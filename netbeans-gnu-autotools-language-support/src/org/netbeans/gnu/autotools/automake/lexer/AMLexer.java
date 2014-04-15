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
package org.netbeans.gnu.autotools.automake.lexer;

import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.netbeans.gnu.autotools.antlr.support.ANTLRCharStream;
import org.netbeans.gnu.autotools.automake.antlr.automakeLexer;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
class AMLexer implements Lexer<AMTokenId> {

    private static final Logger logger = Logger.getLogger(AMLexer.class.getName());

    private final LexerRestartInfo<AMTokenId> info;
    private final automakeLexer lexer;

    AMLexer(LexerRestartInfo<AMTokenId> info) {
        this.info = info;
        ANTLRCharStream stream = new ANTLRCharStream(info.input(), "M4");

        lexer = new automakeLexer(stream);

        Object state = info.state();
        if (state instanceof AMLexer.AMLexerState) {
            AMLexer.AMLexerState automakeState = (AMLexer.AMLexerState) state;
            lexer.readTab = automakeState.readTab;
        }
    }

    @Override
    public org.netbeans.api.lexer.Token<AMTokenId> nextToken() {
        Token token = lexer.nextToken();

        logger.fine((token == null) ? "token: null" : token.getText() + ":" + token.getType());

        if (token == null) {
            throw new IllegalStateException("Token unexpectedly null.");
        }

        if (token.getType() == automakeLexer.EOF) {
            return null;
        }

        return info.tokenFactory().createToken(AMLanguageHierarchy.getToken(token.getType()));
    }

    @Override
    public Object state() {
        return new AMLexer.AMLexerState(lexer.readTab);
    }

    @Override
    public void release() {
    }

    private static class AMLexerState {

        private final boolean readTab;

        public AMLexerState(boolean readTab) {
            this.readTab = readTab;
        }
    }
}
