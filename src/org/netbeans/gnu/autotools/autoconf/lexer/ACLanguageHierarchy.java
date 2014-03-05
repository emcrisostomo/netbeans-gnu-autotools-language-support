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
 * @author Enrico M. Crisostomo
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
            new ACTokenId("INTEGER_LITERAL", "literal", 72),
            new ACTokenId("DECIMAL_LITERAL", "literal", 73),
            new ACTokenId("HEX_LITERAL", "literal", 74),
            new ACTokenId("OCTAL_LITERAL", "literal", 75),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 76),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 77),
            new ACTokenId("DECIMAL_EXPONENT", "number", 78),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 79),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 80),
            new ACTokenId("CHARACTER_LITERAL", "literal", 81),
            new ACTokenId("STRING_LITERAL", "literal", 82),
            new ACTokenId("M4_LITERAL", "literal", 83),
            new ACTokenId("AC_PREREQ", "keyword", 84),
            new ACTokenId("AC_INIT", "keyword", 85),
            new ACTokenId("AC_COPYRIGHT", "keyword", 86),
            new ACTokenId("AC_REVISION", "keyword", 87),
            new ACTokenId("AC_CONFIG_SRCDIR", "keyword", 88),
            new ACTokenId("AC_CONFIG_AUX_DIR", "keyword", 89),
            new ACTokenId("AC_CONFIG_FILES", "keyword", 90),
            new ACTokenId("AC_CONFIG_MACRO_DIRS", "keyword", 91),
            new ACTokenId("AC_LANG", "keyword", 92),
            new ACTokenId("AC_PROG_CC", "keyword", 93),
            new ACTokenId("AC_PROG_CXX", "keyword", 94),
            new ACTokenId("AC_CONFIG_HEADERS", "keyword", 95),
            new ACTokenId("AM_INIT_AUTOMAKE", "keyword", 96),
            new ACTokenId("AC_CHECK_HEADERS", "keyword", 97),
            new ACTokenId("AM_CONDITIONAL", "keyword", 98),
            new ACTokenId("AC_CHECK_HEADER_STDBOOL", "keyword", 99),
            new ACTokenId("AC_TYPE_SIZE_T", "keyword", 100),
            new ACTokenId("AC_TYPE_UINT32_T", "keyword", 101),
            new ACTokenId("AC_TYPE_MODE_T", "keyword", 102),
            new ACTokenId("AC_FUNC_STRTOD", "keyword", 103),
            new ACTokenId("AC_CHECK_FUNCS", "keyword", 104),
            new ACTokenId("AC_MSG_ERROR", "keyword", 105),
            new ACTokenId("AC_CHECK_DECLS", "keyword", 106),
            new ACTokenId("AC_OUTPUT", "keyword", 107),
            new ACTokenId("AC_MACRO", "keyword", 108),
            new ACTokenId("IDENTIFIER", "identifier", 109),
            new ACTokenId("LETTER", "identifier", 110),
            new ACTokenId("PART_LETTER", "identifier", 111),
            new ACTokenId("TEXT", "text", 112)
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
