// Generated from C:/Users/milsm/IdeaProjects/JavaToPython/src/main/antlr\SimpleJava.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Class=1, Public=2, Static=3, Void=4, Main=5, String=6, Int=7, Char=8, 
		Bool=9, Float=10, Extends=11, Return=12, If=13, Else=14, While=15, Print=16, 
		Plus=17, Minus=18, Multiply=19, Divide=20, Equals=21, GreaterThan=22, 
		LessThan=23, DoubleQuote=24, LessThanOrEqual=25, GreaterThanOrEqual=26, 
		Equal=27, NotEqual=28, And=29, Or=30, Dot=31, Increment=32, Decrement=33, 
		Semicolon=34, Comma=35, LeftParen=36, RightParen=37, LeftCurly=38, RightCurly=39, 
		LeftSquareBracket=40, RightSquareBracket=41, IntegerLiteral=42, FloatLiteral=43, 
		CharLiteral=44, BoolLiteral=45, StringLiteral=46, Whitespace=47, Identifier=48;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_classBody = 2, 
		RULE_classBodyDeclaration = 3, RULE_constructorDeclaration = 4, RULE_fieldDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_normalMethodDeclaration = 7, RULE_mainMethodDeclaration = 8, 
		RULE_methodBody = 9, RULE_type = 10, RULE_incrementStatement = 11, RULE_decrementStatement = 12, 
		RULE_declarationStatement = 13, RULE_statement = 14, RULE_assignmentStatement = 15, 
		RULE_printStatement = 16, RULE_ifStatement = 17, RULE_whileStatement = 18, 
		RULE_returnStatement = 19, RULE_expressionStatement = 20, RULE_expression = 21, 
		RULE_logicalExpression = 22, RULE_comparisonExpression = 23, RULE_mathExpression = 24, 
		RULE_unaryExpression = 25, RULE_primaryExpression = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDeclaration", "classBody", "classBodyDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "methodDeclaration", "normalMethodDeclaration", 
			"mainMethodDeclaration", "methodBody", "type", "incrementStatement", 
			"decrementStatement", "declarationStatement", "statement", "assignmentStatement", 
			"printStatement", "ifStatement", "whileStatement", "returnStatement", 
			"expressionStatement", "expression", "logicalExpression", "comparisonExpression", 
			"mathExpression", "unaryExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
			"'int'", "'char'", "'bool'", "'float'", "'extends'", "'return'", "'if'", 
			"'else'", "'while'", "'System.out.println'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'>'", "'<'", "'\"'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'.'", "'++'", "'--'", "';'", "','", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Class", "Public", "Static", "Void", "Main", "String", "Int", "Char", 
			"Bool", "Float", "Extends", "Return", "If", "Else", "While", "Print", 
			"Plus", "Minus", "Multiply", "Divide", "Equals", "GreaterThan", "LessThan", 
			"DoubleQuote", "LessThanOrEqual", "GreaterThanOrEqual", "Equal", "NotEqual", 
			"And", "Or", "Dot", "Increment", "Decrement", "Semicolon", "Comma", "LeftParen", 
			"RightParen", "LeftCurly", "RightCurly", "LeftSquareBracket", "RightSquareBracket", 
			"IntegerLiteral", "FloatLiteral", "CharLiteral", "BoolLiteral", "StringLiteral", 
			"Whitespace", "Identifier"
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
	public String getGrammarFileName() { return "SimpleJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Public) {
				{
				{
				setState(54);
				classDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }
		public TerminalNode Class() { return getToken(SimpleJavaParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Public);
			setState(63);
			match(Class);
			setState(64);
			match(Identifier);
			setState(65);
			classBody();
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LeftCurly);
			setState(68);
			classBodyDeclaration();
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==RightCurly) ) {
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
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976712668L) != 0)) {
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(72);
						methodDeclaration();
						}
						break;
					case 2:
						{
						setState(73);
						fieldDeclaration();
						}
						break;
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SimpleJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleJavaParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> Void() { return getTokens(SimpleJavaParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(SimpleJavaParser.Void, i);
		}
		public List<TerminalNode> Int() { return getTokens(SimpleJavaParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(SimpleJavaParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(SimpleJavaParser.String); }
		public TerminalNode String(int i) {
			return getToken(SimpleJavaParser.String, i);
		}
		public List<TerminalNode> Char() { return getTokens(SimpleJavaParser.Char); }
		public TerminalNode Char(int i) {
			return getToken(SimpleJavaParser.Char, i);
		}
		public List<TerminalNode> Bool() { return getTokens(SimpleJavaParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(SimpleJavaParser.Bool, i);
		}
		public List<TerminalNode> Float() { return getTokens(SimpleJavaParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(SimpleJavaParser.Float, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleJavaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleJavaParser.Comma, i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Identifier);
			setState(82);
			match(LeftParen);
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			match(Identifier);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(85);
				match(Comma);
				setState(86);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				match(Identifier);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(RightParen);
			setState(94);
			methodBody();
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				type();
				setState(97);
				match(Identifier);
				setState(98);
				match(Semicolon);
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(101);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(99);
							fieldDeclaration();
							}
							break;
						case 2:
							{
							setState(100);
							methodDeclaration();
							}
							break;
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				type();
				setState(107);
				assignmentStatement();
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(110);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(108);
							fieldDeclaration();
							}
							break;
						case 2:
							{
							setState(109);
							methodDeclaration();
							}
							break;
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public NormalMethodDeclarationContext normalMethodDeclaration() {
			return getRuleContext(NormalMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				mainMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				normalMethodDeclaration();
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
	public static class NormalMethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SimpleJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleJavaParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> Void() { return getTokens(SimpleJavaParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(SimpleJavaParser.Void, i);
		}
		public List<TerminalNode> Int() { return getTokens(SimpleJavaParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(SimpleJavaParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(SimpleJavaParser.String); }
		public TerminalNode String(int i) {
			return getToken(SimpleJavaParser.String, i);
		}
		public List<TerminalNode> Char() { return getTokens(SimpleJavaParser.Char); }
		public TerminalNode Char(int i) {
			return getToken(SimpleJavaParser.Char, i);
		}
		public List<TerminalNode> Bool() { return getTokens(SimpleJavaParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(SimpleJavaParser.Bool, i);
		}
		public List<TerminalNode> Float() { return getTokens(SimpleJavaParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(SimpleJavaParser.Float, i);
		}
		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }
		public TerminalNode Static() { return getToken(SimpleJavaParser.Static, 0); }
		public List<TerminalNode> Comma() { return getTokens(SimpleJavaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleJavaParser.Comma, i);
		}
		public NormalMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterNormalMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitNormalMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitNormalMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalMethodDeclarationContext normalMethodDeclaration() throws RecognitionException {
		NormalMethodDeclarationContext _localctx = new NormalMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_normalMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(121);
				match(Public);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(124);
				match(Static);
				}
			}

			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(Identifier);
			setState(129);
			match(LeftParen);
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			match(Identifier);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(132);
				match(Comma);
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				match(Identifier);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RightParen);
			setState(141);
			methodBody();
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
	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }
		public TerminalNode Static() { return getToken(SimpleJavaParser.Static, 0); }
		public TerminalNode Void() { return getToken(SimpleJavaParser.Void, 0); }
		public TerminalNode Main() { return getToken(SimpleJavaParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public TerminalNode String() { return getToken(SimpleJavaParser.String, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(SimpleJavaParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(SimpleJavaParser.RightSquareBracket, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMainMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Public);
			setState(144);
			match(Static);
			setState(145);
			match(Void);
			setState(146);
			match(Main);
			setState(147);
			match(LeftParen);
			setState(148);
			match(String);
			setState(149);
			match(LeftSquareBracket);
			setState(150);
			match(RightSquareBracket);
			setState(151);
			match(Identifier);
			setState(152);
			match(RightParen);
			setState(153);
			methodBody();
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
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LeftCurly);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 417883138537408L) != 0)) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==RightCurly) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleJavaParser.Int, 0); }
		public TerminalNode Char() { return getToken(SimpleJavaParser.Char, 0); }
		public TerminalNode Bool() { return getToken(SimpleJavaParser.Bool, 0); }
		public TerminalNode Float() { return getToken(SimpleJavaParser.Float, 0); }
		public TerminalNode String() { return getToken(SimpleJavaParser.String, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976712640L) != 0)) ) {
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
	public static class IncrementStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Increment() { return getToken(SimpleJavaParser.Increment, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public IncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitIncrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitIncrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementStatementContext incrementStatement() throws RecognitionException {
		IncrementStatementContext _localctx = new IncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_incrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Identifier);
			setState(167);
			match(Increment);
			setState(168);
			match(Semicolon);
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
	public static class DecrementStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Decrement() { return getToken(SimpleJavaParser.Decrement, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public DecrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDecrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDecrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitDecrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementStatementContext decrementStatement() throws RecognitionException {
		DecrementStatementContext _localctx = new DecrementStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Identifier);
			setState(171);
			match(Decrement);
			setState(172);
			match(Semicolon);
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
	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Equals() { return getToken(SimpleJavaParser.Equals, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			type();
			setState(175);
			match(Identifier);
			setState(176);
			match(Equals);
			setState(177);
			primaryExpression();
			setState(178);
			match(Semicolon);
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
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
		}
		public DecrementStatementContext decrementStatement() {
			return getRuleContext(DecrementStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(180);
				declarationStatement();
				}
				break;
			case 2:
				{
				setState(181);
				assignmentStatement();
				}
				break;
			case 3:
				{
				setState(182);
				ifStatement();
				}
				break;
			case 4:
				{
				setState(183);
				whileStatement();
				}
				break;
			case 5:
				{
				setState(184);
				returnStatement();
				}
				break;
			case 6:
				{
				setState(185);
				expressionStatement();
				}
				break;
			case 7:
				{
				setState(186);
				incrementStatement();
				}
				break;
			case 8:
				{
				setState(187);
				decrementStatement();
				}
				break;
			case 9:
				{
				setState(188);
				printStatement();
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Equals() { return getToken(SimpleJavaParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public TerminalNode CharLiteral() { return getToken(SimpleJavaParser.CharLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(SimpleJavaParser.FloatLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SimpleJavaParser.IntegerLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SimpleJavaParser.BoolLiteral, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStatement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(Identifier);
				setState(192);
				match(Equals);
				setState(193);
				expression();
				setState(194);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(Identifier);
				setState(197);
				match(Equals);
				setState(198);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339441844224L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(Semicolon);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(SimpleJavaParser.Print, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Print);
			setState(203);
			match(LeftParen);
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
			match(RightParen);
			setState(206);
			match(Semicolon);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SimpleJavaParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public List<TerminalNode> LeftCurly() { return getTokens(SimpleJavaParser.LeftCurly); }
		public TerminalNode LeftCurly(int i) {
			return getToken(SimpleJavaParser.LeftCurly, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RightCurly() { return getTokens(SimpleJavaParser.RightCurly); }
		public TerminalNode RightCurly(int i) {
			return getToken(SimpleJavaParser.RightCurly, i);
		}
		public TerminalNode Else() { return getToken(SimpleJavaParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(If);
			setState(209);
			match(LeftParen);
			setState(210);
			expression();
			setState(211);
			match(RightParen);
			setState(212);
			match(LeftCurly);
			setState(213);
			statement();
			setState(214);
			match(RightCurly);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(215);
				match(Else);
				setState(216);
				match(LeftCurly);
				setState(217);
				statement();
				setState(218);
				match(RightCurly);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SimpleJavaParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(While);
			setState(223);
			match(LeftParen);
			setState(224);
			expression();
			setState(225);
			match(RightParen);
			setState(226);
			statement();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SimpleJavaParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Return);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 417883138424832L) != 0)) {
				{
				setState(229);
				expression();
				}
			}

			setState(232);
			match(Semicolon);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expression();
			setState(235);
			match(Semicolon);
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
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			logicalExpression();
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(SimpleJavaParser.And); }
		public TerminalNode And(int i) {
			return getToken(SimpleJavaParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(SimpleJavaParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(SimpleJavaParser.Or, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			comparisonExpression();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And || _la==Or) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==And || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				comparisonExpression();
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
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public List<TerminalNode> LessThan() { return getTokens(SimpleJavaParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(SimpleJavaParser.LessThan, i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(SimpleJavaParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(SimpleJavaParser.GreaterThan, i);
		}
		public List<TerminalNode> LessThanOrEqual() { return getTokens(SimpleJavaParser.LessThanOrEqual); }
		public TerminalNode LessThanOrEqual(int i) {
			return getToken(SimpleJavaParser.LessThanOrEqual, i);
		}
		public List<TerminalNode> GreaterThanOrEqual() { return getTokens(SimpleJavaParser.GreaterThanOrEqual); }
		public TerminalNode GreaterThanOrEqual(int i) {
			return getToken(SimpleJavaParser.GreaterThanOrEqual, i);
		}
		public List<TerminalNode> Equal() { return getTokens(SimpleJavaParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(SimpleJavaParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(SimpleJavaParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(SimpleJavaParser.NotEqual, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			mathExpression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515899392L) != 0)) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515899392L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				mathExpression();
				}
				}
				setState(254);
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
	public static class MathExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(SimpleJavaParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(SimpleJavaParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(SimpleJavaParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(SimpleJavaParser.Minus, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(SimpleJavaParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(SimpleJavaParser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(SimpleJavaParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(SimpleJavaParser.Divide, i);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			unaryExpression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				unaryExpression();
				}
				}
				setState(262);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SimpleJavaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleJavaParser.Minus, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpression);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case IntegerLiteral:
			case FloatLiteral:
			case CharLiteral:
			case BoolLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				primaryExpression();
				}
				break;
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				unaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SimpleJavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(SimpleJavaParser.FloatLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(SimpleJavaParser.CharLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SimpleJavaParser.BoolLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExpression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(IntegerLiteral);
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(FloatLiteral);
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(CharLiteral);
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(BoolLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(StringLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(Identifier);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(LeftParen);
				setState(275);
				expression();
				setState(276);
				match(RightParen);
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
		"\u0004\u00010\u0119\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"K\b\u0003\n\u0003\f\u0003N\t\u0003\u0003\u0003P\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0003"+
		"\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0007"+
		"\u0003\u0007{\b\u0007\u0001\u0007\u0003\u0007~\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0088\b\u0007\n\u0007\f\u0007\u008b\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005"+
		"\t\u009e\b\t\n\t\f\t\u00a1\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00be\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c9\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00e7\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00f3\b\u0016\n\u0016\f\u0016\u00f6\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00fb\b\u0017\n\u0017\f\u0017\u00fe\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0103\b\u0018\n\u0018\f\u0018"+
		"\u0106\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u010b\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0117"+
		"\b\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\t\u0001"+
		"\u0000\'\'\u0002\u0000\u0004\u0004\u0006\n\u0002\u0000\u0006\n00\u0001"+
		"\u0000*.\u0002\u0000..00\u0001\u0000\u001d\u001e\u0002\u0000\u0016\u0017"+
		"\u0019\u001c\u0001\u0000\u0011\u0014\u0001\u0000\u0011\u0012\u0121\u0000"+
		"9\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000"+
		"\u0000\ns\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000ez\u0001"+
		"\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u009b\u0001"+
		"\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00a6\u0001"+
		"\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00ae\u0001"+
		"\u0000\u0000\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u00c8\u0001"+
		"\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000"+
		"\u0000\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000"+
		"(\u00ea\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00ef"+
		"\u0001\u0000\u0000\u0000.\u00f7\u0001\u0000\u0000\u00000\u00ff\u0001\u0000"+
		"\u0000\u00002\u010a\u0001\u0000\u0000\u00004\u0116\u0001\u0000\u0000\u0000"+
		"68\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005\u0001\u0000"+
		"\u0000@A\u00050\u0000\u0000AB\u0003\u0004\u0002\u0000B\u0003\u0001\u0000"+
		"\u0000\u0000CD\u0005&\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0007\u0000"+
		"\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GP\u0003\b\u0004\u0000HK\u0003"+
		"\f\u0006\u0000IK\u0003\n\u0005\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000OG\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000P\u0007\u0001"+
		"\u0000\u0000\u0000QR\u00050\u0000\u0000RS\u0005$\u0000\u0000ST\u0007\u0001"+
		"\u0000\u0000TZ\u00050\u0000\u0000UV\u0005#\u0000\u0000VW\u0007\u0001\u0000"+
		"\u0000WY\u00050\u0000\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005%\u0000\u0000^_\u0003\u0012"+
		"\t\u0000_\t\u0001\u0000\u0000\u0000`a\u0003\u0014\n\u0000ab\u00050\u0000"+
		"\u0000bg\u0005\"\u0000\u0000cf\u0003\n\u0005\u0000df\u0003\f\u0006\u0000"+
		"ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000ht\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0003\u0014\n\u0000kp\u0003\u001e"+
		"\u000f\u0000lo\u0003\n\u0005\u0000mo\u0003\f\u0006\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000s`\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000"+
		"\u0000t\u000b\u0001\u0000\u0000\u0000ux\u0003\u0010\b\u0000vx\u0003\u000e"+
		"\u0007\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\r\u0001"+
		"\u0000\u0000\u0000y{\u0005\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|~\u0005\u0003\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000\u0080\u0081\u0005"+
		"0\u0000\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083\u0007\u0001\u0000"+
		"\u0000\u0083\u0089\u00050\u0000\u0000\u0084\u0085\u0005#\u0000\u0000\u0085"+
		"\u0086\u0007\u0001\u0000\u0000\u0086\u0088\u00050\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005%\u0000\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e\u000f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0091\u0005"+
		"\u0003\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0005"+
		"\u0005\u0000\u0000\u0093\u0094\u0005$\u0000\u0000\u0094\u0095\u0005\u0006"+
		"\u0000\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u0097\u0005)\u0000\u0000"+
		"\u0097\u0098\u00050\u0000\u0000\u0098\u0099\u0005%\u0000\u0000\u0099\u009a"+
		"\u0003\u0012\t\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009f\u0005"+
		"&\u0000\u0000\u009c\u009e\u0003\u001c\u000e\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0000"+
		"\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0002"+
		"\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7\u00050\u0000"+
		"\u0000\u00a7\u00a8\u0005 \u0000\u0000\u00a8\u00a9\u0005\"\u0000\u0000"+
		"\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u00050\u0000\u0000\u00ab"+
		"\u00ac\u0005!\u0000\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u0019"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af\u00b0\u0005"+
		"0\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b2\u00034\u001a"+
		"\u0000\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000"+
		"\u00b4\u00be\u0003\u001a\r\u0000\u00b5\u00be\u0003\u001e\u000f\u0000\u00b6"+
		"\u00be\u0003\"\u0011\u0000\u00b7\u00be\u0003$\u0012\u0000\u00b8\u00be"+
		"\u0003&\u0013\u0000\u00b9\u00be\u0003(\u0014\u0000\u00ba\u00be\u0003\u0016"+
		"\u000b\u0000\u00bb\u00be\u0003\u0018\f\u0000\u00bc\u00be\u0003 \u0010"+
		"\u0000\u00bd\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u001d\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u00050\u0000\u0000\u00c0\u00c1\u0005\u0015\u0000\u0000"+
		"\u00c1\u00c2\u0003*\u0015\u0000\u00c2\u00c3\u0005\"\u0000\u0000\u00c3"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c4\u00c5\u00050\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0015\u0000\u0000\u00c6\u00c7\u0007\u0003\u0000\u0000\u00c7\u00c9"+
		"\u0005\"\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0010\u0000\u0000\u00cb\u00cc\u0005$\u0000\u0000\u00cc\u00cd\u0007\u0004"+
		"\u0000\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce\u00cf\u0005\"\u0000"+
		"\u0000\u00cf!\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000"+
		"\u00d1\u00d2\u0005$\u0000\u0000\u00d2\u00d3\u0003*\u0015\u0000\u00d3\u00d4"+
		"\u0005%\u0000\u0000\u00d4\u00d5\u0005&\u0000\u0000\u00d5\u00d6\u0003\u001c"+
		"\u000e\u0000\u00d6\u00dc\u0005\'\u0000\u0000\u00d7\u00d8\u0005\u000e\u0000"+
		"\u0000\u00d8\u00d9\u0005&\u0000\u0000\u00d9\u00da\u0003\u001c\u000e\u0000"+
		"\u00da\u00db\u0005\'\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d7\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"#\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u000f\u0000\u0000\u00df\u00e0"+
		"\u0005$\u0000\u0000\u00e0\u00e1\u0003*\u0015\u0000\u00e1\u00e2\u0005%"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001c\u000e\u0000\u00e3%\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0005\f\u0000\u0000\u00e5\u00e7\u0003*\u0015\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\"\u0000\u0000\u00e9"+
		"\'\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003*\u0015\u0000\u00eb\u00ec"+
		"\u0005\"\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003"+
		",\u0016\u0000\u00ee+\u0001\u0000\u0000\u0000\u00ef\u00f4\u0003.\u0017"+
		"\u0000\u00f0\u00f1\u0007\u0005\u0000\u0000\u00f1\u00f3\u0003.\u0017\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5-\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fc\u00030\u0018\u0000\u00f8\u00f9\u0007\u0006\u0000\u0000\u00f9\u00fb"+
		"\u00030\u0018\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd/\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0104\u00032\u0019\u0000\u0100\u0101\u0007\u0007\u0000"+
		"\u0000\u0101\u0103\u00032\u0019\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u01051\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u010b\u00034\u001a\u0000\u0108\u0109"+
		"\u0007\b\u0000\u0000\u0109\u010b\u00032\u0019\u0000\u010a\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b3\u0001\u0000"+
		"\u0000\u0000\u010c\u0117\u0005*\u0000\u0000\u010d\u0117\u0005+\u0000\u0000"+
		"\u010e\u0117\u0005,\u0000\u0000\u010f\u0117\u0005-\u0000\u0000\u0110\u0117"+
		"\u0005.\u0000\u0000\u0111\u0117\u00050\u0000\u0000\u0112\u0113\u0005$"+
		"\u0000\u0000\u0113\u0114\u0003*\u0015\u0000\u0114\u0115\u0005%\u0000\u0000"+
		"\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u010c\u0001\u0000\u0000\u0000"+
		"\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000"+
		"\u0116\u010f\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000"+
		"\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000"+
		"\u01175\u0001\u0000\u0000\u0000\u00189JLOZegnpswz}\u0089\u009f\u00bd\u00c8"+
		"\u00dc\u00e6\u00f4\u00fc\u0104\u010a\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}