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

import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
class AMLexer implements Lexer<AMTokenId> {

    private final LexerRestartInfo<AMTokenId> info;

    AMLexer(LexerRestartInfo<AMTokenId> info) {
        this.info = info;
    }

    @Override
    public org.netbeans.api.lexer.Token<AMTokenId> nextToken() {
        return info.tokenFactory().createToken(AMLanguageHierarchy.getToken(0));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
