// Generated from C:/Users/james/IdeaProjects/LuaLike/syntax-tree/src/main/resources\AlmostLuaParser.g4 by ANTLR 4.12.0
package me.cynsin.almostlua;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlmostLuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LongString=1, Comment=2, LineComment=3, LParen=4, RParen=5, Colon=6, Function=7, 
		Comma=8, Varargs=9, Nil=10, True=11, False=12, Dot=13, ColonColon=14, 
		Break=15, Goto=16, Do=17, End=18, Semi=19, Assign=20, While=21, Repeat=22, 
		Until=23, If=24, Then=25, ElseIf=26, Else=27, For=28, In=29, Local=30, 
		Return=31, Continue=32, Or=33, And=34, Not=35, Count=36, RBrace=37, LBrace=38, 
		StrConcat=39, BitXor=40, NotEqual=41, RBraceAssign=42, LBraceAssign=43, 
		EqualEqual=44, Plus=45, Minus=46, Multiply=47, Divide=48, Modulo=49, Pow=50, 
		BitAnd=51, BitOr=52, ShiftLeft=53, ShiftRight=54, OpenBrace=55, CloseBrace=56, 
		OpenSquareBracket=57, CloseSquareBracket=58, Int=59, Hex=60, Float=61, 
		HexFloat=62, Name=63, NormalString=64, CharString=65, WS=66, Shebang=67;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_statement = 2, RULE_functionDeclaration = 3, 
		RULE_anonymousFunction = 4, RULE_parameterList = 5, RULE_assignment = 6, 
		RULE_expressions = 7, RULE_object = 8, RULE_attribute = 9, RULE_attributeList = 10, 
		RULE_return = 11, RULE_attributes = 12, RULE_chunkObject = 13, RULE_expression = 14, 
		RULE_binaryOperator = 15, RULE_literal = 16, RULE_numeric = 17, RULE_string = 18, 
		RULE_identifier = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "statement", "functionDeclaration", "anonymousFunction", 
			"parameterList", "assignment", "expressions", "object", "attribute", 
			"attributeList", "return", "attributes", "chunkObject", "expression", 
			"binaryOperator", "literal", "numeric", "string", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "':'", "'function'", "','", "'...'", 
			"'nil'", null, null, "'.'", "'::'", null, "'goto'", "'do'", "'end'", 
			"';'", "'='", "'while'", "'repeat'", "'until'", "'if'", "'then'", "'elseif'", 
			"'else'", "'for'", "'in'", "'local'", null, "'continue'", "'or'", "'and'", 
			"'not'", "'#'", "'>'", "'<'", "'..'", "'~'", "'~='", "'>='", "'<='", 
			"'=='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'<<'", 
			"'>>'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LongString", "Comment", "LineComment", "LParen", "RParen", "Colon", 
			"Function", "Comma", "Varargs", "Nil", "True", "False", "Dot", "ColonColon", 
			"Break", "Goto", "Do", "End", "Semi", "Assign", "While", "Repeat", "Until", 
			"If", "Then", "ElseIf", "Else", "For", "In", "Local", "Return", "Continue", 
			"Or", "And", "Not", "Count", "RBrace", "LBrace", "StrConcat", "BitXor", 
			"NotEqual", "RBraceAssign", "LBraceAssign", "EqualEqual", "Plus", "Minus", 
			"Multiply", "Divide", "Modulo", "Pow", "BitAnd", "BitOr", "ShiftLeft", 
			"ShiftRight", "OpenBrace", "CloseBrace", "OpenSquareBracket", "CloseSquareBracket", 
			"Int", "Hex", "Float", "HexFloat", "Name", "NormalString", "CharString", 
			"WS", "Shebang"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlmostLuaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlmostLuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlmostLuaParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			block();
			setState(41);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					statement();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(49);
				return_();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext cond;
		public BlockContext body;
		public BlockContext elseBody;
		public TerminalNode If() { return getToken(AlmostLuaParser.If, 0); }
		public TerminalNode Then() { return getToken(AlmostLuaParser.Then, 0); }
		public TerminalNode End() { return getToken(AlmostLuaParser.End, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(AlmostLuaParser.Else, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(AlmostLuaParser.Semi, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode While() { return getToken(AlmostLuaParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(AlmostLuaParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(AlmostLuaParser.End, 0); }
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(If);
				setState(53);
				((IfStatementContext)_localctx).cond = expression(0);
				setState(54);
				match(Then);
				setState(55);
				((IfStatementContext)_localctx).body = block();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(56);
					match(Else);
					setState(57);
					((IfStatementContext)_localctx).elseBody = block();
					}
				}

				setState(60);
				match(End);
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				assignment();
				}
				break;
			case 3:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				functionDeclaration();
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(While);
				setState(65);
				expression(0);
				setState(66);
				match(Do);
				setState(67);
				block();
				setState(68);
				match(End);
				}
				break;
			case 5:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				expression(0);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(71);
					match(Semi);
					}
				}

				}
				break;
			case 6:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				return_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(AlmostLuaParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LParen() { return getToken(AlmostLuaParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(AlmostLuaParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(AlmostLuaParser.End, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Function);
			setState(78);
			identifier();
			setState(79);
			match(LParen);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(80);
				parameterList();
				}
			}

			setState(83);
			match(RParen);
			setState(84);
			block();
			setState(85);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(AlmostLuaParser.Function, 0); }
		public TerminalNode LParen() { return getToken(AlmostLuaParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(AlmostLuaParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(AlmostLuaParser.End, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Function);
			setState(88);
			match(LParen);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(89);
				parameterList();
				}
			}

			setState(92);
			match(RParen);
			setState(93);
			block();
			setState(94);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(AlmostLuaParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(AlmostLuaParser.Name, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AlmostLuaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AlmostLuaParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(Name);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(97);
				match(Comma);
				setState(98);
				match(Name);
				}
				}
				setState(103);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionsContext left;
		public ExpressionContext right;
		public TerminalNode Assign() { return getToken(AlmostLuaParser.Assign, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(AlmostLuaParser.Semi, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((AssignmentContext)_localctx).left = expressions();
			setState(105);
			match(Assign);
			setState(106);
			((AssignmentContext)_localctx).right = expression(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(107);
				match(Semi);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AlmostLuaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AlmostLuaParser.Comma, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expression(0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(111);
				match(Comma);
				setState(112);
				expression(0);
				}
				}
				setState(117);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode LBrace() { return getToken(AlmostLuaParser.LBrace, 0); }
		public TerminalNode Divide() { return getToken(AlmostLuaParser.Divide, 0); }
		public TerminalNode RBrace() { return getToken(AlmostLuaParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LBrace);
			setState(119);
			((ObjectContext)_localctx).name = identifier();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460477425509246L) != 0) || _la==NormalString || _la==CharString) {
				{
				setState(120);
				attributes();
				}
			}

			setState(123);
			match(Divide);
			setState(124);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AlmostLuaParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			identifier();
			setState(127);
			match(Assign);
			setState(128);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AlmostLuaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AlmostLuaParser.Comma, i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			attribute();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(131);
				match(Comma);
				setState(132);
				attribute();
				}
				}
				setState(137);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AlmostLuaParser.Return, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Semi() { return getToken(AlmostLuaParser.Semi, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Return);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(139);
				attributes();
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(142);
				match(Semi);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	 
		public AttributesContext() { }
		public void copyFrom(AttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnnamedAttributesContext extends AttributesContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AlmostLuaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AlmostLuaParser.Comma, i);
		}
		public UnnamedAttributesContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitUnnamedAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedAttributesContext extends AttributesContext {
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public NamedAttributesContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitNamedAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributes);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new UnnamedAttributesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				expression(0);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(146);
					match(Comma);
					setState(147);
					expression(0);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				_localctx = new NamedAttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				attributeList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkObjectContext extends ParserRuleContext {
		public IdentifierContext name;
		public List<TerminalNode> LBrace() { return getTokens(AlmostLuaParser.LBrace); }
		public TerminalNode LBrace(int i) {
			return getToken(AlmostLuaParser.LBrace, i);
		}
		public List<TerminalNode> RBrace() { return getTokens(AlmostLuaParser.RBrace); }
		public TerminalNode RBrace(int i) {
			return getToken(AlmostLuaParser.RBrace, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode Divide() { return getToken(AlmostLuaParser.Divide, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ChunkObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunkObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitChunkObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkObjectContext chunkObject() throws RecognitionException {
		ChunkObjectContext _localctx = new ChunkObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chunkObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LBrace);
			setState(157);
			((ChunkObjectContext)_localctx).name = identifier();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460477425509246L) != 0) || _la==NormalString || _la==CharString) {
				{
				setState(158);
				attributes();
				}
			}

			setState(161);
			match(RBrace);
			setState(162);
			block();
			setState(163);
			match(LBrace);
			setState(164);
			identifier();
			setState(165);
			match(Divide);
			setState(166);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionExpressionContext extends ExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitAnonymousFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Dot() { return getToken(AlmostLuaParser.Dot, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public BinaryOperatorContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public BinaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitBinaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChunkObjectExpressionContext extends ExpressionContext {
		public ChunkObjectContext chunkObject() {
			return getRuleContext(ChunkObjectContext.class,0);
		}
		public ChunkObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitChunkObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ExpressionContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LParen() { return getToken(AlmostLuaParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(AlmostLuaParser.RParen, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				anonymousFunction();
				}
				break;
			case 4:
				{
				_localctx = new ChunkObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				chunkObject();
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				identifier();
				setState(174);
				match(LParen);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460477425509246L) != 0) || _la==NormalString || _la==CharString) {
					{
					setState(175);
					attributes();
					}
				}

				setState(178);
				match(RParen);
				}
				break;
			case 6:
				{
				_localctx = new ObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				object();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MemberExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(184);
						match(Dot);
						setState(185);
						((MemberExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						((BinaryOperatorExpressionContext)_localctx).op = binaryOperator();
						setState(188);
						((BinaryOperatorExpressionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(AlmostLuaParser.Or, 0); }
		public TerminalNode And() { return getToken(AlmostLuaParser.And, 0); }
		public TerminalNode LBrace() { return getToken(AlmostLuaParser.LBrace, 0); }
		public TerminalNode LBraceAssign() { return getToken(AlmostLuaParser.LBraceAssign, 0); }
		public TerminalNode RBrace() { return getToken(AlmostLuaParser.RBrace, 0); }
		public TerminalNode RBraceAssign() { return getToken(AlmostLuaParser.RBraceAssign, 0); }
		public TerminalNode NotEqual() { return getToken(AlmostLuaParser.NotEqual, 0); }
		public TerminalNode EqualEqual() { return getToken(AlmostLuaParser.EqualEqual, 0); }
		public TerminalNode StrConcat() { return getToken(AlmostLuaParser.StrConcat, 0); }
		public TerminalNode Plus() { return getToken(AlmostLuaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AlmostLuaParser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(AlmostLuaParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AlmostLuaParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(AlmostLuaParser.Modulo, 0); }
		public TerminalNode Pow() { return getToken(AlmostLuaParser.Pow, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2250588632907776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends LiteralContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public NumericLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode True() { return getToken(AlmostLuaParser.True, 0); }
		public TerminalNode False() { return getToken(AlmostLuaParser.False, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilLiteralContext extends LiteralContext {
		public TerminalNode Nil() { return getToken(AlmostLuaParser.Nil, 0); }
		public NilLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitNilLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Nil:
				_localctx = new NilLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(Nil);
				}
				break;
			case LongString:
			case NormalString:
			case CharString:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				string();
				}
				break;
			case Int:
			case Hex:
			case Float:
			case HexFloat:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				numeric();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericContext extends ParserRuleContext {
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	 
		public NumericContext() { }
		public void copyFrom(NumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends NumericContext {
		public TerminalNode Float() { return getToken(AlmostLuaParser.Float, 0); }
		public FloatLiteralContext(NumericContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexLiteralContext extends NumericContext {
		public TerminalNode Hex() { return getToken(AlmostLuaParser.Hex, 0); }
		public HexLiteralContext(NumericContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitHexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexFloatLiteralContext extends NumericContext {
		public TerminalNode HexFloat() { return getToken(AlmostLuaParser.HexFloat, 0); }
		public HexFloatLiteralContext(NumericContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitHexFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends NumericContext {
		public TerminalNode Int() { return getToken(AlmostLuaParser.Int, 0); }
		public IntLiteralContext(NumericContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeric);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(Int);
				}
				break;
			case Hex:
				_localctx = new HexLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(Hex);
				}
				break;
			case Float:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(Float);
				}
				break;
			case HexFloat:
				_localctx = new HexFloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(HexFloat);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharStringLiteralContext extends StringContext {
		public TerminalNode CharString() { return getToken(AlmostLuaParser.CharString, 0); }
		public CharStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitCharStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LongStringLiteralContext extends StringContext {
		public TerminalNode LongString() { return getToken(AlmostLuaParser.LongString, 0); }
		public LongStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitLongStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalStringLiteralContext extends StringContext {
		public TerminalNode NormalString() { return getToken(AlmostLuaParser.NormalString, 0); }
		public NormalStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitNormalStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NormalString:
				_localctx = new NormalStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(NormalString);
				}
				break;
			case LongString:
				_localctx = new LongStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LongString);
				}
				break;
			case CharString:
				_localctx = new CharStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(CharString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(AlmostLuaParser.Name, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlmostLuaParserVisitor ) return ((AlmostLuaParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Name);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003R\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005d\b\u0005\n\u0005\f\u0005g\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\bz\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0090\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0095\b\f\n\f\f\f\u0098"+
		"\t\f\u0001\f\u0003\f\u009b\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00a0\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00bf\b\u000e\n\u000e"+
		"\f\u000e\u00c2\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ca\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00d0\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00d5\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0001\u001c\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0002\u0003\u0000!\"%"+
		"\')2\u0001\u0000\u000b\f\u00e9\u0000(\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000"+
		"\u0000\bW\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\fh\u0001"+
		"\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000"+
		"\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000"+
		"\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000"+
		"\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000"+
		"\u001e\u00c3\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\""+
		"\u00cf\u0001\u0000\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00d6\u0001"+
		"\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0000\u0000\u0001"+
		"*\u0001\u0001\u0000\u0000\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"13\u0003\u0016\u000b\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0018\u0000\u000056\u0003"+
		"\u001c\u000e\u000067\u0005\u0019\u0000\u00007:\u0003\u0002\u0001\u0000"+
		"89\u0005\u001b\u0000\u00009;\u0003\u0002\u0001\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0012"+
		"\u0000\u0000=L\u0001\u0000\u0000\u0000>L\u0003\f\u0006\u0000?L\u0003\u0006"+
		"\u0003\u0000@A\u0005\u0015\u0000\u0000AB\u0003\u001c\u000e\u0000BC\u0005"+
		"\u0011\u0000\u0000CD\u0003\u0002\u0001\u0000DE\u0005\u0012\u0000\u0000"+
		"EL\u0001\u0000\u0000\u0000FH\u0003\u001c\u000e\u0000GI\u0005\u0013\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0016\u000b\u0000K4\u0001\u0000\u0000\u0000K>\u0001"+
		"\u0000\u0000\u0000K?\u0001\u0000\u0000\u0000K@\u0001\u0000\u0000\u0000"+
		"KF\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0003&\u0013\u0000OQ\u0005\u0004"+
		"\u0000\u0000PR\u0003\n\u0005\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000TU\u0003"+
		"\u0002\u0001\u0000UV\u0005\u0012\u0000\u0000V\u0007\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0007\u0000\u0000XZ\u0005\u0004\u0000\u0000Y[\u0003\n\u0005"+
		"\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0005\u0000\u0000]^\u0003\u0002\u0001\u0000^_\u0005"+
		"\u0012\u0000\u0000_\t\u0001\u0000\u0000\u0000`e\u0005?\u0000\u0000ab\u0005"+
		"\b\u0000\u0000bd\u0005?\u0000\u0000ca\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\u000b\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003\u000e"+
		"\u0007\u0000ij\u0005\u0014\u0000\u0000jl\u0003\u001c\u000e\u0000km\u0005"+
		"\u0013\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"m\r\u0001\u0000\u0000\u0000ns\u0003\u001c\u000e\u0000op\u0005\b\u0000"+
		"\u0000pr\u0003\u001c\u000e\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u000f"+
		"\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005&\u0000\u0000"+
		"wy\u0003&\u0013\u0000xz\u0003\u0018\f\u0000yx\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u00050\u0000\u0000"+
		"|}\u0005%\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u007f\u0003&\u0013"+
		"\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080\u0081\u0003\u001c\u000e"+
		"\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u0012\t\u0000"+
		"\u0083\u0084\u0005\b\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0015\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0005\u001f\u0000\u0000\u008b\u008d\u0003\u0018\f\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0013\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0017"+
		"\u0001\u0000\u0000\u0000\u0091\u0096\u0003\u001c\u000e\u0000\u0092\u0093"+
		"\u0005\b\u0000\u0000\u0093\u0095\u0003\u001c\u000e\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009b\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0003"+
		"\u0014\n\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005&\u0000"+
		"\u0000\u009d\u009f\u0003&\u0013\u0000\u009e\u00a0\u0003\u0018\f\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2"+
		"\u00a3\u0003\u0002\u0001\u0000\u00a3\u00a4\u0005&\u0000\u0000\u00a4\u00a5"+
		"\u0003&\u0013\u0000\u00a5\u00a6\u00050\u0000\u0000\u00a6\u00a7\u0005%"+
		"\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\u000e"+
		"\uffff\uffff\u0000\u00a9\u00b6\u0003&\u0013\u0000\u00aa\u00b6\u0003 \u0010"+
		"\u0000\u00ab\u00b6\u0003\b\u0004\u0000\u00ac\u00b6\u0003\u001a\r\u0000"+
		"\u00ad\u00ae\u0003&\u0013\u0000\u00ae\u00b0\u0005\u0004\u0000\u0000\u00af"+
		"\u00b1\u0003\u0018\f\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0005\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0003\u0010\b\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00c0\u0001\u0000\u0000\u0000\u00b7\u00b8\n\u0004"+
		"\u0000\u0000\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u00bf\u0003\u001c\u000e"+
		"\u0005\u00ba\u00bb\n\u0002\u0000\u0000\u00bb\u00bc\u0003\u001e\u000f\u0000"+
		"\u00bc\u00bd\u0003\u001c\u000e\u0003\u00bd\u00bf\u0001\u0000\u0000\u0000"+
		"\u00be\u00b7\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0007\u0000\u0000\u0000"+
		"\u00c4\u001f\u0001\u0000\u0000\u0000\u00c5\u00ca\u0007\u0001\u0000\u0000"+
		"\u00c6\u00ca\u0005\n\u0000\u0000\u00c7\u00ca\u0003$\u0012\u0000\u00c8"+
		"\u00ca\u0003\"\u0011\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u00cb\u00d0\u0005"+
		";\u0000\u0000\u00cc\u00d0\u0005<\u0000\u0000\u00cd\u00d0\u0005=\u0000"+
		"\u0000\u00ce\u00d0\u0005>\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0#\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d5\u0005@\u0000\u0000\u00d2\u00d5\u0005\u0001\u0000\u0000\u00d3\u00d5"+
		"\u0005A\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5%\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005?\u0000\u0000\u00d7\'\u0001\u0000\u0000"+
		"\u0000\u0018.2:HKQZelsy\u0087\u008c\u008f\u0096\u009a\u009f\u00b0\u00b5"+
		"\u00be\u00c0\u00c9\u00cf\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}