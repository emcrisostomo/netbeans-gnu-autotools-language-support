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

import org.netbeans.gnu.autotools.automake.lexer.javacc.AutomakeParserTokenManager;
import org.netbeans.gnu.autotools.automake.lexer.javacc.JavaCharStream;
import org.netbeans.gnu.autotools.automake.lexer.javacc.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
class AMLexer implements Lexer<AMTokenId> {

    private final LexerRestartInfo<AMTokenId> info;
    private final AutomakeParserTokenManager javaParserTokenManager;

    AMLexer(LexerRestartInfo<AMTokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());
        javaParserTokenManager = new AutomakeParserTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<AMTokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();

        if (info.input().readLength() < 1) {
            return null;
        }

        return info.tokenFactory().createToken(AMLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}