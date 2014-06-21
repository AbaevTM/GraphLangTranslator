package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.GraphLangErrorListener;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.GraphLangErrorListenerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarLexer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class SyntaxAnalyzerDefault implements SyntaxAnalyzer {
	
	private ParseTree parseTree;
	
	private GraphLangGrammarParser parser;
	
	private Logger logger;
	
	private String sourcePath;
	
	private boolean initFlag = false;
	
	private boolean successfulParsing = false;
	
	public SyntaxAnalyzerDefault() {
		super();
	}

	@Override
	public void init(String absolutePath) {
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
			GraphLangErrorListener errorListener = new GraphLangErrorListenerDefault();
			errorListener.setLogger(logger);
			errorListener.setErrorObserver(this);
			parser.addErrorListener(errorListener);
			lexer.addErrorListener(errorListener);
			initFlag = true;
		} catch (IOException exc){
			logger.addSystemMessage(StringConstant.MESSAGE_FILE_CANNOT_BE_OPENED.getText());
		}		
	}

	@Override
	public boolean analyze() {
		try{
			if(initFlag){
				logger.addSystemMessage(StringConstant.MESSAGE_START_SYNTAX_ANALYSIS.getText());
				logger.addSystemMessage(StringConstant.MESSAGE_FOR_FILE.getText() +
						StringConstant.SEPARATOR_SPACE.getText() +
						sourcePath);
				successfulParsing = true;
				parseTree = parser.document();
				if (successfulParsing){
					logger.addSystemMessage(StringConstant.MESSAGE_SUCCESSFUL_END_SYNTAX_ANALYSIS.getText());
					return true;
				}				
			}
			logger.addSystemMessage(StringConstant.MESSAGE_UNSUCCESSFUL_END_SYNTAX_ANALYSIS.getText());
			return false;
		} catch (RecognitionException exc){
			logger.addSystemMessage(StringConstant.MESSAGE_UNSUCCESSFUL_END_SYNTAX_ANALYSIS.getText());
			return false;
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

	@Override
	public void errorOccurred() {
		successfulParsing = false;
	}

}
