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
        tokens = Arrays.asList(new AMTokenId[]{
            new AMTokenId("EOF", "whitespace", 0),
            new AMTokenId("WHITESPACE", "whitespace", 1),
            new AMTokenId("SINGLE_LINE_COMMENT", "comment", 2),
            new AMTokenId("BOOLEAN", "keyword", 3),
            new AMTokenId("BREAK", "keyword", 4),
            new AMTokenId("CASE", "keyword", 5),
            new AMTokenId("CHAR", "keyword", 6),
            new AMTokenId("CONTINUE", "keyword", 7),
            new AMTokenId("_DEFAULT", "keyword", 8),
            new AMTokenId("DO", "keyword", 9),
            new AMTokenId("DOUBLE", "keyword", 10),
            new AMTokenId("ELSE", "keyword", 11),
            new AMTokenId("FALSE", "keyword", 12),
            new AMTokenId("FINALLY", "keyword", 13),
            new AMTokenId("FLOAT", "keyword", 14),
            new AMTokenId("FOR", "keyword", 15),
            new AMTokenId("GOTO", "keyword", 16),
            new AMTokenId("IF", "keyword", 17),
            new AMTokenId("INT", "keyword", 18),
            new AMTokenId("LONG", "keyword", 19),
            new AMTokenId("NULL", "keyword", 20),
            new AMTokenId("RETURN", "keyword", 21),
            new AMTokenId("SHORT", "keyword", 22),
            new AMTokenId("SWITCH", "keyword", 23),
            new AMTokenId("TRUE", "keyword", 24),
            new AMTokenId("TRY", "keyword", 25),
            new AMTokenId("VOID", "keyword", 26),
            new AMTokenId("WHILE", "keyword", 27),
            new AMTokenId("LPAREN", "operator", 28),
            new AMTokenId("RPAREN", "operator", 29),
            new AMTokenId("LBRACE", "operator", 30),
            new AMTokenId("RBRACE", "operator", 31),
            new AMTokenId("LBRACKET", "operator", 32),
            new AMTokenId("RBRACKET", "operator", 33),
            new AMTokenId("SEMICOLON", "operator", 34),
            new AMTokenId("COMMA", "operator", 35),
            new AMTokenId("DOT", "operator", 36),
            new AMTokenId("AT", "operator", 37),
            new AMTokenId("ASSIGN", "operator", 38),
            new AMTokenId("LT", "operator", 39),
            new AMTokenId("BANG", "operator", 40),
            new AMTokenId("TILDE", "operator", 41),
            new AMTokenId("HOOK", "operator", 42),
            new AMTokenId("COLON", "operator", 43),
            new AMTokenId("EQ", "operator", 44),
            new AMTokenId("LE", "operator", 45),
            new AMTokenId("GE", "operator", 46),
            new AMTokenId("NE", "operator", 47),
            new AMTokenId("SC_OR", "operator", 48),
            new AMTokenId("SC_AND", "operator", 49),
            new AMTokenId("INCR", "operator", 50),
            new AMTokenId("DECR", "operator", 51),
            new AMTokenId("PLUS", "operator", 52),
            new AMTokenId("MINUS", "operator", 53),
            new AMTokenId("STAR", "operator", 54),
            new AMTokenId("SLASH", "operator", 55),
            new AMTokenId("BIT_AND", "operator", 56),
            new AMTokenId("BIT_OR", "operator", 57),
            new AMTokenId("XOR", "operator", 58),
            new AMTokenId("REM", "operator", 59),
            new AMTokenId("LSHIFT", "operator", 60),
            new AMTokenId("PLUSASSIGN", "operator", 61),
            new AMTokenId("MINUSASSIGN", "operator", 62),
            new AMTokenId("STARASSIGN", "operator", 63),
            new AMTokenId("SLASHASSIGN", "operator", 64),
            new AMTokenId("ANDASSIGN", "operator", 65),
            new AMTokenId("ORASSIGN", "operator", 66),
            new AMTokenId("XORASSIGN", "operator", 67),
            new AMTokenId("REMASSIGN", "operator", 68),
            new AMTokenId("LSHIFTASSIGN", "operator", 69),
            new AMTokenId("RSIGNEDSHIFTASSIGN", "operator", 70),
            new AMTokenId("ELLIPSIS", "operator", 71),
            new AMTokenId("AC_PREREQ", "keyword", 72),
            new AMTokenId("AC_INIT", "keyword", 73),
            new AMTokenId("AC_COPYRIGHT", "keyword", 74),
            new AMTokenId("AC_REVISION", "keyword", 75),
            new AMTokenId("AC_CONFIG_SRCDIR", "keyword", 76),
            new AMTokenId("AC_CONFIG_AUX_DIR", "keyword", 77),
            new AMTokenId("AC_CONFIG_FILES", "keyword", 78),
            new AMTokenId("AC_CONFIG_MACRO_DIRS", "keyword", 79),
            new AMTokenId("AC_LANG", "keyword", 80),
            new AMTokenId("AC_PROG_CC", "keyword", 81),
            new AMTokenId("AC_PROG_CXX", "keyword", 82),
            new AMTokenId("INTEGER_LITERAL", "literal", 83),
            new AMTokenId("DECIMAL_LITERAL", "literal", 84),
            new AMTokenId("HEX_LITERAL", "literal", 85),
            new AMTokenId("OCTAL_LITERAL", "literal", 86),
            new AMTokenId("FLOATING_POINT_LITERAL", "literal", 87),
            new AMTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 88),
            new AMTokenId("DECIMAL_EXPONENT", "number", 89),
            new AMTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 90),
            new AMTokenId("HEXADECIMAL_EXPONENT", "number", 91),
            new AMTokenId("CHARACTER_LITERAL", "literal", 92),
            new AMTokenId("STRING_LITERAL", "literal", 93),
            new AMTokenId("M4_LITERAL", "literal", 94),
            new AMTokenId("IDENTIFIER", "identifier", 95),
            new AMTokenId("LETTER", "identifier", 96),
            new AMTokenId("PART_LETTER", "identifier", 97), 
            new AMTokenId("TEXT", "text", 98)
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
