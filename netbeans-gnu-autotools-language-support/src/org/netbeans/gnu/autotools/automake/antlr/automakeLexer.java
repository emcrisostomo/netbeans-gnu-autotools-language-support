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
		SINGLE_LINE_COMMENT=1, STRING=2, IF=3, ELSE=4, ENDIF=5, AM_VARIABLE=6, 
		ID=7, DOLLAR=8, LPAREN=9, RPAREN=10, LBRACE=11, RBRACE=12, PLUSASSIGN=13, 
		DEFINE=14, ASSIGN=15, COLON=16, ENL=17, NL=18, TAB=19, HORIZONTAL_WHITESPACE=20, 
		ANY=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SINGLE_LINE_COMMENT", "STRING", "'if'", "'else'", "'endif'", "AM_VARIABLE", 
		"ID", "'$'", "'('", "')'", "'{'", "'}'", "'+='", "':='", "'='", "':'", 
		"ENL", "NL", "'\t'", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"SINGLE_LINE_COMMENT", "STRING", "IF", "ELSE", "ENDIF", "AM_VARIABLE", 
		"ID", "AM_LETTER", "AM_LETTER_OR_DIGIT", "LOWERCASE_LETTER", "UPPERCASE_LETTER", 
		"ESC", "DOLLAR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUSASSIGN", 
		"DEFINE", "ASSIGN", "COLON", "LETTER", "DIGIT", "ENL", "NL", "TAB", "HORIZONTAL_WHITESPACE", 
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
		case 1: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 2: IF_action((RuleContext)_localctx, actionIndex); break;

		case 3: ELSE_action((RuleContext)_localctx, actionIndex); break;

		case 4: ENDIF_action((RuleContext)_localctx, actionIndex); break;

		case 5: AM_VARIABLE_action((RuleContext)_localctx, actionIndex); break;

		case 6: ID_action((RuleContext)_localctx, actionIndex); break;

		case 12: DOLLAR_action((RuleContext)_localctx, actionIndex); break;

		case 13: LPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 14: RPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 15: LBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 16: RBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 17: PLUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 18: DEFINE_action((RuleContext)_localctx, actionIndex); break;

		case 19: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 20: COLON_action((RuleContext)_localctx, actionIndex); break;

		case 23: ENL_action((RuleContext)_localctx, actionIndex); break;

		case 24: NL_action((RuleContext)_localctx, actionIndex); break;

		case 26: HORIZONTAL_WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 27: ANY_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:  readTab = false;  break;
		}
	}
	private void ENDIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  readTab = false;  break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  readTab = false;  break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:  readTab = false;  break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:  readTab = false;  break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:  readTab = false;  break;
		}
	}
	private void ANY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:  readTab = false;  break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:  readTab = false;  break;
		}
	}
	private void HORIZONTAL_WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:  readTab = false;  break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:  readTab = false;  break;
		}
	}
	private void AM_VARIABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  readTab = false;  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  readTab = false;  break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  readTab = false;  break;
		}
	}
	private void PLUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:  readTab = false;  break;
		}
	}
	private void DOLLAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:  readTab = false;  break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  readTab = false;  break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  readTab = false;  break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:  readTab = true;  break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:  readTab = false;  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25: return TAB_sempred((RuleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\7\7o\n\7\f\7\16\7"+
		"r\13\7\3\7\3\7\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\t\3\t\5\t\u0081"+
		"\n\t\3\n\3\n\3\n\5\n\u0086\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\5\32\u00b9"+
		"\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\6\35"+
		"\u00c7\n\35\r\35\16\35\u00c8\3\35\3\35\4K\u00c8\2\36\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\n\35\13\37\f!\r#\16%\17\'\20)"+
		"\21+\22-\2/\2\61\23\63\24\65\25\67\269\27\3\2\n\4\2\f\f\17\17\3\2aa\3"+
		"\2c|\3\2C\\\b\2$$^^ddppttvv\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"\u00d0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5F\3\2\2\2"+
		"\7Q\3\2\2\2\tV\3\2\2\2\13]\3\2\2\2\ri\3\2\2\2\17u\3\2\2\2\21\u0080\3\2"+
		"\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#"+
		"\u009a\3\2\2\2%\u009d\3\2\2\2\'\u00a2\3\2\2\2)\u00a7\3\2\2\2+\u00aa\3"+
		"\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b8\3\2\2\2"+
		"\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29\u00c6\3\2\2\2;<\7%\2\2<=\7%\2\2=A"+
		"\3\2\2\2>@\n\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C"+
		"A\3\2\2\2DE\b\2\2\2E\4\3\2\2\2FK\7$\2\2GJ\5\31\r\2HJ\13\2\2\2IG\3\2\2"+
		"\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7$\2"+
		"\2OP\b\3\3\2P\6\3\2\2\2QR\7k\2\2RS\7h\2\2ST\3\2\2\2TU\b\4\4\2U\b\3\2\2"+
		"\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z[\3\2\2\2[\\\b\5\5\2\\\n\3\2\2"+
		"\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`a\7k\2\2ab\7h\2\2bc\3\2\2\2cd\b\6\6\2d\f"+
		"\3\2\2\2eh\5\25\13\2fh\7a\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lp\7a\2\2mo\5\27\f\2nm\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\7\7\2t\16\3\2\2\2uy\5\21"+
		"\t\2vx\5\23\n\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3"+
		"\2\2\2|}\b\b\b\2}\20\3\2\2\2~\u0081\5-\27\2\177\u0081\t\3\2\2\u0080~\3"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\22\3\2\2\2\u0082\u0086\5-\27\2\u0083\u0086"+
		"\5/\30\2\u0084\u0086\t\3\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\24\3\2\2\2\u0087\u0088\t\4\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\t\5\2\2\u008a\30\3\2\2\2\u008b\u008c\7^\2\2\u008c\u008d\t\6\2\2"+
		"\u008d\32\3\2\2\2\u008e\u008f\7&\2\2\u008f\u0090\b\16\t\2\u0090\34\3\2"+
		"\2\2\u0091\u0092\7*\2\2\u0092\u0093\b\17\n\2\u0093\36\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\b\20\13\2\u0096 \3\2\2\2\u0097\u0098\7}\2\2\u0098"+
		"\u0099\b\21\f\2\u0099\"\3\2\2\2\u009a\u009b\7\177\2\2\u009b\u009c\b\22"+
		"\r\2\u009c$\3\2\2\2\u009d\u009e\7-\2\2\u009e\u009f\7?\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\b\23\16\2\u00a1&\3\2\2\2\u00a2\u00a3\7<\2\2\u00a3"+
		"\u00a4\7?\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\24\17\2\u00a6(\3\2\2\2"+
		"\u00a7\u00a8\7?\2\2\u00a8\u00a9\b\25\20\2\u00a9*\3\2\2\2\u00aa\u00ab\7"+
		"<\2\2\u00ab\u00ac\b\26\21\2\u00ac,\3\2\2\2\u00ad\u00ae\t\7\2\2\u00ae."+
		"\3\2\2\2\u00af\u00b0\t\b\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2"+
		"\u00b3\5\63\32\2\u00b3\u00b4\b\31\22\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\b\31\2\2\u00b6\62\3\2\2\2\u00b7\u00b9\7\17\2\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\b\32"+
		"\23\2\u00bc\64\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\6\33\2\2\u00bf"+
		"\66\3\2\2\2\u00c0\u00c1\t\t\2\2\u00c1\u00c2\b\34\24\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\b\34\2\2\u00c48\3\2\2\2\u00c5\u00c7\13\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\35\25\2\u00cb:\3\2\2\2\16\2AIKgipy\u0080"+
		"\u0085\u00b8\u00c8\26\2\3\2\3\3\2\3\4\3\3\5\4\3\6\5\3\7\6\3\b\7\3\16\b"+
		"\3\17\t\3\20\n\3\21\13\3\22\f\3\23\r\3\24\16\3\25\17\3\26\20\3\31\21\3"+
		"\32\22\3\34\23\3\35\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}