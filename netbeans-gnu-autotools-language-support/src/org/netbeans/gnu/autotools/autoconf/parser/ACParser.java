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
import javax.swing.event.ChangeListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.netbeans.gnu.autotools.antlr.autoconfLexer;
import org.netbeans.gnu.autotools.antlr.autoconfParser;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class ACParser extends Parser {

    private Snapshot snapshot;
    private autoconfParser parser;
    private autoconfParser.CompilationUnitContext compilationUnit;

    public ACParser() {
    }

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
        this.snapshot = snapshot;

        ANTLRInputStream is = new ANTLRInputStream(snapshot.getText().toString());
        autoconfLexer lexer = new autoconfLexer(is);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        parser = new autoconfParser(tokenStream);
        compilationUnit = parser.compilationUnit();
    }

    @Override
    public Parser.Result getResult(Task task) throws ParseException {
        return new ACParserResult(snapshot, parser, compilationUnit);
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class ACParserResult extends ParserResult {

        private final autoconfParser.CompilationUnitContext compilationUnit;
        private final autoconfParser parser;

        private ACParserResult(Snapshot snapshot, autoconfParser parser, autoconfParser.CompilationUnitContext compilationUnit) {
            super(snapshot);
            this.parser = parser;
            this.compilationUnit = compilationUnit;
        }

        @Override
        protected void invalidate() {

        }

        @Override
        public List<? extends org.netbeans.modules.csl.api.Error> getDiagnostics() {
            return new ArrayList<>();
        }

        public autoconfParser.CompilationUnitContext getCompilationUnit() {
            return compilationUnit;
        }

        public autoconfParser getParser() {
            return parser;
        }
    }
}
