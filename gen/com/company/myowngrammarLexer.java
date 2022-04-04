// Generated from /Users/marcin/Desktop/ModelowanieKontekstowe/ModelowanieKontekstowe/src/com/company/CtxM.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myowngrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAME=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'stop'", "'model'", "'param'", "'event'", "'createModelWithParams'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NAME", "WS"
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


	public myowngrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CtxM.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nR\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bH\n\b\r\b\16\b"+
		"I\3\t\6\tM\n\t\r\t\16\tN\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\3\2\4\5\2\62;C\\c|\4\2\13\f\"\"\2S\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3"+
		"\23\3\2\2\2\5\31\3\2\2\2\7\36\3\2\2\2\t$\3\2\2\2\13*\3\2\2\2\r\60\3\2"+
		"\2\2\17G\3\2\2\2\21L\3\2\2\2\23\24\7u\2\2\24\25\7v\2\2\25\26\7c\2\2\26"+
		"\27\7t\2\2\27\30\7v\2\2\30\4\3\2\2\2\31\32\7u\2\2\32\33\7v\2\2\33\34\7"+
		"q\2\2\34\35\7r\2\2\35\6\3\2\2\2\36\37\7o\2\2\37 \7q\2\2 !\7f\2\2!\"\7"+
		"g\2\2\"#\7n\2\2#\b\3\2\2\2$%\7r\2\2%&\7c\2\2&\'\7t\2\2\'(\7c\2\2()\7o"+
		"\2\2)\n\3\2\2\2*+\7g\2\2+,\7x\2\2,-\7g\2\2-.\7p\2\2./\7v\2\2/\f\3\2\2"+
		"\2\60\61\7e\2\2\61\62\7t\2\2\62\63\7g\2\2\63\64\7c\2\2\64\65\7v\2\2\65"+
		"\66\7g\2\2\66\67\7O\2\2\678\7q\2\289\7f\2\29:\7g\2\2:;\7n\2\2;<\7Y\2\2"+
		"<=\7k\2\2=>\7v\2\2>?\7j\2\2?@\7R\2\2@A\7c\2\2AB\7t\2\2BC\7c\2\2CD\7o\2"+
		"\2DE\7u\2\2E\16\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\20\3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\b\t\2\2Q\22\3\2\2\2\5\2IN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}