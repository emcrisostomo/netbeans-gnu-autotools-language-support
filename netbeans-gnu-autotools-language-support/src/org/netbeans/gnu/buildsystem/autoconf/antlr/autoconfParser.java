// Generated from autoconf.g4 by ANTLR 4.2.2

package org.netbeans.gnu.buildsystem.autoconf.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class autoconfParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DNL_COMMENT=1, SINGLE_LINE_COMMENT=2, ID=3, LPAREN=4, RPAREN=5, LBRACKET=6, 
		RBRACKET=7, COMMA=8, WS=9, NL=10, HORIZONTAL_WHITESPACE=11, ANY=12;
	public static final String[] tokenNames = {
		"<INVALID>", "DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "'('", "')'", 
		"'['", "']'", "','", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_statement = 1, RULE_quote = 2, RULE_expr = 3, 
		RULE_exprParameters = 4, RULE_exprParameter = 5, RULE_parenthesizedText = 6, 
		RULE_verbatimText = 7, RULE_punctuation = 8;
	public static final String[] ruleNames = {
		"compilationUnit", "statement", "quote", "expr", "exprParameters", "exprParameter", 
		"parenthesizedText", "verbatimText", "punctuation"
	};

	@Override
	public String getGrammarFileName() { return "autoconf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public autoconfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PunctuationContext punctuation(int i) {
			return getRuleContext(PunctuationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(autoconfParser.EOF, 0); }
		public List<PunctuationContext> punctuation() {
			return getRuleContexts(PunctuationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACKET) | (1L << COMMA) | (1L << WS) | (1L << NL) | (1L << ANY))) != 0)) {
				{
				setState(20);
				switch (_input.LA(1)) {
				case ID:
				case LBRACKET:
				case WS:
				case NL:
				case ANY:
					{
					setState(18); statement();
					}
					break;
				case LPAREN:
				case RPAREN:
				case COMMA:
					{
					setState(19); punctuation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); expr();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); quote();
				}
				break;
			case WS:
			case NL:
			case ANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); verbatimText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(autoconfParser.RBRACKET, 0); }
		public PunctuationContext punctuation(int i) {
			return getRuleContext(PunctuationContext.class,i);
		}
		public List<PunctuationContext> punctuation() {
			return getRuleContexts(PunctuationContext.class);
		}
		public TerminalNode LBRACKET() { return getToken(autoconfParser.LBRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(LBRACKET);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACKET) | (1L << COMMA) | (1L << WS) | (1L << NL) | (1L << ANY))) != 0)) {
				{
				setState(35);
				switch (_input.LA(1)) {
				case ID:
				case LBRACKET:
				case WS:
				case NL:
				case ANY:
					{
					setState(33); statement();
					}
					break;
				case LPAREN:
				case RPAREN:
				case COMMA:
					{
					setState(34); punctuation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(autoconfParser.ID, 0); }
		public ExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_with_paramsContext extends ExprContext {
		public TerminalNode ID() { return getToken(autoconfParser.ID, 0); }
		public ExprParametersContext exprParameters() {
			return getRuleContext(ExprParametersContext.class,0);
		}
		public Expression_with_paramsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterExpression_with_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitExpression_with_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitExpression_with_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Expression_with_paramsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42); match(ID);
				setState(43); match(LPAREN);
				setState(44); exprParameters();
				setState(45); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprParametersContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(autoconfParser.COMMA); }
		public ExprParameterContext exprParameter(int i) {
			return getRuleContext(ExprParameterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(autoconfParser.COMMA, i);
		}
		public List<ExprParameterContext> exprParameter() {
			return getRuleContexts(ExprParameterContext.class);
		}
		public ExprParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterExprParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitExprParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitExprParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprParametersContext exprParameters() throws RecognitionException {
		ExprParametersContext _localctx = new ExprParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << LBRACKET) | (1L << WS) | (1L << NL) | (1L << ANY))) != 0)) {
				{
				{
				setState(50); exprParameter();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56); match(COMMA);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << LBRACKET) | (1L << WS) | (1L << NL) | (1L << ANY))) != 0)) {
					{
					{
					setState(57); exprParameter();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprParameterContext extends ParserRuleContext {
		public ParenthesizedTextContext parenthesizedText() {
			return getRuleContext(ParenthesizedTextContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterExprParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitExprParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitExprParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprParameterContext exprParameter() throws RecognitionException {
		ExprParameterContext _localctx = new ExprParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprParameter);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case ID:
			case LBRACKET:
			case WS:
			case NL:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); statement();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); parenthesizedText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedTextContext extends ParserRuleContext {
		public VerbatimTextContext verbatimText(int i) {
			return getRuleContext(VerbatimTextContext.class,i);
		}
		public ParenthesizedTextContext parenthesizedText(int i) {
			return getRuleContext(ParenthesizedTextContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(autoconfParser.LPAREN, 0); }
		public List<ParenthesizedTextContext> parenthesizedText() {
			return getRuleContexts(ParenthesizedTextContext.class);
		}
		public TerminalNode RPAREN() { return getToken(autoconfParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VerbatimTextContext> verbatimText() {
			return getRuleContexts(VerbatimTextContext.class);
		}
		public ParenthesizedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterParenthesizedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitParenthesizedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitParenthesizedText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTextContext parenthesizedText() throws RecognitionException {
		ParenthesizedTextContext _localctx = new ParenthesizedTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parenthesizedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(LPAREN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << LBRACKET) | (1L << WS) | (1L << NL) | (1L << ANY))) != 0)) {
				{
				setState(76);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(73); parenthesizedText();
					}
					break;

				case 2:
					{
					setState(74); statement();
					}
					break;

				case 3:
					{
					setState(75); verbatimText();
					}
					break;
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbatimTextContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(autoconfParser.NL); }
		public TerminalNode WS(int i) {
			return getToken(autoconfParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(autoconfParser.WS); }
		public TerminalNode ANY(int i) {
			return getToken(autoconfParser.ANY, i);
		}
		public TerminalNode NL(int i) {
			return getToken(autoconfParser.NL, i);
		}
		public List<TerminalNode> ANY() { return getTokens(autoconfParser.ANY); }
		public VerbatimTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatimText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterVerbatimText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitVerbatimText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitVerbatimText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbatimTextContext verbatimText() throws RecognitionException {
		VerbatimTextContext _localctx = new VerbatimTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verbatimText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << ANY))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PunctuationContext extends ParserRuleContext {
		public TerminalNode RPAREN(int i) {
			return getToken(autoconfParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(autoconfParser.LPAREN); }
		public List<TerminalNode> COMMA() { return getTokens(autoconfParser.COMMA); }
		public List<TerminalNode> RPAREN() { return getTokens(autoconfParser.RPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(autoconfParser.LPAREN, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(autoconfParser.COMMA, i);
		}
		public PunctuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punctuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).enterPunctuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof autoconfListener ) ((autoconfListener)listener).exitPunctuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof autoconfVisitor ) return ((autoconfVisitor<? extends T>)visitor).visitPunctuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunctuationContext punctuation() throws RecognitionException {
		PunctuationContext _localctx = new PunctuationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_punctuation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << COMMA))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\7\4"+
		"&\n\4\f\4\16\4)\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\7"+
		"\6\66\n\6\f\6\16\69\13\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\7\6B\n\6\f\6"+
		"\16\6E\13\6\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3"+
		"\b\3\b\3\t\6\tW\n\t\r\t\16\tX\3\n\6\n\\\n\n\r\n\16\n]\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\4\4\2\13\f\16\16\4\2\6\7\n\nf\2\30\3\2\2\2\4 \3\2\2"+
		"\2\6\"\3\2\2\2\b\62\3\2\2\2\n\67\3\2\2\2\fH\3\2\2\2\16J\3\2\2\2\20V\3"+
		"\2\2\2\22[\3\2\2\2\24\27\5\4\3\2\25\27\5\22\n\2\26\24\3\2\2\2\26\25\3"+
		"\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3"+
		"\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35!\5\b\5\2\36!\5\6\4\2\37!\5\20\t\2"+
		" \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"\'\7\b\2\2#&\5\4\3\2"+
		"$&\5\22\n\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2"+
		"\2\2)\'\3\2\2\2*+\7\t\2\2+\7\3\2\2\2,-\7\5\2\2-.\7\6\2\2./\5\n\6\2/\60"+
		"\7\7\2\2\60\63\3\2\2\2\61\63\7\5\2\2\62,\3\2\2\2\62\61\3\2\2\2\63\t\3"+
		"\2\2\2\64\66\5\f\7\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\28C\3\2\2\29\67\3\2\2\2:>\7\n\2\2;=\5\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A:\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\13\3\2\2\2EC\3\2\2\2FI\5\4\3\2GI\5\16\b\2HF\3\2\2\2HG\3\2\2\2I\r"+
		"\3\2\2\2JP\7\6\2\2KO\5\16\b\2LO\5\4\3\2MO\5\20\t\2NK\3\2\2\2NL\3\2\2\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\7\2\2"+
		"T\17\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\21\3\2"+
		"\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\23\3\2\2\2\20"+
		"\26\30 %\'\62\67>CHNPX]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}