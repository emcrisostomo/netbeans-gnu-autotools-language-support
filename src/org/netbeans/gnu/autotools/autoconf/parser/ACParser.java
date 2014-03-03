/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gnu.autotools.autoconf.parser;

import org.netbeans.gnu.autotools.autoconf.parser.javacc.AutoconfParser;
import org.netbeans.gnu.autotools.autoconf.parser.javacc.ParseException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author enricomariacrisostomo
 */
public class ACParser extends Parser {

    private Snapshot snapshot;
    private AutoconfParser autoconfParser;

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
        this.snapshot = snapshot;
        Reader reader = new StringReader(snapshot.getText().toString());
        autoconfParser = new AutoconfParser(reader);
        try {
            autoconfParser.CompilationUnit();
        } catch (ParseException ex) {
            Logger.getLogger(ACParser.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    @Override
    public Result getResult(Task task) {
        return new ACParserResult(snapshot, autoconfParser);
    }

    @Override
    public void cancel() {
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class ACParserResult extends ParserResult {

        private final AutoconfParser autoconfParser;
        private boolean valid = true;

        ACParserResult(Snapshot snapshot, AutoconfParser javaParser) {
            super(snapshot);
            this.autoconfParser = javaParser;
        }

        public AutoconfParser getAutoconfParser() throws org.netbeans.modules.parsing.spi.ParseException {
            if (!valid) {
                throw new org.netbeans.modules.parsing.spi.ParseException();
            }
            return autoconfParser;
        }

        @Override
        protected void invalidate() {
            valid = false;
        }

        @Override
        public List<? extends Error> getDiagnostics() {
            return new ArrayList();
        }
    }

}
