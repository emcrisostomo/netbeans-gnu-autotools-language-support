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
package org.netbeans.gnu.buildsystem.autoconf.lexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class ACLanguageHierarchy extends LanguageHierarchy<ACTokenId> {

    private static final List<ACTokenId> tokens;
    private static final Map<Integer, ACTokenId> idToToken;

    static {
        int regExCounter = 1;
        tokens = Arrays.asList(new ACTokenId[]{
            new ACTokenId("DNL_COMMENT", "comment", regExCounter++),
            new ACTokenId("SINGLE_LINE_COMMENT", "comment", regExCounter++),
            new ACTokenId("ID", "identifier", regExCounter++),
            new ACTokenId("LPAREN", "separator", regExCounter++),
            new ACTokenId("RPAREN", "separator", regExCounter++),
            new ACTokenId("LBRACKET", "separator", regExCounter++),
            new ACTokenId("RBRACKET", "separator", regExCounter++),
            new ACTokenId("COMMA", "separator", regExCounter++),
            new ACTokenId("LQUOTE", "separator", regExCounter++),
            new ACTokenId("RQUOTE", "separator", regExCounter++),
            new ACTokenId("WS", "whitespace", regExCounter++),
            new ACTokenId("NL", "whitespace", regExCounter++),
            new ACTokenId("HORIZONTAL_WHITESPACE", "whitespace", regExCounter++),
            new ACTokenId("ANY", "text", regExCounter++)
        });

        idToToken = new HashMap<>();

        for (ACTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    public static ACTokenId getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected Collection<ACTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected Lexer<ACTokenId> createLexer(LexerRestartInfo<ACTokenId> info) {
        return new ACLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-autoconf";
    }
}
