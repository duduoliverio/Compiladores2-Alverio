// Generated from br\u005Cufscar\dc\compiladores\alverio\Alverio.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.alverio;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlverioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, STRING=16, WS=17;
	public static final int
		RULE_program = 0, RULE_entity = 1, RULE_testcase = 2, RULE_condition = 3, 
		RULE_query = 4, RULE_assertType = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "entity", "testcase", "condition", "query", "assertType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entity'", "'{'", "'id'", "':'", "'events'", "','", "'}'", "'test-case'", 
			"'when'", "'assert'", "'.'", "'is'", "'highlighted'", "'visible'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "Alverio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlverioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<TestcaseContext> testcase() {
			return getRuleContexts(TestcaseContext.class);
		}
		public TestcaseContext testcase(int i) {
			return getRuleContext(TestcaseContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__7) {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(12);
					entity();
					}
					break;
				case T__7:
					{
					setState(13);
					testcase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
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

	public static class EntityContext extends ParserRuleContext {
		public Token name;
		public Token entityId;
		public Token ID;
		public List<Token> eventsId = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(AlverioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AlverioParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(AlverioParser.STRING, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			((EntityContext)_localctx).name = match(ID);
			setState(21);
			match(T__1);
			setState(22);
			match(T__2);
			setState(23);
			match(T__3);
			setState(24);
			((EntityContext)_localctx).entityId = match(STRING);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(25);
				match(T__4);
				setState(26);
				match(T__3);
				setState(27);
				((EntityContext)_localctx).ID = match(ID);
				((EntityContext)_localctx).eventsId.add(((EntityContext)_localctx).ID);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(28);
					match(T__5);
					setState(29);
					((EntityContext)_localctx).ID = match(ID);
					((EntityContext)_localctx).eventsId.add(((EntityContext)_localctx).ID);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(37);
			match(T__6);
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

	public static class TestcaseContext extends ParserRuleContext {
		public Token name;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode ID() { return getToken(AlverioParser.ID, 0); }
		public TestcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterTestcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitTestcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitTestcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestcaseContext testcase() throws RecognitionException {
		TestcaseContext _localctx = new TestcaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__7);
			setState(40);
			((TestcaseContext)_localctx).name = match(ID);
			setState(41);
			match(T__1);
			setState(42);
			match(T__8);
			setState(43);
			match(T__3);
			setState(44);
			condition();
			setState(45);
			match(T__9);
			setState(46);
			match(T__3);
			setState(47);
			query();
			setState(48);
			match(T__6);
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
		public Token element;
		public Token event;
		public List<TerminalNode> ID() { return getTokens(AlverioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AlverioParser.ID, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((ConditionContext)_localctx).element = match(ID);
			setState(51);
			match(T__10);
			setState(52);
			((ConditionContext)_localctx).event = match(ID);
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

	public static class QueryContext extends ParserRuleContext {
		public Token element;
		public AssertTypeContext assertType() {
			return getRuleContext(AssertTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AlverioParser.ID, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((QueryContext)_localctx).element = match(ID);
			setState(55);
			assertType();
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

	public static class AssertTypeContext extends ParserRuleContext {
		public AssertTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).enterAssertType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlverioListener ) ((AlverioListener)listener).exitAssertType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlverioVisitor ) return ((AlverioVisitor<? extends T>)visitor).visitAssertType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertTypeContext assertType() throws RecognitionException {
		AssertTypeContext _localctx = new AssertTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assertType);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__11);
				setState(58);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__11);
				setState(60);
				match(T__13);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\5"+
		"\3&\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2"+
		"\2@\2\22\3\2\2\2\4\25\3\2\2\2\6)\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f?\3"+
		"\2\2\2\16\21\5\4\3\2\17\21\5\6\4\2\20\16\3\2\2\2\20\17\3\2\2\2\21\24\3"+
		"\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24\22\3\2\2\2\25\26\7"+
		"\3\2\2\26\27\7\21\2\2\27\30\7\4\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32%\7"+
		"\22\2\2\33\34\7\7\2\2\34\35\7\6\2\2\35\"\7\21\2\2\36\37\7\b\2\2\37!\7"+
		"\21\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2%\33\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\t\2\2(\5\3\2\2\2)*\7\n\2\2*+"+
		"\7\21\2\2+,\7\4\2\2,-\7\13\2\2-.\7\6\2\2./\5\b\5\2/\60\7\f\2\2\60\61\7"+
		"\6\2\2\61\62\5\n\6\2\62\63\7\t\2\2\63\7\3\2\2\2\64\65\7\21\2\2\65\66\7"+
		"\r\2\2\66\67\7\21\2\2\67\t\3\2\2\289\7\21\2\29:\5\f\7\2:\13\3\2\2\2;<"+
		"\7\16\2\2<@\7\17\2\2=>\7\16\2\2>@\7\20\2\2?;\3\2\2\2?=\3\2\2\2@\r\3\2"+
		"\2\2\7\20\22\"%?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}