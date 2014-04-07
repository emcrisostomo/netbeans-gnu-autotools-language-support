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
package org.netbeans.gnu.autotools.autoconf.antlr.support;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.openide.text.NbDocument;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class ANTLRTokenToNetBeansTokenMapper {

    private static final Logger logger = Logger.getLogger(ANTLRTokenToNetBeansTokenMapper.class.getName());

    private final Map<Integer, Token<? extends TokenId>> tokensByStartOffset;
    private final StyledDocument netbeansDocument;

    public ANTLRTokenToNetBeansTokenMapper(Document document) {
        if (!(document instanceof AbstractDocument)) {
            throw new IllegalStateException(
                    String.format(
                            "Unexpected document class [%s] is not instance of [%s].",
                            document.getClass().getName(),
                            AbstractDocument.class.getName()));
        }

        if (!(document instanceof StyledDocument)) {
            throw new IllegalStateException(
                    String.format(
                            "Unexpected document class [%s] is not instance of [%s].",
                            document.getClass().getName(),
                            StyledDocument.class.getName()));
        } else {
            netbeansDocument = (StyledDocument) document;
        }

        AbstractDocument doc = (AbstractDocument) document;
        doc.readLock();

        Map<Integer, Token<? extends TokenId>> mutableTokensByStartOffset = new HashMap<>();

        try {
            TokenHierarchy<AbstractDocument> ti = TokenHierarchy.get(doc);
            TokenSequence<? extends TokenId> ts = ti.tokenSequence();

            while (ts.moveNext()) {
                Token<? extends TokenId> t = ts.token();

                mutableTokensByStartOffset.put(t.offset(null), t);
            }

            tokensByStartOffset = Collections.unmodifiableMap(mutableTokensByStartOffset);
        } finally {
            doc.readUnlock();
        }
    }

    public Token<? extends TokenId> findToken(org.antlr.v4.runtime.Token antlrToken) {
        if (antlrToken == null) {
            throw new IllegalArgumentException("ANTLR token cannot be null.");
        }

        final int lineOffset = NbDocument.findLineOffset(netbeansDocument, antlrToken.getLine() - 1);
        final int startOffset = lineOffset + antlrToken.getCharPositionInLine();

        Token<? extends TokenId> token = tokensByStartOffset.get(startOffset);

        if (token == null) {
            logger.warning(String.format("Cannot find token at offset [%d].", startOffset));
            return null;
        }

        if (token.length() != antlrToken.getText().length()) {
            logger.severe(String.format(
                    "Token at offset [%d] has different length (%d) from what ANTLR token has (%d). Skipping token.",
                    startOffset,
                    token.length(),
                    antlrToken.getText().length()));

            return null;
        }

        return token;
    }
}
