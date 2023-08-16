// Generated from edLang.g4 by ANTLR 4.7.1

	import erro.Semantico;
	import estruturas.Simbolo;
	import estruturas.Tabelasimbolo;
	import estruturas.Variavel;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class edLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ATRIBUICAO=7, VIRGULA=8, 
		AP=9, FP=10, PV=11, OP=12, ID=13, NUMERO=14, EB=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ATRIBUICAO", "VIRGULA", 
		"AP", "FP", "PV", "OP", "ID", "NUMERO", "EB"
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


		private int _tipo;
		private String _varNome;
		private String _varValue;
		private Tabelasimbolo simboloTable = new Tabelasimbolo();
		private Simbolo simbolo;
		public void verificaID(String id){
			if(!simboloTable.exists(id)){throw new Semantico("SIMBOLO "+id+ " NÃO DECLARADO");}
		}


	public edLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "edLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16b\n\16\f\16\16\16e\13\16\5\16g"+
		"\n\16\3\17\6\17j\n\17\r\17\16\17k\3\17\3\17\6\17p\n\17\r\17\16\17q\5\17"+
		"t\n\17\3\20\3\20\6\20x\n\20\r\20\16\20y\5\20|\n\20\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\7\5\2,-//\61\61\3\2c|\4\2C\\c|\3\2\62;\4\2\13\f\"\"\2\u0085\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5*\3\2\2"+
		"\2\78\3\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rJ\3\2\2\2\17R\3\2\2\2\21T\3\2\2"+
		"\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35i\3"+
		"\2\2\2\37{\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7q\2\2$%\7i\2\2%&\7t\2\2&\'\7"+
		"c\2\2\'(\7o\2\2()\7c\2\2)\4\3\2\2\2*+\7h\2\2+,\7k\2\2,-\7o\2\2-.\7f\2"+
		"\2./\7q\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7q\2\2\62\63\7i\2\2\63\64\7"+
		"t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\67\7c\2\2\67\6\3\2\2\289\7p\2\29:\7"+
		"w\2\2:;\7o\2\2;<\7g\2\2<=\7t\2\2=>\7q\2\2>\b\3\2\2\2?@\7v\2\2@A\7g\2\2"+
		"AB\7z\2\2BC\7v\2\2CD\7q\2\2D\n\3\2\2\2EF\7n\2\2FG\7g\2\2GH\7k\2\2HI\7"+
		"c\2\2I\f\3\2\2\2JK\7g\2\2KL\7u\2\2LM\7e\2\2MN\7t\2\2NO\7g\2\2OP\7x\2\2"+
		"PQ\7c\2\2Q\16\3\2\2\2RS\7?\2\2S\20\3\2\2\2TU\7.\2\2U\22\3\2\2\2VW\7*\2"+
		"\2W\24\3\2\2\2XY\7+\2\2Y\26\3\2\2\2Z[\7=\2\2[\30\3\2\2\2\\]\t\2\2\2]\32"+
		"\3\2\2\2^f\t\3\2\2_g\t\4\2\2`b\t\5\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2c"+
		"d\3\2\2\2dg\3\2\2\2ec\3\2\2\2f_\3\2\2\2fc\3\2\2\2g\34\3\2\2\2hj\t\5\2"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mo\7\60\2\2np\t\5"+
		"\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2\2st\3\2"+
		"\2\2t\36\3\2\2\2u|\t\6\2\2vx\7\17\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz"+
		"\3\2\2\2z|\3\2\2\2{u\3\2\2\2{w\3\2\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2"+
		"\n\2cfkqsy{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}