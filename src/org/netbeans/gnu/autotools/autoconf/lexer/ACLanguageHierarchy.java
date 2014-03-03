/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
            new ACTokenId("INTEGER_LITERAL", "literal", 28),
            new ACTokenId("DECIMAL_LITERAL", "literal", 29),
            new ACTokenId("HEX_LITERAL", "literal", 30),
            new ACTokenId("OCTAL_LITERAL", "literal", 31),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 32),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 33),
            new ACTokenId("DECIMAL_EXPONENT", "number", 34),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 35),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 36),
            new ACTokenId("CHARACTER_LITERAL", "literal", 37),
            new ACTokenId("STRING_LITERAL", "literal", 38),
            new ACTokenId("IDENTIFIER", "identifier", 39),
            new ACTokenId("LETTER", "literal", 40),
            new ACTokenId("PART_LETTER", "literal", 41),
            new ACTokenId("LPAREN", "operator", 42),
            new ACTokenId("RPAREN", "operator", 43),
            new ACTokenId("LBRACE", "operator", 44),
            new ACTokenId("RBRACE", "operator", 45),
            new ACTokenId("LBRACKET", "operator", 46),
            new ACTokenId("RBRACKET", "operator", 47),
            new ACTokenId("SEMICOLON", "operator", 48),
            new ACTokenId("COMMA", "operator", 49),
            new ACTokenId("DOT", "operator", 50),
            new ACTokenId("AT", "operator", 51),
            new ACTokenId("ASSIGN", "operator", 52),
            new ACTokenId("LT", "operator", 53),
            new ACTokenId("BANG", "operator", 54),
            new ACTokenId("TILDE", "operator", 55),
            new ACTokenId("HOOK", "operator", 56),
            new ACTokenId("COLON", "operator", 57),
            new ACTokenId("EQ", "operator", 58),
            new ACTokenId("LE", "operator", 59),
            new ACTokenId("GE", "operator", 60),
            new ACTokenId("NE", "operator", 61),
            new ACTokenId("SC_OR", "operator", 62),
            new ACTokenId("SC_AND", "operator", 63),
            new ACTokenId("INCR", "operator", 64),
            new ACTokenId("DECR", "operator", 65),
            new ACTokenId("PLUS", "operator", 66),
            new ACTokenId("MINUS", "operator", 67),
            new ACTokenId("STAR", "operator", 68),
            new ACTokenId("SLASH", "operator", 69),
            new ACTokenId("BIT_AND", "operator", 70),
            new ACTokenId("BIT_OR", "operator", 71),
            new ACTokenId("XOR", "operator", 72),
            new ACTokenId("REM", "operator", 73),
            new ACTokenId("LSHIFT", "operator", 74),
            new ACTokenId("PLUSASSIGN", "operator", 75),
            new ACTokenId("MINUSASSIGN", "operator", 76),
            new ACTokenId("STARASSIGN", "operator", 77),
            new ACTokenId("SLASHASSIGN", "operator", 78),
            new ACTokenId("ANDASSIGN", "operator", 79),
            new ACTokenId("ORASSIGN", "operator", 80),
            new ACTokenId("XORASSIGN", "operator", 81),
            new ACTokenId("REMASSIGN", "operator", 82),
            new ACTokenId("LSHIFTASSIGN", "operator", 83),
            new ACTokenId("RSIGNEDSHIFTASSIGN", "operator", 84),
            new ACTokenId("ELLIPSIS", "operator", 85),
            new ACTokenId("TEXT", "literal", 86)
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
