// Generated from automake.g4 by ANTLR 4.2.1

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
		T__2=1, T__1=2, T__0=3, SINGLE_LINE_COMMENT=4, STRING=5, AM_VARIABLE=6, 
		ID=7, DOLLAR=8, LPAREN=9, RPAREN=10, PLUSASSIGN=11, DEFINE=12, ASSIGN=13, 
		COLON=14, ENL=15, NL=16, TAB=17, HORIZONTAL_WHITESPACE=18, ANY=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'$('", "'${'", "'}'", "SINGLE_LINE_COMMENT", "STRING", "AM_VARIABLE", 
		"ID", "'$'", "'('", "')'", "'+='", "':='", "'='", "':'", "ENL", "NL", 
		"'\t'", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "SINGLE_LINE_COMMENT", "STRING", "AM_VARIABLE", 
		"ID", "AM_LETTER", "AM_LETTER_OR_DIGIT", "LOWERCASE_LETTER", "UPPERCASE_LETTER", 
		"ESC", "DOLLAR", "LPAREN", "RPAREN", "PLUSASSIGN", "DEFINE", "ASSIGN", 
		"COLON", "LETTER", "DIGIT", "ENL", "NL", "TAB", "HORIZONTAL_WHITESPACE", 
		"ANY"
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
		case 4: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 5: AM_VARIABLE_action((RuleContext)_localctx, actionIndex); break;

		case 6: ID_action((RuleContext)_localctx, actionIndex); break;

		case 12: DOLLAR_action((RuleContext)_localctx, actionIndex); break;

		case 13: LPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 14: RPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 15: PLUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 16: DEFINE_action((RuleContext)_localctx, actionIndex); break;

		case 17: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 18: COLON_action((RuleContext)_localctx, actionIndex); break;

		case 21: ENL_action((RuleContext)_localctx, actionIndex); break;

		case 22: NL_action((RuleContext)_localctx, actionIndex); break;

		case 24: HORIZONTAL_WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 25: ANY_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:  readTab = false;  break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  readTab = false;  break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:  readTab = false;  break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  readTab = false;  break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:  readTab = false;  break;
		}
	}
	private void ANY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:  readTab = false;  break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  readTab = false;  break;
		}
	}
	private void HORIZONTAL_WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:  readTab = false;  break;
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
		case 6:  readTab = false;  break;
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
		case 11:  readTab = true;  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23: return TAB_sempred((RuleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\7\7_\n\7\f\7\16"+
		"\7b\13\7\3\7\3\7\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\t\3\t\5\tq"+
		"\n\t\3\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\5\30\u00a3\n\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00b1\n\33\r\33\16\33\u00b2\3\33\3"+
		"\33\4O\u00b2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31"+
		"\2\33\n\35\13\37\f!\r#\16%\17\'\20)\2+\2-\21/\22\61\23\63\24\65\25\3\2"+
		"\n\4\2\f\f\17\17\3\2aa\3\2c|\3\2C\\\b\2$$^^ddppttvv\4\2C\\c|\3\2\62;\5"+
		"\2\13\13\16\16\"\"\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2"+
		"\7=\3\2\2\2\t?\3\2\2\2\13J\3\2\2\2\rY\3\2\2\2\17e\3\2\2\2\21p\3\2\2\2"+
		"\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0081"+
		"\3\2\2\2\37\u0084\3\2\2\2!\u0087\3\2\2\2#\u008c\3\2\2\2%\u0091\3\2\2\2"+
		"\'\u0094\3\2\2\2)\u0097\3\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u00a2\3"+
		"\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00b0\3\2\2\2\678\7&\2\28"+
		"9\7*\2\29\4\3\2\2\2:;\7&\2\2;<\7}\2\2<\6\3\2\2\2=>\7\177\2\2>\b\3\2\2"+
		"\2?@\7%\2\2@A\7%\2\2AE\3\2\2\2BD\n\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\b\5\2\2I\n\3\2\2\2JO\7$\2\2KN\5\31\r"+
		"\2LN\13\2\2\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2"+
		"\2\2QO\3\2\2\2RS\7$\2\2ST\b\6\3\2T\f\3\2\2\2UX\5\25\13\2VX\7a\2\2WU\3"+
		"\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\"+
		"`\7a\2\2]_\5\27\f\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cd\b\7\4\2d\16\3\2\2\2ei\5\21\t\2fh\5\23\n\2gf\3\2\2\2hk\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\b\b\5\2m\20\3\2\2\2nq\5"+
		")\25\2oq\t\3\2\2pn\3\2\2\2po\3\2\2\2q\22\3\2\2\2rv\5)\25\2sv\5+\26\2t"+
		"v\t\3\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\24\3\2\2\2wx\t\4\2\2x\26\3\2"+
		"\2\2yz\t\5\2\2z\30\3\2\2\2{|\7^\2\2|}\t\6\2\2}\32\3\2\2\2~\177\7&\2\2"+
		"\177\u0080\b\16\6\2\u0080\34\3\2\2\2\u0081\u0082\7*\2\2\u0082\u0083\b"+
		"\17\7\2\u0083\36\3\2\2\2\u0084\u0085\7+\2\2\u0085\u0086\b\20\b\2\u0086"+
		" \3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\7?\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\21\t\2\u008b\"\3\2\2\2\u008c\u008d\7<\2\2\u008d\u008e\7?\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\b\22\n\2\u0090$\3\2\2\2\u0091\u0092\7"+
		"?\2\2\u0092\u0093\b\23\13\2\u0093&\3\2\2\2\u0094\u0095\7<\2\2\u0095\u0096"+
		"\b\24\f\2\u0096(\3\2\2\2\u0097\u0098\t\7\2\2\u0098*\3\2\2\2\u0099\u009a"+
		"\t\b\2\2\u009a,\3\2\2\2\u009b\u009c\7^\2\2\u009c\u009d\5/\30\2\u009d\u009e"+
		"\b\27\r\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\27\2\2\u00a0.\3\2\2\2\u00a1"+
		"\u00a3\7\17\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\b\30\16\2\u00a6\60\3\2\2\2\u00a7"+
		"\u00a8\7\13\2\2\u00a8\u00a9\6\31\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\t\t"+
		"\2\2\u00ab\u00ac\b\32\17\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\32\2\2\u00ae"+
		"\64\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\b\33\20\2\u00b5\66\3\2\2\2\16\2EMOWY`ipu\u00a2\u00b2\21\2\3\2\3\6\2\3"+
		"\7\3\3\b\4\3\16\5\3\17\6\3\20\7\3\21\b\3\22\t\3\23\n\3\24\13\3\27\f\3"+
		"\30\r\3\32\16\3\33\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}