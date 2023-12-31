// Generated from edLang.g4 by ANTLR 4.7.1

	import erro.Semantico;
	import estruturas.Simbolo;
	import estruturas.Tabelasimbolo;
	import estruturas.Variavel;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class edLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ATRIBUICAO=7, VIRGULA=8, 
		AP=9, FP=10, PV=11, OP=12, ID=13, NUMERO=14, EB=15;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravariavel = 2, RULE_tipo = 3, 
		RULE_bloco = 4, RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, 
		RULE_cmdatribuicao = 8, RULE_expr = 9, RULE_termo = 10;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravariavel", "tipo", "bloco", "cmd", "cmdleitura", 
		"cmdescrita", "cmdatribuicao", "expr", "termo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimdoprograma'", "'numero'", "'texto'", "'leia'", 
		"'escreva'", "'='", "','", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ATRIBUICAO", "VIRGULA", "AP", 
		"FP", "PV", "OP", "ID", "NUMERO", "EB"
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
	public String getGrammarFileName() { return "edLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varNome;
		private String _varValue;
		private Tabelasimbolo simboloTable = new Tabelasimbolo();
		private Simbolo simbolo;
		public void verificaID(String id){
			if(!simboloTable.exists(id)){throw new Semantico("SIMBOLO "+id+ " NÃO DECLARADO");}
		}

	public edLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			decl();
			setState(24);
			bloco();
			setState(25);
			match(T__1);
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravariavelContext> declaravariavel() {
			return getRuleContexts(DeclaravariavelContext.class);
		}
		public DeclaravariavelContext declaravariavel(int i) {
			return getRuleContext(DeclaravariavelContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				declaravariavel();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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

	public static class DeclaravariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(edLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(edLangParser.ID, i);
		}
		public TerminalNode PV() { return getToken(edLangParser.PV, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(edLangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(edLangParser.VIRGULA, i);
		}
		public DeclaravariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterDeclaravariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitDeclaravariavel(this);
		}
	}

	public final DeclaravariavelContext declaravariavel() throws RecognitionException {
		DeclaravariavelContext _localctx = new DeclaravariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			tipo();
			setState(33);
			match(ID);
			_varNome = _input.LT(-1).getText();
									_varValue = null;
									simbolo = new Variavel(_varNome, _tipo, _varValue);
									if(!simboloTable.exists(_varNome)){simboloTable.add(simbolo);}else{throw new Semantico("SIMBOLO "+_varNome+ " JÁ DECLARADO");}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(35);
				match(VIRGULA);
				setState(36);
				match(ID);
				verificaID(_input.LT(-1).getText());
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(PV);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__2);
				_tipo = Variavel.NUMERO;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__3);
				_tipo = Variavel.TEXTO;
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				cmd();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdatribuicaoContext cmdatribuicao() {
			return getRuleContext(CmdatribuicaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				cmdatribuicao();
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(edLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(edLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(edLangParser.FP, 0); }
		public TerminalNode PV() { return getToken(edLangParser.PV, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__4);
			setState(62);
			match(AP);
			setState(63);
			match(ID);
			_varNome = _input.LT(-1).getText();if(!simboloTable.exists(_varNome)){throw new Semantico("SIMBOLO "+_varNome+ " NÃO DECLARADO");}
			setState(65);
			match(FP);
			setState(66);
			match(PV);
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(edLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(edLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(edLangParser.FP, 0); }
		public TerminalNode PV() { return getToken(edLangParser.PV, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			setState(69);
			match(AP);
			setState(70);
			match(ID);
			verificaID(_input.LT(-1).getText());
			setState(72);
			match(FP);
			setState(73);
			match(PV);
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

	public static class CmdatribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(edLangParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(edLangParser.ATRIBUICAO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(edLangParser.PV, 0); }
		public CmdatribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdatribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterCmdatribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitCmdatribuicao(this);
		}
	}

	public final CmdatribuicaoContext cmdatribuicao() throws RecognitionException {
		CmdatribuicaoContext _localctx = new CmdatribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdatribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			verificaID(_input.LT(-1).getText());
			setState(77);
			match(ATRIBUICAO);
			setState(78);
			expr();
			setState(79);
			match(PV);
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
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(edLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(edLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			termo();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(82);
				match(OP);
				setState(83);
				termo();
				}
				}
				setState(88);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(edLangParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(edLangParser.NUMERO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof edLangListener ) ((edLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termo);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				verificaID(_input.LT(-1).getText());
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUMERO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6"+
		"\6\6\67\n\6\r\6\16\68\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7"+
		"\13W\n\13\f\13\16\13Z\13\13\3\f\3\f\3\f\5\f_\n\f\3\f\2\2\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2]\2\30\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b\63\3\2"+
		"\2\2\n\66\3\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20F\3\2\2\2\22M\3\2\2\2\24S\3"+
		"\2\2\2\26^\3\2\2\2\30\31\7\3\2\2\31\32\5\4\3\2\32\33\5\n\6\2\33\34\7\4"+
		"\2\2\34\3\3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!\5\3\2\2\2\"#\5\b\5\2#$\7\17\2\2$*\b\4\1\2%&\7\n\2\2&\'\7\17"+
		"\2\2\')\b\4\1\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3"+
		"\2\2\2-.\7\r\2\2.\7\3\2\2\2/\60\7\5\2\2\60\64\b\5\1\2\61\62\7\6\2\2\62"+
		"\64\b\5\1\2\63/\3\2\2\2\63\61\3\2\2\2\64\t\3\2\2\2\65\67\5\f\7\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:>\5\16\b\2;>\5"+
		"\20\t\2<>\5\22\n\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\r\3\2\2\2?@\7\7\2\2"+
		"@A\7\13\2\2AB\7\17\2\2BC\b\b\1\2CD\7\f\2\2DE\7\r\2\2E\17\3\2\2\2FG\7\b"+
		"\2\2GH\7\13\2\2HI\7\17\2\2IJ\b\t\1\2JK\7\f\2\2KL\7\r\2\2L\21\3\2\2\2M"+
		"N\7\17\2\2NO\b\n\1\2OP\7\t\2\2PQ\5\24\13\2QR\7\r\2\2R\23\3\2\2\2SX\5\26"+
		"\f\2TU\7\16\2\2UW\5\26\f\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\25"+
		"\3\2\2\2ZX\3\2\2\2[\\\7\17\2\2\\_\b\f\1\2]_\7\20\2\2^[\3\2\2\2^]\3\2\2"+
		"\2_\27\3\2\2\2\t *\638=X^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}