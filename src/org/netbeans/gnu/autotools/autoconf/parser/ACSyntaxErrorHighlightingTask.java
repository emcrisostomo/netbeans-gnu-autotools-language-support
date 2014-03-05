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
package org.netbeans.gnu.autotools.autoconf.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.netbeans.gnu.autotools.autoconf.parser.ACParser.ACParserResult;
import org.netbeans.gnu.autotools.autoconf.parser.javacc.ParseException;
import org.netbeans.gnu.autotools.autoconf.parser.javacc.Token;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class ACSyntaxErrorHighlightingTask extends ParserResultTask {

    @Override
    public void run(Parser.Result result, SchedulerEvent event) {
        try {
            ACParserResult sjResult = (ACParserResult) result;
            List<ParseException> syntaxErrors = sjResult.getAutoconfParser().syntaxErrors;
            Document document = result.getSnapshot().getSource().getDocument(false);
            List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
            
            for (ParseException syntaxError : syntaxErrors) {
                Token token = syntaxError.currentToken;

                int bl = Math.max(token.beginLine - 1, 0);
                int bc = Math.max(token.beginColumn, 0);
                int el = Math.max(token.endLine - 1, 0);
                                
                int start = NbDocument.findLineOffset((StyledDocument) document, bl) + bc - 1;
                int end = NbDocument.findLineOffset((StyledDocument) document, el) + token.endColumn;

                start = Math.max(start, 0);
                end = Math.max(start + 1, end);
                                
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR,
                        syntaxError.getMessage(),
                        document,
                        document.createPosition(start),
                        document.createPosition(end)
                );
                errors.add(errorDescription);
            }
            HintsController.setErrors(document, "autoconf", errors);
        } catch (BadLocationException ex1) {
            Exceptions.printStackTrace(ex1);
        } catch (org.netbeans.modules.parsing.spi.ParseException ex1) {
            Exceptions.printStackTrace(ex1);
        }
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
    }
}
