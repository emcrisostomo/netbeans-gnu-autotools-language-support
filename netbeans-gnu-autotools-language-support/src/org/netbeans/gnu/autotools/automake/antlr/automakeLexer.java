// Generated from automake.g4 by ANTLR 4.2.2

package org.netbeans.gnu.autotools.automake.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class automakeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, STRING=2, AM_VARIABLE=3, ID=4, DOLLAR=5, LPAREN=6, 
		RPAREN=7, LBRACE=8, RBRACE=9, PLUSASSIGN=10, DEFINE=11, ASSIGN=12, COLON=13, 
		ENL=14, NL=15, TAB=16, HORIZONTAL_WHITESPACE=17, ANY=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SINGLE_LINE_COMMENT", "STRING", "AM_VARIABLE", "ID", "'$'", "'('", "')'", 
		"'{'", "'}'", "'+='", "':='", "'='", "':'", "ENL", "NL", "'\t'", "HORIZONTAL_WHITESPACE", 
		"ANY"
	};
	public static final String[] ruleNames = {
		"SINGLE_LINE_COMMENT", "STRING", "AM_VARIABLE", "ID", "AM_LETTER", "AM_LETTER_OR_DIGIT", 
		"LOWERCASE_LETTER", "UPPERCASE_LETTER", "ESC", "DOLLAR", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "PLUSASSIGN", "DEFINE", "ASSIGN", "COLON", "LETTER", 
		"DIGIT", "ENL", "NL", "TAB", "HORIZONTAL_WHITESPACE", "ANY"
	};


	public boolean readTab = true;


	public automakeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "automake.g4"; }

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
		case 1: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 2: AM_VARIABLE_action((RuleContext)_localctx, actionIndex); break;

		case 3: ID_action((RuleContext)_localctx, actionIndex); break;

		case 9: DOLLAR_action((RuleContext)_localctx, actionIndex); break;

		case 10: LPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 11: RPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 12: LBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 13: RBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 14: PLUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 15: DEFINE_action((RuleContext)_localctx, actionIndex); break;

		case 16: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 17: COLON_action((RuleContext)_localctx, actionIndex); break;

		case 20: ENL_action((RuleContext)_localctx, actionIndex); break;

		case 21: NL_action((RuleContext)_localctx, actionIndex); break;

		case 23: HORIZONTAL_WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 24: ANY_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:  readTab = false;  break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  readTab = false;  break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:  readTab = false;  break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  readTab = false;  break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:  readTab = false;  break;
		}
	}
	private void ANY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:  readTab = false;  break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:  readTab = false;  break;
		}
	}
	private void HORIZONTAL_WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:  readTab = false;  break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  readTab = false;  break;
		}
	}
	private void AM_VARIABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  readTab = false;  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  readTab = false;  break;
		}
	}
	private void PLUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:  readTab = false;  break;
		}
	}
	private void DOLLAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  readTab = false;  break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  readTab = false;  break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:  readTab = true;  break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:  readTab = false;  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22: return TAB_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean TAB_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return readTab;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\4\3\4\7\4N\n\4\f\4\16\4Q"+
		"\13\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\5\3\5\7\5^\n\5\f\5\16"+
		"\5a\13\5\3\5\3\5\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\5\27\u009f\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\6\32\u00ad\n\32\r\32\16\32\u00ae\3\32\3\32\4E\u00ae\2\33\3"+
		"\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25\7\27\b\31\t\33\n\35\13\37\f"+
		"!\r#\16%\17\'\2)\2+\20-\21/\22\61\23\63\24\3\2\n\4\2\f\f\17\17\3\2aa\3"+
		"\2c|\3\2C\\\b\2$$^^ddppttvv\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"\u00b6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\3\65\3\2\2\2\5@\3\2\2\2\7O\3\2\2\2\t[\3\2\2\2\13f\3\2\2\2\rk"+
		"\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25t\3\2\2\2\27w\3\2\2\2\31"+
		"z\3\2\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37\u0083\3\2\2\2!\u0088\3\2\2\2"+
		"#\u008d\3\2\2\2%\u0090\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3"+
		"\2\2\2-\u009e\3\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2\63\u00ac\3\2\2\2"+
		"\65\66\7%\2\2\66\67\7%\2\2\67;\3\2\2\28:\n\2\2\298\3\2\2\2:=\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\2\2\2?\4\3\2\2\2@E\7$\2\2"+
		"AD\5\23\n\2BD\13\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2"+
		"\2FH\3\2\2\2GE\3\2\2\2HI\7$\2\2IJ\b\3\3\2J\6\3\2\2\2KN\5\17\b\2LN\7a\2"+
		"\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2"+
		"\2RV\7a\2\2SU\5\21\t\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XV\3\2\2\2YZ\b\4\4\2Z\b\3\2\2\2[_\5\13\6\2\\^\5\r\7\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\b\5\5\2c\n\3\2\2\2dg"+
		"\5\'\24\2eg\t\3\2\2fd\3\2\2\2fe\3\2\2\2g\f\3\2\2\2hl\5\'\24\2il\5)\25"+
		"\2jl\t\3\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\16\3\2\2\2mn\t\4\2\2n\20\3"+
		"\2\2\2op\t\5\2\2p\22\3\2\2\2qr\7^\2\2rs\t\6\2\2s\24\3\2\2\2tu\7&\2\2u"+
		"v\b\13\6\2v\26\3\2\2\2wx\7*\2\2xy\b\f\7\2y\30\3\2\2\2z{\7+\2\2{|\b\r\b"+
		"\2|\32\3\2\2\2}~\7}\2\2~\177\b\16\t\2\177\34\3\2\2\2\u0080\u0081\7\177"+
		"\2\2\u0081\u0082\b\17\n\2\u0082\36\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085"+
		"\7?\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\20\13\2\u0087 \3\2\2\2\u0088"+
		"\u0089\7<\2\2\u0089\u008a\7?\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\21"+
		"\f\2\u008c\"\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\b\22\r\2\u008f$\3"+
		"\2\2\2\u0090\u0091\7<\2\2\u0091\u0092\b\23\16\2\u0092&\3\2\2\2\u0093\u0094"+
		"\t\7\2\2\u0094(\3\2\2\2\u0095\u0096\t\b\2\2\u0096*\3\2\2\2\u0097\u0098"+
		"\7^\2\2\u0098\u0099\5-\27\2\u0099\u009a\b\26\17\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\b\26\2\2\u009c,\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\b\27\20\2\u00a2.\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\6\30"+
		"\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\t\t\2\2\u00a7\u00a8\b\31\21\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\31\2\2\u00aa\62\3\2\2\2\u00ab\u00ad\13\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\32\22\2\u00b1\64\3\2"+
		"\2\2\16\2;CEMOV_fk\u009e\u00ae\23\2\3\2\3\3\2\3\4\3\3\5\4\3\13\5\3\f\6"+
		"\3\r\7\3\16\b\3\17\t\3\20\n\3\21\13\3\22\f\3\23\r\3\26\16\3\27\17\3\31"+
		"\20\3\32\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}