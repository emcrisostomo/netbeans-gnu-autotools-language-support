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
package org.netbeans.gnu.buildsystem.automake.lexer;

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
public class AMLanguageHierarchy extends LanguageHierarchy<AMTokenId> {

    private static final List<AMTokenId> tokens;
    private static final Map<Integer, AMTokenId> idToToken;

    static {
        int regExCounter = 1;
        tokens = Arrays.asList(new AMTokenId[]{
            new AMTokenId("SINGLE_LINE_COMMENT", "comment", regExCounter++),
            new AMTokenId("STRING", "string", regExCounter++),
            new AMTokenId("IF", "keyword", regExCounter++),
            new AMTokenId("ELSE", "keyword", regExCounter++),
            new AMTokenId("ENDIF", "keyword", regExCounter++),
            new AMTokenId("AM_VARIABLE", "keyword", regExCounter++),
            new AMTokenId("ID", "identifier", regExCounter++),
            new AMTokenId("DOLLAR", "whitespace", regExCounter++),
            new AMTokenId("LPAREN", "operator", regExCounter++),
            new AMTokenId("RPAREN", "operator", regExCounter++),
            new AMTokenId("LBRACE", "operator", regExCounter++),
            new AMTokenId("RBRACE", "operator", regExCounter++),
            new AMTokenId("PLUSASSIGN", "operator", regExCounter++),
            new AMTokenId("DEFINE", "operator", regExCounter++),
            new AMTokenId("ASSIGN", "operator", regExCounter++),
            new AMTokenId("COLON", "operator", regExCounter++),
            new AMTokenId("ENL", "operator", regExCounter++),
            new AMTokenId("NL", "whitespace", regExCounter++),
            new AMTokenId("TAB", "whitespace", regExCounter++),
            new AMTokenId("HORIZONTAL_WHITESPACE", "whitespace", regExCounter++),
            new AMTokenId("ANY", "text", regExCounter)
        });

        idToToken = new HashMap<>();

        for (AMTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    public static AMTokenId getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected Collection<AMTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected Lexer<AMTokenId> createLexer(LexerRestartInfo<AMTokenId> info) {
        return new AMLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-automake";
    }
}
