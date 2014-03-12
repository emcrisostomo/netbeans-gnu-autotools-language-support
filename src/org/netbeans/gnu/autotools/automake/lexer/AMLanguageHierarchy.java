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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.gnu.autotools.automake.lexer.javacc.AutomakeParserConstants;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class AMLanguageHierarchy extends LanguageHierarchy<AMTokenId> {

    private static List<AMTokenId> tokens;
    private static Map<Integer, AMTokenId> idToToken;

    private static void init() {
        int regExCounter = 0;
        tokens = Arrays.asList(new AMTokenId[]{
            // whitespace and comments
            new AMTokenId("EOF", "whitespace", regExCounter++),
            new AMTokenId("WHITESPACE", "whitespace", regExCounter++),
            new AMTokenId("SINGLE_LINE_COMMENT", "comment", regExCounter++),
            // Automake variables
            new AMTokenId("AUTOMAKE_SHELL_VARIABLE", "automake-variable", regExCounter++),
            new AMTokenId("AUTOMAKE_VARIABLE", "automake", regExCounter++),
            new AMTokenId("NAME", "automake", regExCounter++),
            new AMTokenId("PRIMARY", "automake", regExCounter++),
            // Reserved words
            new AMTokenId("BOOLEAN", "keyword", regExCounter++),
            new AMTokenId("BREAK", "keyword", regExCounter++),
            new AMTokenId("CASE", "keyword", regExCounter++),
            new AMTokenId("CHAR", "keyword", regExCounter++),
            new AMTokenId("CONTINUE", "keyword", regExCounter++),
            new AMTokenId("_DEFAULT", "keyword", regExCounter++),
            new AMTokenId("DO", "keyword", regExCounter++),
            new AMTokenId("DONE", "keyword", regExCounter++),
            new AMTokenId("DOUBLE", "keyword", regExCounter++),
            new AMTokenId("ELSE", "keyword", regExCounter++),
            new AMTokenId("FALSE", "keyword", regExCounter++),
            new AMTokenId("FINALLY", "keyword", regExCounter++),
            new AMTokenId("FLOAT", "keyword", regExCounter++),
            new AMTokenId("FOR", "keyword", regExCounter++),
            new AMTokenId("GOTO", "keyword", regExCounter++),
            new AMTokenId("IF", "keyword", regExCounter++),
            new AMTokenId("ENDIF", "keyword", regExCounter++),
            new AMTokenId("FI", "keyword", regExCounter++),
            new AMTokenId("INT", "keyword", regExCounter++),
            new AMTokenId("LONG", "keyword", regExCounter++),
            new AMTokenId("NULL", "keyword", regExCounter++),
            new AMTokenId("RETURN", "keyword", regExCounter++),
            new AMTokenId("SHORT", "keyword", regExCounter++),
            new AMTokenId("SWITCH", "keyword", regExCounter++),
            new AMTokenId("TEST", "keyword", regExCounter++),
            new AMTokenId("THEN", "keyword", regExCounter++),
            new AMTokenId("TRUE", "keyword", regExCounter++),
            new AMTokenId("TRY", "keyword", regExCounter++),
            new AMTokenId("VOID", "keyword", regExCounter++),
            new AMTokenId("WHILE", "keyword", regExCounter++),
            // Separators
            new AMTokenId("LPAREN", "operator", regExCounter++),
            new AMTokenId("RPAREN", "operator", regExCounter++),
            new AMTokenId("LBRACKET", "operator", regExCounter++),
            new AMTokenId("RBRACKET", "operator", regExCounter++),
            new AMTokenId("LBRACE", "operator", regExCounter++),
            new AMTokenId("RBRACE", "operator", regExCounter++),
            new AMTokenId("SEMICOLON", "operator", regExCounter++),
            new AMTokenId("COMMA", "operator", regExCounter++),
            new AMTokenId("DOT", "operator", regExCounter++),
            // Operators  
            new AMTokenId("ASSIGN", "operator", regExCounter++),
            new AMTokenId("LT", "operator", regExCounter++),
            new AMTokenId("BANG", "operator", regExCounter++),
            new AMTokenId("TILDE", "operator", regExCounter++),
            new AMTokenId("HOOK", "operator", regExCounter++),
            new AMTokenId("COLON", "operator", regExCounter++),
            new AMTokenId("EQ", "operator", regExCounter++),
            new AMTokenId("LE", "operator", regExCounter++),
            new AMTokenId("GE", "operator", regExCounter++),
            new AMTokenId("NE", "operator", regExCounter++),
            new AMTokenId("SC_OR", "operator", regExCounter++),
            new AMTokenId("SC_AND", "operator", regExCounter++),
            new AMTokenId("INCR", "operator", regExCounter++),
            new AMTokenId("DECR", "operator", regExCounter++),
            new AMTokenId("PLUS", "operator", regExCounter++),
            new AMTokenId("MINUS", "operator", regExCounter++),
            new AMTokenId("STAR", "operator", regExCounter++),
            new AMTokenId("SLASH", "operator", regExCounter++),
            new AMTokenId("BIT_AND", "operator", regExCounter++),
            new AMTokenId("BIT_OR", "operator", regExCounter++),
            new AMTokenId("XOR", "operator", regExCounter++),
            new AMTokenId("REM", "operator", regExCounter++),
            new AMTokenId("LSHIFT", "operator", regExCounter++),
            new AMTokenId("PLUSASSIGN", "operator", regExCounter++),
            new AMTokenId("MINUSASSIGN", "operator", regExCounter++),
            new AMTokenId("STARASSIGN", "operator", regExCounter++),
            new AMTokenId("SLASHASSIGN", "operator", regExCounter++),
            new AMTokenId("ANDASSIGN", "operator", regExCounter++),
            new AMTokenId("ORASSIGN", "operator", regExCounter++),
            new AMTokenId("XORASSIGN", "operator", regExCounter++),
            new AMTokenId("REMASSIGN", "operator", regExCounter++),
            new AMTokenId("LSHIFTASSIGN", "operator", regExCounter++),
            new AMTokenId("RSIGNEDSHIFTASSIGN", "operator", regExCounter++),
            new AMTokenId("ELLIPSIS", "operator", regExCounter++),
            //  Literals
            new AMTokenId("INTEGER_LITERAL", "number", regExCounter++),
            new AMTokenId("DECIMAL_LITERAL", "number", regExCounter++),
            new AMTokenId("HEX_LITERAL", "number", regExCounter++),
            new AMTokenId("OCTAL_LITERAL", "number", regExCounter++),
            new AMTokenId("FLOATING_POINT_LITERAL", "number", regExCounter++),
            new AMTokenId("DECIMAL_FLOATING_POINT_LITERAL", "number", regExCounter++),
            new AMTokenId("DECIMAL_EXPONENT", "number", regExCounter++),
            new AMTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "number", regExCounter++),
            new AMTokenId("HEXADECIMAL_EXPONENT", "number", regExCounter++),
            new AMTokenId("CHARACTER_LITERAL", "character", regExCounter++),
            new AMTokenId("STRING_LITERAL", "string", regExCounter++),
            // Identifiers
            new AMTokenId("IDENTIFIER", "identifier", regExCounter++),
            new AMTokenId("LETTER", "identifier", regExCounter++),
            new AMTokenId("PART_LETTER", "identifier", regExCounter++),
            // Text
            new AMTokenId("TEXT", "text", AutomakeParserConstants.TEXT)
        });

        idToToken = new HashMap<Integer, AMTokenId>();

        for (AMTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized AMTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }

        return idToToken.get(id);
    }

    @Override
    protected Collection<AMTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }

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
