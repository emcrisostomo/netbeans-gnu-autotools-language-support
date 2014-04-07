/* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.netbeans.gnu.autotools.autoconf.semantic;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.gnu.autotools.autoconf.semantic.ACColoringAttributes.Coloring;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;
import org.netbeans.spi.editor.highlighting.support.AbstractHighlightsContainer;
import org.netbeans.spi.editor.highlighting.support.OffsetsBag;

/**
 *
 * @author Enrico M. Crisostomo
 */
class ACLexerBasedHighlightLayer extends AbstractHighlightsContainer {
    private static final Logger logger = Logger.getLogger(ACLexerBasedHighlightLayer.class.getName());
    private Map<Token<? extends TokenId>, Coloring> colorings;
    private final Map<Coloring, AttributeSet> CACHE = new HashMap<>();
    private final WeakReference<Document> doc;
    private final OffsetsBag bag;

    private ACLexerBasedHighlightLayer(Document doc) {
        this.doc = new WeakReference<>(doc);
        this.colorings = Collections.emptyMap();
        this.bag = new OffsetsBag(doc);
    }

    public static ACLexerBasedHighlightLayer getLayer(Class<?> id, Document doc) {
        ACLexerBasedHighlightLayer layer = (ACLexerBasedHighlightLayer) doc.getProperty(id);

        if (layer == null) {
            doc.putProperty(id, layer = new ACLexerBasedHighlightLayer(doc));
        }

        return layer;
    }

    @Override
    public synchronized HighlightsSequence getHighlights(int startOffset, int endOffset) {
        if (colorings.isEmpty()) {
            return HighlightsSequence.EMPTY;
        }

        TokenHierarchy<Document> th = TokenHierarchy.get(doc.get());
        TokenSequence<? extends TokenId> seq = th.tokenSequence();

        if (seq == null) { // Null when token hierarchy is inactive
            return HighlightsSequence.EMPTY;
        }

        return bag.getHighlights(startOffset, endOffset);
    }

    public void setColorings(final Map<Token<? extends TokenId>, Coloring> colorings, final Set<Token<? extends TokenId>> addedTokens) {
        bag.clear();

        this.colorings = colorings;

        if (addedTokens.isEmpty()) {
            return;
        }

        for (Token<? extends TokenId> token : addedTokens) {
            if (!colorings.containsKey(token)) {
                logger.log(Level.WARNING, "Token {0} has no coloring info.", token.text().toString());
                continue;
            }

            final Coloring coloring = colorings.get(token);

            if (logger.isLoggable(Level.FINE)) {
                logger.log(Level.FINE, "Token {0} has the following coloring info: ", token.text().toString());
                for (ACColoringAttributes attrib : coloring) {
                    logger.log(Level.FINE, "Coloring Attribute: {0}", attrib.name());
                }
            }

            final int startOffset = token.offset(null);

            bag.addHighlight(startOffset, startOffset + token.length(), this.getColoring(coloring));
        }
    }

    public synchronized void clearColoringCache() {
        CACHE.clear();
    }

    synchronized AttributeSet getColoring(Coloring c) {
        AttributeSet a = CACHE.get(c);

        if (a == null) {
            CACHE.put(c, a = ACColoringManager.getColoringImpl(c));
        }

        return a;
    }
}
