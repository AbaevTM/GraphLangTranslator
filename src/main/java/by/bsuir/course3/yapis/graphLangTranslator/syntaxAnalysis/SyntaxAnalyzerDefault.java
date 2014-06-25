package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.GraphLangErrorListenerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxExceptionRuntime;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarLexer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SyntaxAnalyzerDefault implements SyntaxAnalyzer {
	
	private ParseTree parseTree;
	
	private GraphLangGrammarParser parser;
	
	private Logger logger;
	
	private String sourcePath;
	
	private boolean initFlag = false;

	public SyntaxAnalyzerDefault() {
		super();
	}

	@Override
	public void init(String absolutePath) throws IOException {
		try {
			sourcePath = absolutePath;
			initFlag = false;
			File file = new File(absolutePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileInputStream);
			GraphLangGrammarLexer lexer = new GraphLangGrammarLexer(antlrInputStream);
			TokenStream tokens = new CommonTokenStream(lexer);
			parser = new GraphLangGrammarParser(tokens);
			lexer.removeErrorListeners();
			parser.removeErrorListeners();
			parser.setErrorHandler(new BailErrorStrategy());
			GraphLangErrorListenerDefault errorListener = new GraphLangErrorListenerDefault();
			parser.addErrorListener(errorListener);
			lexer.addErrorListener(errorListener);
			initFlag = true;
		} catch (IOException exc){
			throw exc;
		} 	
	}

	@Override
	public void analyze() throws GraphLangSyntaxException {
		try{
			if(initFlag){
				logger.addSystemMessage(StringConstant.FILE_FOR_FILE.getString() +
						StringConstant.SEPARATOR_SPACE.getString() +
						sourcePath);
				logger.addSystemMessage(StringConstant.SYNTAX_ANALYSIS_START.getString());
				parseTree = parser.document();
				logger.addSystemMessage(StringConstant.SYNTAX_ANALYSIS_SUCCESSFUL_END.getString());				
			}
		} catch (GraphLangSyntaxExceptionRuntime exc){
			throw new GraphLangSyntaxException(exc);
		}	
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public ParseTree getTree() {
		return parseTree;
	}

}
