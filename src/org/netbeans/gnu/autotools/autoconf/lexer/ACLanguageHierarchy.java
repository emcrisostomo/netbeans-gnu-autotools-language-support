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


  /** RegularExpression Id. */
  int LE = 50;
  /** RegularExpression Id. */
  int GE = 51;
  /** RegularExpression Id. */
  int NE = 52;
  /** RegularExpression Id. */
  int SC_OR = 53;
  /** RegularExpression Id. */
  int SC_AND = 54;
  /** RegularExpression Id. */
  int INCR = 55;
  /** RegularExpression Id. */
  int DECR = 56;
  /** RegularExpression Id. */
  int PLUS = 57;
  /** RegularExpression Id. */
  int MINUS = 58;
  /** RegularExpression Id. */
  int STAR = 59;
  /** RegularExpression Id. */
  int SLASH = 60;
  /** RegularExpression Id. */
  int BIT_AND = 61;
  /** RegularExpression Id. */
  int BIT_OR = 62;
  /** RegularExpression Id. */
  int XOR = 63;
  /** RegularExpression Id. */
  int REM = 64;
  /** RegularExpression Id. */
  int LSHIFT = 65;
  /** RegularExpression Id. */
  int PLUSASSIGN = 66;
  /** RegularExpression Id. */
  int MINUSASSIGN = 67;
  /** RegularExpression Id. */
  int STARASSIGN = 68;
  /** RegularExpression Id. */
  int SLASHASSIGN = 69;
  /** RegularExpression Id. */
  int ANDASSIGN = 70;
  /** RegularExpression Id. */
  int ORASSIGN = 71;
  /** RegularExpression Id. */
  int XORASSIGN = 72;
  /** RegularExpression Id. */
  int REMASSIGN = 73;
  /** RegularExpression Id. */
  int LSHIFTASSIGN = 74;
  /** RegularExpression Id. */
  int RSIGNEDSHIFTASSIGN = 75;
  /** RegularExpression Id. */
  int ELLIPSIS = 76;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 77;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 78;
  /** RegularExpression Id. */
  int HEX_LITERAL = 79;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 80;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 81;
  /** RegularExpression Id. */
  int DECIMAL_FLOATING_POINT_LITERAL = 82;
  /** RegularExpression Id. */
  int DECIMAL_EXPONENT = 83;
  /** RegularExpression Id. */
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 84;
  /** RegularExpression Id. */
  int HEXADECIMAL_EXPONENT = 85;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 86;
  /** RegularExpression Id. */
  int STRING_LITERAL = 87;
  /** RegularExpression Id. */
  int AC_PREREQ = 88;
  /** RegularExpression Id. */
  int AC_INIT = 89;
  /** RegularExpression Id. */
  int AC_COPYRIGHT = 90;
  /** RegularExpression Id. */
  int AC_REVISION = 91;
  /** RegularExpression Id. */
  int AC_CONFIG_SRCDIR = 92;
  /** RegularExpression Id. */
  int AC_CONFIG_AUX_DIR = 93;
  /** RegularExpression Id. */
  int AC_CONFIG_FILES = 94;
  /** RegularExpression Id. */
  int AC_CONFIG_MACRO_DIRS = 95;
  /** RegularExpression Id. */
  int AC_LANG = 96;
  /** RegularExpression Id. */
  int AC_PROG_CC = 97;
  /** RegularExpression Id. */
  int AC_PROG_CXX = 98;
  /** RegularExpression Id. */
  int AC_CONFIG_HEADERS = 99;
  /** RegularExpression Id. */
  int AM_INIT_AUTOMAKE = 100;
  /** RegularExpression Id. */
  int AC_CHECK_HEADERS = 101;
  /** RegularExpression Id. */
  int AM_CONDITIONAL = 102;
  /** RegularExpression Id. */
  int AC_CHECK_HEADER_STDBOOL = 103;
  /** RegularExpression Id. */
  int AC_TYPE_SIZE_T = 104;
  /** RegularExpression Id. */
  int AC_TYPE_UINT32_T = 105;
  /** RegularExpression Id. */
  int AC_TYPE_MODE_T = 106;
  /** RegularExpression Id. */
  int AC_FUNC_STRTOD = 107;
  /** RegularExpression Id. */
  int AC_CHECK_FUNCS = 108;
  /** RegularExpression Id. */
  int AC_MSG_ERROR = 109;
  /** RegularExpression Id. */
  int AC_CHECK_DECLS = 110;
  /** RegularExpression Id. */
  int AC_OUTPUT = 111;
  /** RegularExpression Id. */
  int AC_MACRO = 112;
  /** RegularExpression Id. */
  int AX_MACRO = 113;
  /** RegularExpression Id. */
  int AM_MACRO = 114;
  /** RegularExpression Id. */
  int IDENTIFIER = 115;
  /** RegularExpression Id. */
  int LETTER = 116;
  /** RegularExpression Id. */
  int PART_LETTER = 117;
  /** RegularExpression Id. */
  int TEXT = 119;

  
    private static void init() {
        tokens = Arrays.asList(new ACTokenId[]{
            new ACTokenId("EOF", "whitespace", 0),
            new ACTokenId("WHITESPACE", "whitespace", 1),
            new ACTokenId("SINGLE_LINE_COMMENT", "comment", 2),
            new ACTokenId("LBRACKET", "operator", 3),
            new ACTokenId("MLBRACKET", "operator", 4),
            new ACTokenId("MRBRACKET", "operator", 5),
            new ACTokenId("RBRACKET", "operator", 6),
            new ACTokenId("BOOLEAN", "keyword", 7),
            new ACTokenId("BREAK", "keyword", 8),
            new ACTokenId("CASE", "keyword", 9),
            new ACTokenId("CHAR", "keyword", 10),
            new ACTokenId("CONTINUE", "keyword", 11),
            new ACTokenId("_DEFAULT", "keyword", 12),
            new ACTokenId("DO", "keyword", 13),
            new ACTokenId("DONE", "keyword", 14),
            new ACTokenId("DOUBLE", "keyword", 15),
            new ACTokenId("ELSE", "keyword", 16),
            new ACTokenId("FALSE", "keyword", 17),
            new ACTokenId("FINALLY", "keyword", 18),
            new ACTokenId("FLOAT", "keyword", 19),
            new ACTokenId("FOR", "keyword", 20),
            new ACTokenId("GOTO", "keyword", 21),
            new ACTokenId("IF", "keyword", 22),
            new ACTokenId("FI", "keyword", 23),
            new ACTokenId("INT", "keyword", 24),
            new ACTokenId("LONG", "keyword", 25),
            new ACTokenId("NULL", "keyword", 26),
            new ACTokenId("RETURN", "keyword", 27),
            new ACTokenId("SHORT", "keyword", 28),
            new ACTokenId("SWITCH", "keyword", 29),
            new ACTokenId("THEN", "keyword", 30),
            new ACTokenId("TRUE", "keyword", 31),
            new ACTokenId("TRY", "keyword", 32),
            new ACTokenId("VOID", "keyword", 33),
            new ACTokenId("WHILE", "keyword", 34),
            new ACTokenId("LPAREN", "operator", 35),
            new ACTokenId("RPAREN", "operator", 36),
            new ACTokenId("LBRACE", "operator", 37),
            new ACTokenId("RBRACE", "operator", 38),
            new ACTokenId("SEMICOLON", "operator", 39),
            new ACTokenId("COMMA", "operator", 40),
            new ACTokenId("DOT", "operator", 41),
            new ACTokenId("AT", "operator", 42),
            new ACTokenId("ASSIGN", "operator", 43),
            new ACTokenId("LT", "operator", 44),
            new ACTokenId("BANG", "operator", 45),
            new ACTokenId("TILDE", "operator", 46),
            new ACTokenId("HOOK", "operator", 47),
            new ACTokenId("COLON", "operator", 48),
            new ACTokenId("EQ", "operator", 49),
            
            new ACTokenId("LE", "operator", 50),
            new ACTokenId("GE", "operator", 51),
            new ACTokenId("NE", "operator", 52),
            new ACTokenId("SC_OR", "operator", 53),
            new ACTokenId("SC_AND", "operator", 54),
            new ACTokenId("INCR", "operator", 55),
            new ACTokenId("DECR", "operator", 56),
            new ACTokenId("PLUS", "operator", 57),
            new ACTokenId("MINUS", "operator", 58),
            new ACTokenId("STAR", "operator", 59),
            new ACTokenId("SLASH", "operator", 60),
            new ACTokenId("BIT_AND", "operator", 61),
            new ACTokenId("BIT_OR", "operator", 62),
            new ACTokenId("XOR", "operator", 63),
            new ACTokenId("REM", "operator", 64),
            new ACTokenId("LSHIFT", "operator", 65),
            new ACTokenId("PLUSASSIGN", "operator", 66),
            new ACTokenId("MINUSASSIGN", "operator", 67),
            new ACTokenId("STARASSIGN", "operator", 68),
            new ACTokenId("SLASHASSIGN", "operator", 69),
            new ACTokenId("ANDASSIGN", "operator", 70),
            new ACTokenId("ORASSIGN", "operator", 71),
            new ACTokenId("XORASSIGN", "operator", 72),
            new ACTokenId("REMASSIGN", "operator", 73),
            new ACTokenId("LSHIFTASSIGN", "operator", 74),
            new ACTokenId("RSIGNEDSHIFTASSIGN", "operator", 75),
            new ACTokenId("ELLIPSIS", "operator", 76),
            new ACTokenId("INTEGER_LITERAL", "literal", 77),
            new ACTokenId("DECIMAL_LITERAL", "literal", 78),
            new ACTokenId("HEX_LITERAL", "literal", 79),
            new ACTokenId("OCTAL_LITERAL", "literal", 80),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 81),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 82),
            new ACTokenId("DECIMAL_EXPONENT", "number", 83),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 84),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 85),
            new ACTokenId("CHARACTER_LITERAL", "string", 86),
            new ACTokenId("STRING_LITERAL", "string", 87),
            new ACTokenId("AC_PREREQ", "autoconf", 88),
            new ACTokenId("AC_INIT", "autoconf", 89),
            new ACTokenId("AC_COPYRIGHT", "autoconf", 90),
            new ACTokenId("AC_REVISION", "autoconf", 91),
            new ACTokenId("AC_CONFIG_SRCDIR", "autoconf", 92),
            new ACTokenId("AC_CONFIG_AUX_DIR", "autoconf", 93),
            new ACTokenId("AC_CONFIG_FILES", "autoconf", 94),
            new ACTokenId("AC_CONFIG_MACRO_DIRS", "autoconf", 95),
            new ACTokenId("AC_LANG", "autoconf", 96),
            new ACTokenId("AC_PROG_CC", "autoconf", 97),
            new ACTokenId("AC_PROG_CXX", "autoconf", 98),
            new ACTokenId("AC_CONFIG_HEADERS", "autoconf", 99),
            new ACTokenId("AM_INIT_AUTOMAKE", "autoconf", 100),
            new ACTokenId("AC_CHECK_HEADERS", "autoconf", 101),
            new ACTokenId("AM_CONDITIONAL", "autoconf", 102),
            new ACTokenId("AC_CHECK_HEADER_STDBOOL", "autoconf", 103),
            new ACTokenId("AC_TYPE_SIZE_T", "autoconf", 104),
            new ACTokenId("AC_TYPE_UINT32_T", "autoconf", 105),
            new ACTokenId("AC_TYPE_MODE_T", "autoconf", 106),
            new ACTokenId("AC_FUNC_STRTOD", "autoconf", 107),
            new ACTokenId("AC_CHECK_FUNCS", "autoconf", 108),
            new ACTokenId("AC_MSG_ERROR", "autoconf", 109),
            new ACTokenId("AC_CHECK_DECLS", "autoconf", 110),
            new ACTokenId("AC_OUTPUT", "autoconf", 111),
            new ACTokenId("AC_MACRO", "autoconf-c-keyword", 112),
            new ACTokenId("AX_MACRO", "autoconf-x-keyword", 113),
            new ACTokenId("AM_MACRO", "autoconf-m-keyword", 114),
            new ACTokenId("IDENTIFIER", "identifier", 115),
            new ACTokenId("LETTER", "identifier", 116),
            new ACTokenId("PART_LETTER", "identifier", 117),
            new ACTokenId("TEXT", "text", 119)
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
