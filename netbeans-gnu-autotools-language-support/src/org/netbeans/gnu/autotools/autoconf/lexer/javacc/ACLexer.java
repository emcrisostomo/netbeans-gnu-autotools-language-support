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
package org.netbeans.gnu.autotools.autoconf.lexer.javacc;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.gnu.autotools.autoconf.lexer.ACLanguageHierarchy;
import org.netbeans.gnu.autotools.autoconf.lexer.ACTokenId;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class ACLexer implements Lexer<ACTokenId> {

    public static final String VERBOSE_PROPERTY = ACLexer.class.getName() + ".verbose";
    private static final boolean isVerbose = Boolean.valueOf(System.getProperty(VERBOSE_PROPERTY));
    private static final Logger logger = Logger.getLogger(ACLexer.class.getName());

    private final LexerRestartInfo<ACTokenId> info;
    private final AutoconfParserTokenManager javaParserTokenManager;

    public ACLexer(LexerRestartInfo<ACTokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());

        ACLexerState lexState = (ACLexerState) info.state();

        if (lexState == null) {
            javaParserTokenManager = new AutoconfParserTokenManager(stream);
        } else {
            javaParserTokenManager = new AutoconfParserTokenManager(stream, lexState.state);
            javaParserTokenManager.m4NestingDepth = lexState.m4NestingDepth;
        }
    }

    @Override
    public org.netbeans.api.lexer.Token<ACTokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();

        if (isVerbose) {
            logger.info((token == null) ? "token: null" : token.image + ":" + token.kind);
        }

        if (info.input().readLength() < 1) {
            return null;
        }

        return info.tokenFactory().createToken(ACLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        if (isVerbose) {
            logger.log(Level.INFO, "Lexer state: {0}", javaParserTokenManager.curLexState);
            logger.log(Level.INFO, "Lexer nesting depth: {0}", javaParserTokenManager.m4NestingDepth);
        }

        return new ACLexerState(javaParserTokenManager.m4NestingDepth, javaParserTokenManager.curLexState);
    }

    @Override
    public void release() {
    }

    private class ACLexerState {

        private int m4NestingDepth;
        private int state;

        private ACLexerState(int m4NestingDepth, int state) {
            this.m4NestingDepth = m4NestingDepth;
            this.state = state;
        }
    }
}
