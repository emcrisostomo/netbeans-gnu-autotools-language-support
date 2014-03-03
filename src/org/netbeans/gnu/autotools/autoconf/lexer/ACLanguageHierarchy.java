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
            new ACTokenId("SINGLE_LINE_COMMENT", "comment", 4),
            new ACTokenId("FORMAL_COMMENT", "comment", 5),
            new ACTokenId("MULTI_LINE_COMMENT", "comment", 6),
            new ACTokenId("ABSTRACT", "keyword", 8),
            new ACTokenId("ASSERT", "keyword", 9),
            new ACTokenId("BOOLEAN", "keyword", 10),
            new ACTokenId("BREAK", "keyword", 11),
            new ACTokenId("BYTE", "keyword", 12),
            new ACTokenId("CASE", "keyword", 13),
            new ACTokenId("CATCH", "keyword", 14),
            new ACTokenId("CHAR", "keyword", 15),
            new ACTokenId("CLASS", "keyword", 16),
            new ACTokenId("CONST", "keyword", 17),
            new ACTokenId("CONTINUE", "keyword", 18),
            new ACTokenId("_DEFAULT", "keyword", 19),
            new ACTokenId("DO", "keyword", 20),
            new ACTokenId("DOUBLE", "keyword", 21),
            new ACTokenId("ELSE", "keyword", 22),
            new ACTokenId("ENUM", "keyword", 23),
            new ACTokenId("EXTENDS", "keyword", 24),
            new ACTokenId("FALSE", "keyword", 25),
            new ACTokenId("FINAL", "keyword", 26),
            new ACTokenId("FINALLY", "keyword", 27),
            new ACTokenId("FLOAT", "keyword", 28),
            new ACTokenId("FOR", "keyword", 29),
            new ACTokenId("GOTO", "keyword", 30),
            new ACTokenId("IF", "keyword", 31),
            new ACTokenId("IMPLEMENTS", "keyword", 32),
            new ACTokenId("IMPORT", "keyword", 33),
            new ACTokenId("INSTANCEOF", "keyword", 34),
            new ACTokenId("INT", "keyword", 35),
            new ACTokenId("INTERFACE", "keyword", 36),
            new ACTokenId("LONG", "keyword", 37),
            new ACTokenId("NATIVE", "keyword", 38),
            new ACTokenId("NEW", "keyword", 39),
            new ACTokenId("NULL", "keyword", 40),
            new ACTokenId("PACKAGE", "keyword", 41),
            new ACTokenId("PRIVATE", "keyword", 42),
            new ACTokenId("PROTECTED", "keyword", 43),
            new ACTokenId("PUBLIC", "keyword", 44),
            new ACTokenId("RETURN", "keyword", 45),
            new ACTokenId("SHORT", "keyword", 46),
            new ACTokenId("STATIC", "keyword", 47),
            new ACTokenId("STRICTFP", "keyword", 48),
            new ACTokenId("SUPER", "keyword", 49),
            new ACTokenId("SWITCH", "keyword", 50),
            new ACTokenId("SYNCHRONIZED", "keyword", 51),
            new ACTokenId("THIS", "keyword", 52),
            new ACTokenId("THROW", "keyword", 53),
            new ACTokenId("THROWS", "keyword", 54),
            new ACTokenId("TRANSIENT", "keyword", 55),
            new ACTokenId("TRUE", "keyword", 56),
            new ACTokenId("TRY", "keyword", 57),
            new ACTokenId("VOID", "keyword", 58),
            new ACTokenId("VOLATILE", "keyword", 59),
            new ACTokenId("WHILE", "keyword", 60),
            new ACTokenId("INTEGER_LITERAL", "literal", 61),
            new ACTokenId("DECIMAL_LITERAL", "literal", 62),
            new ACTokenId("HEX_LITERAL", "literal", 63),
            new ACTokenId("OCTAL_LITERAL", "literal", 64),
            new ACTokenId("FLOATING_POINT_LITERAL", "literal", 65),
            new ACTokenId("DECIMAL_FLOATING_POINT_LITERAL", "literal", 66),
            new ACTokenId("DECIMAL_EXPONENT", "number", 67),
            new ACTokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "literal", 68),
            new ACTokenId("HEXADECIMAL_EXPONENT", "number", 69),
            new ACTokenId("CHARACTER_LITERAL", "literal", 70),
            new ACTokenId("STRING_LITERAL", "literal", 71),
            new ACTokenId("IDENTIFIER", "identifier", 72),
            new ACTokenId("LETTER", "literal", 73),
            new ACTokenId("PART_LETTER", "literal", 74),
            new ACTokenId("LPAREN", "operator", 75),
            new ACTokenId("RPAREN", "operator", 76),
            new ACTokenId("LBRACE", "operator", 77),
            new ACTokenId("RBRACE", "operator", 78),
            new ACTokenId("LBRACKET", "operator", 79),
            new ACTokenId("RBRACKET", "operator", 80),
            new ACTokenId("SEMICOLON", "operator", 81),
            new ACTokenId("COMMA", "operator", 82),
            new ACTokenId("DOT", "operator", 83),
            new ACTokenId("AT", "operator", 84),
            new ACTokenId("ASSIGN", "operator", 85),
            new ACTokenId("LT", "operator", 86),
            new ACTokenId("BANG", "operator", 87),
            new ACTokenId("TILDE", "operator", 88),
            new ACTokenId("HOOK", "operator", 89),
            new ACTokenId("COLON", "operator", 90),
            new ACTokenId("EQ", "operator", 91),
            new ACTokenId("LE", "operator", 92),
            new ACTokenId("GE", "operator", 93),
            new ACTokenId("NE", "operator", 94),
            new ACTokenId("SC_OR", "operator", 95),
            new ACTokenId("SC_AND", "operator", 96),
            new ACTokenId("INCR", "operator", 97),
            new ACTokenId("DECR", "operator", 98),
            new ACTokenId("PLUS", "operator", 99),
            new ACTokenId("MINUS", "operator", 100),
            new ACTokenId("STAR", "operator", 101),
            new ACTokenId("SLASH", "operator", 102),
            new ACTokenId("BIT_AND", "operator", 103),
            new ACTokenId("BIT_OR", "operator", 104),
            new ACTokenId("XOR", "operator", 105),
            new ACTokenId("REM", "operator", 106),
            new ACTokenId("LSHIFT", "operator", 107),
            new ACTokenId("PLUSASSIGN", "operator", 108),
            new ACTokenId("MINUSASSIGN", "operator", 109),
            new ACTokenId("STARASSIGN", "operator", 110),
            new ACTokenId("SLASHASSIGN", "operator", 111),
            new ACTokenId("ANDASSIGN", "operator", 112),
            new ACTokenId("ORASSIGN", "operator", 113),
            new ACTokenId("XORASSIGN", "operator", 114),
            new ACTokenId("REMASSIGN", "operator", 115),
            new ACTokenId("LSHIFTASSIGN", "operator", 116),
            new ACTokenId("RSIGNEDSHIFTASSIGN", "operator", 117),
            new ACTokenId("RUNSIGNEDSHIFTASSIGN", "operator", 118),
            new ACTokenId("ELLIPSIS", "operator", 119),
            new ACTokenId("TEXT", "literal", 120)
            //new ACTokenId("RUNSIGNEDSHIFT", "operator", 120),
        //new ACTokenId("RSIGNEDSHIFT", "operator", 121),
        //new ACTokenId("GT", "operator", 122)
        }
        );

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
