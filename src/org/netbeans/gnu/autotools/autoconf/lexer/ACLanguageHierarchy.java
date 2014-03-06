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
            new ACTokenId("MBRACKET", "identifier", 5),
            new ACTokenId("RBRACKET", "identifier", 6),
            new ACTokenId("BOOLEAN", "keyword", 8),
            new ACTokenId("BREAK", "keyword", 9),
            new ACTokenId("CASE", "keyword", 10),
            new ACTokenId("CHAR", "keyword", 11),
            new ACTokenId("CONTINUE", "keyword", 12),
            new ACTokenId("_DEFAULT", "keyword", 13),
            new ACTokenId("DO", "keyword", 14),
            new ACTokenId("DOUBLE", "keyword", 15),
            new ACTokenId("ELSE", "keyword", 16),
            new ACTokenId("FALSE", "keyword", 17),
            new ACTokenId("FINALLY", "keyword", 18),
            new ACTokenId("FLOAT", "keyword", 19),
            new ACTokenId("FOR", "keyword", 20),
            new ACTokenId("GOTO", "keyword", 21),
            new ACTokenId("IF", "keyword", 22),
            new ACTokenId("INT", "keyword", 23),
            new ACTokenId("LONG", "keyword", 24),
            new ACTokenId("NULL", "keyword", 25),
            new ACTokenId("RETURN", "keyword", 26),
            new ACTokenId("SHORT", "keyword", 27),
            new ACTokenId("SWITCH", "keyword", 28),
            new ACTokenId("TRUE", "keyword", 29),
            new ACTokenId("TRY", "keyword", 30),
            new ACTokenId("VOID", "keyword", 31),
            new ACTokenId("WHILE", "keyword", 32),
            new ACTokenId("LPAREN", "operator", 33),
            new ACTokenId("RPAREN", "operator", 34),
            new ACTokenId("LBRACE", "operator", 35),
            new ACTokenId("RBRACE", "operator", 36),
            new ACTokenId("SEMICOLON", "operator", 37),
            new ACTokenId("COMMA", "operator", 38),
            new ACTokenId("DOT", "operator", 39),
            new ACTokenId("AT", "operator", 40),
            new ACTokenId("ASSIGN", "operator", 41),
            new ACTokenId("LT", "operator", 42),
            new ACTokenId("BANG", "operator", 43),
            new ACTokenId("TILDE", "operator", 44),
            new ACTokenId("HOOK", "operator", 45),
            new ACTokenId("COLON", "operator", 46),
            new ACTokenId("EQ", "operator", 47),
            new ACTokenId("LE", "operator", 48),
            new ACTokenId("GE", "operator", 49),
            new ACTokenId("NE", "operator", 50),
            new ACTokenId("SC_OR", "operator", 51),
            new ACTokenId("SC_AND", "operator", 52),
            new ACTokenId("INCR", "operator", 53),
            new ACTokenId("DECR", "operator", 54),
            new ACTokenId("PLUS", "operator", 55),
            new ACTokenId("MINUS", "operator", 56),
            new ACTokenId("STAR", "operator", 57),
            new ACTokenId("SLASH", "operator", 58),
            new ACTokenId("BIT_AND", "operator", 59),
            new ACTokenId("BIT_OR", "operator", 60),
            new ACTokenId("XOR", "operator", 61),
            new ACTokenId("REM", "operator", 62),
            new ACTokenId("LSHIFT", "operator", 63),
            new ACTokenId("PLUSASSIGN", "operator", 64),
            new ACTokenId("MINUSASSIGN", "operator", 65),
            new ACTokenId("STARASSIGN", "operator", 66),
            new ACTokenId("SLASHASSIGN", "operator", 67),
            new ACTokenId("ANDASSIGN", "operator", 68),
            new ACTokenId("ORASSIGN", "operator", 69),
            new ACTokenId("XORASSIGN", "operator", 70),
            new ACTokenId("REMASSIGN", "operator", 71),
            new ACTokenId("LSHIFTASSIGN", "operator", 72),
            new ACTokenId("RSIGNEDSHIFTASSIGN", "operator", 73),
            new ACTokenId("ELLIPSIS", "operator", 74),
            new ACTokenId("INTEGER_LITERAL", "literal", 75),
            new ACTokenId("DECIMAL_LITERAL", "literal", 76),
            new ACTokenId("HEX_LITERAL", "literal", 77),
            new ACTokenId("OCTAL_LITERAL", "literal", 78),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 79),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 80),
            new ACTokenId("DECIMAL_EXPONENT", "number", 81),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 82),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 83),
            new ACTokenId("CHARACTER_LITERAL", "string", 84),
            new ACTokenId("STRING_LITERAL", "string", 85),
            new ACTokenId("AC_PREREQ", "autoconf", 86),
            new ACTokenId("AC_INIT", "autoconf", 87),
            new ACTokenId("AC_COPYRIGHT", "autoconf", 88),
            new ACTokenId("AC_REVISION", "autoconf", 89),
            new ACTokenId("AC_CONFIG_SRCDIR", "autoconf", 90),
            new ACTokenId("AC_CONFIG_AUX_DIR", "autoconf", 91),
            new ACTokenId("AC_CONFIG_FILES", "autoconf", 92),
            new ACTokenId("AC_CONFIG_MACRO_DIRS", "autoconf", 93),
            new ACTokenId("AC_LANG", "autoconf", 94),
            new ACTokenId("AC_PROG_CC", "autoconf", 95),
            new ACTokenId("AC_PROG_CXX", "autoconf", 96),
            new ACTokenId("AC_CONFIG_HEADERS", "autoconf", 97),
            new ACTokenId("AM_INIT_AUTOMAKE", "autoconf", 98),
            new ACTokenId("AC_CHECK_HEADERS", "autoconf", 99),
            new ACTokenId("AM_CONDITIONAL", "autoconf", 100),
            new ACTokenId("AC_CHECK_HEADER_STDBOOL", "autoconf", 101),
            new ACTokenId("AC_TYPE_SIZE_T", "autoconf", 102),
            new ACTokenId("AC_TYPE_UINT32_T", "autoconf", 103),
            new ACTokenId("AC_TYPE_MODE_T", "autoconf", 104),
            new ACTokenId("AC_FUNC_STRTOD", "autoconf", 105),
            new ACTokenId("AC_CHECK_FUNCS", "autoconf", 106),
            new ACTokenId("AC_MSG_ERROR", "autoconf", 107),
            new ACTokenId("AC_CHECK_DECLS", "autoconf", 108),
            new ACTokenId("AC_OUTPUT", "autoconf", 109),
            new ACTokenId("AC_MACRO", "autoconf-c-keyword", 110),
            new ACTokenId("AX_MACRO", "autoconf-x-keyword", 111),
            new ACTokenId("AM_MACRO", "autoconf-m-keyword", 112),
            new ACTokenId("IDENTIFIER", "identifier", 113),
            new ACTokenId("LETTER", "identifier", 114),
            new ACTokenId("PART_LETTER", "identifier", 115),
            new ACTokenId("TEXT", "text", 116)
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
