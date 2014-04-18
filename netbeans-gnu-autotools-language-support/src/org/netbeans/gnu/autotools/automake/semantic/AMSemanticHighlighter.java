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
package org.netbeans.gnu.autotools.automake.semantic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.gnu.buildsystem.antlr.support.ANTLRTokenToNetBeansTokenMapper;
import org.netbeans.gnu.autotools.automake.antlr.automakeParser.CompilationUnitContext;
import org.netbeans.gnu.autotools.automake.lexer.AutomakeKeyword.Type;
import org.netbeans.gnu.autotools.automake.parser.AMParser;
import org.netbeans.gnu.autotools.automake.semantic.AMColoringAttributes.Coloring;
import org.netbeans.modules.parsing.spi.IndexingAwareParserResultTask;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.modules.parsing.spi.TaskIndexingMode;
import org.netbeans.spi.editor.highlighting.support.OffsetsBag;
import org.netbeans.spi.editor.hints.ErrorDescription;

/**
 *
 * @author Enrico M. Crisostomo
 */
class AMSemanticHighlighter extends IndexingAwareParserResultTask<Parser.Result> {

    private static final Logger logger = Logger.getLogger(AMSemanticHighlighter.class.getName());

    AMSemanticHighlighter() {
        super(TaskIndexingMode.ALLOWED_DURING_SCAN);
    }

    @Override
    public void run(Parser.Result result, SchedulerEvent event) {
        logger.finest("Running.");

        if (result == null) {
            logger.severe("Parser result is null.");
            return;
        }

        if (!(result instanceof AMParser.AMParserResult)) {
            logger.severe(String.format("Invalid result class: %s", result.getClass().getName()));
            return;
        }

        final Document doc = result.getSnapshot().getSource().getDocument(false);

        // Analyse parse results
        AMParser.AMParserResult res = (AMParser.AMParserResult) result;
        CompilationUnitContext compilationUnit = res.getCompilationUnit();
        AMBuiltinMacroVisitor visitor = new AMBuiltinMacroVisitor();
        visitor.visit(compilationUnit);

        // Get visitor results
        Map<org.antlr.v4.runtime.Token, Type> identifiers = visitor.getIdentifiers();

        final ANTLRTokenToNetBeansTokenMapper mapper = new ANTLRTokenToNetBeansTokenMapper(doc);

        final Map<Token<? extends TokenId>, Coloring> newColoring = new IdentityHashMap<>();
        final Set<Token<? extends TokenId>> addedTokens = new HashSet<>();

        for (Map.Entry<org.antlr.v4.runtime.Token, Type> entry : identifiers.entrySet()) {
            final org.antlr.v4.runtime.Token antlrToken = entry.getKey();

            logger.fine(String.format(
                    "Automake Token Position: %d %d %d.",
                    antlrToken.getLine(),
                    antlrToken.getCharPositionInLine(),
                    antlrToken.getText().length()));

            final Token<? extends TokenId> token = mapper.findToken(antlrToken);

            if (token == null) {
                continue;
            }

            final List<AMColoringAttributes> attributes = new ArrayList<>();
            final AMColoringAttributes tokenType = AMColoringAttributes.fromType(entry.getValue());

            logger.log(Level.FINE, "Token {0} coloring type: {1}", new Object[]{antlrToken.getText(), tokenType});

            if (tokenType != null) {
                attributes.add(tokenType);
                newColoring.put(token, collection2Coloring(attributes));
                addedTokens.add(token);
            }
        }

        ERROR_DESCRIPTION_SETTER.setColorings(doc, newColoring, addedTokens);
    }

    static Coloring collection2Coloring(Collection<AMColoringAttributes> attr) {
        Coloring c = AMColoringAttributes.empty();

        for (AMColoringAttributes a : attr) {
            c = AMColoringAttributes.add(c, a);
        }

        return c;
    }

    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
        // no op
    }

    public static interface ErrorDescriptionSetter {

        public void setErrors(Document doc, List<ErrorDescription> errors);

        public void setHighlights(Document doc, OffsetsBag highlights);

        public void setColorings(
                Document doc,
                Map<Token<? extends TokenId>, Coloring> colorings,
                Set<Token<? extends TokenId>> addedTokens);
    }

    private static final ErrorDescriptionSetter ERROR_DESCRIPTION_SETTER = new ErrorDescriptionSetter() {
        @Override
        public void setErrors(Document doc, List<ErrorDescription> errors) {
        }

        @Override
        public void setHighlights(final Document doc, final OffsetsBag highlights) {

        }

        @Override
        public void setColorings(
                final Document doc,
                final Map<Token<? extends TokenId>, Coloring> colorings,
                final Set<Token<? extends TokenId>> addedTokens) {
            AMLexerBasedHighlightLayer.getLayer(AMSemanticHighlighter.class, doc).setColorings(colorings, addedTokens);
        }
    };
}

