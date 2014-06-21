// Generated from main\java\by\bsuir\course3\yapis\graphLangTranslator\syntaxAnalysis\parsing\GraphLangGrammar.g4 by ANTLR 4.2
package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphLangGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF_WORD=1, RETURN_WORD=2, ELSE_WORD=3, SWITCH_WORD=4, WHILE_WORD=5, UNTIL_WORD=6, 
		FOR_WORD=7, NULL_WORD=8, BREAK_WORD=9, SEMICOLON_WORD=10, OPENING_BRACKET_WORD=11, 
		CLOSING_BRACKET_WORD=12, OPENING_CURLY_BRACKET_WORD=13, CLOSING_CURLY_BRACKET_WORD=14, 
		OPENING_SQUARE_BRACKET_WORD=15, CLOSING_SQUARE_BRACKET_WORD=16, COMMA_WORD=17, 
		EQUAL_SIGN_WORD=18, PLUS_WORD=19, MINUS_WORD=20, MULTIPLICATION_WORD=21, 
		DIVISION_WORD=22, SEPARATOR_WORD=23, GREATER_WORD=24, GREATER_OR_EQUAL_WORD=25, 
		LESS_WORD=26, LESS_OR_EQUAL_WORD=27, EQUAL_WORD=28, NOT_EQUAL_WORD=29, 
		BOOLEAN_LITERAL=30, TRUE_LITERAL=31, FALSE_LITERAL=32, INTEGER_NUMBER=33, 
		REAL_NUMBER=34, STRING=35, TYPE_WORD=36, TYPE_SPECIFIER=37, IDENTIFIER_WORD=38, 
		VOID_TYPE=39, BOOLEAN_TYPE=40, INT_TYPE=41, REAL_TYPE=42, STRING_TYPE=43, 
		ARC_TYPE=44, NODE_TYPE=45, GRAPH_TYPE=46, CONSTANT_TYPE_SPEC=47, GLOBAL_TYPE_SPEC=48, 
		TRASH=49, LINE_COMMENT=50, MULTI_LINE_COMMENT=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'return'", "'else'", "'switch'", "'while'", "'until'", 
		"'for'", "'null'", "'break'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'|'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'<>'", "BOOLEAN_LITERAL", "'true'", "'false'", 
		"INTEGER_NUMBER", "REAL_NUMBER", "STRING", "TYPE_WORD", "TYPE_SPECIFIER", 
		"IDENTIFIER_WORD", "'Void'", "'Boolean'", "'Int'", "'Real'", "'String'", 
		"'Arc'", "'Node'", "'Graph'", "'#'", "'@'", "TRASH", "LINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_document = 0, RULE_function = 1, RULE_functionHeader = 2, RULE_functionParametersSection = 3, 
		RULE_functionArgumentsSection = 4, RULE_functionBody = 5, RULE_functionCall = 6, 
		RULE_blockStatement = 7, RULE_terminalStatement = 8, RULE_cycleOperator = 9, 
		RULE_whileCycle = 10, RULE_untilCycle = 11, RULE_forCycle = 12, RULE_forCondition = 13, 
		RULE_preCondition = 14, RULE_condition = 15, RULE_postCondition = 16, 
		RULE_conditionalOperator = 17, RULE_ifOperator = 18, RULE_switchOperator = 19, 
		RULE_variableAssignment = 20, RULE_variable = 21, RULE_statement = 22, 
		RULE_atom = 23, RULE_primitiveAtom = 24, RULE_breakStatement = 25, RULE_returnStatement = 26, 
		RULE_variableInitialization = 27, RULE_variableDefenition = 28, RULE_typeDefinition = 29;
	public static final String[] ruleNames = {
		"document", "function", "functionHeader", "functionParametersSection", 
		"functionArgumentsSection", "functionBody", "functionCall", "blockStatement", 
		"terminalStatement", "cycleOperator", "whileCycle", "untilCycle", "forCycle", 
		"forCondition", "preCondition", "condition", "postCondition", "conditionalOperator", 
		"ifOperator", "switchOperator", "variableAssignment", "variable", "statement", 
		"atom", "primitiveAtom", "breakStatement", "returnStatement", "variableInitialization", 
		"variableDefenition", "typeDefinition"
	};

	@Override
	public String getGrammarFileName() { return "GraphLangGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphLangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public TerminalNode EOF() { return getToken(GraphLangGrammarParser.EOF, 0); }
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); function();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE_WORD || _la==TYPE_SPECIFIER );
			setState(65); match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); functionHeader();
			setState(68); functionBody();
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

	public static class FunctionHeaderContext extends ParserRuleContext {
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public TerminalNode IDENTIFIER_WORD() { return getToken(GraphLangGrammarParser.IDENTIFIER_WORD, 0); }
		public FunctionParametersSectionContext functionParametersSection() {
			return getRuleContext(FunctionParametersSectionContext.class,0);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunctionHeader(this);
		}
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); typeDefinition();
			setState(71); match(IDENTIFIER_WORD);
			setState(72); functionParametersSection();
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

	public static class FunctionParametersSectionContext extends ParserRuleContext {
		public List<TerminalNode> COMMA_WORD() { return getTokens(GraphLangGrammarParser.COMMA_WORD); }
		public List<VariableDefenitionContext> variableDefenition() {
			return getRuleContexts(VariableDefenitionContext.class);
		}
		public TerminalNode COMMA_WORD(int i) {
			return getToken(GraphLangGrammarParser.COMMA_WORD, i);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public VariableDefenitionContext variableDefenition(int i) {
			return getRuleContext(VariableDefenitionContext.class,i);
		}
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public FunctionParametersSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParametersSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunctionParametersSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunctionParametersSection(this);
		}
	}

	public final FunctionParametersSectionContext functionParametersSection() throws RecognitionException {
		FunctionParametersSectionContext _localctx = new FunctionParametersSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionParametersSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(OPENING_BRACKET_WORD);
			setState(83);
			_la = _input.LA(1);
			if (_la==TYPE_WORD || _la==TYPE_SPECIFIER) {
				{
				setState(75); variableDefenition();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_WORD) {
					{
					{
					setState(76); match(COMMA_WORD);
					setState(77); variableDefenition();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(CLOSING_BRACKET_WORD);
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

	public static class FunctionArgumentsSectionContext extends ParserRuleContext {
		public List<TerminalNode> COMMA_WORD() { return getTokens(GraphLangGrammarParser.COMMA_WORD); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode COMMA_WORD(int i) {
			return getToken(GraphLangGrammarParser.COMMA_WORD, i);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public FunctionArgumentsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunctionArgumentsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunctionArgumentsSection(this);
		}
	}

	public final FunctionArgumentsSectionContext functionArgumentsSection() throws RecognitionException {
		FunctionArgumentsSectionContext _localctx = new FunctionArgumentsSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionArgumentsSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(OPENING_BRACKET_WORD);
			setState(96);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_WORD) | (1L << OPENING_BRACKET_WORD) | (1L << MINUS_WORD) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_NUMBER) | (1L << REAL_NUMBER) | (1L << STRING) | (1L << IDENTIFIER_WORD))) != 0)) {
				{
				setState(88); statement(0);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_WORD) {
					{
					{
					setState(89); match(COMMA_WORD);
					setState(90); statement(0);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(98); match(CLOSING_BRACKET_WORD);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode CLOSING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_CURLY_BRACKET_WORD, 0); }
		public TerminalStatementContext terminalStatement(int i) {
			return getRuleContext(TerminalStatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalStatementContext> terminalStatement() {
			return getRuleContexts(TerminalStatementContext.class);
		}
		public TerminalNode OPENING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_CURLY_BRACKET_WORD, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(OPENING_CURLY_BRACKET_WORD);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_WORD) | (1L << SWITCH_WORD) | (1L << WHILE_WORD) | (1L << FOR_WORD) | (1L << OPENING_CURLY_BRACKET_WORD) | (1L << TYPE_WORD) | (1L << TYPE_SPECIFIER) | (1L << IDENTIFIER_WORD))) != 0)) {
				{
				{
				setState(101); terminalStatement();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); returnStatement();
			setState(108); match(CLOSING_CURLY_BRACKET_WORD);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WORD() { return getToken(GraphLangGrammarParser.IDENTIFIER_WORD, 0); }
		public FunctionArgumentsSectionContext functionArgumentsSection() {
			return getRuleContext(FunctionArgumentsSectionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(IDENTIFIER_WORD);
			setState(111); functionArgumentsSection();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TerminalNode CLOSING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_CURLY_BRACKET_WORD, 0); }
		public TerminalStatementContext terminalStatement(int i) {
			return getRuleContext(TerminalStatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalStatementContext> terminalStatement() {
			return getRuleContexts(TerminalStatementContext.class);
		}
		public TerminalNode OPENING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_CURLY_BRACKET_WORD, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(OPENING_CURLY_BRACKET_WORD);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_WORD) | (1L << SWITCH_WORD) | (1L << WHILE_WORD) | (1L << FOR_WORD) | (1L << OPENING_CURLY_BRACKET_WORD) | (1L << TYPE_WORD) | (1L << TYPE_SPECIFIER) | (1L << IDENTIFIER_WORD))) != 0)) {
				{
				{
				setState(114); terminalStatement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			switch (_input.LA(1)) {
			case BREAK_WORD:
				{
				setState(120); breakStatement();
				}
				break;
			case RETURN_WORD:
				{
				setState(121); returnStatement();
				}
				break;
			case CLOSING_CURLY_BRACKET_WORD:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124); match(CLOSING_CURLY_BRACKET_WORD);
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

	public static class TerminalStatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public TerminalNode SEMICOLON_WORD() { return getToken(GraphLangGrammarParser.SEMICOLON_WORD, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableInitializationContext variableInitialization() {
			return getRuleContext(VariableInitializationContext.class,0);
		}
		public CycleOperatorContext cycleOperator() {
			return getRuleContext(CycleOperatorContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public TerminalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterTerminalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitTerminalStatement(this);
		}
	}

	public final TerminalStatementContext terminalStatement() throws RecognitionException {
		TerminalStatementContext _localctx = new TerminalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminalStatement);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(129);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(126); functionCall();
					}
					break;

				case 2:
					{
					setState(127); variableAssignment();
					}
					break;

				case 3:
					{
					setState(128); variableInitialization();
					}
					break;
				}
				setState(131); match(SEMICOLON_WORD);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); cycleOperator();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); conditionalOperator();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); blockStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); function();
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

	public static class CycleOperatorContext extends ParserRuleContext {
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public WhileCycleContext whileCycle() {
			return getRuleContext(WhileCycleContext.class,0);
		}
		public UntilCycleContext untilCycle() {
			return getRuleContext(UntilCycleContext.class,0);
		}
		public CycleOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterCycleOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitCycleOperator(this);
		}
	}

	public final CycleOperatorContext cycleOperator() throws RecognitionException {
		CycleOperatorContext _localctx = new CycleOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cycleOperator);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case WHILE_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); whileCycle();
				}
				break;
			case OPENING_CURLY_BRACKET_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); untilCycle();
				}
				break;
			case FOR_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(141); forCycle();
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

	public static class WhileCycleContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode WHILE_WORD() { return getToken(GraphLangGrammarParser.WHILE_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public WhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterWhileCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitWhileCycle(this);
		}
	}

	public final WhileCycleContext whileCycle() throws RecognitionException {
		WhileCycleContext _localctx = new WhileCycleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(WHILE_WORD);
			setState(145); match(OPENING_BRACKET_WORD);
			setState(146); statement(0);
			setState(147); match(CLOSING_BRACKET_WORD);
			setState(148); blockStatement();
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

	public static class UntilCycleContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode UNTIL_WORD() { return getToken(GraphLangGrammarParser.UNTIL_WORD, 0); }
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public UntilCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterUntilCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitUntilCycle(this);
		}
	}

	public final UntilCycleContext untilCycle() throws RecognitionException {
		UntilCycleContext _localctx = new UntilCycleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_untilCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); blockStatement();
			setState(151); match(UNTIL_WORD);
			setState(152); match(OPENING_BRACKET_WORD);
			setState(153); statement(0);
			setState(154); match(CLOSING_BRACKET_WORD);
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

	public static class ForCycleContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode FOR_WORD() { return getToken(GraphLangGrammarParser.FOR_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitForCycle(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(FOR_WORD);
			setState(157); match(OPENING_BRACKET_WORD);
			setState(158); forCondition();
			setState(159); match(CLOSING_BRACKET_WORD);
			setState(160); blockStatement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public TerminalNode SEPARATOR_WORD(int i) {
			return getToken(GraphLangGrammarParser.SEPARATOR_WORD, i);
		}
		public List<TerminalNode> SEPARATOR_WORD() { return getTokens(GraphLangGrammarParser.SEPARATOR_WORD); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PreConditionContext preCondition() {
			return getRuleContext(PreConditionContext.class,0);
		}
		public PostConditionContext postCondition() {
			return getRuleContext(PostConditionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitForCondition(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); preCondition();
			setState(163); match(SEPARATOR_WORD);
			setState(164); condition();
			setState(165); match(SEPARATOR_WORD);
			setState(166); postCondition();
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

	public static class PreConditionContext extends ParserRuleContext {
		public VariableInitializationContext variableInitialization() {
			return getRuleContext(VariableInitializationContext.class,0);
		}
		public PreConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterPreCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitPreCondition(this);
		}
	}

	public final PreConditionContext preCondition() throws RecognitionException {
		PreConditionContext _localctx = new PreConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_preCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==TYPE_WORD || _la==TYPE_SPECIFIER) {
				{
				setState(168); variableInitialization();
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); statement(0);
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

	public static class PostConditionContext extends ParserRuleContext {
		public TerminalStatementContext terminalStatement() {
			return getRuleContext(TerminalStatementContext.class,0);
		}
		public PostConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterPostCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitPostCondition(this);
		}
	}

	public final PostConditionContext postCondition() throws RecognitionException {
		PostConditionContext _localctx = new PostConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_postCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_WORD) | (1L << SWITCH_WORD) | (1L << WHILE_WORD) | (1L << FOR_WORD) | (1L << OPENING_CURLY_BRACKET_WORD) | (1L << TYPE_WORD) | (1L << TYPE_SPECIFIER) | (1L << IDENTIFIER_WORD))) != 0)) {
				{
				setState(173); terminalStatement();
				}
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

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public IfOperatorContext ifOperator() {
			return getRuleContext(IfOperatorContext.class,0);
		}
		public SwitchOperatorContext switchOperator() {
			return getRuleContext(SwitchOperatorContext.class,0);
		}
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditionalOperator);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case IF_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); ifOperator();
				}
				break;
			case SWITCH_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); switchOperator();
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

	public static class IfOperatorContext extends ParserRuleContext {
		public TerminalNode ELSE_WORD() { return getToken(GraphLangGrammarParser.ELSE_WORD, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IF_WORD() { return getToken(GraphLangGrammarParser.IF_WORD, 0); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public IfOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterIfOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitIfOperator(this);
		}
	}

	public final IfOperatorContext ifOperator() throws RecognitionException {
		IfOperatorContext _localctx = new IfOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(IF_WORD);
			setState(181); match(OPENING_BRACKET_WORD);
			setState(182); statement(0);
			setState(183); match(CLOSING_BRACKET_WORD);
			setState(184); blockStatement();
			setState(187);
			_la = _input.LA(1);
			if (_la==ELSE_WORD) {
				{
				setState(185); match(ELSE_WORD);
				setState(186); blockStatement();
				}
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

	public static class SwitchOperatorContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode SWITCH_WORD() { return getToken(GraphLangGrammarParser.SWITCH_WORD, 0); }
		public TerminalNode CLOSING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_CURLY_BRACKET_WORD, 0); }
		public List<TerminalNode> CLOSING_SQUARE_BRACKET_WORD() { return getTokens(GraphLangGrammarParser.CLOSING_SQUARE_BRACKET_WORD); }
		public TerminalNode CLOSING_SQUARE_BRACKET_WORD(int i) {
			return getToken(GraphLangGrammarParser.CLOSING_SQUARE_BRACKET_WORD, i);
		}
		public TerminalNode OPENING_SQUARE_BRACKET_WORD(int i) {
			return getToken(GraphLangGrammarParser.OPENING_SQUARE_BRACKET_WORD, i);
		}
		public List<TerminalNode> OPENING_SQUARE_BRACKET_WORD() { return getTokens(GraphLangGrammarParser.OPENING_SQUARE_BRACKET_WORD); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode OPENING_CURLY_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_CURLY_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public SwitchOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterSwitchOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitSwitchOperator(this);
		}
	}

	public final SwitchOperatorContext switchOperator() throws RecognitionException {
		SwitchOperatorContext _localctx = new SwitchOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(SWITCH_WORD);
			setState(190); match(OPENING_BRACKET_WORD);
			setState(191); statement(0);
			setState(192); match(CLOSING_BRACKET_WORD);
			setState(193); match(OPENING_CURLY_BRACKET_WORD);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194); match(OPENING_SQUARE_BRACKET_WORD);
				setState(195); statement(0);
				setState(196); match(CLOSING_SQUARE_BRACKET_WORD);
				setState(197); blockStatement();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPENING_SQUARE_BRACKET_WORD );
			setState(203); match(CLOSING_CURLY_BRACKET_WORD);
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
		public List<TerminalNode> COMMA_WORD() { return getTokens(GraphLangGrammarParser.COMMA_WORD); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EQUAL_SIGN_WORD() { return getToken(GraphLangGrammarParser.EQUAL_SIGN_WORD, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public TerminalNode COMMA_WORD(int i) {
			return getToken(GraphLangGrammarParser.COMMA_WORD, i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); variable();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_WORD) {
				{
				{
				setState(206); match(COMMA_WORD);
				setState(207); variable();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); match(EQUAL_SIGN_WORD);
			setState(214); statement(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_WORD) {
				{
				{
				setState(215); match(COMMA_WORD);
				setState(216); statement(0);
				}
				}
				setState(221);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WORD() { return getToken(GraphLangGrammarParser.IDENTIFIER_WORD, 0); }
		public TerminalNode OPENING_SQUARE_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_SQUARE_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_SQUARE_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_SQUARE_BRACKET_WORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INTEGER_NUMBER() { return getToken(GraphLangGrammarParser.INTEGER_NUMBER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(IDENTIFIER_WORD);
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(223); match(OPENING_SQUARE_BRACKET_WORD);
				setState(226);
				switch (_input.LA(1)) {
				case INTEGER_NUMBER:
					{
					setState(224); match(INTEGER_NUMBER);
					}
					break;
				case IDENTIFIER_WORD:
					{
					setState(225); variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(228); match(CLOSING_SQUARE_BRACKET_WORD);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode MINUS_WORD() { return getToken(GraphLangGrammarParser.MINUS_WORD, 0); }
		public UnaryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitUnary(this);
		}
	}
	public static class StatementBinaryMinusContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode MINUS_WORD() { return getToken(GraphLangGrammarParser.MINUS_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBinaryMinusContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryMinus(this);
		}
	}
	public static class StatementAtomContext extends StatementContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public StatementAtomContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementAtom(this);
		}
	}
	public static class StatementBinaryPlusContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode PLUS_WORD() { return getToken(GraphLangGrammarParser.PLUS_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBinaryPlusContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryPlus(this);
		}
	}
	public static class StatementBinaryMultiplicationContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode MULTIPLICATION_WORD() { return getToken(GraphLangGrammarParser.MULTIPLICATION_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBinaryMultiplicationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryMultiplication(this);
		}
	}
	public static class StatementBinaryComparisonContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode GREATER_OR_EQUAL_WORD() { return getToken(GraphLangGrammarParser.GREATER_OR_EQUAL_WORD, 0); }
		public TerminalNode GREATER_WORD() { return getToken(GraphLangGrammarParser.GREATER_WORD, 0); }
		public TerminalNode LESS_OR_EQUAL_WORD() { return getToken(GraphLangGrammarParser.LESS_OR_EQUAL_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LESS_WORD() { return getToken(GraphLangGrammarParser.LESS_WORD, 0); }
		public StatementBinaryComparisonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryComparison(this);
		}
	}
	public static class StatementFunctionCallContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementFunctionCall(this);
		}
	}
	public static class StatementBinaryComparisionEquatingContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NOT_EQUAL_WORD() { return getToken(GraphLangGrammarParser.NOT_EQUAL_WORD, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EQUAL_WORD() { return getToken(GraphLangGrammarParser.EQUAL_WORD, 0); }
		public StatementBinaryComparisionEquatingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryComparisionEquating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryComparisionEquating(this);
		}
	}
	public static class StatementBinaryDivisionContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DIVISION_WORD() { return getToken(GraphLangGrammarParser.DIVISION_WORD, 0); }
		public StatementBinaryDivisionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBinaryDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBinaryDivision(this);
		}
	}
	public static class StatementCastContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TYPE_WORD() { return getToken(GraphLangGrammarParser.TYPE_WORD, 0); }
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public StatementCastContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementCast(this);
		}
	}
	public static class StatementBracketsContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode OPENING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_BRACKET_WORD, 0); }
		public StatementBracketsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterStatementBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitStatementBrackets(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(232); match(MINUS_WORD);
				setState(233); statement(8);
				}
				break;

			case 2:
				{
				_localctx = new StatementCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234); match(OPENING_BRACKET_WORD);
				setState(235); match(TYPE_WORD);
				setState(236); match(CLOSING_BRACKET_WORD);
				setState(237); statement(7);
				}
				break;

			case 3:
				{
				_localctx = new StatementAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); atom();
				}
				break;

			case 4:
				{
				_localctx = new StatementBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); match(OPENING_BRACKET_WORD);
				setState(240); statement(0);
				setState(241); match(CLOSING_BRACKET_WORD);
				}
				break;

			case 5:
				{
				_localctx = new StatementFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new StatementBinaryMultiplicationContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(246);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(247); match(MULTIPLICATION_WORD);
						setState(248); statement(7);
						}
						break;

					case 2:
						{
						_localctx = new StatementBinaryDivisionContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250); match(DIVISION_WORD);
						setState(251); statement(6);
						}
						break;

					case 3:
						{
						_localctx = new StatementBinaryPlusContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253); match(PLUS_WORD);
						setState(254); statement(5);
						}
						break;

					case 4:
						{
						_localctx = new StatementBinaryMinusContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(255);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(256); match(MINUS_WORD);
						setState(257); statement(4);
						}
						break;

					case 5:
						{
						_localctx = new StatementBinaryComparisonContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(259);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_WORD) | (1L << GREATER_OR_EQUAL_WORD) | (1L << LESS_WORD) | (1L << LESS_OR_EQUAL_WORD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(260); statement(3);
						}
						break;

					case 6:
						{
						_localctx = new StatementBinaryComparisionEquatingContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(261);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(262);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_WORD || _la==NOT_EQUAL_WORD) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(263); statement(2);
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public PrimitiveAtomContext primitiveAtom() {
			return getRuleContext(PrimitiveAtomContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			switch (_input.LA(1)) {
			case NULL_WORD:
			case BOOLEAN_LITERAL:
			case INTEGER_NUMBER:
			case REAL_NUMBER:
			case STRING:
				{
				setState(269); primitiveAtom();
				}
				break;
			case IDENTIFIER_WORD:
				{
				setState(270); variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimitiveAtomContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(GraphLangGrammarParser.REAL_NUMBER, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(GraphLangGrammarParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_WORD() { return getToken(GraphLangGrammarParser.NULL_WORD, 0); }
		public TerminalNode STRING() { return getToken(GraphLangGrammarParser.STRING, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(GraphLangGrammarParser.INTEGER_NUMBER, 0); }
		public PrimitiveAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterPrimitiveAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitPrimitiveAtom(this);
		}
	}

	public final PrimitiveAtomContext primitiveAtom() throws RecognitionException {
		PrimitiveAtomContext _localctx = new PrimitiveAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitiveAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_WORD) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_NUMBER) | (1L << REAL_NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON_WORD() { return getToken(GraphLangGrammarParser.SEMICOLON_WORD, 0); }
		public TerminalNode BREAK_WORD() { return getToken(GraphLangGrammarParser.BREAK_WORD, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(BREAK_WORD);
			setState(276); match(SEMICOLON_WORD);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON_WORD() { return getToken(GraphLangGrammarParser.SEMICOLON_WORD, 0); }
		public TerminalNode RETURN_WORD() { return getToken(GraphLangGrammarParser.RETURN_WORD, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(RETURN_WORD);
			setState(280);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_WORD) | (1L << OPENING_BRACKET_WORD) | (1L << MINUS_WORD) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_NUMBER) | (1L << REAL_NUMBER) | (1L << STRING) | (1L << IDENTIFIER_WORD))) != 0)) {
				{
				setState(279); statement(0);
				}
			}

			setState(282); match(SEMICOLON_WORD);
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

	public static class VariableInitializationContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EQUAL_SIGN_WORD() { return getToken(GraphLangGrammarParser.EQUAL_SIGN_WORD, 0); }
		public VariableDefenitionContext variableDefenition() {
			return getRuleContext(VariableDefenitionContext.class,0);
		}
		public VariableInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterVariableInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitVariableInitialization(this);
		}
	}

	public final VariableInitializationContext variableInitialization() throws RecognitionException {
		VariableInitializationContext _localctx = new VariableInitializationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); variableDefenition();
			setState(287);
			_la = _input.LA(1);
			if (_la==EQUAL_SIGN_WORD) {
				{
				setState(285); match(EQUAL_SIGN_WORD);
				setState(286); statement(0);
				}
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

	public static class VariableDefenitionContext extends ParserRuleContext {
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public TerminalNode IDENTIFIER_WORD() { return getToken(GraphLangGrammarParser.IDENTIFIER_WORD, 0); }
		public TerminalNode OPENING_SQUARE_BRACKET_WORD() { return getToken(GraphLangGrammarParser.OPENING_SQUARE_BRACKET_WORD, 0); }
		public TerminalNode CLOSING_SQUARE_BRACKET_WORD() { return getToken(GraphLangGrammarParser.CLOSING_SQUARE_BRACKET_WORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INTEGER_NUMBER() { return getToken(GraphLangGrammarParser.INTEGER_NUMBER, 0); }
		public VariableDefenitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefenition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterVariableDefenition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitVariableDefenition(this);
		}
	}

	public final VariableDefenitionContext variableDefenition() throws RecognitionException {
		VariableDefenitionContext _localctx = new VariableDefenitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDefenition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); typeDefinition();
			setState(296);
			_la = _input.LA(1);
			if (_la==OPENING_SQUARE_BRACKET_WORD) {
				{
				setState(290); match(OPENING_SQUARE_BRACKET_WORD);
				setState(293);
				switch (_input.LA(1)) {
				case INTEGER_NUMBER:
					{
					setState(291); match(INTEGER_NUMBER);
					}
					break;
				case IDENTIFIER_WORD:
					{
					setState(292); variable();
					}
					break;
				case CLOSING_SQUARE_BRACKET_WORD:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); match(CLOSING_SQUARE_BRACKET_WORD);
				}
			}

			setState(298); match(IDENTIFIER_WORD);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_SPECIFIER() { return getTokens(GraphLangGrammarParser.TYPE_SPECIFIER); }
		public TerminalNode TYPE_WORD() { return getToken(GraphLangGrammarParser.TYPE_WORD, 0); }
		public TerminalNode TYPE_SPECIFIER(int i) {
			return getToken(GraphLangGrammarParser.TYPE_SPECIFIER, i);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphLangGrammarListener ) ((GraphLangGrammarListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_SPECIFIER) {
				{
				{
				setState(300); match(TYPE_SPECIFIER);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(TYPE_WORD);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22: return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 5);

		case 2: return precpred(_ctx, 4);

		case 3: return precpred(_ctx, 3);

		case 4: return precpred(_ctx, 2);

		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0137\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"Q\n\5\f\5\16\5T\13\5\5\5V\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16"+
		"\6a\13\6\5\6c\n\6\3\6\3\6\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t\3\t\3\t\5\t}\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\5\n\u0084\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13"+
		"\3\13\3\13\5\13\u0091\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\5\20\u00ac\n\20\3\21\3\21\3\22\5\22\u00b1\n\22\3\23\3\23\5\23\u00b5\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00be\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00ca\n\25\r\25\16\25\u00cb\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df\13\26\3\27\3\27\3\27\3"+
		"\27\5\27\u00e5\n\27\3\27\5\27\u00e8\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f7\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u010b\n\30\f\30\16\30\u010e\13\30\3\31\3\31\5\31\u0112\n\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\5\34\u011b\n\34\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u0122\n\35\3\36\3\36\3\36\3\36\5\36\u0128\n\36\3\36\5\36\u012b\n"+
		"\36\3\36\3\36\3\37\7\37\u0130\n\37\f\37\16\37\u0133\13\37\3\37\3\37\3"+
		"\37\2\3. \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<\2\5\3\2\32\35\3\2\36\37\5\2\n\n  #%\u0143\2?\3\2\2\2\4E\3\2\2\2\6"+
		"H\3\2\2\2\bL\3\2\2\2\nY\3\2\2\2\ff\3\2\2\2\16p\3\2\2\2\20s\3\2\2\2\22"+
		"\u008b\3\2\2\2\24\u0090\3\2\2\2\26\u0092\3\2\2\2\30\u0098\3\2\2\2\32\u009e"+
		"\3\2\2\2\34\u00a4\3\2\2\2\36\u00ab\3\2\2\2 \u00ad\3\2\2\2\"\u00b0\3\2"+
		"\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00bf\3\2\2\2*\u00cf\3\2\2\2,\u00e0"+
		"\3\2\2\2.\u00f6\3\2\2\2\60\u0111\3\2\2\2\62\u0113\3\2\2\2\64\u0115\3\2"+
		"\2\2\66\u0118\3\2\2\28\u011e\3\2\2\2:\u0123\3\2\2\2<\u0131\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\2\2\3D\3"+
		"\3\2\2\2EF\5\6\4\2FG\5\f\7\2G\5\3\2\2\2HI\5<\37\2IJ\7(\2\2JK\5\b\5\2K"+
		"\7\3\2\2\2LU\7\r\2\2MR\5:\36\2NO\7\23\2\2OQ\5:\36\2PN\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2\2"+
		"\2WX\7\16\2\2X\t\3\2\2\2Yb\7\r\2\2Z_\5.\30\2[\\\7\23\2\2\\^\5.\30\2]["+
		"\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3\2\2\2b"+
		"c\3\2\2\2cd\3\2\2\2de\7\16\2\2e\13\3\2\2\2fj\7\17\2\2gi\5\22\n\2hg\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\5\66\34\2no\7"+
		"\20\2\2o\r\3\2\2\2pq\7(\2\2qr\5\n\6\2r\17\3\2\2\2sw\7\17\2\2tv\5\22\n"+
		"\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z}\5\64"+
		"\33\2{}\5\66\34\2|z\3\2\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\20\2"+
		"\2\177\21\3\2\2\2\u0080\u0084\5\16\b\2\u0081\u0084\5*\26\2\u0082\u0084"+
		"\58\35\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u008c\3\2\2\2\u0087\u008c\5\24"+
		"\13\2\u0088\u008c\5$\23\2\u0089\u008c\5\20\t\2\u008a\u008c\5\4\3\2\u008b"+
		"\u0083\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\23\3\2\2\2\u008d\u0091\5\26\f\2\u008e\u0091"+
		"\5\30\r\2\u008f\u0091\5\32\16\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093\7\7\2\2\u0093\u0094"+
		"\7\r\2\2\u0094\u0095\5.\30\2\u0095\u0096\7\16\2\2\u0096\u0097\5\20\t\2"+
		"\u0097\27\3\2\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\b\2\2\u009a\u009b"+
		"\7\r\2\2\u009b\u009c\5.\30\2\u009c\u009d\7\16\2\2\u009d\31\3\2\2\2\u009e"+
		"\u009f\7\t\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7"+
		"\16\2\2\u00a2\u00a3\5\20\t\2\u00a3\33\3\2\2\2\u00a4\u00a5\5\36\20\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7\31\2\2\u00a8\u00a9\5"+
		"\"\22\2\u00a9\35\3\2\2\2\u00aa\u00ac\58\35\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\5.\30\2\u00ae!\3\2\2\2\u00af"+
		"\u00b1\5\22\n\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1#\3\2\2\2"+
		"\u00b2\u00b5\5&\24\2\u00b3\u00b5\5(\25\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8\7\r\2\2\u00b8"+
		"\u00b9\5.\30\2\u00b9\u00ba\7\16\2\2\u00ba\u00bd\5\20\t\2\u00bb\u00bc\7"+
		"\5\2\2\u00bc\u00be\5\20\t\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\'\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5.\30\2"+
		"\u00c2\u00c3\7\16\2\2\u00c3\u00c9\7\17\2\2\u00c4\u00c5\7\21\2\2\u00c5"+
		"\u00c6\5.\30\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00ca\3"+
		"\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce)\3\2\2\2"+
		"\u00cf\u00d4\5,\27\2\u00d0\u00d1\7\23\2\2\u00d1\u00d3\5,\27\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00dd\5"+
		".\30\2\u00d9\u00da\7\23\2\2\u00da\u00dc\5.\30\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de+\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e7\7(\2\2\u00e1\u00e4\7\21\2\2\u00e2\u00e5"+
		"\7#\2\2\u00e3\u00e5\5,\27\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\7\22\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8-\3\2\2\2\u00e9\u00ea\b\30\1\2\u00ea\u00eb\7\26\2\2\u00eb"+
		"\u00f7\5.\30\n\u00ec\u00ed\7\r\2\2\u00ed\u00ee\7&\2\2\u00ee\u00ef\7\16"+
		"\2\2\u00ef\u00f7\5.\30\t\u00f0\u00f7\5\60\31\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f3\5.\30\2\u00f3\u00f4\7\16\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\5"+
		"\16\b\2\u00f6\u00e9\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f1\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u010c\3\2\2\2\u00f8\u00f9\f\b"+
		"\2\2\u00f9\u00fa\7\27\2\2\u00fa\u010b\5.\30\t\u00fb\u00fc\f\7\2\2\u00fc"+
		"\u00fd\7\30\2\2\u00fd\u010b\5.\30\b\u00fe\u00ff\f\6\2\2\u00ff\u0100\7"+
		"\25\2\2\u0100\u010b\5.\30\7\u0101\u0102\f\5\2\2\u0102\u0103\7\26\2\2\u0103"+
		"\u010b\5.\30\6\u0104\u0105\f\4\2\2\u0105\u0106\t\2\2\2\u0106\u010b\5."+
		"\30\5\u0107\u0108\f\3\2\2\u0108\u0109\t\3\2\2\u0109\u010b\5.\30\4\u010a"+
		"\u00f8\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u00fe\3\2\2\2\u010a\u0101\3\2"+
		"\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d/\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0112\5\62\32\2\u0110\u0112\5,\27\2\u0111\u010f\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\61\3\2\2\2\u0113\u0114\t\4\2\2\u0114\63\3\2\2\2\u0115\u0116"+
		"\7\13\2\2\u0116\u0117\7\f\2\2\u0117\65\3\2\2\2\u0118\u011a\7\4\2\2\u0119"+
		"\u011b\5.\30\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\7\f\2\2\u011d\67\3\2\2\2\u011e\u0121\5:\36\2\u011f\u0120"+
		"\7\24\2\2\u0120\u0122\5.\30\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u01229\3\2\2\2\u0123\u012a\5<\37\2\u0124\u0127\7\21\2\2\u0125\u0128\7"+
		"#\2\2\u0126\u0128\5,\27\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\7\22\2\2\u012a\u0124\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7(\2\2\u012d"+
		";\3\2\2\2\u012e\u0130\7\'\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\7&\2\2\u0135=\3\2\2\2\37ARU_bjw|\u0083\u008b\u0090"+
		"\u00ab\u00b0\u00b4\u00bd\u00cb\u00d4\u00dd\u00e4\u00e7\u00f6\u010a\u010c"+
		"\u0111\u011a\u0121\u0127\u012a\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}