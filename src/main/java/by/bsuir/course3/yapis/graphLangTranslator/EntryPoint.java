package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.LoggerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzerDefault;

public class EntryPoint {

	public static void main(String[] args) {
		Logger logger = new LoggerDefault();
		try {
			if( args != null && args.length != 0 ){
				GraphLangTranslator graphLangTranslator = new GraphLangTranslatorDefault();
				graphLangTranslator.setSourcePath(args[0]);
				graphLangTranslator.setTranslatedSourcePath(StringConstant.TRANSLATED_SOURCE_PATH.getText());
				graphLangTranslator.setLogger(logger);
				graphLangTranslator.setSemanticAnalyzer(new SemanticAnalyzerDefault());
				graphLangTranslator.setSyntaxAnalyzer(new SyntaxAnalyzerDefault());
				graphLangTranslator.translate();
			}
			else{
				logger.addSystemMessage(StringConstant.MESSAGE_NEED_TO_SET_FILE_NAME.getText());
			}
		} finally {
			logger.printLog();
		}
	}

}
