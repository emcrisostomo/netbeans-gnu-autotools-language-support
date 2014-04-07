// Generated from autoconf.g4 by ANTLR 4.2.1

package org.netbeans.gnu.autotools.autoconf.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class autoconfLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DNL_COMMENT=1, SINGLE_LINE_COMMENT=2, ID=3, LPAREN=4, RPAREN=5, LBRACKET=6, 
		RBRACKET=7, COMMA=8, LQUOTE=9, RQUOTE=10, WS=11, NL=12, HORIZONTAL_WHITESPACE=13, 
		ANY=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "'('", "')'", "'['", "']'", 
		"','", "'`'", "'''", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "COMMA", "LQUOTE", "RQUOTE", "M4_LETTER", "M4_LETTER_OR_DIGIT", 
		"LETTER", "DIGIT", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};


	public int quoteLevel = 0;
	public boolean quoted = false;


	public autoconfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "autoconf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5: LBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 6: RBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 8: LQUOTE_action((RuleContext)_localctx, actionIndex); break;

		case 9: RQUOTE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  --quoteLevel; if (quoteLevel < 0) quoteLevel = 0; if (quoteLevel == 0) quoted = false;  break;
		}
	}
	private void LBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  ++quoteLevel; quoted = true;  break;
		}
	}
	private void RBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  --quoteLevel; if (quoteLevel < 0) quoteLevel = 0; if (quoteLevel == 0) quoted = false;  break;
		}
	}
	private void LQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  ++quoteLevel; quoted = true;  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return SINGLE_LINE_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SINGLE_LINE_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !quoted;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2>\n\2\3\2\3\2\3\3\3\3"+
		"\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4P\n\4\f\4\16\4"+
		"S\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\6\20v\n\20\r\20\16\20w\3\21\5\21{\n\21\3\21\3\21\3\22\3\22\3"+
		"\23\6\23\u0082\n\23\r\23\16\23\u0083\3\u0083\2\24\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\r!\16#\17%\20\3\2\7\4"+
		"\2\f\f\17\17\3\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"\u008c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7M\3\2\2\2\tT\3\2\2\2\13"+
		"V\3\2\2\2\rX\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27"+
		"h\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37u\3\2\2\2!z\3\2\2\2#~"+
		"\3\2\2\2%\u0081\3\2\2\2\'(\7f\2\2()\7p\2\2)*\7n\2\2*,\3\2\2\2+-\5#\22"+
		"\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60\62\n\2\2\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65"+
		"\63\3\2\2\2\66\67\5!\21\2\67>\3\2\2\289\7f\2\29:\7p\2\2:;\7n\2\2;<\3\2"+
		"\2\2<>\5!\21\2=\'\3\2\2\2=8\3\2\2\2>?\3\2\2\2?@\b\2\2\2@\4\3\2\2\2AE\7"+
		"%\2\2BD\n\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HI\5!\21\2IJ\6\3\2\2JK\3\2\2\2KL\b\3\2\2L\6\3\2\2\2MQ\5\27\f\2N"+
		"P\5\31\r\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\b\3\2\2\2SQ\3\2\2"+
		"\2TU\7*\2\2U\n\3\2\2\2VW\7+\2\2W\f\3\2\2\2XY\7]\2\2YZ\b\7\3\2Z\16\3\2"+
		"\2\2[\\\7_\2\2\\]\b\b\4\2]\20\3\2\2\2^_\7.\2\2_\22\3\2\2\2`a\7b\2\2ab"+
		"\b\n\5\2b\24\3\2\2\2cd\7)\2\2de\b\13\6\2e\26\3\2\2\2fi\5\33\16\2gi\t\3"+
		"\2\2hf\3\2\2\2hg\3\2\2\2i\30\3\2\2\2jn\5\33\16\2kn\5\35\17\2ln\t\3\2\2"+
		"mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\32\3\2\2\2op\t\4\2\2p\34\3\2\2\2qr\t\5"+
		"\2\2r\36\3\2\2\2sv\5!\21\2tv\5#\22\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x \3\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}"+
		"\7\f\2\2}\"\3\2\2\2~\177\t\6\2\2\177$\3\2\2\2\u0080\u0082\13\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084&\3\2\2\2\16\2.\63=EQhmuwz\u0083\7\2\3\2\3\7\2\3\b\3\3\n\4\3"+
		"\13\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}