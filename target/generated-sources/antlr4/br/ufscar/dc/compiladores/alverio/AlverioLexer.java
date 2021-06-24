// Generated from br\u005Cufscar\dc\compiladores\alverio\Alverio.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.alverio;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlverioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, STRING=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ID", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entity'", "'{'", "'xpath'", "':'", "'events'", "','", "'}'", 
			"'test-case'", "'when'", "'assert'", "'.'", "'has-content'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "STRING", "WS"
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


	public AlverioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alverio.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16d\n\16\f\16\16\16g\13"+
		"\16\3\17\3\17\7\17k\n\17\f\17\16\17n\13\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\5\2\13\f\17\17\""+
		"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5"+
		"(\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2"+
		"\21=\3\2\2\2\23G\3\2\2\2\25L\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33a\3\2\2"+
		"\2\35h\3\2\2\2\37q\3\2\2\2!\"\7g\2\2\"#\7p\2\2#$\7v\2\2$%\7k\2\2%&\7v"+
		"\2\2&\'\7{\2\2\'\4\3\2\2\2()\7}\2\2)\6\3\2\2\2*+\7z\2\2+,\7r\2\2,-\7c"+
		"\2\2-.\7v\2\2./\7j\2\2/\b\3\2\2\2\60\61\7<\2\2\61\n\3\2\2\2\62\63\7g\2"+
		"\2\63\64\7x\2\2\64\65\7g\2\2\65\66\7p\2\2\66\67\7v\2\2\678\7u\2\28\f\3"+
		"\2\2\29:\7.\2\2:\16\3\2\2\2;<\7\177\2\2<\20\3\2\2\2=>\7v\2\2>?\7g\2\2"+
		"?@\7u\2\2@A\7v\2\2AB\7/\2\2BC\7e\2\2CD\7c\2\2DE\7u\2\2EF\7g\2\2F\22\3"+
		"\2\2\2GH\7y\2\2HI\7j\2\2IJ\7g\2\2JK\7p\2\2K\24\3\2\2\2LM\7c\2\2MN\7u\2"+
		"\2NO\7u\2\2OP\7g\2\2PQ\7t\2\2QR\7v\2\2R\26\3\2\2\2ST\7\60\2\2T\30\3\2"+
		"\2\2UV\7j\2\2VW\7c\2\2WX\7u\2\2XY\7/\2\2YZ\7e\2\2Z[\7q\2\2[\\\7p\2\2\\"+
		"]\7v\2\2]^\7g\2\2^_\7p\2\2_`\7v\2\2`\32\3\2\2\2ae\t\2\2\2bd\t\3\2\2cb"+
		"\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\34\3\2\2\2ge\3\2\2\2hl\7$\2\2"+
		"ik\n\4\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2"+
		"op\7$\2\2p\36\3\2\2\2qr\t\5\2\2rs\3\2\2\2st\b\20\2\2t \3\2\2\2\5\2el\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}