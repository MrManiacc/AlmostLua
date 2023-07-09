// Generated from C:/Users/james/IdeaProjects/LuaLike/syntax-tree/src/main/resources\LuaLikeParser.g4 by ANTLR 4.12.0
package me.cynsin.lualike;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LuaLikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LONGSTRING=1, COMMENT=2, LINE_COMMENT=3, OPEN_PARENTHESES=4, CLOSE_PARENTHESES=5, 
		COLON=6, FUNCTION=7, COMMA=8, VARARGS=9, NIL=10, TRUE=11, FALSE=12, DOT=13, 
		COLON_COLON=14, BREAK=15, GOTO=16, DO=17, END=18, SEMI=19, EQUALS=20, 
		WHILE=21, REPEAT=22, UNTIL=23, IF=24, THEN=25, ELSEIF=26, ELSE=27, FOR=28, 
		IN=29, LOCAL=30, RETURN=31, CONTINUE=32, OR=33, AND=34, NOT=35, COUNT=36, 
		GREATER_THAN=37, LESS_THAN=38, STR_CONCAT=39, BIT_XOR=40, NOT_EQUAL=41, 
		GREATER_THAN_OR_EQUAL=42, LESS_THAN_OR_EQUAL=43, EQUAL_EQUAL=44, PLUS=45, 
		MINUS=46, MULTIPLY=47, DIVIDE=48, MODULO=49, POW=50, BIT_AND=51, BIT_OR=52, 
		SHIFT_LEFT=53, SHIFT_RIGHT=54, OPEN_BRACE=55, CLOSE_BRACE=56, OPEN_SQUARE_BRACKET=57, 
		CLOSE_SQUARE_BRACKET=58, INT=59, HEX=60, FLOAT=61, HEX_FLOAT=62, NAME=63, 
		NORMALSTRING=64, CHARSTRING=65, WS=66, SHEBANG=67;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_attribList = 3, RULE_laststat = 4, 
		RULE_label = 5, RULE_object = 6, RULE_objectAttributes = 7, RULE_functionObjectEntry = 8, 
		RULE_funcname = 9, RULE_varlist = 10, RULE_namelist = 11, RULE_explist = 12, 
		RULE_reference = 13, RULE_exp = 14, RULE_literalexp = 15, RULE_var = 16, 
		RULE_varSuffix = 17, RULE_nameAndArgs = 18, RULE_args = 19, RULE_functiondef = 20, 
		RULE_funcbody = 21, RULE_parlist = 22, RULE_tableconstructor = 23, RULE_fieldlist = 24, 
		RULE_field = 25, RULE_fieldsep = 26, RULE_operatorOr = 27, RULE_operatorAnd = 28, 
		RULE_operatorComparison = 29, RULE_operatorStrcat = 30, RULE_operatorAddSub = 31, 
		RULE_operatorMulDivMod = 32, RULE_operatorBitwise = 33, RULE_operatorUnary = 34, 
		RULE_operatorPower = 35, RULE_number = 36, RULE_string = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "attribList", "laststat", "label", "object", 
			"objectAttributes", "functionObjectEntry", "funcname", "varlist", "namelist", 
			"explist", "reference", "exp", "literalexp", "var", "varSuffix", "nameAndArgs", 
			"args", "functiondef", "funcbody", "parlist", "tableconstructor", "fieldlist", 
			"field", "fieldsep", "operatorOr", "operatorAnd", "operatorComparison", 
			"operatorStrcat", "operatorAddSub", "operatorMulDivMod", "operatorBitwise", 
			"operatorUnary", "operatorPower", "number", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "':'", "'function'", "','", "'...'", 
			"'nil'", "'true'", "'false'", "'.'", "'::'", "'break'", "'goto'", "'do'", 
			"'end'", "';'", "'='", "'while'", "'repeat'", "'until'", "'if'", "'then'", 
			"'elseif'", "'else'", "'for'", "'in'", "'local'", "'return'", "'continue'", 
			"'or'", "'and'", "'not'", "'#'", "'>'", "'<'", "'..'", "'~'", "'~='", 
			"'>='", "'<='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", 
			"'|'", "'<<'", "'>>'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LONGSTRING", "COMMENT", "LINE_COMMENT", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"COLON", "FUNCTION", "COMMA", "VARARGS", "NIL", "TRUE", "FALSE", "DOT", 
			"COLON_COLON", "BREAK", "GOTO", "DO", "END", "SEMI", "EQUALS", "WHILE", 
			"REPEAT", "UNTIL", "IF", "THEN", "ELSEIF", "ELSE", "FOR", "IN", "LOCAL", 
			"RETURN", "CONTINUE", "OR", "AND", "NOT", "COUNT", "GREATER_THAN", "LESS_THAN", 
			"STR_CONCAT", "BIT_XOR", "NOT_EQUAL", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"EQUAL_EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "POW", 
			"BIT_AND", "BIT_OR", "SHIFT_LEFT", "SHIFT_RIGHT", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "HEX", "FLOAT", 
			"HEX_FLOAT", "NAME", "NORMALSTRING", "CHARSTRING", "WS", "SHEBANG"
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
	public String getGrammarFileName() { return "LuaLikeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuaLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaLikeParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			block();
			setState(77);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public LaststatContext laststat() {
			return getRuleContext(LaststatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					stat();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6442483712L) != 0)) {
				{
				setState(85);
				laststat();
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends StatContext {
		public TerminalNode DO() { return getToken(LuaLikeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public DoStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelStatementContext extends StatContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLabelStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatContext {
		public TerminalNode SEMI() { return getToken(LuaLikeParser.SEMI, 0); }
		public EmptyStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatContext {
		public TerminalNode WHILE() { return getToken(LuaLikeParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DO() { return getToken(LuaLikeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public WhileStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatContext {
		public TerminalNode BREAK() { return getToken(LuaLikeParser.BREAK, 0); }
		public BreakStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatContext {
		public TerminalNode IF() { return getToken(LuaLikeParser.IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(LuaLikeParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LuaLikeParser.THEN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(LuaLikeParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(LuaLikeParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(LuaLikeParser.ELSE, 0); }
		public IfStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericForStatementContext extends StatContext {
		public TerminalNode FOR() { return getToken(LuaLikeParser.FOR, 0); }
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuaLikeParser.IN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode DO() { return getToken(LuaLikeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public GenericForStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitGenericForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StatContext {
		public TerminalNode FUNCTION() { return getToken(LuaLikeParser.FUNCTION, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctionStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalFunctionStatementContext extends StatContext {
		public TerminalNode LOCAL() { return getToken(LuaLikeParser.LOCAL, 0); }
		public TerminalNode FUNCTION() { return getToken(LuaLikeParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public LocalFunctionStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLocalFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GotoStatementContext extends StatContext {
		public TerminalNode GOTO() { return getToken(LuaLikeParser.GOTO, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public GotoStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public AssignmentStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpressionStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericForStatementContext extends StatContext {
		public TerminalNode FOR() { return getToken(LuaLikeParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public TerminalNode DO() { return getToken(LuaLikeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public NumericForStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNumericForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends StatContext {
		public TerminalNode LOCAL() { return getToken(LuaLikeParser.LOCAL, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public AttribListContext attribList() {
			return getRuleContext(AttribListContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends StatContext {
		public TerminalNode REPEAT() { return getToken(LuaLikeParser.REPEAT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(LuaLikeParser.UNTIL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				exp(0);
				setState(90);
				match(EQUALS);
				setState(91);
				explist();
				}
				break;
			case 3:
				_localctx = new LabelStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				label();
				}
				break;
			case 4:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(BREAK);
				}
				break;
			case 5:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(GOTO);
				setState(96);
				match(NAME);
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(DO);
				setState(98);
				block();
				setState(99);
				match(END);
				}
				break;
			case 7:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				match(WHILE);
				setState(102);
				exp(0);
				setState(103);
				match(DO);
				setState(104);
				block();
				setState(105);
				match(END);
				}
				break;
			case 8:
				_localctx = new RepeatStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				match(REPEAT);
				setState(108);
				block();
				setState(109);
				match(UNTIL);
				setState(110);
				exp(0);
				}
				break;
			case 9:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				match(IF);
				setState(113);
				exp(0);
				setState(114);
				match(THEN);
				setState(115);
				block();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(116);
					match(ELSEIF);
					setState(117);
					exp(0);
					setState(118);
					match(THEN);
					setState(119);
					block();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(126);
					match(ELSE);
					setState(127);
					block();
					}
				}

				setState(130);
				match(END);
				}
				break;
			case 10:
				_localctx = new NumericForStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				match(FOR);
				setState(133);
				match(NAME);
				setState(134);
				match(EQUALS);
				setState(135);
				exp(0);
				setState(136);
				match(COMMA);
				setState(137);
				exp(0);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(138);
					match(COMMA);
					setState(139);
					exp(0);
					}
				}

				setState(142);
				match(DO);
				setState(143);
				block();
				setState(144);
				match(END);
				}
				break;
			case 11:
				_localctx = new GenericForStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				match(FOR);
				setState(147);
				namelist();
				setState(148);
				match(IN);
				setState(149);
				explist();
				setState(150);
				match(DO);
				setState(151);
				block();
				setState(152);
				match(END);
				}
				break;
			case 12:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(FUNCTION);
				setState(155);
				funcname();
				setState(156);
				funcbody();
				}
				break;
			case 13:
				_localctx = new LocalFunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				match(LOCAL);
				setState(159);
				match(FUNCTION);
				setState(160);
				match(NAME);
				setState(161);
				funcbody();
				}
				break;
			case 14:
				_localctx = new LocalVariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(162);
				match(LOCAL);
				setState(163);
				match(NAME);
				setState(164);
				attribList();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(165);
					match(EQUALS);
					setState(166);
					explist();
					}
				}

				}
				break;
			case 15:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(169);
				exp(0);
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
	public static class AttribListContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(LuaLikeParser.LESS_THAN, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(LuaLikeParser.GREATER_THAN, 0); }
		public AttribListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitAttribList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribListContext attribList() throws RecognitionException {
		AttribListContext _localctx = new AttribListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(172);
				match(LESS_THAN);
				setState(173);
				varlist();
				setState(174);
				match(GREATER_THAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LaststatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LuaLikeParser.RETURN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LuaLikeParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(LuaLikeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(LuaLikeParser.SEMI, 0); }
		public LaststatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laststat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLaststat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaststatContext laststat() throws RecognitionException {
		LaststatContext _localctx = new LaststatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_laststat);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(RETURN);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(179);
					explist();
					}
					break;
				}
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(CONTINUE);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(184);
					match(SEMI);
					}
				}

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
	public static class LabelContext extends ParserRuleContext {
		public List<TerminalNode> COLON_COLON() { return getTokens(LuaLikeParser.COLON_COLON); }
		public TerminalNode COLON_COLON(int i) {
			return getToken(LuaLikeParser.COLON_COLON, i);
		}
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(COLON_COLON);
			setState(190);
			match(NAME);
			setState(191);
			match(COLON_COLON);
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
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjectDeclarationContext extends ObjectContext {
		public TerminalNode LESS_THAN() { return getToken(LuaLikeParser.LESS_THAN, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(LuaLikeParser.DIVIDE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(LuaLikeParser.GREATER_THAN, 0); }
		public ObjectAttributesContext objectAttributes() {
			return getRuleContext(ObjectAttributesContext.class,0);
		}
		public InlineObjectDeclarationContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitInlineObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationContext extends ObjectContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(LuaLikeParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(LuaLikeParser.LESS_THAN, i);
		}
		public List<FuncnameContext> funcname() {
			return getRuleContexts(FuncnameContext.class);
		}
		public FuncnameContext funcname(int i) {
			return getRuleContext(FuncnameContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(LuaLikeParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(LuaLikeParser.GREATER_THAN, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(LuaLikeParser.DIVIDE, 0); }
		public ObjectAttributesContext objectAttributes() {
			return getRuleContext(ObjectAttributesContext.class,0);
		}
		public ObjectDeclarationContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(LESS_THAN);
				setState(194);
				funcname();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(195);
					objectAttributes();
					}
				}

				setState(198);
				match(GREATER_THAN);
				setState(199);
				block();
				setState(200);
				match(LESS_THAN);
				setState(201);
				match(DIVIDE);
				setState(202);
				funcname();
				setState(203);
				match(GREATER_THAN);
				}
				break;
			case 2:
				_localctx = new InlineObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(LESS_THAN);
				setState(206);
				funcname();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(207);
					objectAttributes();
					}
				}

				setState(210);
				match(DIVIDE);
				setState(211);
				match(GREATER_THAN);
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
	public static class ObjectAttributesContext extends ParserRuleContext {
		public List<FunctionObjectEntryContext> functionObjectEntry() {
			return getRuleContexts(FunctionObjectEntryContext.class);
		}
		public FunctionObjectEntryContext functionObjectEntry(int i) {
			return getRuleContext(FunctionObjectEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public ObjectAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAttributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitObjectAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAttributesContext objectAttributes() throws RecognitionException {
		ObjectAttributesContext _localctx = new ObjectAttributesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objectAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			functionObjectEntry();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				functionObjectEntry();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FunctionObjectEntryContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctionObjectEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionObjectEntry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctionObjectEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionObjectEntryContext functionObjectEntry() throws RecognitionException {
		FunctionObjectEntryContext _localctx = new FunctionObjectEntryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionObjectEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			reference();
			setState(224);
			match(EQUALS);
			setState(225);
			exp(0);
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
	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaLikeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaLikeParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(LuaLikeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(LuaLikeParser.DOT, i);
		}
		public TerminalNode COLON() { return getToken(LuaLikeParser.COLON, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(NAME);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(228);
				match(DOT);
				setState(229);
				match(NAME);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(235);
				match(COLON);
				setState(236);
				match(NAME);
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
	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			var();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				var();
				}
				}
				setState(246);
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
	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaLikeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaLikeParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NAME);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					match(COMMA);
					setState(249);
					match(NAME);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					exp(0);
					setState(256);
					match(COMMA);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(263);
			exp(0);
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
	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public AttribListContext attribList() {
			return getRuleContext(AttribListContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(NAME);
			setState(266);
			attribList();
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public PowerExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpContext {
		public LiteralexpContext literalexp() {
			return getRuleContext(LiteralexpContext.class,0);
		}
		public LiteralExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(LuaLikeParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(LuaLikeParser.CLOSE_SQUARE_BRACKET, 0); }
		public IndexExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpContext {
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableConstructorContext extends ExpContext {
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TableConstructorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitTableConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public OrExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public MulDivModExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitMulDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public AddSubExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DOT() { return getToken(LuaLikeParser.DOT, 0); }
		public MemberExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public ComparisonExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public AndExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionLiteralContext extends ExpContext {
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public FunctionLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionCallStatementContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrcatExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public StrcatExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitStrcatExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ExpContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public BitwiseExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONGSTRING:
			case VARARGS:
			case NIL:
			case TRUE:
			case FALSE:
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
			case NORMALSTRING:
			case CHARSTRING:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(269);
				literalexp();
				}
				break;
			case FUNCTION:
				{
				_localctx = new FunctionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				functiondef();
				}
				break;
			case NAME:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				reference();
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new TableConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				tableconstructor();
				}
				break;
			case NOT:
			case COUNT:
			case BIT_XOR:
			case MINUS:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				operatorUnary();
				setState(274);
				exp(10);
				}
				break;
			case LESS_THAN:
				{
				_localctx = new ObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MemberExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(279);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(280);
						match(DOT);
						setState(281);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(282);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(283);
						operatorPower();
						setState(284);
						exp(11);
						}
						break;
					case 3:
						{
						_localctx = new MulDivModExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(286);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(287);
						operatorMulDivMod();
						setState(288);
						exp(10);
						}
						break;
					case 4:
						{
						_localctx = new AddSubExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(291);
						operatorAddSub();
						setState(292);
						exp(9);
						}
						break;
					case 5:
						{
						_localctx = new StrcatExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(294);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(295);
						operatorStrcat();
						setState(296);
						exp(7);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(298);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(299);
						operatorComparison();
						setState(300);
						exp(7);
						}
						break;
					case 7:
						{
						_localctx = new AndExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(302);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(303);
						operatorAnd();
						setState(304);
						exp(6);
						}
						break;
					case 8:
						{
						_localctx = new OrExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(306);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(307);
						operatorOr();
						setState(308);
						exp(5);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						operatorBitwise();
						setState(312);
						exp(4);
						}
						break;
					case 10:
						{
						_localctx = new IndexExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(314);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(315);
						match(OPEN_SQUARE_BRACKET);
						setState(316);
						exp(0);
						setState(317);
						match(CLOSE_SQUARE_BRACKET);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallStatementContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						args();
						}
						break;
					}
					} 
				}
				setState(325);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralexpContext extends ParserRuleContext {
		public LiteralexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalexp; }
	 
		public LiteralexpContext() { }
		public void copyFrom(LiteralexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralexpContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(LiteralexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralexpContext {
		public TerminalNode TRUE() { return getToken(LuaLikeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LuaLikeParser.FALSE, 0); }
		public BooleanLiteralContext(LiteralexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilLiteralContext extends LiteralexpContext {
		public TerminalNode NIL() { return getToken(LuaLikeParser.NIL, 0); }
		public NilLiteralContext(LiteralexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNilLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarargsLiteralContext extends LiteralexpContext {
		public TerminalNode VARARGS() { return getToken(LuaLikeParser.VARARGS, 0); }
		public VarargsLiteralContext(LiteralexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitVarargsLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralexpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberLiteralContext(LiteralexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralexpContext literalexp() throws RecognitionException {
		LiteralexpContext _localctx = new LiteralexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literalexp);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				_localctx = new NilLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(NIL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				number();
				}
				break;
			case LONGSTRING:
			case NORMALSTRING:
			case CHARSTRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				string();
				}
				break;
			case VARARGS:
				_localctx = new VarargsLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(VARARGS);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(LuaLikeParser.OPEN_PARENTHESES, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(LuaLikeParser.CLOSE_PARENTHESES, 0); }
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(333);
				match(NAME);
				}
				break;
			case OPEN_PARENTHESES:
				{
				setState(334);
				match(OPEN_PARENTHESES);
				setState(335);
				exp(0);
				setState(336);
				match(CLOSE_PARENTHESES);
				setState(337);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 180143985094828114L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
				{
				{
				setState(341);
				varSuffix();
				}
				}
				setState(346);
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
	public static class VarSuffixContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(LuaLikeParser.OPEN_SQUARE_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(LuaLikeParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(LuaLikeParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797018964050L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
				{
				{
				setState(347);
				nameAndArgs();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_BRACKET:
				{
				setState(353);
				match(OPEN_SQUARE_BRACKET);
				setState(354);
				exp(0);
				setState(355);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case DOT:
				{
				setState(357);
				match(DOT);
				setState(358);
				match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LuaLikeParser.COLON, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(361);
				match(COLON);
				setState(362);
				match(NAME);
				}
			}

			setState(365);
			args();
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
	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(LuaLikeParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(LuaLikeParser.CLOSE_PARENTHESES, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(OPEN_PARENTHESES);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -540360109071524222L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
					{
					setState(368);
					explist();
					}
				}

				setState(371);
				match(CLOSE_PARENTHESES);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				tableconstructor();
				}
				break;
			case LONGSTRING:
			case NORMALSTRING:
			case CHARSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				string();
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
	public static class FunctiondefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LuaLikeParser.FUNCTION, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(FUNCTION);
			setState(377);
			funcbody();
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
	public static class FuncbodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(LuaLikeParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(LuaLikeParser.CLOSE_PARENTHESES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OPEN_PARENTHESES);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARARGS || _la==NAME) {
				{
				setState(380);
				parlist();
				}
			}

			setState(383);
			match(CLOSE_PARENTHESES);
			setState(384);
			block();
			setState(385);
			match(END);
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
	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LuaLikeParser.COMMA, 0); }
		public TerminalNode VARARGS() { return getToken(LuaLikeParser.VARARGS, 0); }
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parlist);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				namelist();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(388);
					match(COMMA);
					setState(389);
					match(VARARGS);
					}
				}

				}
				break;
			case VARARGS:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(VARARGS);
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
	public static class TableconstructorContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(LuaLikeParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LuaLikeParser.CLOSE_BRACE, 0); }
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(OPEN_BRACE);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -396244920995668350L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
				{
				setState(396);
				fieldlist();
				}
			}

			setState(399);
			match(CLOSE_BRACE);
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
	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			field();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					fieldsep();
					setState(403);
					field();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMI) {
				{
				setState(410);
				fieldsep();
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(LuaLikeParser.OPEN_SQUARE_BRACKET, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(LuaLikeParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_field);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(OPEN_SQUARE_BRACKET);
				setState(414);
				exp(0);
				setState(415);
				match(CLOSE_SQUARE_BRACKET);
				setState(416);
				match(EQUALS);
				setState(417);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(NAME);
				setState(420);
				match(EQUALS);
				setState(421);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				exp(0);
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
	public static class FieldsepContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LuaLikeParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(LuaLikeParser.SEMI, 0); }
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
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
	public static class OperatorOrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LuaLikeParser.OR, 0); }
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(OR);
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
	public static class OperatorAndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LuaLikeParser.AND, 0); }
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(AND);
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
	public static class OperatorComparisonContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(LuaLikeParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(LuaLikeParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(LuaLikeParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(LuaLikeParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LuaLikeParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(LuaLikeParser.EQUAL_EQUAL, 0); }
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33397665693696L) != 0)) ) {
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
	public static class OperatorStrcatContext extends ParserRuleContext {
		public TerminalNode STR_CONCAT() { return getToken(LuaLikeParser.STR_CONCAT, 0); }
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(STR_CONCAT);
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
	public static class OperatorAddSubContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LuaLikeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LuaLikeParser.MINUS, 0); }
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
	public static class OperatorMulDivModContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(LuaLikeParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(LuaLikeParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(LuaLikeParser.MODULO, 0); }
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
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
	public static class OperatorBitwiseContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(LuaLikeParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(LuaLikeParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(LuaLikeParser.BIT_XOR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(LuaLikeParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(LuaLikeParser.SHIFT_RIGHT, 0); }
		public OperatorBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBitwise; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBitwiseContext operatorBitwise() throws RecognitionException {
		OperatorBitwiseContext _localctx = new OperatorBitwiseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33778096716906496L) != 0)) ) {
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
	public static class OperatorUnaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LuaLikeParser.NOT, 0); }
		public TerminalNode COUNT() { return getToken(LuaLikeParser.COUNT, 0); }
		public TerminalNode MINUS() { return getToken(LuaLikeParser.MINUS, 0); }
		public TerminalNode BIT_XOR() { return getToken(LuaLikeParser.BIT_XOR, 0); }
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 71571335020544L) != 0)) ) {
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
	public static class OperatorPowerContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(LuaLikeParser.POW, 0); }
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(POW);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LuaLikeParser.INT, 0); }
		public TerminalNode HEX() { return getToken(LuaLikeParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(LuaLikeParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(LuaLikeParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646911284551352320L) != 0)) ) {
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(LuaLikeParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(LuaLikeParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(LuaLikeParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==LONGSTRING || _la==NORMALSTRING || _la==CHARSTRING) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001Q\b\u0001\n\u0001\f\u0001T\t\u0001\u0001\u0001"+
		"\u0003\u0001W\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"z\b\u0002\n\u0002\f\u0002}\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00a8\b\u0002\u0001\u0002\u0003\u0002"+
		"\u00ab\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00b1\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ba\b\u0004\u0003\u0004\u00bc"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c5\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00d1\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00db\b\u0007\n\u0007\f\u0007\u00de\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00e7\b\t\n\t\f\t\u00ea\t\t"+
		"\u0001\t\u0001\t\u0003\t\u00ee\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00f3"+
		"\b\n\n\n\f\n\u00f6\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00fb\b\u000b\n\u000b\f\u000b\u00fe\t\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0103\b\f\n\f\f\f\u0106\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0116\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0142\b\u000e\n\u000e\f\u000e\u0145\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u014c\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0154"+
		"\b\u0010\u0001\u0010\u0005\u0010\u0157\b\u0010\n\u0010\f\u0010\u015a\t"+
		"\u0010\u0001\u0011\u0005\u0011\u015d\b\u0011\n\u0011\f\u0011\u0160\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0168\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u016c\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0172"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0177\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u017e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0187\b\u0016\u0001\u0016\u0003\u0016"+
		"\u018a\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u018e\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0196\b\u0018\n\u0018\f\u0018\u0199\t\u0018\u0001\u0018\u0003\u0018"+
		"\u019c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01a8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001%\u0000\u0001\u001c&\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJ\u0000\t\u0001\u0000\u000b\f\u0002\u0000\b\b\u0013"+
		"\u0013\u0002\u0000%&),\u0001\u0000-.\u0001\u0000/1\u0002\u0000((36\u0003"+
		"\u0000#$((..\u0001\u0000;>\u0002\u0000\u0001\u0001@A\u01e1\u0000L\u0001"+
		"\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004\u00aa\u0001\u0000"+
		"\u0000\u0000\u0006\u00b0\u0001\u0000\u0000\u0000\b\u00bb\u0001\u0000\u0000"+
		"\u0000\n\u00bd\u0001\u0000\u0000\u0000\f\u00d5\u0001\u0000\u0000\u0000"+
		"\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u00df\u0001\u0000\u0000\u0000"+
		"\u0012\u00e3\u0001\u0000\u0000\u0000\u0014\u00ef\u0001\u0000\u0000\u0000"+
		"\u0016\u00f7\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000"+
		"\u001a\u0109\u0001\u0000\u0000\u0000\u001c\u0115\u0001\u0000\u0000\u0000"+
		"\u001e\u014b\u0001\u0000\u0000\u0000 \u0153\u0001\u0000\u0000\u0000\""+
		"\u015e\u0001\u0000\u0000\u0000$\u016b\u0001\u0000\u0000\u0000&\u0176\u0001"+
		"\u0000\u0000\u0000(\u0178\u0001\u0000\u0000\u0000*\u017b\u0001\u0000\u0000"+
		"\u0000,\u0189\u0001\u0000\u0000\u0000.\u018b\u0001\u0000\u0000\u00000"+
		"\u0191\u0001\u0000\u0000\u00002\u01a7\u0001\u0000\u0000\u00004\u01a9\u0001"+
		"\u0000\u0000\u00006\u01ab\u0001\u0000\u0000\u00008\u01ad\u0001\u0000\u0000"+
		"\u0000:\u01af\u0001\u0000\u0000\u0000<\u01b1\u0001\u0000\u0000\u0000>"+
		"\u01b3\u0001\u0000\u0000\u0000@\u01b5\u0001\u0000\u0000\u0000B\u01b7\u0001"+
		"\u0000\u0000\u0000D\u01b9\u0001\u0000\u0000\u0000F\u01bb\u0001\u0000\u0000"+
		"\u0000H\u01bd\u0001\u0000\u0000\u0000J\u01bf\u0001\u0000\u0000\u0000L"+
		"M\u0003\u0002\u0001\u0000MN\u0005\u0000\u0000\u0001N\u0001\u0001\u0000"+
		"\u0000\u0000OQ\u0003\u0004\u0002\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0003\b\u0004\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0003\u0001\u0000"+
		"\u0000\u0000X\u00ab\u0005\u0013\u0000\u0000YZ\u0003\u001c\u000e\u0000"+
		"Z[\u0005\u0014\u0000\u0000[\\\u0003\u0018\f\u0000\\\u00ab\u0001\u0000"+
		"\u0000\u0000]\u00ab\u0003\n\u0005\u0000^\u00ab\u0005\u000f\u0000\u0000"+
		"_`\u0005\u0010\u0000\u0000`\u00ab\u0005?\u0000\u0000ab\u0005\u0011\u0000"+
		"\u0000bc\u0003\u0002\u0001\u0000cd\u0005\u0012\u0000\u0000d\u00ab\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0015\u0000\u0000fg\u0003\u001c\u000e\u0000"+
		"gh\u0005\u0011\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005\u0012\u0000"+
		"\u0000j\u00ab\u0001\u0000\u0000\u0000kl\u0005\u0016\u0000\u0000lm\u0003"+
		"\u0002\u0001\u0000mn\u0005\u0017\u0000\u0000no\u0003\u001c\u000e\u0000"+
		"o\u00ab\u0001\u0000\u0000\u0000pq\u0005\u0018\u0000\u0000qr\u0003\u001c"+
		"\u000e\u0000rs\u0005\u0019\u0000\u0000s{\u0003\u0002\u0001\u0000tu\u0005"+
		"\u001a\u0000\u0000uv\u0003\u001c\u000e\u0000vw\u0005\u0019\u0000\u0000"+
		"wx\u0003\u0002\u0001\u0000xz\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|\u0080\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u001b\u0000\u0000\u007f\u0081\u0003\u0002\u0001\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0012\u0000\u0000\u0083\u00ab"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001c\u0000\u0000\u0085\u0086"+
		"\u0005?\u0000\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0088\u0003"+
		"\u001c\u000e\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089\u008c\u0003\u001c"+
		"\u000e\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008d\u0003\u001c\u000e"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0011\u0000"+
		"\u0000\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0091\u0005\u0012\u0000"+
		"\u0000\u0091\u00ab\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001c\u0000"+
		"\u0000\u0093\u0094\u0003\u0016\u000b\u0000\u0094\u0095\u0005\u001d\u0000"+
		"\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u0097\u0005\u0011\u0000\u0000"+
		"\u0097\u0098\u0003\u0002\u0001\u0000\u0098\u0099\u0005\u0012\u0000\u0000"+
		"\u0099\u00ab\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0007\u0000\u0000"+
		"\u009b\u009c\u0003\u0012\t\u0000\u009c\u009d\u0003*\u0015\u0000\u009d"+
		"\u00ab\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001e\u0000\u0000\u009f"+
		"\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a1\u0005?\u0000\u0000\u00a1\u00ab"+
		"\u0003*\u0015\u0000\u00a2\u00a3\u0005\u001e\u0000\u0000\u00a3\u00a4\u0005"+
		"?\u0000\u0000\u00a4\u00a7\u0003\u0006\u0003\u0000\u00a5\u00a6\u0005\u0014"+
		"\u0000\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0003\u001c\u000e\u0000\u00aaX\u0001\u0000\u0000\u0000"+
		"\u00aaY\u0001\u0000\u0000\u0000\u00aa]\u0001\u0000\u0000\u0000\u00aa^"+
		"\u0001\u0000\u0000\u0000\u00aa_\u0001\u0000\u0000\u0000\u00aaa\u0001\u0000"+
		"\u0000\u0000\u00aae\u0001\u0000\u0000\u0000\u00aak\u0001\u0000\u0000\u0000"+
		"\u00aap\u0001\u0000\u0000\u0000\u00aa\u0084\u0001\u0000\u0000\u0000\u00aa"+
		"\u0092\u0001\u0000\u0000\u0000\u00aa\u009a\u0001\u0000\u0000\u0000\u00aa"+
		"\u009e\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u0005\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005&\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af"+
		"\u0005%\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0007\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0005\u001f\u0000\u0000\u00b3\u00b5\u0003"+
		"\u0018\f\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000\u00b6\u00bc\u0005\u000f"+
		"\u0000\u0000\u00b7\u00b9\u0005 \u0000\u0000\u00b8\u00ba\u0005\u0013\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bc\t\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000e\u0000\u0000"+
		"\u00be\u00bf\u0005?\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0"+
		"\u000b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005&\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0012\t\u0000\u00c3\u00c5\u0003\u000e\u0007\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005%\u0000\u0000\u00c7\u00c8\u0003\u0002"+
		"\u0001\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9\u00ca\u00050\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0012\t\u0000\u00cb\u00cc\u0005%\u0000\u0000\u00cc"+
		"\u00d6\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005&\u0000\u0000\u00ce\u00d0"+
		"\u0003\u0012\t\u0000\u00cf\u00d1\u0003\u000e\u0007\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u00050\u0000\u0000\u00d3\u00d4\u0005%\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c1\u0001\u0000\u0000"+
		"\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d6\r\u0001\u0000\u0000\u0000"+
		"\u00d7\u00dc\u0003\u0010\b\u0000\u00d8\u00d9\u0005\b\u0000\u0000\u00d9"+
		"\u00db\u0003\u0010\b\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u000f\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0003\u001a\r\u0000\u00e0\u00e1\u0005"+
		"\u0014\u0000\u0000\u00e1\u00e2\u0003\u001c\u000e\u0000\u00e2\u0011\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e8\u0005?\u0000\u0000\u00e4\u00e5\u0005\r"+
		"\u0000\u0000\u00e5\u00e7\u0005?\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000"+
		"\u0000\u00ec\u00ee\u0005?\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0013\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f4\u0003 \u0010\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1"+
		"\u00f3\u0003 \u0010\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u0015\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fc\u0005?\u0000\u0000\u00f8\u00f9\u0005"+
		"\b\u0000\u0000\u00f9\u00fb\u0005?\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0017\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u001c"+
		"\u000e\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0003\u001c\u000e\u0000\u0108\u0019\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005?\u0000\u0000\u010a\u010b\u0003\u0006\u0003\u0000"+
		"\u010b\u001b\u0001\u0000\u0000\u0000\u010c\u010d\u0006\u000e\uffff\uffff"+
		"\u0000\u010d\u0116\u0003\u001e\u000f\u0000\u010e\u0116\u0003(\u0014\u0000"+
		"\u010f\u0116\u0003\u001a\r\u0000\u0110\u0116\u0003.\u0017\u0000\u0111"+
		"\u0112\u0003D\"\u0000\u0112\u0113\u0003\u001c\u000e\n\u0113\u0116\u0001"+
		"\u0000\u0000\u0000\u0114\u0116\u0003\f\u0006\u0000\u0115\u010c\u0001\u0000"+
		"\u0000\u0000\u0115\u010e\u0001\u0000\u0000\u0000\u0115\u010f\u0001\u0000"+
		"\u0000\u0000\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0111\u0001\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0143\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\n\r\u0000\u0000\u0118\u0119\u0005\r\u0000\u0000"+
		"\u0119\u0142\u0003\u001c\u000e\u000e\u011a\u011b\n\u000b\u0000\u0000\u011b"+
		"\u011c\u0003F#\u0000\u011c\u011d\u0003\u001c\u000e\u000b\u011d\u0142\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\n\t\u0000\u0000\u011f\u0120\u0003@ \u0000"+
		"\u0120\u0121\u0003\u001c\u000e\n\u0121\u0142\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\n\b\u0000\u0000\u0123\u0124\u0003>\u001f\u0000\u0124\u0125\u0003"+
		"\u001c\u000e\t\u0125\u0142\u0001\u0000\u0000\u0000\u0126\u0127\n\u0007"+
		"\u0000\u0000\u0127\u0128\u0003<\u001e\u0000\u0128\u0129\u0003\u001c\u000e"+
		"\u0007\u0129\u0142\u0001\u0000\u0000\u0000\u012a\u012b\n\u0006\u0000\u0000"+
		"\u012b\u012c\u0003:\u001d\u0000\u012c\u012d\u0003\u001c\u000e\u0007\u012d"+
		"\u0142\u0001\u0000\u0000\u0000\u012e\u012f\n\u0005\u0000\u0000\u012f\u0130"+
		"\u00038\u001c\u0000\u0130\u0131\u0003\u001c\u000e\u0006\u0131\u0142\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\n\u0004\u0000\u0000\u0133\u0134\u00036"+
		"\u001b\u0000\u0134\u0135\u0003\u001c\u000e\u0005\u0135\u0142\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\n\u0003\u0000\u0000\u0137\u0138\u0003B!\u0000"+
		"\u0138\u0139\u0003\u001c\u000e\u0004\u0139\u0142\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\n\u000e\u0000\u0000\u013b\u013c\u00059\u0000\u0000\u013c"+
		"\u013d\u0003\u001c\u000e\u0000\u013d\u013e\u0005:\u0000\u0000\u013e\u0142"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\n\u0002\u0000\u0000\u0140\u0142\u0003"+
		"&\u0013\u0000\u0141\u0117\u0001\u0000\u0000\u0000\u0141\u011a\u0001\u0000"+
		"\u0000\u0000\u0141\u011e\u0001\u0000\u0000\u0000\u0141\u0122\u0001\u0000"+
		"\u0000\u0000\u0141\u0126\u0001\u0000\u0000\u0000\u0141\u012a\u0001\u0000"+
		"\u0000\u0000\u0141\u012e\u0001\u0000\u0000\u0000\u0141\u0132\u0001\u0000"+
		"\u0000\u0000\u0141\u0136\u0001\u0000\u0000\u0000\u0141\u013a\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u001d\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u014c\u0005\n\u0000\u0000\u0147\u014c\u0007\u0000\u0000"+
		"\u0000\u0148\u014c\u0003H$\u0000\u0149\u014c\u0003J%\u0000\u014a\u014c"+
		"\u0005\t\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u0147\u0001"+
		"\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u001f\u0001"+
		"\u0000\u0000\u0000\u014d\u0154\u0005?\u0000\u0000\u014e\u014f\u0005\u0004"+
		"\u0000\u0000\u014f\u0150\u0003\u001c\u000e\u0000\u0150\u0151\u0005\u0005"+
		"\u0000\u0000\u0151\u0152\u0003\"\u0011\u0000\u0152\u0154\u0001\u0000\u0000"+
		"\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000"+
		"\u0000\u0154\u0158\u0001\u0000\u0000\u0000\u0155\u0157\u0003\"\u0011\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159!\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b"+
		"\u015d\u0003$\u0012\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0167\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u00059\u0000\u0000\u0162\u0163\u0003"+
		"\u001c\u000e\u0000\u0163\u0164\u0005:\u0000\u0000\u0164\u0168\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\r\u0000\u0000\u0166\u0168\u0005?\u0000"+
		"\u0000\u0167\u0161\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0168#\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0006\u0000\u0000"+
		"\u016a\u016c\u0005?\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0003&\u0013\u0000\u016e%\u0001\u0000\u0000\u0000\u016f\u0171\u0005"+
		"\u0004\u0000\u0000\u0170\u0172\u0003\u0018\f\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0177\u0005\u0005\u0000\u0000\u0174\u0177\u0003.\u0017"+
		"\u0000\u0175\u0177\u0003J%\u0000\u0176\u016f\u0001\u0000\u0000\u0000\u0176"+
		"\u0174\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\'\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0007\u0000\u0000\u0179\u017a"+
		"\u0003*\u0015\u0000\u017a)\u0001\u0000\u0000\u0000\u017b\u017d\u0005\u0004"+
		"\u0000\u0000\u017c\u017e\u0003,\u0016\u0000\u017d\u017c\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\u0005\u0000\u0000\u0180\u0181\u0003\u0002\u0001"+
		"\u0000\u0181\u0182\u0005\u0012\u0000\u0000\u0182+\u0001\u0000\u0000\u0000"+
		"\u0183\u0186\u0003\u0016\u000b\u0000\u0184\u0185\u0005\b\u0000\u0000\u0185"+
		"\u0187\u0005\t\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u018a"+
		"\u0005\t\u0000\u0000\u0189\u0183\u0001\u0000\u0000\u0000\u0189\u0188\u0001"+
		"\u0000\u0000\u0000\u018a-\u0001\u0000\u0000\u0000\u018b\u018d\u00057\u0000"+
		"\u0000\u018c\u018e\u00030\u0018\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u00058\u0000\u0000\u0190/\u0001\u0000\u0000\u0000\u0191\u0197"+
		"\u00032\u0019\u0000\u0192\u0193\u00034\u001a\u0000\u0193\u0194\u00032"+
		"\u0019\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0192\u0001\u0000"+
		"\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019c\u00034\u001a"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c1\u0001\u0000\u0000\u0000\u019d\u019e\u00059\u0000\u0000\u019e"+
		"\u019f\u0003\u001c\u000e\u0000\u019f\u01a0\u0005:\u0000\u0000\u01a0\u01a1"+
		"\u0005\u0014\u0000\u0000\u01a1\u01a2\u0003\u001c\u000e\u0000\u01a2\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005?\u0000\u0000\u01a4\u01a5\u0005"+
		"\u0014\u0000\u0000\u01a5\u01a8\u0003\u001c\u000e\u0000\u01a6\u01a8\u0003"+
		"\u001c\u000e\u0000\u01a7\u019d\u0001\u0000\u0000\u0000\u01a7\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a83\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0007\u0001\u0000\u0000\u01aa5\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0005!\u0000\u0000\u01ac7\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005\"\u0000\u0000\u01ae9\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0007\u0002\u0000\u0000\u01b0;\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"\'\u0000\u0000\u01b2=\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007\u0003"+
		"\u0000\u0000\u01b4?\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007\u0004\u0000"+
		"\u0000\u01b6A\u0001\u0000\u0000\u0000\u01b7\u01b8\u0007\u0005\u0000\u0000"+
		"\u01b8C\u0001\u0000\u0000\u0000\u01b9\u01ba\u0007\u0006\u0000\u0000\u01ba"+
		"E\u0001\u0000\u0000\u0000\u01bb\u01bc\u00052\u0000\u0000\u01bcG\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0007\u0007\u0000\u0000\u01beI\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0007\b\u0000\u0000\u01c0K\u0001\u0000\u0000"+
		"\u0000&RV{\u0080\u008c\u00a7\u00aa\u00b0\u00b4\u00b9\u00bb\u00c4\u00d0"+
		"\u00d5\u00dc\u00e8\u00ed\u00f4\u00fc\u0104\u0115\u0141\u0143\u014b\u0153"+
		"\u0158\u015e\u0167\u016b\u0171\u0176\u017d\u0186\u0189\u018d\u0197\u019b"+
		"\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}