// Generated from autoconf.g4 by ANTLR 4.2.2

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
		RBRACKET=7, COMMA=8, WS=9, NL=10, HORIZONTAL_WHITESPACE=11, ANY=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "'('", "')'", "'['", "']'", 
		"','", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "COMMA", "M4_LETTER", "M4_LETTER_OR_DIGIT", "LETTER", "DIGIT", 
		"WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\2\3\2\3\3\3\3\7\3@\n\3\f\3\16\3C\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\5\13d\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\6\16l\n\16\r\16\16\16m\3\17\5\17q\n\17\3\17"+
		"\3\17\3\20\3\20\3\21\6\21x\n\21\r\21\16\21y\3y\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\13\35\f\37\r!\16\3\2\7\4\2\f\f"+
		"\17\17\3\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"\u0082\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\39\3"+
		"\2\2\2\5=\3\2\2\2\7I\3\2\2\2\tP\3\2\2\2\13R\3\2\2\2\rT\3\2\2\2\17W\3\2"+
		"\2\2\21Z\3\2\2\2\23^\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33k\3"+
		"\2\2\2\35p\3\2\2\2\37t\3\2\2\2!w\3\2\2\2#$\7f\2\2$%\7p\2\2%&\7n\2\2&("+
		"\3\2\2\2\')\5\37\20\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+/\3\2\2"+
		"\2,.\n\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2"+
		"\61/\3\2\2\2\62\63\5\35\17\2\63:\3\2\2\2\64\65\7f\2\2\65\66\7p\2\2\66"+
		"\67\7n\2\2\678\3\2\2\28:\5\35\17\29#\3\2\2\29\64\3\2\2\2:;\3\2\2\2;<\b"+
		"\2\2\2<\4\3\2\2\2=A\7%\2\2>@\n\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BD\3\2\2\2CA\3\2\2\2DE\5\35\17\2EF\6\3\2\2FG\3\2\2\2GH\b\3\2\2H"+
		"\6\3\2\2\2IM\5\23\n\2JL\5\25\13\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2N\b\3\2\2\2OM\3\2\2\2PQ\7*\2\2Q\n\3\2\2\2RS\7+\2\2S\f\3\2\2\2TU\7"+
		"]\2\2UV\b\7\3\2V\16\3\2\2\2WX\7_\2\2XY\b\b\4\2Y\20\3\2\2\2Z[\7.\2\2[\22"+
		"\3\2\2\2\\_\5\27\f\2]_\t\3\2\2^\\\3\2\2\2^]\3\2\2\2_\24\3\2\2\2`d\5\27"+
		"\f\2ad\5\31\r\2bd\t\3\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\26\3\2\2\2ef"+
		"\t\4\2\2f\30\3\2\2\2gh\t\5\2\2h\32\3\2\2\2il\5\35\17\2jl\5\37\20\2ki\3"+
		"\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\34\3\2\2\2oq\7\17\2\2"+
		"po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s\36\3\2\2\2tu\t\6\2\2u \3\2\2"+
		"\2vx\13\2\2\2wv\3\2\2\2xy\3\2\2\2yz\3\2\2\2yw\3\2\2\2z\"\3\2\2\2\16\2"+
		"*/9AM^ckmpy\5\2\3\2\3\7\2\3\b\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}