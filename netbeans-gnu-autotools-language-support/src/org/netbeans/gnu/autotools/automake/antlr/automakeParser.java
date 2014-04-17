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
		SINGLE_LINE_COMMENT=1, STRING=2, IF=3, ELSE=4, ENDIF=5, AM_VARIABLE=6, 
		ID=7, DOLLAR=8, LPAREN=9, RPAREN=10, LBRACE=11, RBRACE=12, PLUSASSIGN=13, 
		DEFINE=14, ASSIGN=15, COLON=16, ENL=17, NL=18, TAB=19, HORIZONTAL_WHITESPACE=20, 
		ANY=21;
	public static final String[] tokenNames = {
		"<INVALID>", "SINGLE_LINE_COMMENT", "STRING", "'if'", "'else'", "'endif'", 
		"AM_VARIABLE", "ID", "'$'", "'('", "')'", "'{'", "'}'", "'+='", "':='", 
		"'='", "':'", "ENL", "NL", "'\t'", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_row = 1, RULE_unterminatedRow = 2, RULE_line = 3, 
		RULE_ifstatement = 4, RULE_condition = 5, RULE_elsestatement = 6, RULE_target = 7, 
		RULE_prerequisiteList = 8, RULE_filename = 9, RULE_variableAssignment = 10, 
		RULE_variable = 11, RULE_variableName = 12, RULE_recipe = 13, RULE_recipeText = 14, 
		RULE_statement = 15, RULE_any = 16;
	public static final String[] ruleNames = {
		"compilationUnit", "row", "unterminatedRow", "line", "ifstatement", "condition", 
		"elsestatement", "target", "prerequisiteList", "filename", "variableAssignment", 
		"variable", "variableName", "recipe", "recipeText", "statement", "any"
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
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34); row();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(41);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_LINE_COMMENT) | (1L << STRING) | (1L << IF) | (1L << ELSE) | (1L << ENDIF) | (1L << AM_VARIABLE) | (1L << ID) | (1L << DOLLAR) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << PLUSASSIGN) | (1L << DEFINE) | (1L << ASSIGN) | (1L << COLON) | (1L << ENL) | (1L << NL) | (1L << TAB) | (1L << HORIZONTAL_WHITESPACE) | (1L << ANY))) != 0)) {
				{
				setState(40); unterminatedRow();
				}
			}

			setState(43); match(EOF);
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
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); line();
				setState(47); match(NL);
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
			setState(51); line();
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
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
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
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53); ifstatement();
				}
				break;

			case 2:
				{
				setState(54); target();
				}
				break;

			case 3:
				{
				setState(55); recipe();
				}
				break;

			case 4:
				{
				setState(56); variableAssignment();
				}
				break;

			case 5:
				{
				setState(57); statement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(automakeParser.NL, 0); }
		public TerminalNode IF() { return getToken(automakeParser.IF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public TerminalNode ENDIF() { return getToken(automakeParser.ENDIF, 0); }
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(IF);
			setState(61); condition();
			setState(62); match(NL);
			setState(64); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(63); row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(69);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(68); elsestatement();
				}
			}

			setState(71); match(ENDIF);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(73);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(automakeParser.NL, 0); }
		public TerminalNode ELSE() { return getToken(automakeParser.ELSE, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitElsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitElsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elsestatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(ELSE);
			setState(79); match(NL);
			setState(81); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(80); row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(ID);
			setState(86); match(COLON);
			setState(87); prerequisiteList();
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
		enterRule(_localctx, 16, RULE_prerequisiteList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==DOLLAR) {
				{
				{
				setState(89); filename();
				}
				}
				setState(94);
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
		enterRule(_localctx, 18, RULE_filename);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(ID);
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); variable();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(automakeParser.ASSIGN, 0); }
		public TerminalNode DEFINE() { return getToken(automakeParser.DEFINE, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(automakeParser.PLUSASSIGN, 0); }
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
			setState(99); variableName();
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSASSIGN) | (1L << DEFINE) | (1L << ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(101);
					matchWildcard();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableWiwhBraceContext extends VariableContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(automakeParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(automakeParser.LBRACE, 0); }
		public TerminalNode DOLLAR() { return getToken(automakeParser.DOLLAR, 0); }
		public VariableWiwhBraceContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterVariableWiwhBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitVariableWiwhBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitVariableWiwhBrace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableWithParenContext extends VariableContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(automakeParser.LPAREN, 0); }
		public TerminalNode DOLLAR() { return getToken(automakeParser.DOLLAR, 0); }
		public TerminalNode RPAREN() { return getToken(automakeParser.RPAREN, 0); }
		public VariableWithParenContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterVariableWithParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitVariableWithParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitVariableWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new VariableWithParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(DOLLAR);
				setState(108); match(LPAREN);
				setState(109); variableName();
				setState(110); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new VariableWiwhBraceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(DOLLAR);
				setState(113); match(LBRACE);
				setState(114); variableName();
				setState(115); match(RBRACE);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(automakeParser.ID, 0); }
		public TerminalNode AM_VARIABLE() { return getToken(automakeParser.AM_VARIABLE, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automakeListener ) ((automakeListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof automakeVisitor ) return ((automakeVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==AM_VARIABLE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 26, RULE_recipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(TAB);
			setState(122); recipeText();
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
		enterRule(_localctx, 28, RULE_recipeText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(124);
					matchWildcard();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); any();
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
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
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
		enterRule(_localctx, 32, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(134);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(132); variable();
						}
						break;

					case 2:
						{
						setState(133);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\5\2,\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\6\6C\n\6"+
		"\r\6\16\6D\3\6\5\6H\n\6\3\6\3\6\3\7\6\7M\n\7\r\7\16\7N\3\b\3\b\3\b\6\b"+
		"T\n\b\r\b\16\bU\3\t\3\t\3\t\3\t\3\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13"+
		"\5\13d\n\13\3\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\rx\n\r\3\16\3\16\3\17\3\17\3\17\3\20\7\20\u0080\n"+
		"\20\f\20\16\20\u0083\13\20\3\21\3\21\3\22\3\22\6\22\u0089\n\22\r\22\16"+
		"\22\u008a\3\22\bDNUj\u0081\u008a\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\4\3\2\17\21\3\2\b\t\u008d\2\'\3\2\2\2\4\63\3\2\2\2\6\65\3"+
		"\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20W\3\2\2\2\22^\3"+
		"\2\2\2\24c\3\2\2\2\26e\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36"+
		"\u0081\3\2\2\2 \u0084\3\2\2\2\"\u0088\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*,\5\6\4\2+*\3\2\2\2"+
		"+,\3\2\2\2,-\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\64\7\24\2\2\60\61\5\b\5\2\61"+
		"\62\7\24\2\2\62\64\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2\65\66"+
		"\5\b\5\2\66\7\3\2\2\2\67=\5\n\6\28=\5\20\t\29=\5\34\17\2:=\5\26\f\2;="+
		"\5 \21\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\t\3\2\2"+
		"\2>?\7\5\2\2?@\5\f\7\2@B\7\24\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2DE\3\2"+
		"\2\2DB\3\2\2\2EG\3\2\2\2FH\5\16\b\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7"+
		"\7\2\2J\13\3\2\2\2KM\13\2\2\2LK\3\2\2\2MN\3\2\2\2NO\3\2\2\2NL\3\2\2\2"+
		"O\r\3\2\2\2PQ\7\6\2\2QS\7\24\2\2RT\5\4\3\2SR\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2US\3\2\2\2V\17\3\2\2\2WX\7\t\2\2XY\7\22\2\2YZ\5\22\n\2Z\21\3\2\2\2["+
		"]\5\24\13\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`^\3"+
		"\2\2\2ad\7\t\2\2bd\5\30\r\2ca\3\2\2\2cb\3\2\2\2d\25\3\2\2\2ef\5\32\16"+
		"\2fj\t\2\2\2gi\13\2\2\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2k\27\3"+
		"\2\2\2lj\3\2\2\2mn\7\n\2\2no\7\13\2\2op\5\32\16\2pq\7\f\2\2qx\3\2\2\2"+
		"rs\7\n\2\2st\7\r\2\2tu\5\32\16\2uv\7\16\2\2vx\3\2\2\2wm\3\2\2\2wr\3\2"+
		"\2\2x\31\3\2\2\2yz\t\3\2\2z\33\3\2\2\2{|\7\25\2\2|}\5\36\20\2}\35\3\2"+
		"\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\37\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\5\"\22\2\u0085!\3\2\2\2\u0086\u0089\5\30\r\2\u0087\u0089\13\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b#\3\2\2\2\21\'+\63<DGNU^cjw\u0081\u0088"+
		"\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}