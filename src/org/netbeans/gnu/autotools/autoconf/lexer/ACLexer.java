/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gnu.autotools.autoconf.lexer;

import org.netbeans.gnu.autotools.autoconf.lexer.javacc.AutoconfParserTokenManager;
import org.netbeans.gnu.autotools.autoconf.lexer.javacc.JavaCharStream;
import org.netbeans.gnu.autotools.autoconf.lexer.javacc.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author enricomariacrisostomo
 */
class ACLexer implements Lexer<ACTokenId> {

    private final LexerRestartInfo<ACTokenId> info;
    private final AutoconfParserTokenManager javaParserTokenManager;

    ACLexer(LexerRestartInfo<ACTokenId> info) {
        this.info = info;
        JavaCharStream stream = new JavaCharStream(info.input());
        javaParserTokenManager = new AutoconfParserTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<ACTokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();

        if (info.input().readLength() < 1) {
            return null;
        }

        return info.tokenFactory().createToken(ACLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
