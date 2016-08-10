// Generated from Lua.g4 by ANTLR 4.5

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, BREAK=38, 
		GOTO=39, RETURN=40, DO=41, WHILE=42, REPEAT=43, UNTIL=44, IF=45, ELSEIF=46, 
		ELSE=47, THEN=48, FOR=49, IN=50, END=51, LOCAL=52, FUNCTION=53, COLON=54, 
		VARARGS=55, NAME=56, NORMALSTRING=57, CHARSTRING=58, LONGSTRING=59, INT=60, 
		HEX=61, FLOAT=62, HEX_FLOAT=63, COMMENT=64, LINE_COMMENT=65, WS=66, SHEBANG=67;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_namelist = 7, RULE_explist = 8, 
		RULE_exp = 9, RULE_var = 10, RULE_prefixexp = 11, RULE_functioncall = 12, 
		RULE_varOrExp = 13, RULE_nameAndArgs = 14, RULE_varSuffix = 15, RULE_args = 16, 
		RULE_functiondef = 17, RULE_funcbody = 18, RULE_parlist = 19, RULE_tableconstructor = 20, 
		RULE_fieldlist = 21, RULE_field = 22, RULE_fieldsep = 23, RULE_opExp = 24, 
		RULE_opUnary = 25, RULE_opMulDivMod = 26, RULE_opAddSub = 27, RULE_opStrConcat = 28, 
		RULE_opShift = 29, RULE_opBinAnd = 30, RULE_opBinXor = 31, RULE_opBinOr = 32, 
		RULE_opComp = 33, RULE_opLogAnd = 34, RULE_opLogOr = 35, RULE_number = 36, 
		RULE_string = 37;
	public static final String[] ruleNames = {
		"chunk", "block", "stat", "retstat", "label", "funcname", "varlist", "namelist", 
		"explist", "exp", "var", "prefixexp", "functioncall", "varOrExp", "nameAndArgs", 
		"varSuffix", "args", "functiondef", "funcbody", "parlist", "tableconstructor", 
		"fieldlist", "field", "fieldsep", "opExp", "opUnary", "opMulDivMod", "opAddSub", 
		"opStrConcat", "opShift", "opBinAnd", "opBinXor", "opBinOr", "opComp", 
		"opLogAnd", "opLogOr", "number", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'::'", "'.'", "'nil'", "'false'", "'true'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'^'", "'not'", "'#'", "'-'", 
		"'~'", "'*'", "'/'", "'//'", "'%'", "'+'", "'..'", "'<<'", "'>>'", "'&'", 
		"'|'", "'<'", "'>'", "'<='", "'>='", "'~='", "'=='", "'and'", "'or'", 
		"'break'", "'goto'", "'return'", "'do'", "'while'", "'repeat'", "'until'", 
		"'if'", "'elseif'", "'else'", "'then'", "'for'", "'in'", "'end'", "'local'", 
		"'function'", "':'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "BREAK", "GOTO", "RETURN", "DO", "WHILE", "REPEAT", "UNTIL", 
		"IF", "ELSEIF", "ELSE", "THEN", "FOR", "IN", "END", "LOCAL", "FUNCTION", 
		"COLON", "VARARGS", "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", 
		"INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChunk(this);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << BREAK) | (1L << GOTO) | (1L << DO) | (1L << WHILE) | (1L << REPEAT) | (1L << IF) | (1L << FOR) | (1L << LOCAL) | (1L << FUNCTION) | (1L << NAME))) != 0)) {
				{
				{
				setState(79);
				stat();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(85);
				retstat();
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
	public static class StatFunctionDeclContext extends StatContext {
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public StatFunctionDeclContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatForContext extends StatContext {
		public TerminalNode FOR() { return getToken(LuaParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public StatForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatDoContext extends StatContext {
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public StatDoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatVarAssignContext extends StatContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public StatVarAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatVarAssignLocContext extends StatContext {
		public TerminalNode LOCAL() { return getToken(LuaParser.LOCAL, 0); }
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public StatVarAssignLocContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatVarAssignLoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatWhileContext extends StatContext {
		public TerminalNode WHILE() { return getToken(LuaParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public StatWhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatFunctCallContext extends StatContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public StatFunctCallContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatFunctCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatBreakContext extends StatContext {
		public TerminalNode BREAK() { return getToken(LuaParser.BREAK, 0); }
		public StatBreakContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatUntilContext extends StatContext {
		public TerminalNode REPEAT() { return getToken(LuaParser.REPEAT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(LuaParser.UNTIL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatUntilContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatLabelContext extends StatContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatFunctDeclLocContext extends StatContext {
		public TerminalNode LOCAL() { return getToken(LuaParser.LOCAL, 0); }
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public StatFunctDeclLocContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatFunctDeclLoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatGotoContext extends StatContext {
		public TerminalNode GOTO() { return getToken(LuaParser.GOTO, 0); }
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public StatGotoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatForEachContext extends StatContext {
		public TerminalNode FOR() { return getToken(LuaParser.FOR, 0); }
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuaParser.IN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode DO() { return getToken(LuaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public StatForEachContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatForEach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatIfContext extends StatContext {
		public TerminalNode IF() { return getToken(LuaParser.IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(LuaParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(LuaParser.THEN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(LuaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(LuaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(LuaParser.ELSE, 0); }
		public StatIfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatSepContext extends StatContext {
		public StatSepContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStatSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StatSepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new StatVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				varlist();
				setState(90);
				match(T__1);
				setState(91);
				explist();
				}
				break;
			case 3:
				_localctx = new StatFunctCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				functioncall();
				}
				break;
			case 4:
				_localctx = new StatLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				label();
				}
				break;
			case 5:
				_localctx = new StatBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(BREAK);
				}
				break;
			case 6:
				_localctx = new StatGotoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(GOTO);
				setState(97);
				match(NAME);
				}
				break;
			case 7:
				_localctx = new StatDoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(DO);
				setState(99);
				block();
				setState(100);
				match(END);
				}
				break;
			case 8:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				match(WHILE);
				setState(103);
				exp(0);
				setState(104);
				match(DO);
				setState(105);
				block();
				setState(106);
				match(END);
				}
				break;
			case 9:
				_localctx = new StatUntilContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				match(REPEAT);
				setState(109);
				block();
				setState(110);
				match(UNTIL);
				setState(111);
				exp(0);
				}
				break;
			case 10:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				match(IF);
				setState(114);
				exp(0);
				setState(115);
				match(THEN);
				setState(116);
				block();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(117);
					match(ELSEIF);
					setState(118);
					exp(0);
					setState(119);
					match(THEN);
					setState(120);
					block();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(127);
					match(ELSE);
					setState(128);
					block();
					}
				}

				setState(131);
				match(END);
				}
				break;
			case 11:
				_localctx = new StatForContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				match(FOR);
				setState(134);
				match(NAME);
				setState(135);
				match(T__1);
				setState(136);
				exp(0);
				setState(137);
				match(T__2);
				setState(138);
				exp(0);
				setState(141);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(139);
					match(T__2);
					setState(140);
					exp(0);
					}
				}

				setState(143);
				match(DO);
				setState(144);
				block();
				setState(145);
				match(END);
				}
				break;
			case 12:
				_localctx = new StatForEachContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				match(FOR);
				setState(148);
				namelist();
				setState(149);
				match(IN);
				setState(150);
				explist();
				setState(151);
				match(DO);
				setState(152);
				block();
				setState(153);
				match(END);
				}
				break;
			case 13:
				_localctx = new StatFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				match(FUNCTION);
				setState(156);
				funcname();
				setState(157);
				funcbody();
				}
				break;
			case 14:
				_localctx = new StatFunctDeclLocContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(159);
				match(LOCAL);
				setState(160);
				match(FUNCTION);
				setState(161);
				match(NAME);
				setState(162);
				funcbody();
				}
				break;
			case 15:
				_localctx = new StatVarAssignLocContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(163);
				match(LOCAL);
				setState(164);
				namelist();
				setState(167);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(165);
					match(T__1);
					setState(166);
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

	public static class RetstatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LuaParser.RETURN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(RETURN);
			setState(173);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << FUNCTION) | (1L << VARARGS) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
				{
				setState(172);
				explist();
				}
			}

			setState(176);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(175);
				match(T__0);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__3);
			setState(179);
			match(NAME);
			setState(180);
			match(T__3);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public TerminalNode COLON() { return getToken(LuaParser.COLON, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NAME);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(183);
				match(T__4);
				setState(184);
				match(NAME);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(190);
				match(COLON);
				setState(191);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			var();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(195);
				match(T__2);
				setState(196);
				var();
				}
				}
				setState(201);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(NAME);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(T__2);
					setState(204);
					match(NAME);
					}
					} 
				}
				setState(209);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			exp(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(211);
				match(T__2);
				setState(212);
				exp(0);
				}
				}
				setState(217);
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
	public static class ExpStrConcatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpStrConcatContext opStrConcat() {
			return getRuleContext(OpStrConcatContext.class,0);
		}
		public ExpStrConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpStrConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFuncDefContext extends ExpContext {
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public ExpFuncDefContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMathContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpExpContext opExp() {
			return getRuleContext(OpExpContext.class,0);
		}
		public OpMulDivModContext opMulDivMod() {
			return getRuleContext(OpMulDivModContext.class,0);
		}
		public OpAddSubContext opAddSub() {
			return getRuleContext(OpAddSubContext.class,0);
		}
		public ExpMathContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpMath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLogContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpCompContext opComp() {
			return getRuleContext(OpCompContext.class,0);
		}
		public OpLogAndContext opLogAnd() {
			return getRuleContext(OpLogAndContext.class,0);
		}
		public OpLogOrContext opLogOr() {
			return getRuleContext(OpLogOrContext.class,0);
		}
		public ExpLogContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpUnaryContext extends ExpContext {
		public OpUnaryContext opUnary() {
			return getRuleContext(OpUnaryContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpUnaryContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpAtomContext extends ExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode VARARGS() { return getToken(LuaParser.VARARGS, 0); }
		public ExpAtomContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPrefxExpContext extends ExpContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public ExpPrefxExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpPrefxExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpTableConstrContext extends ExpContext {
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public ExpTableConstrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpTableConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBinContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpShiftContext opShift() {
			return getRuleContext(OpShiftContext.class,0);
		}
		public OpBinAndContext opBinAnd() {
			return getRuleContext(OpBinAndContext.class,0);
		}
		public OpBinXorContext opBinXor() {
			return getRuleContext(OpBinXorContext.class,0);
		}
		public OpBinOrContext opBinOr() {
			return getRuleContext(OpBinOrContext.class,0);
		}
		public ExpBinContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpBin(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				_localctx = new ExpUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				opUnary();
				setState(220);
				exp(11);
				}
				break;
			case T__5:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__7);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				string();
				}
				break;
			case VARARGS:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(VARARGS);
				}
				break;
			case FUNCTION:
				{
				_localctx = new ExpFuncDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				functiondef();
				}
				break;
			case T__8:
			case NAME:
				{
				_localctx = new ExpPrefxExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				prefixexp();
				}
				break;
			case T__12:
				{
				_localctx = new ExpTableConstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				tableconstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpMathContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						opExp();
						setState(235);
						exp(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpMathContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(238);
						opMulDivMod();
						setState(239);
						exp(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpMathContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						opAddSub();
						setState(243);
						exp(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpStrConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						opStrConcat();
						setState(247);
						exp(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpBinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250);
						opShift();
						setState(251);
						exp(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpBinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254);
						opBinAnd();
						setState(255);
						exp(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpBinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258);
						opBinXor();
						setState(259);
						exp(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpBinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
						opBinOr();
						setState(263);
						exp(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpLogContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266);
						opComp();
						setState(267);
						exp(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpLogContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						opLogAnd();
						setState(271);
						exp(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpLogContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(273);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(274);
						opLogOr();
						setState(275);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(282);
				match(NAME);
				}
				break;
			case T__8:
				{
				setState(283);
				match(T__8);
				setState(284);
				exp(0);
				setState(285);
				match(T__9);
				setState(286);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					varSuffix();
					}
					} 
				}
				setState(295);
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
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			varOrExp();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					nameAndArgs();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			varOrExp();
			setState(305); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(304);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varOrExp);
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(T__8);
				setState(311);
				exp(0);
				setState(312);
				match(T__9);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LuaParser.COLON, 0); }
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(316);
				match(COLON);
				setState(317);
				match(NAME);
				}
			}

			setState(320);
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
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
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << COLON) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) {
				{
				{
				setState(322);
				nameAndArgs();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(328);
				match(T__10);
				setState(329);
				exp(0);
				setState(330);
				match(T__11);
				}
				break;
			case T__4:
				{
				setState(332);
				match(T__4);
				setState(333);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsStrContext extends ArgsContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsStrContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgsStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsTableConstrContext extends ArgsContext {
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public ArgsTableConstrContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgsTableConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsExpListContext extends ArgsContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ArgsExpListContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgsExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(343);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ArgsExpListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__8);
				setState(338);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << FUNCTION) | (1L << VARARGS) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
					{
					setState(337);
					explist();
					}
				}

				setState(340);
				match(T__9);
				}
				break;
			case T__12:
				_localctx = new ArgsTableConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				_localctx = new ArgsStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FUNCTION);
			setState(346);
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__8);
			setState(350);
			_la = _input.LA(1);
			if (_la==VARARGS || _la==NAME) {
				{
				setState(349);
				parlist();
				}
			}

			setState(352);
			match(T__9);
			setState(353);
			block();
			setState(354);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public TerminalNode VARARGS() { return getToken(LuaParser.VARARGS, 0); }
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parlist);
		int _la;
		try {
			setState(362);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				namelist();
				setState(359);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(357);
					match(T__2);
					setState(358);
					match(VARARGS);
					}
				}

				}
				break;
			case VARARGS:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__12);
			setState(366);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << FUNCTION) | (1L << VARARGS) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
				{
				setState(365);
				fieldlist();
				}
			}

			setState(368);
			match(T__13);
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
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			field();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					fieldsep();
					setState(372);
					field();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(380);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__2) {
				{
				setState(379);
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

	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldStrContext extends FieldContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FieldStrContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldIndexContext extends FieldContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FieldIndexContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpContext extends FieldContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FieldExpContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new FieldIndexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(T__10);
				setState(383);
				exp(0);
				setState(384);
				match(T__11);
				setState(385);
				match(T__1);
				setState(386);
				exp(0);
				}
				break;
			case 2:
				_localctx = new FieldStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(NAME);
				setState(389);
				match(T__1);
				setState(390);
				exp(0);
				}
				break;
			case 3:
				_localctx = new FieldExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpExpContext extends ParserRuleContext {
		public OpExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpExpContext opExp() throws RecognitionException {
		OpExpContext _localctx = new OpExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__14);
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

	public static class OpUnaryContext extends ParserRuleContext {
		public OpUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUnary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpUnaryContext opUnary() throws RecognitionException {
		OpUnaryContext _localctx = new OpUnaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpMulDivModContext extends ParserRuleContext {
		public OpMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMulDivMod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMulDivModContext opMulDivMod() throws RecognitionException {
		OpMulDivModContext _localctx = new OpMulDivModContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpAddSubContext extends ParserRuleContext {
		public OpAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAddSub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAddSubContext opAddSub() throws RecognitionException {
		OpAddSubContext _localctx = new OpAddSubContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpStrConcatContext extends ParserRuleContext {
		public OpStrConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opStrConcat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpStrConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpStrConcatContext opStrConcat() throws RecognitionException {
		OpStrConcatContext _localctx = new OpStrConcatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opStrConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__24);
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

	public static class OpShiftContext extends ParserRuleContext {
		public OpShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opShift; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpShiftContext opShift() throws RecognitionException {
		OpShiftContext _localctx = new OpShiftContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opShift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpBinAndContext extends ParserRuleContext {
		public OpBinAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpBinAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpBinAndContext opBinAnd() throws RecognitionException {
		OpBinAndContext _localctx = new OpBinAndContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_opBinAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__27);
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

	public static class OpBinXorContext extends ParserRuleContext {
		public OpBinXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinXor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpBinXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpBinXorContext opBinXor() throws RecognitionException {
		OpBinXorContext _localctx = new OpBinXorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opBinXor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__18);
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

	public static class OpBinOrContext extends ParserRuleContext {
		public OpBinOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinOr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpBinOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpBinOrContext opBinOr() throws RecognitionException {
		OpBinOrContext _localctx = new OpBinOrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_opBinOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__28);
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

	public static class OpCompContext extends ParserRuleContext {
		public OpCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpCompContext opComp() throws RecognitionException {
		OpCompContext _localctx = new OpCompContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpLogAndContext extends ParserRuleContext {
		public OpLogAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpLogAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpLogAndContext opLogAnd() throws RecognitionException {
		OpLogAndContext _localctx = new OpLogAndContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opLogAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__35);
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

	public static class OpLogOrContext extends ParserRuleContext {
		public OpLogOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogOr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpLogOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpLogOrContext opLogOr() throws RecognitionException {
		OpLogOrContext _localctx = new OpLogOrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opLogOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__36);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LuaParser.INT, 0); }
		public TerminalNode HEX() { return getToken(LuaParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(LuaParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(LuaParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNumber(this);
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
			setState(420);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(LuaParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(LuaParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(LuaParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitString(this);
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
			setState(422);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
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
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4\3\4\5\4\u0084"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00aa\n\4\5\4\u00ac\n\4\3\5\3\5\5\5\u00b0\n\5\3\5\5"+
		"\5\u00b3\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf"+
		"\13\7\3\7\3\7\5\7\u00c3\n\7\3\b\3\b\3\b\7\b\u00c8\n\b\f\b\16\b\u00cb\13"+
		"\b\3\t\3\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3\13\t\3\n\3\n\3\n\7\n\u00d8"+
		"\n\n\f\n\16\n\u00db\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00ea\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0118\n\13\f\13\16"+
		"\13\u011b\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0123\n\f\3\f\7\f\u0126\n"+
		"\f\f\f\16\f\u0129\13\f\3\r\3\r\7\r\u012d\n\r\f\r\16\r\u0130\13\r\3\16"+
		"\3\16\6\16\u0134\n\16\r\16\16\16\u0135\3\17\3\17\3\17\3\17\3\17\5\17\u013d"+
		"\n\17\3\20\3\20\5\20\u0141\n\20\3\20\3\20\3\21\7\21\u0146\n\21\f\21\16"+
		"\21\u0149\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0151\n\21\3\22\3\22"+
		"\5\22\u0155\n\22\3\22\3\22\3\22\5\22\u015a\n\22\3\23\3\23\3\23\3\24\3"+
		"\24\5\24\u0161\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u016a\n\25"+
		"\3\25\5\25\u016d\n\25\3\26\3\26\5\26\u0171\n\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\7\27\u0179\n\27\f\27\16\27\u017c\13\27\3\27\5\27\u017f\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u018b\n\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\3\24(\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\n\4\2"+
		"\3\3\5\5\3\2\22\25\3\2\26\31\4\2\24\24\32\32\3\2\34\35\3\2 %\3\2>A\3\2"+
		";=\u01c6\2N\3\2\2\2\4T\3\2\2\2\6\u00ab\3\2\2\2\b\u00ad\3\2\2\2\n\u00b4"+
		"\3\2\2\2\f\u00b8\3\2\2\2\16\u00c4\3\2\2\2\20\u00cc\3\2\2\2\22\u00d4\3"+
		"\2\2\2\24\u00e9\3\2\2\2\26\u0122\3\2\2\2\30\u012a\3\2\2\2\32\u0131\3\2"+
		"\2\2\34\u013c\3\2\2\2\36\u0140\3\2\2\2 \u0147\3\2\2\2\"\u0159\3\2\2\2"+
		"$\u015b\3\2\2\2&\u015e\3\2\2\2(\u016c\3\2\2\2*\u016e\3\2\2\2,\u0174\3"+
		"\2\2\2.\u018a\3\2\2\2\60\u018c\3\2\2\2\62\u018e\3\2\2\2\64\u0190\3\2\2"+
		"\2\66\u0192\3\2\2\28\u0194\3\2\2\2:\u0196\3\2\2\2<\u0198\3\2\2\2>\u019a"+
		"\3\2\2\2@\u019c\3\2\2\2B\u019e\3\2\2\2D\u01a0\3\2\2\2F\u01a2\3\2\2\2H"+
		"\u01a4\3\2\2\2J\u01a6\3\2\2\2L\u01a8\3\2\2\2NO\5\4\3\2OP\7\2\2\3P\3\3"+
		"\2\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2WY\5\b\5\2XW\3\2\2\2XY\3\2\2\2Y\5\3\2\2\2Z\u00ac\7\3\2\2[\\\5\16"+
		"\b\2\\]\7\4\2\2]^\5\22\n\2^\u00ac\3\2\2\2_\u00ac\5\32\16\2`\u00ac\5\n"+
		"\6\2a\u00ac\7(\2\2bc\7)\2\2c\u00ac\7:\2\2de\7+\2\2ef\5\4\3\2fg\7\65\2"+
		"\2g\u00ac\3\2\2\2hi\7,\2\2ij\5\24\13\2jk\7+\2\2kl\5\4\3\2lm\7\65\2\2m"+
		"\u00ac\3\2\2\2no\7-\2\2op\5\4\3\2pq\7.\2\2qr\5\24\13\2r\u00ac\3\2\2\2"+
		"st\7/\2\2tu\5\24\13\2uv\7\62\2\2v~\5\4\3\2wx\7\60\2\2xy\5\24\13\2yz\7"+
		"\62\2\2z{\5\4\3\2{}\3\2\2\2|w\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0083\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0084"+
		"\5\4\3\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\65\2\2\u0086\u00ac\3\2\2\2\u0087\u0088\7\63\2\2\u0088\u0089\7"+
		":\2\2\u0089\u008a\7\4\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\5\2\2\u008c"+
		"\u008f\5\24\13\2\u008d\u008e\7\5\2\2\u008e\u0090\5\24\13\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7+\2\2\u0092"+
		"\u0093\5\4\3\2\u0093\u0094\7\65\2\2\u0094\u00ac\3\2\2\2\u0095\u0096\7"+
		"\63\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\64\2\2\u0098\u0099\5\22\n\2"+
		"\u0099\u009a\7+\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7\65\2\2\u009c\u00ac"+
		"\3\2\2\2\u009d\u009e\7\67\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\5&\24\2"+
		"\u00a0\u00ac\3\2\2\2\u00a1\u00a2\7\66\2\2\u00a2\u00a3\7\67\2\2\u00a3\u00a4"+
		"\7:\2\2\u00a4\u00ac\5&\24\2\u00a5\u00a6\7\66\2\2\u00a6\u00a9\5\20\t\2"+
		"\u00a7\u00a8\7\4\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00abZ\3\2\2\2\u00ab[\3\2\2\2\u00ab_\3\2"+
		"\2\2\u00ab`\3\2\2\2\u00aba\3\2\2\2\u00abb\3\2\2\2\u00abd\3\2\2\2\u00ab"+
		"h\3\2\2\2\u00abn\3\2\2\2\u00abs\3\2\2\2\u00ab\u0087\3\2\2\2\u00ab\u0095"+
		"\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ac"+
		"\7\3\2\2\2\u00ad\u00af\7*\2\2\u00ae\u00b0\5\22\n\2\u00af\u00ae\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\7\3\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\t\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5"+
		"\u00b6\7:\2\2\u00b6\u00b7\7\6\2\2\u00b7\13\3\2\2\2\u00b8\u00bd\7:\2\2"+
		"\u00b9\u00ba\7\7\2\2\u00ba\u00bc\7:\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\78\2\2\u00c1\u00c3\7:\2\2\u00c2\u00c0\3\2\2"+
		"\2\u00c2\u00c3\3\2\2\2\u00c3\r\3\2\2\2\u00c4\u00c9\5\26\f\2\u00c5\u00c6"+
		"\7\5\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00d1\7:\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\7:\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\21\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\5\24\13\2\u00d5"+
		"\u00d6\7\5\2\2\u00d6\u00d8\5\24\13\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\23\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\b\13\1\2\u00dd\u00de\5\64\33\2\u00de\u00df"+
		"\5\24\13\r\u00df\u00ea\3\2\2\2\u00e0\u00ea\7\b\2\2\u00e1\u00ea\7\t\2\2"+
		"\u00e2\u00ea\7\n\2\2\u00e3\u00ea\5J&\2\u00e4\u00ea\5L\'\2\u00e5\u00ea"+
		"\79\2\2\u00e6\u00ea\5$\23\2\u00e7\u00ea\5\30\r\2\u00e8\u00ea\5*\26\2\u00e9"+
		"\u00dc\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2"+
		"\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u0119\3\2"+
		"\2\2\u00eb\u00ec\f\16\2\2\u00ec\u00ed\5\62\32\2\u00ed\u00ee\5\24\13\16"+
		"\u00ee\u0118\3\2\2\2\u00ef\u00f0\f\f\2\2\u00f0\u00f1\5\66\34\2\u00f1\u00f2"+
		"\5\24\13\r\u00f2\u0118\3\2\2\2\u00f3\u00f4\f\13\2\2\u00f4\u00f5\58\35"+
		"\2\u00f5\u00f6\5\24\13\f\u00f6\u0118\3\2\2\2\u00f7\u00f8\f\n\2\2\u00f8"+
		"\u00f9\5:\36\2\u00f9\u00fa\5\24\13\n\u00fa\u0118\3\2\2\2\u00fb\u00fc\f"+
		"\t\2\2\u00fc\u00fd\5<\37\2\u00fd\u00fe\5\24\13\n\u00fe\u0118\3\2\2\2\u00ff"+
		"\u0100\f\b\2\2\u0100\u0101\5> \2\u0101\u0102\5\24\13\t\u0102\u0118\3\2"+
		"\2\2\u0103\u0104\f\7\2\2\u0104\u0105\5@!\2\u0105\u0106\5\24\13\b\u0106"+
		"\u0118\3\2\2\2\u0107\u0108\f\6\2\2\u0108\u0109\5B\"\2\u0109\u010a\5\24"+
		"\13\7\u010a\u0118\3\2\2\2\u010b\u010c\f\5\2\2\u010c\u010d\5D#\2\u010d"+
		"\u010e\5\24\13\6\u010e\u0118\3\2\2\2\u010f\u0110\f\4\2\2\u0110\u0111\5"+
		"F$\2\u0111\u0112\5\24\13\5\u0112\u0118\3\2\2\2\u0113\u0114\f\3\2\2\u0114"+
		"\u0115\5H%\2\u0115\u0116\5\24\13\4\u0116\u0118\3\2\2\2\u0117\u00eb\3\2"+
		"\2\2\u0117\u00ef\3\2\2\2\u0117\u00f3\3\2\2\2\u0117\u00f7\3\2\2\2\u0117"+
		"\u00fb\3\2\2\2\u0117\u00ff\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0107\3\2"+
		"\2\2\u0117\u010b\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0113\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\25\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011c\u0123\7:\2\2\u011d\u011e\7\13\2\2\u011e\u011f"+
		"\5\24\13\2\u011f\u0120\7\f\2\2\u0120\u0121\5 \21\2\u0121\u0123\3\2\2\2"+
		"\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0123\u0127\3\2\2\2\u0124\u0126"+
		"\5 \21\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\27\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e\5\34\17"+
		"\2\u012b\u012d\5\36\20\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\31\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0131\u0133\5\34\17\2\u0132\u0134\5\36\20\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\33\3\2\2"+
		"\2\u0137\u013d\5\26\f\2\u0138\u0139\7\13\2\2\u0139\u013a\5\24\13\2\u013a"+
		"\u013b\7\f\2\2\u013b\u013d\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013d\35\3\2\2\2\u013e\u013f\78\2\2\u013f\u0141\7:\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5\"\22\2"+
		"\u0143\37\3\2\2\2\u0144\u0146\5\36\20\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0150\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\r\2\2\u014b\u014c\5\24\13\2\u014c\u014d\7"+
		"\16\2\2\u014d\u0151\3\2\2\2\u014e\u014f\7\7\2\2\u014f\u0151\7:\2\2\u0150"+
		"\u014a\3\2\2\2\u0150\u014e\3\2\2\2\u0151!\3\2\2\2\u0152\u0154\7\13\2\2"+
		"\u0153\u0155\5\22\n\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u015a\7\f\2\2\u0157\u015a\5*\26\2\u0158\u015a\5L\'\2\u0159"+
		"\u0152\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a#\3\2\2\2"+
		"\u015b\u015c\7\67\2\2\u015c\u015d\5&\24\2\u015d%\3\2\2\2\u015e\u0160\7"+
		"\13\2\2\u015f\u0161\5(\25\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7\f\2\2\u0163\u0164\5\4\3\2\u0164\u0165\7\65"+
		"\2\2\u0165\'\3\2\2\2\u0166\u0169\5\20\t\2\u0167\u0168\7\5\2\2\u0168\u016a"+
		"\79\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u016d\79\2\2\u016c\u0166\3\2\2\2\u016c\u016b\3\2\2\2\u016d)\3\2\2\2\u016e"+
		"\u0170\7\17\2\2\u016f\u0171\5,\27\2\u0170\u016f\3\2\2\2\u0170\u0171\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\20\2\2\u0173+\3\2\2\2\u0174\u017a"+
		"\5.\30\2\u0175\u0176\5\60\31\2\u0176\u0177\5.\30\2\u0177\u0179\3\2\2\2"+
		"\u0178\u0175\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\5\60\31\2"+
		"\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f-\3\2\2\2\u0180\u0181\7"+
		"\r\2\2\u0181\u0182\5\24\13\2\u0182\u0183\7\16\2\2\u0183\u0184\7\4\2\2"+
		"\u0184\u0185\5\24\13\2\u0185\u018b\3\2\2\2\u0186\u0187\7:\2\2\u0187\u0188"+
		"\7\4\2\2\u0188\u018b\5\24\13\2\u0189\u018b\5\24\13\2\u018a\u0180\3\2\2"+
		"\2\u018a\u0186\3\2\2\2\u018a\u0189\3\2\2\2\u018b/\3\2\2\2\u018c\u018d"+
		"\t\2\2\2\u018d\61\3\2\2\2\u018e\u018f\7\21\2\2\u018f\63\3\2\2\2\u0190"+
		"\u0191\t\3\2\2\u0191\65\3\2\2\2\u0192\u0193\t\4\2\2\u0193\67\3\2\2\2\u0194"+
		"\u0195\t\5\2\2\u01959\3\2\2\2\u0196\u0197\7\33\2\2\u0197;\3\2\2\2\u0198"+
		"\u0199\t\6\2\2\u0199=\3\2\2\2\u019a\u019b\7\36\2\2\u019b?\3\2\2\2\u019c"+
		"\u019d\7\25\2\2\u019dA\3\2\2\2\u019e\u019f\7\37\2\2\u019fC\3\2\2\2\u01a0"+
		"\u01a1\t\7\2\2\u01a1E\3\2\2\2\u01a2\u01a3\7&\2\2\u01a3G\3\2\2\2\u01a4"+
		"\u01a5\7\'\2\2\u01a5I\3\2\2\2\u01a6\u01a7\t\b\2\2\u01a7K\3\2\2\2\u01a8"+
		"\u01a9\t\t\2\2\u01a9M\3\2\2\2$TX~\u0083\u008f\u00a9\u00ab\u00af\u00b2"+
		"\u00bd\u00c2\u00c9\u00d1\u00d9\u00e9\u0117\u0119\u0122\u0127\u012e\u0135"+
		"\u013c\u0140\u0147\u0150\u0154\u0159\u0160\u0169\u016c\u0170\u017a\u017e"+
		"\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}