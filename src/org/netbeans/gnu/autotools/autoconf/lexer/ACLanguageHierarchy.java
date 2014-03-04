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
package org.netbeans.gnu.autotools.autoconf.lexer;

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
 * @author enricomariacrisostomo
 */
public class ACLanguageHierarchy extends LanguageHierarchy<ACTokenId> {

    private static List<ACTokenId> tokens;
    private static Map<Integer, ACTokenId> idToToken;

    private static void init() {
        tokens = Arrays.asList(new ACTokenId[]{
            new ACTokenId("EOF", "whitespace", 0),
            new ACTokenId("WHITESPACE", "whitespace", 1),
            new ACTokenId("SINGLE_LINE_COMMENT", "comment", 2),
            new ACTokenId("BOOLEAN", "keyword", 3),
            new ACTokenId("BREAK", "keyword", 4),
            new ACTokenId("CASE", "keyword", 5),
            new ACTokenId("CHAR", "keyword", 6),
            new ACTokenId("CONTINUE", "keyword", 7),
            new ACTokenId("_DEFAULT", "keyword", 8),
            new ACTokenId("DO", "keyword", 9),
            new ACTokenId("DOUBLE", "keyword", 10),
            new ACTokenId("ELSE", "keyword", 11),
            new ACTokenId("FALSE", "keyword", 12),
            new ACTokenId("FINALLY", "keyword", 13),
            new ACTokenId("FLOAT", "keyword", 14),
            new ACTokenId("FOR", "keyword", 15),
            new ACTokenId("GOTO", "keyword", 16),
            new ACTokenId("IF", "keyword", 17),
            new ACTokenId("INT", "keyword", 18),
            new ACTokenId("LONG", "keyword", 19),
            new ACTokenId("NULL", "keyword", 20),
            new ACTokenId("RETURN", "keyword", 21),
            new ACTokenId("SHORT", "keyword", 22),
            new ACTokenId("SWITCH", "keyword", 23),
            new ACTokenId("TRUE", "keyword", 24),
            new ACTokenId("TRY", "keyword", 25),
            new ACTokenId("VOID", "keyword", 26),
            new ACTokenId("WHILE", "keyword", 27),
            new ACTokenId("LPAREN", "operator", 28),
            new ACTokenId("RPAREN", "operator", 29),
            new ACTokenId("LBRACE", "operator", 30),
            new ACTokenId("RBRACE", "operator", 31),
            new ACTokenId("LBRACKET", "operator", 32),
            new ACTokenId("RBRACKET", "operator", 33),
            new ACTokenId("SEMICOLON", "operator", 34),
            new ACTokenId("COMMA", "operator", 35),
            new ACTokenId("DOT", "operator", 36),
            new ACTokenId("AT", "operator", 37),
            new ACTokenId("ASSIGN", "operator", 38),
            new ACTokenId("LT", "operator", 39),
            new ACTokenId("BANG", "operator", 40),
            new ACTokenId("TILDE", "operator", 41),
            new ACTokenId("HOOK", "operator", 42),
            new ACTokenId("COLON", "operator", 43),
            new ACTokenId("EQ", "operator", 44),
            new ACTokenId("LE", "operator", 45),
            new ACTokenId("GE", "operator", 46),
            new ACTokenId("NE", "operator", 47),
            new ACTokenId("SC_OR", "operator", 48),
            new ACTokenId("SC_AND", "operator", 49),
            new ACTokenId("INCR", "operator", 50),
            new ACTokenId("DECR", "operator", 51),
            new ACTokenId("PLUS", "operator", 52),
            new ACTokenId("MINUS", "operator", 53),
            new ACTokenId("STAR", "operator", 54),
            new ACTokenId("SLASH", "operator", 55),
            new ACTokenId("BIT_AND", "operator", 56),
            new ACTokenId("BIT_OR", "operator", 57),
            new ACTokenId("XOR", "operator", 58),
            new ACTokenId("REM", "operator", 59),
            new ACTokenId("LSHIFT", "operator", 60),
            new ACTokenId("PLUSASSIGN", "operator", 61),
            new ACTokenId("MINUSASSIGN", "operator", 62),
            new ACTokenId("STARASSIGN", "operator", 63),
            new ACTokenId("SLASHASSIGN", "operator", 64),
            new ACTokenId("ANDASSIGN", "operator", 65),
            new ACTokenId("ORASSIGN", "operator", 66),
            new ACTokenId("XORASSIGN", "operator", 67),
            new ACTokenId("REMASSIGN", "operator", 68),
            new ACTokenId("LSHIFTASSIGN", "operator", 69),
            new ACTokenId("RSIGNEDSHIFTASSIGN", "operator", 70),
            new ACTokenId("ELLIPSIS", "operator", 71),
            new ACTokenId("AC_PREREQ", "keyword", 72),
            new ACTokenId("AC_INIT", "keyword", 73),
            new ACTokenId("AC_COPYRIGHT", "keyword", 74),
            new ACTokenId("AC_REVISION", "keyword", 75),
            new ACTokenId("AC_CONFIG_SRCDIR", "keyword", 76),
            new ACTokenId("AC_CONFIG_AUX_DIR", "keyword", 77),
            new ACTokenId("AC_CONFIG_FILES", "keyword", 78),
            new ACTokenId("AC_CONFIG_MACRO_DIRS", "keyword", 79),
            new ACTokenId("AC_LANG", "keyword", 80),
            new ACTokenId("AC_PROG_CC", "keyword", 81),
            new ACTokenId("AC_PROG_CXX", "keyword", 82),
            new ACTokenId("INTEGER_LITERAL", "literal", 83),
            new ACTokenId("DECIMAL_LITERAL", "literal", 84),
            new ACTokenId("HEX_LITERAL", "literal", 85),
            new ACTokenId("OCTAL_LITERAL", "literal", 86),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 87),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 88),
            new ACTokenId("DECIMAL_EXPONENT", "number", 89),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 90),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 91),
            new ACTokenId("CHARACTER_LITERAL", "literal", 92),
            new ACTokenId("STRING_LITERAL", "literal", 93),
            new ACTokenId("IDENTIFIER", "identifier", 94),
            new ACTokenId("LETTER", "identifier", 95),
            new ACTokenId("PART_LETTER", "identifier", 96), 
            new ACTokenId("TEXT", "text", 97)
        });

        idToToken = new HashMap<Integer, ACTokenId>();

        for (ACTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized ACTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }

        return idToToken.get(id);
    }

    @Override
    protected Collection<ACTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }

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
