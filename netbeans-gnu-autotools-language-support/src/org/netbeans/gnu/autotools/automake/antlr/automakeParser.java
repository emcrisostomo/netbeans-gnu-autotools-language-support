// Generated from automake.g4 by ANTLR 4.2.2

package org.netbeans.gnu.autotools.automake.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class automakeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, STRING=2, AM_VARIABLE=3, ID=4, DOLLAR=5, LPAREN=6, 
		RPAREN=7, LBRACE=8, RBRACE=9, PLUSASSIGN=10, DEFINE=11, ASSIGN=12, COLON=13, 
		ENL=14, NL=15, TAB=16, HORIZONTAL_WHITESPACE=17, ANY=18;
	public static final String[] tokenNames = {
		"<INVALID>", "SINGLE_LINE_COMMENT", "STRING", "AM_VARIABLE", "ID", "'$'", 
		"'('", "')'", "'{'", "'}'", "'+='", "':='", "'='", "':'", "ENL", "NL", 
		"'\t'", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_row = 1, RULE_unterminatedRow = 2, RULE_line = 3, 
		RULE_target = 4, RULE_prerequisiteList = 5, RULE_filename = 6, RULE_variable = 7, 
		RULE_recipe = 8, RULE_recipeText = 9, RULE_variableAssignment = 10, RULE_statement = 11, 
		RULE_any = 12;
	public static final String[] ruleNames = {
		"compilationUnit", "row", "unterminatedRow", "line", "target", "prerequisiteList", 
		"filename", "variable", "recipe", "recipeText", "variableAssignment", 
		"statement", "any"
	};

	@Override
	public String getGrammarFileName() { return "automake.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public automakeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public TerminalNode EOF() { return getToken(automakeParser.EOF, 0); }
		public UnterminatedRowContext unterminatedRow() {
			return getRuleContext(UnterminatedRowContext.class,0);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26); row();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << AM_VARIABLE) | (1L << ID) | (1L << DOLLAR) | (1L << LPAREN) | (1L << RPAREN) | (1L << PLUSASSIGN) | (1L << DEFINE) | (1L << ASSIGN) | (1L << COLON) | (1L << TAB) | (1L << ANY))) != 0)) {
				{
				setState(32); unterminatedRow();
				}
			}

			setState(35); match(EOF);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(automakeParser.NL, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case STRING:
			case AM_VARIABLE:
			case ID:
			case DOLLAR:
			case LPAREN:
			case RPAREN:
			case PLUSASSIGN:
			case DEFINE:
			case ASSIGN:
			case COLON:
			case TAB:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); line();
				setState(38); match(NL);
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); match(NL);
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

	public static class UnterminatedRowContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public UnterminatedRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unterminatedRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterUnterminatedRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitUnterminatedRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitUnterminatedRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnterminatedRowContext unterminatedRow() throws RecognitionException {
		UnterminatedRowContext _localctx = new UnterminatedRowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unterminatedRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); line();
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

	public static class LineContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(45); target();
				}
				break;

			case 2:
				{
				setState(46); recipe();
				}
				break;

			case 3:
				{
				setState(47); variableAssignment();
				}
				break;

			case 4:
				{
				setState(48); statement();
				}
				break;
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(automakeParser.ID, 0); }
		public TerminalNode COLON() { return getToken(automakeParser.COLON, 0); }
		public PrerequisiteListContext prerequisiteList() {
			return getRuleContext(PrerequisiteListContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(ID);
			setState(52); match(COLON);
			setState(53); prerequisiteList();
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

	public static class PrerequisiteListContext extends ParserRuleContext {
		public List<FilenameContext> filename() {
			return getRuleContexts(FilenameContext.class);
		}
		public FilenameContext filename(int i) {
			return getRuleContext(FilenameContext.class,i);
		}
		public PrerequisiteListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prerequisiteList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterPrerequisiteList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitPrerequisiteList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitPrerequisiteList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrerequisiteListContext prerequisiteList() throws RecognitionException {
		PrerequisiteListContext _localctx = new PrerequisiteListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prerequisiteList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==DOLLAR) {
				{
				{
				setState(55); filename();
				}
				}
				setState(60);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(automakeParser.ID, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filename);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(ID);
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); variable();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(automakeParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(automakeParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(automakeParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(automakeParser.LBRACE, 0); }
		public TerminalNode DOLLAR() { return getToken(automakeParser.DOLLAR, 0); }
		public TerminalNode RPAREN() { return getToken(automakeParser.RPAREN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); match(DOLLAR);
				setState(66); match(LPAREN);
				setState(67); match(ID);
				setState(68); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(DOLLAR);
				setState(70); match(LBRACE);
				setState(71); match(ID);
				setState(72); match(RBRACE);
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

	public static class RecipeContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(automakeParser.TAB, 0); }
		public RecipeTextContext recipeText() {
			return getRuleContext(RecipeTextContext.class,0);
		}
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_recipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(TAB);
			setState(76); recipeText();
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

	public static class RecipeTextContext extends ParserRuleContext {
		public RecipeTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipeText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterRecipeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitRecipeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitRecipeText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeTextContext recipeText() throws RecognitionException {
		RecipeTextContext _localctx = new RecipeTextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recipeText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(78);
					matchWildcard();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(automakeParser.ASSIGN, 0); }
		public TerminalNode DEFINE() { return getToken(automakeParser.DEFINE, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(automakeParser.PLUSASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); variable();
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSASSIGN) | (1L << DEFINE) | (1L << ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(86);
					matchWildcard();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); any();
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

	public static class AnyContext extends ParserRuleContext {
		public TerminalNode AM_VARIABLE(int i) {
			return getToken(automakeParser.AM_VARIABLE, i);
		}
		public TerminalNode DOLLAR(int i) {
			return getToken(automakeParser.DOLLAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(automakeParser.COLON); }
		public List<TerminalNode> PLUSASSIGN() { return getTokens(automakeParser.PLUSASSIGN); }
		public List<TerminalNode> STRING() { return getTokens(automakeParser.STRING); }
		public TerminalNode ID(int i) {
			return getToken(automakeParser.ID, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(automakeParser.RPAREN); }
		public List<TerminalNode> AM_VARIABLE() { return getTokens(automakeParser.AM_VARIABLE); }
		public TerminalNode TAB(int i) {
			return getToken(automakeParser.TAB, i);
		}
		public List<TerminalNode> ANY() { return getTokens(automakeParser.ANY); }
		public TerminalNode DEFINE(int i) {
			return getToken(automakeParser.DEFINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(automakeParser.TAB); }
		public List<TerminalNode> ID() { return getTokens(automakeParser.ID); }
		public List<TerminalNode> ASSIGN() { return getTokens(automakeParser.ASSIGN); }
		public TerminalNode STRING(int i) {
			return getToken(automakeParser.STRING, i);
		}
		public List<TerminalNode> DEFINE() { return getTokens(automakeParser.DEFINE); }
		public TerminalNode ASSIGN(int i) {
			return getToken(automakeParser.ASSIGN, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(automakeParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(automakeParser.LPAREN); }
		public TerminalNode COLON(int i) {
			return getToken(automakeParser.COLON, i);
		}
		public TerminalNode ANY(int i) {
			return getToken(automakeParser.ANY, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(automakeParser.DOLLAR); }
		public TerminalNode PLUSASSIGN(int i) {
			return getToken(automakeParser.PLUSASSIGN, i);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(automakeParser.LPAREN, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_any);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(94);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << AM_VARIABLE) | (1L << ID) | (1L << DOLLAR) | (1L << LPAREN) | (1L << RPAREN) | (1L << PLUSASSIGN) | (1L << DEFINE) | (1L << ASSIGN) | (1L << COLON) | (1L << TAB) | (1L << ANY))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\5\2$\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6"+
		"\3\6\3\6\3\6\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\5\bB\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\13\7\13R\n\13\f\13\16\13U"+
		"\13\13\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\r\3\r\3\16\6\16b\n\16\r\16"+
		"\16\16c\3\16\5S[c\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\f\16\6"+
		"\2\4\t\f\17\22\22\24\24d\2\37\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b\63\3\2\2"+
		"\2\n\65\3\2\2\2\f<\3\2\2\2\16A\3\2\2\2\20K\3\2\2\2\22M\3\2\2\2\24S\3\2"+
		"\2\2\26V\3\2\2\2\30^\3\2\2\2\32a\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!\37\3\2\2\2\"$\5\6\4\2#"+
		"\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\5\b\5\2()\7\21"+
		"\2\2),\3\2\2\2*,\7\21\2\2+\'\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\5\b\5\2.\7"+
		"\3\2\2\2/\64\5\n\6\2\60\64\5\22\n\2\61\64\5\26\f\2\62\64\5\30\r\2\63/"+
		"\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66"+
		"\7\6\2\2\66\67\7\17\2\2\678\5\f\7\28\13\3\2\2\29;\5\16\b\2:9\3\2\2\2;"+
		">\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2><\3\2\2\2?B\7\6\2\2@B\5\20\t"+
		"\2A?\3\2\2\2A@\3\2\2\2B\17\3\2\2\2CD\7\7\2\2DE\7\b\2\2EF\7\6\2\2FL\7\t"+
		"\2\2GH\7\7\2\2HI\7\n\2\2IJ\7\6\2\2JL\7\13\2\2KC\3\2\2\2KG\3\2\2\2L\21"+
		"\3\2\2\2MN\7\22\2\2NO\5\24\13\2O\23\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2"+
		"\2\2ST\3\2\2\2SQ\3\2\2\2T\25\3\2\2\2US\3\2\2\2VW\5\20\t\2W[\t\2\2\2XZ"+
		"\13\2\2\2YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\\27\3\2\2\2][\3\2"+
		"\2\2^_\5\32\16\2_\31\3\2\2\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2cd\3\2\2\2c"+
		"a\3\2\2\2d\33\3\2\2\2\f\37#+\63<AKS[c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}