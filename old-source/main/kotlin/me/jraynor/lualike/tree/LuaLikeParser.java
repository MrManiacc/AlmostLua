// Generated from C:/Users/james/IdeaProjects/LuaLike/src/main/kotlin/me/jraynor/lualike/tree\LuaLikeParser.g4 by ANTLR 4.12.0
package me.jraynor.lualike.tree;
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
		RULE_label = 5, RULE_funcname = 6, RULE_varlist = 7, RULE_namelist = 8, 
		RULE_explist = 9, RULE_exp = 10, RULE_literalexp = 11, RULE_prefixexp = 12, 
		RULE_functioncall = 13, RULE_varOrExp = 14, RULE_var = 15, RULE_varSuffix = 16, 
		RULE_nameAndArgs = 17, RULE_args = 18, RULE_functiondef = 19, RULE_funcbody = 20, 
		RULE_parlist = 21, RULE_tableconstructor = 22, RULE_fieldlist = 23, RULE_field = 24, 
		RULE_fieldsep = 25, RULE_operatorOr = 26, RULE_operatorAnd = 27, RULE_operatorComparison = 28, 
		RULE_operatorStrcat = 29, RULE_operatorAddSub = 30, RULE_operatorMulDivMod = 31, 
		RULE_operatorBitwise = 32, RULE_operatorUnary = 33, RULE_operatorPower = 34, 
		RULE_number = 35, RULE_string = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "attribList", "laststat", "label", "funcname", 
			"varlist", "namelist", "explist", "exp", "literalexp", "prefixexp", "functioncall", 
			"varOrExp", "var", "varSuffix", "nameAndArgs", "args", "functiondef", 
			"funcbody", "parlist", "tableconstructor", "fieldlist", "field", "fieldsep", 
			"operatorOr", "operatorAnd", "operatorComparison", "operatorStrcat", 
			"operatorAddSub", "operatorMulDivMod", "operatorBitwise", "operatorUnary", 
			"operatorPower", "number", "string"
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
			setState(74);
			block();
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					stat();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6442483712L) != 0)) {
				{
				setState(83);
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
		public TerminalNode SEMI() { return getToken(LuaLikeParser.SEMI, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(LuaLikeParser.EQUALS, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LuaLikeParser.BREAK, 0); }
		public TerminalNode GOTO() { return getToken(LuaLikeParser.GOTO, 0); }
		public TerminalNode NAME() { return getToken(LuaLikeParser.NAME, 0); }
		public TerminalNode DO() { return getToken(LuaLikeParser.DO, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(LuaLikeParser.END, 0); }
		public TerminalNode WHILE() { return getToken(LuaLikeParser.WHILE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode REPEAT() { return getToken(LuaLikeParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(LuaLikeParser.UNTIL, 0); }
		public TerminalNode IF() { return getToken(LuaLikeParser.IF, 0); }
		public List<TerminalNode> THEN() { return getTokens(LuaLikeParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LuaLikeParser.THEN, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(LuaLikeParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(LuaLikeParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(LuaLikeParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(LuaLikeParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LuaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuaLikeParser.COMMA, i);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuaLikeParser.IN, 0); }
		public TerminalNode FUNCTION() { return getToken(LuaLikeParser.FUNCTION, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(LuaLikeParser.LOCAL, 0); }
		public AttribListContext attribList() {
			return getRuleContext(AttribListContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				varlist();
				setState(88);
				match(EQUALS);
				setState(89);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(GOTO);
				setState(95);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(DO);
				setState(97);
				block();
				setState(98);
				match(END);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(WHILE);
				setState(101);
				exp(0);
				setState(102);
				match(DO);
				setState(103);
				block();
				setState(104);
				match(END);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				match(REPEAT);
				setState(107);
				block();
				setState(108);
				match(UNTIL);
				setState(109);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				match(IF);
				setState(112);
				exp(0);
				setState(113);
				match(THEN);
				setState(114);
				block();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(115);
					match(ELSEIF);
					setState(116);
					exp(0);
					setState(117);
					match(THEN);
					setState(118);
					block();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(125);
					match(ELSE);
					setState(126);
					block();
					}
				}

				setState(129);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				match(FOR);
				setState(132);
				match(NAME);
				setState(133);
				match(EQUALS);
				setState(134);
				exp(0);
				setState(135);
				match(COMMA);
				setState(136);
				exp(0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(137);
					match(COMMA);
					setState(138);
					exp(0);
					}
				}

				setState(141);
				match(DO);
				setState(142);
				block();
				setState(143);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				match(FOR);
				setState(146);
				namelist();
				setState(147);
				match(IN);
				setState(148);
				explist();
				setState(149);
				match(DO);
				setState(150);
				block();
				setState(151);
				match(END);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(153);
				match(FUNCTION);
				setState(154);
				funcname();
				setState(155);
				funcbody();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
				match(LOCAL);
				setState(158);
				match(FUNCTION);
				setState(159);
				match(NAME);
				setState(160);
				funcbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(161);
				match(LOCAL);
				setState(162);
				match(NAME);
				setState(163);
				attribList();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(164);
					match(EQUALS);
					setState(165);
					explist();
					}
				}

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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(170);
				match(LESS_THAN);
				setState(171);
				varlist();
				setState(172);
				match(GREATER_THAN);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(RETURN);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -540360383949431150L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
					{
					setState(177);
					explist();
					}
				}

				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(CONTINUE);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(182);
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
			setState(187);
			match(COLON_COLON);
			setState(188);
			match(NAME);
			setState(189);
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
		enterRule(_localctx, 12, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(NAME);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(192);
				match(DOT);
				setState(193);
				match(NAME);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(199);
				match(COLON);
				setState(200);
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
		enterRule(_localctx, 14, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			var();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				var();
				}
				}
				setState(210);
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
		enterRule(_localctx, 16, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(NAME);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(COMMA);
					setState(213);
					match(NAME);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 18, RULE_explist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					exp(0);
					setState(220);
					match(COMMA);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(227);
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
	public static class PrefixExpressionContext extends ExpContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public PrefixExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitPrefixExpression(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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

				setState(230);
				literalexp();
				}
				break;
			case FUNCTION:
				{
				_localctx = new FunctionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				functiondef();
				}
				break;
			case OPEN_PARENTHESES:
			case NAME:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				prefixexp();
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new TableConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
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
				setState(234);
				operatorUnary();
				setState(235);
				exp(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(239);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(240);
						operatorPower();
						setState(241);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(243);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(244);
						operatorMulDivMod();
						setState(245);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(247);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(248);
						operatorAddSub();
						setState(249);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new StrcatExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(251);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(252);
						operatorStrcat();
						setState(253);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256);
						operatorComparison();
						setState(257);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(259);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(260);
						operatorAnd();
						setState(261);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						operatorOr();
						setState(265);
						exp(3);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(267);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(268);
						operatorBitwise();
						setState(269);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(275);
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
		enterRule(_localctx, 22, RULE_literalexp);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				_localctx = new NilLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(NIL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
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
				setState(278);
				number();
				}
				break;
			case LONGSTRING:
			case NORMALSTRING:
			case CHARSTRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				string();
				}
				break;
			case VARARGS:
				_localctx = new VarargsLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
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
	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			varOrExp();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					nameAndArgs();
					}
					} 
				}
				setState(289);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			varOrExp();
			setState(292); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(291);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(LuaLikeParser.OPEN_PARENTHESES, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(LuaLikeParser.CLOSE_PARENTHESES, 0); }
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaLikeParserVisitor ) return ((LuaLikeParserVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varOrExp);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(OPEN_PARENTHESES);
				setState(298);
				exp(0);
				setState(299);
				match(CLOSE_PARENTHESES);
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
		enterRule(_localctx, 30, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(303);
				match(NAME);
				}
				break;
			case OPEN_PARENTHESES:
				{
				setState(304);
				match(OPEN_PARENTHESES);
				setState(305);
				exp(0);
				setState(306);
				match(CLOSE_PARENTHESES);
				setState(307);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					varSuffix();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 32, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797018964050L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
				{
				{
				setState(317);
				nameAndArgs();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_BRACKET:
				{
				setState(323);
				match(OPEN_SQUARE_BRACKET);
				setState(324);
				exp(0);
				setState(325);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case DOT:
				{
				setState(327);
				match(DOT);
				setState(328);
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
		enterRule(_localctx, 34, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(331);
				match(COLON);
				setState(332);
				match(NAME);
				}
			}

			setState(335);
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
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(OPEN_PARENTHESES);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -540360383949431150L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
					{
					setState(338);
					explist();
					}
				}

				setState(341);
				match(CLOSE_PARENTHESES);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				tableconstructor();
				}
				break;
			case LONGSTRING:
			case NORMALSTRING:
			case CHARSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
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
		enterRule(_localctx, 38, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(FUNCTION);
			setState(347);
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
		enterRule(_localctx, 40, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_PARENTHESES);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARARGS || _la==NAME) {
				{
				setState(350);
				parlist();
				}
			}

			setState(353);
			match(CLOSE_PARENTHESES);
			setState(354);
			block();
			setState(355);
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
		enterRule(_localctx, 42, RULE_parlist);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				namelist();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(358);
					match(COMMA);
					setState(359);
					match(VARARGS);
					}
				}

				}
				break;
			case VARARGS:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
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
		enterRule(_localctx, 44, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(OPEN_BRACE);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -396245195873575278L) != 0) || _la==NORMALSTRING || _la==CHARSTRING) {
				{
				setState(366);
				fieldlist();
				}
			}

			setState(369);
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
		enterRule(_localctx, 46, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			field();
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					fieldsep();
					setState(373);
					field();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMI) {
				{
				setState(380);
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
		enterRule(_localctx, 48, RULE_field);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(OPEN_SQUARE_BRACKET);
				setState(384);
				exp(0);
				setState(385);
				match(CLOSE_SQUARE_BRACKET);
				setState(386);
				match(EQUALS);
				setState(387);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(NAME);
				setState(390);
				match(EQUALS);
				setState(391);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
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
		enterRule(_localctx, 50, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 52, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 54, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 56, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 58, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 60, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 62, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 64, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 66, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		enterRule(_localctx, 68, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		enterRule(_localctx, 70, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		enterRule(_localctx, 72, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0080\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00a7\b\u0002\u0003\u0002\u00a9\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00af"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00b3\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b8\b\u0004\u0003\u0004\u00ba\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00c3\b\u0006\n\u0006\f\u0006\u00c6\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00cf\b\u0007\n\u0007\f\u0007\u00d2\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00d7\b\b\n\b\f\b\u00da\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00df\b\t\n\t\f\t\u00e2\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ee\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0110\b\n\n\n\f\n\u0113\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u011a\b\u000b\u0001\f\u0001\f\u0005\f\u011e\b\f\n\f\f\f\u0121\t\f\u0001"+
		"\r\u0001\r\u0004\r\u0125\b\r\u000b\r\f\r\u0126\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012e\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0136\b\u000f\u0001\u000f\u0005\u000f\u0139\b\u000f\n\u000f\f\u000f\u013c"+
		"\t\u000f\u0001\u0010\u0005\u0010\u013f\b\u0010\n\u0010\f\u0010\u0142\t"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u014a\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u014e"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0154"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0159\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0160\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001\u0015\u0003\u0015"+
		"\u016c\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0170\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0178\b\u0017\n\u0017\f\u0017\u017b\t\u0017\u0001\u0017\u0003\u0017"+
		"\u017e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u018a\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0001\u0014%\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFH\u0000\t\u0001\u0000\u000b\f\u0002\u0000\b"+
		"\b\u0013\u0013\u0002\u0000%&),\u0001\u0000-.\u0001\u0000/1\u0002\u0000"+
		"((36\u0003\u0000#$((..\u0001\u0000;>\u0002\u0000\u0001\u0001@A\u01bf\u0000"+
		"J\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000\u0004\u00a8\u0001"+
		"\u0000\u0000\u0000\u0006\u00ae\u0001\u0000\u0000\u0000\b\u00b9\u0001\u0000"+
		"\u0000\u0000\n\u00bb\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000\u0000"+
		"\u0000\u000e\u00cb\u0001\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000"+
		"\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00ed\u0001\u0000\u0000"+
		"\u0000\u0016\u0119\u0001\u0000\u0000\u0000\u0018\u011b\u0001\u0000\u0000"+
		"\u0000\u001a\u0122\u0001\u0000\u0000\u0000\u001c\u012d\u0001\u0000\u0000"+
		"\u0000\u001e\u0135\u0001\u0000\u0000\u0000 \u0140\u0001\u0000\u0000\u0000"+
		"\"\u014d\u0001\u0000\u0000\u0000$\u0158\u0001\u0000\u0000\u0000&\u015a"+
		"\u0001\u0000\u0000\u0000(\u015d\u0001\u0000\u0000\u0000*\u016b\u0001\u0000"+
		"\u0000\u0000,\u016d\u0001\u0000\u0000\u0000.\u0173\u0001\u0000\u0000\u0000"+
		"0\u0189\u0001\u0000\u0000\u00002\u018b\u0001\u0000\u0000\u00004\u018d"+
		"\u0001\u0000\u0000\u00006\u018f\u0001\u0000\u0000\u00008\u0191\u0001\u0000"+
		"\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0195\u0001\u0000\u0000\u0000"+
		">\u0197\u0001\u0000\u0000\u0000@\u0199\u0001\u0000\u0000\u0000B\u019b"+
		"\u0001\u0000\u0000\u0000D\u019d\u0001\u0000\u0000\u0000F\u019f\u0001\u0000"+
		"\u0000\u0000H\u01a1\u0001\u0000\u0000\u0000JK\u0003\u0002\u0001\u0000"+
		"KL\u0005\u0000\u0000\u0001L\u0001\u0001\u0000\u0000\u0000MO\u0003\u0004"+
		"\u0002\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SU\u0003\b\u0004\u0000TS\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000V\u00a9\u0005"+
		"\u0013\u0000\u0000WX\u0003\u000e\u0007\u0000XY\u0005\u0014\u0000\u0000"+
		"YZ\u0003\u0012\t\u0000Z\u00a9\u0001\u0000\u0000\u0000[\u00a9\u0003\u001a"+
		"\r\u0000\\\u00a9\u0003\n\u0005\u0000]\u00a9\u0005\u000f\u0000\u0000^_"+
		"\u0005\u0010\u0000\u0000_\u00a9\u0005?\u0000\u0000`a\u0005\u0011\u0000"+
		"\u0000ab\u0003\u0002\u0001\u0000bc\u0005\u0012\u0000\u0000c\u00a9\u0001"+
		"\u0000\u0000\u0000de\u0005\u0015\u0000\u0000ef\u0003\u0014\n\u0000fg\u0005"+
		"\u0011\u0000\u0000gh\u0003\u0002\u0001\u0000hi\u0005\u0012\u0000\u0000"+
		"i\u00a9\u0001\u0000\u0000\u0000jk\u0005\u0016\u0000\u0000kl\u0003\u0002"+
		"\u0001\u0000lm\u0005\u0017\u0000\u0000mn\u0003\u0014\n\u0000n\u00a9\u0001"+
		"\u0000\u0000\u0000op\u0005\u0018\u0000\u0000pq\u0003\u0014\n\u0000qr\u0005"+
		"\u0019\u0000\u0000rz\u0003\u0002\u0001\u0000st\u0005\u001a\u0000\u0000"+
		"tu\u0003\u0014\n\u0000uv\u0005\u0019\u0000\u0000vw\u0003\u0002\u0001\u0000"+
		"wy\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u007f\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u001b\u0000\u0000"+
		"~\u0080\u0003\u0002\u0001\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0012\u0000\u0000\u0082\u00a9\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u001c\u0000\u0000\u0084\u0085\u0005?\u0000\u0000\u0085\u0086\u0005"+
		"\u0014\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087\u0088\u0005\b"+
		"\u0000\u0000\u0088\u008b\u0003\u0014\n\u0000\u0089\u008a\u0005\b\u0000"+
		"\u0000\u008a\u008c\u0003\u0014\n\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0011\u0000\u0000\u008e\u008f\u0003\u0002\u0001\u0000"+
		"\u008f\u0090\u0005\u0012\u0000\u0000\u0090\u00a9\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0093\u0003\u0010\b\u0000\u0093"+
		"\u0094\u0005\u001d\u0000\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0096"+
		"\u0005\u0011\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000\u0097\u0098"+
		"\u0005\u0012\u0000\u0000\u0098\u00a9\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u0007\u0000\u0000\u009a\u009b\u0003\f\u0006\u0000\u009b\u009c\u0003"+
		"(\u0014\u0000\u009c\u00a9\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001e"+
		"\u0000\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a0\u0005?\u0000"+
		"\u0000\u00a0\u00a9\u0003(\u0014\u0000\u00a1\u00a2\u0005\u001e\u0000\u0000"+
		"\u00a2\u00a3\u0005?\u0000\u0000\u00a3\u00a6\u0003\u0006\u0003\u0000\u00a4"+
		"\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a7\u0003\u0012\t\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a8V\u0001\u0000\u0000\u0000\u00a8W\u0001\u0000"+
		"\u0000\u0000\u00a8[\u0001\u0000\u0000\u0000\u00a8\\\u0001\u0000\u0000"+
		"\u0000\u00a8]\u0001\u0000\u0000\u0000\u00a8^\u0001\u0000\u0000\u0000\u00a8"+
		"`\u0001\u0000\u0000\u0000\u00a8d\u0001\u0000\u0000\u0000\u00a8j\u0001"+
		"\u0000\u0000\u0000\u00a8o\u0001\u0000\u0000\u0000\u00a8\u0083\u0001\u0000"+
		"\u0000\u0000\u00a8\u0091\u0001\u0000\u0000\u0000\u00a8\u0099\u0001\u0000"+
		"\u0000\u0000\u00a8\u009d\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a9\u0005\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005&\u0000"+
		"\u0000\u00ab\u00ac\u0003\u000e\u0007\u0000\u00ac\u00ad\u0005%\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0007\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0005\u001f\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b4\u00ba\u0005\u000f\u0000\u0000\u00b5"+
		"\u00b7\u0005 \u0000\u0000\u00b6\u00b8\u0005\u0013\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00ba\t\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u000e\u0000\u0000\u00bc\u00bd\u0005"+
		"?\u0000\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be\u000b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c4\u0005?\u0000\u0000\u00c0\u00c1\u0005\r\u0000"+
		"\u0000\u00c1\u00c3\u0005?\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000"+
		"\u00c8\u00ca\u0005?\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\r\u0001\u0000\u0000\u0000\u00cb\u00d0"+
		"\u0003\u001e\u000f\u0000\u00cc\u00cd\u0005\b\u0000\u0000\u00cd\u00cf\u0003"+
		"\u001e\u000f\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u000f\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d8\u0005?\u0000\u0000\u00d4\u00d5\u0005\b"+
		"\u0000\u0000\u00d5\u00d7\u0005?\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0011\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0014\n\u0000"+
		"\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de"+
		"\u00db\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0003\u0014\n\u0000\u00e4\u0013\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0006\n\uffff\uffff\u0000\u00e6\u00ee\u0003\u0016\u000b\u0000\u00e7\u00ee"+
		"\u0003&\u0013\u0000\u00e8\u00ee\u0003\u0018\f\u0000\u00e9\u00ee\u0003"+
		",\u0016\u0000\u00ea\u00eb\u0003B!\u0000\u00eb\u00ec\u0003\u0014\n\b\u00ec"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee"+
		"\u0111\u0001\u0000\u0000\u0000\u00ef\u00f0\n\t\u0000\u0000\u00f0\u00f1"+
		"\u0003D\"\u0000\u00f1\u00f2\u0003\u0014\n\t\u00f2\u0110\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\n\u0007\u0000\u0000\u00f4\u00f5\u0003>\u001f\u0000"+
		"\u00f5\u00f6\u0003\u0014\n\b\u00f6\u0110\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\n\u0006\u0000\u0000\u00f8\u00f9\u0003<\u001e\u0000\u00f9\u00fa"+
		"\u0003\u0014\n\u0007\u00fa\u0110\u0001\u0000\u0000\u0000\u00fb\u00fc\n"+
		"\u0005\u0000\u0000\u00fc\u00fd\u0003:\u001d\u0000\u00fd\u00fe\u0003\u0014"+
		"\n\u0005\u00fe\u0110\u0001\u0000\u0000\u0000\u00ff\u0100\n\u0004\u0000"+
		"\u0000\u0100\u0101\u00038\u001c\u0000\u0101\u0102\u0003\u0014\n\u0005"+
		"\u0102\u0110\u0001\u0000\u0000\u0000\u0103\u0104\n\u0003\u0000\u0000\u0104"+
		"\u0105\u00036\u001b\u0000\u0105\u0106\u0003\u0014\n\u0004\u0106\u0110"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\n\u0002\u0000\u0000\u0108\u0109\u0003"+
		"4\u001a\u0000\u0109\u010a\u0003\u0014\n\u0003\u010a\u0110\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\n\u0001\u0000\u0000\u010c\u010d\u0003@ \u0000"+
		"\u010d\u010e\u0003\u0014\n\u0002\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u00ef\u0001\u0000\u0000\u0000\u010f\u00f3\u0001\u0000\u0000\u0000\u010f"+
		"\u00f7\u0001\u0000\u0000\u0000\u010f\u00fb\u0001\u0000\u0000\u0000\u010f"+
		"\u00ff\u0001\u0000\u0000\u0000\u010f\u0103\u0001\u0000\u0000\u0000\u010f"+
		"\u0107\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0015\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u011a\u0005\n\u0000\u0000\u0115\u011a"+
		"\u0007\u0000\u0000\u0000\u0116\u011a\u0003F#\u0000\u0117\u011a\u0003H"+
		"$\u0000\u0118\u011a\u0005\t\u0000\u0000\u0119\u0114\u0001\u0000\u0000"+
		"\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u0017\u0001\u0000\u0000\u0000\u011b\u011f\u0003\u001c\u000e"+
		"\u0000\u011c\u011e\u0003\"\u0011\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0019\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0124\u0003\u001c\u000e\u0000"+
		"\u0123\u0125\u0003\"\u0011\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u001b\u0001\u0000\u0000\u0000\u0128"+
		"\u012e\u0003\u001e\u000f\u0000\u0129\u012a\u0005\u0004\u0000\u0000\u012a"+
		"\u012b\u0003\u0014\n\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u012e"+
		"\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u0129"+
		"\u0001\u0000\u0000\u0000\u012e\u001d\u0001\u0000\u0000\u0000\u012f\u0136"+
		"\u0005?\u0000\u0000\u0130\u0131\u0005\u0004\u0000\u0000\u0131\u0132\u0003"+
		"\u0014\n\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133\u0134\u0003 "+
		"\u0010\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u012f\u0001\u0000"+
		"\u0000\u0000\u0135\u0130\u0001\u0000\u0000\u0000\u0136\u013a\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0003 \u0010\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u001f\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f\u0003\"\u0011\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0149\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u00059\u0000\u0000\u0144\u0145\u0003\u0014\n\u0000\u0145"+
		"\u0146\u0005:\u0000\u0000\u0146\u014a\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0005\r\u0000\u0000\u0148\u014a\u0005?\u0000\u0000\u0149\u0143\u0001"+
		"\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a!\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005\u0006\u0000\u0000\u014c\u014e\u0005?\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0003$\u0012\u0000"+
		"\u0150#\u0001\u0000\u0000\u0000\u0151\u0153\u0005\u0004\u0000\u0000\u0152"+
		"\u0154\u0003\u0012\t\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0159"+
		"\u0005\u0005\u0000\u0000\u0156\u0159\u0003,\u0016\u0000\u0157\u0159\u0003"+
		"H$\u0000\u0158\u0151\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159%\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005\u0007\u0000\u0000\u015b\u015c\u0003(\u0014\u0000\u015c"+
		"\'\u0001\u0000\u0000\u0000\u015d\u015f\u0005\u0004\u0000\u0000\u015e\u0160"+
		"\u0003*\u0015\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0005"+
		"\u0005\u0000\u0000\u0162\u0163\u0003\u0002\u0001\u0000\u0163\u0164\u0005"+
		"\u0012\u0000\u0000\u0164)\u0001\u0000\u0000\u0000\u0165\u0168\u0003\u0010"+
		"\b\u0000\u0166\u0167\u0005\b\u0000\u0000\u0167\u0169\u0005\t\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u016c\u0005\t\u0000\u0000\u016b"+
		"\u0165\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c"+
		"+\u0001\u0000\u0000\u0000\u016d\u016f\u00057\u0000\u0000\u016e\u0170\u0003"+
		".\u0017\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u00058\u0000"+
		"\u0000\u0172-\u0001\u0000\u0000\u0000\u0173\u0179\u00030\u0018\u0000\u0174"+
		"\u0175\u00032\u0019\u0000\u0175\u0176\u00030\u0018\u0000\u0176\u0178\u0001"+
		"\u0000\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u00032\u0019\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e/\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u00059\u0000\u0000\u0180\u0181\u0003\u0014\n\u0000"+
		"\u0181\u0182\u0005:\u0000\u0000\u0182\u0183\u0005\u0014\u0000\u0000\u0183"+
		"\u0184\u0003\u0014\n\u0000\u0184\u018a\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005?\u0000\u0000\u0186\u0187\u0005\u0014\u0000\u0000\u0187\u018a\u0003"+
		"\u0014\n\u0000\u0188\u018a\u0003\u0014\n\u0000\u0189\u017f\u0001\u0000"+
		"\u0000\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000"+
		"\u0000\u0000\u018a1\u0001\u0000\u0000\u0000\u018b\u018c\u0007\u0001\u0000"+
		"\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u018e\u0005!\u0000\u0000\u018e"+
		"5\u0001\u0000\u0000\u0000\u018f\u0190\u0005\"\u0000\u0000\u01907\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0007\u0002\u0000\u0000\u01929\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005\'\u0000\u0000\u0194;\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0007\u0003\u0000\u0000\u0196=\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0007\u0004\u0000\u0000\u0198?\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0007\u0005\u0000\u0000\u019aA\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0007\u0006\u0000\u0000\u019cC\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"2\u0000\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u01a0\u0007\u0007\u0000"+
		"\u0000\u01a0G\u0001\u0000\u0000\u0000\u01a1\u01a2\u0007\b\u0000\u0000"+
		"\u01a2I\u0001\u0000\u0000\u0000%PTz\u007f\u008b\u00a6\u00a8\u00ae\u00b2"+
		"\u00b7\u00b9\u00c4\u00c9\u00d0\u00d8\u00e0\u00ed\u010f\u0111\u0119\u011f"+
		"\u0126\u012d\u0135\u013a\u0140\u0149\u014d\u0153\u0158\u015f\u0168\u016b"+
		"\u016f\u0179\u017d\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}