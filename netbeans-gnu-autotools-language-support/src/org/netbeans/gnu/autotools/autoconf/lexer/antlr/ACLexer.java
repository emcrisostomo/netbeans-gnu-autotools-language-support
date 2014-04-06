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
package org.netbeans.gnu.autotools.autoconf.lexer.antlr;

import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.netbeans.gnu.autotools.antlr.autoconfLexer;
import org.netbeans.gnu.autotools.autoconf.antlr.support.ANTLRCharStream;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class ACLexer implements Lexer<ACTokenId> {
    private static final Logger logger = Logger.getLogger(ACLexer.class.getName());

    private final LexerRestartInfo<ACTokenId> info;
    private final autoconfLexer lexer;

    public ACLexer(LexerRestartInfo<ACTokenId> info) {
        this.info = info;
        ANTLRCharStream stream = new ANTLRCharStream(info.input(), "M4");

        lexer = new autoconfLexer(stream);

        Object state = info.state();
        if (state instanceof M4LexerState) {
            M4LexerState m4State = (M4LexerState) state;
            lexer.quoteLevel = m4State.quoteLevel;
            lexer.quoted = m4State.quoted;
        }
    }

    @Override
    public org.netbeans.api.lexer.Token<ACTokenId> nextToken() {
        Token token = lexer.nextToken();

        logger.fine((token == null) ? "token: null" : token.getText() + ":" + token.getType());

        if (token == null) {
            throw new IllegalStateException("Token unexpectedly null.");
        }

        if (token.getType() == autoconfLexer.EOF) {
            return null;
        }

        return info.tokenFactory().createToken(ACLanguageHierarchy.getToken(token.getType()));
    }

    @Override
    public Object state() {
        return new M4LexerState(lexer.quoteLevel);
    }

    @Override
    public void release() {
    }

    private static class M4LexerState {

        private final int quoteLevel;
        private final boolean quoted;

        public M4LexerState(int quoteLevel) {
            this.quoteLevel = quoteLevel;
            this.quoted = quoteLevel > 0;
        }
    }
}
