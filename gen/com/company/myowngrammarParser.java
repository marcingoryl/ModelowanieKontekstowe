// Generated from /Users/marcin/Desktop/ModelowanieKontekstowe/ModelowanieKontekstowe/src/com/company/CtxM.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myowngrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAME=7, WS=8;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_createModel = 2, RULE_createParam = 3, 
		RULE_createEvent = 4, RULE_assingParamsWithModel = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "createModel", "createParam", "createEvent", 
			"assingParamsWithModel"
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

	@Override
	public String getGrammarFileName() { return "CtxM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myowngrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				statement();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0) );
			setState(18);
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

	public static class StatementContext extends ParserRuleContext {
		public CreateModelContext createModel() {
			return getRuleContext(CreateModelContext.class,0);
		}
		public CreateParamContext createParam() {
			return getRuleContext(CreateParamContext.class,0);
		}
		public AssingParamsWithModelContext assingParamsWithModel() {
			return getRuleContext(AssingParamsWithModelContext.class,0);
		}
		public CreateEventContext createEvent() {
			return getRuleContext(CreateEventContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				createModel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				createParam();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				assingParamsWithModel();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				createEvent();
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

	public static class CreateModelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(myowngrammarParser.NAME, 0); }
		public CreateModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterCreateModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitCreateModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitCreateModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateModelContext createModel() throws RecognitionException {
		CreateModelContext _localctx = new CreateModelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__2);
			setState(27);
			match(NAME);
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

	public static class CreateParamContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(myowngrammarParser.NAME, 0); }
		public CreateParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterCreateParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitCreateParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitCreateParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateParamContext createParam() throws RecognitionException {
		CreateParamContext _localctx = new CreateParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__3);
			setState(30);
			match(NAME);
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

	public static class CreateEventContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(myowngrammarParser.NAME, 0); }
		public CreateEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterCreateEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitCreateEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitCreateEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateEventContext createEvent() throws RecognitionException {
		CreateEventContext _localctx = new CreateEventContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__4);
			setState(33);
			match(NAME);
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

	public static class AssingParamsWithModelContext extends ParserRuleContext {
		public AssingParamsWithModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingParamsWithModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).enterAssingParamsWithModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myowngrammarListener ) ((myowngrammarListener)listener).exitAssingParamsWithModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myowngrammarVisitor ) return ((myowngrammarVisitor<? extends T>)visitor).visitAssingParamsWithModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssingParamsWithModelContext assingParamsWithModel() throws RecognitionException {
		AssingParamsWithModelContext _localctx = new AssingParamsWithModelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assingParamsWithModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2%\2\16\3\2\2\2\4\32\3\2\2\2\6\34\3\2"+
		"\2\2\b\37\3\2\2\2\n\"\3\2\2\2\f%\3\2\2\2\16\20\7\3\2\2\17\21\5\4\3\2\20"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2\24"+
		"\25\7\4\2\2\25\3\3\2\2\2\26\33\5\6\4\2\27\33\5\b\5\2\30\33\5\f\7\2\31"+
		"\33\5\n\6\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33"+
		"\5\3\2\2\2\34\35\7\5\2\2\35\36\7\t\2\2\36\7\3\2\2\2\37 \7\6\2\2 !\7\t"+
		"\2\2!\t\3\2\2\2\"#\7\7\2\2#$\7\t\2\2$\13\3\2\2\2%&\7\b\2\2&\r\3\2\2\2"+
		"\4\22\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}