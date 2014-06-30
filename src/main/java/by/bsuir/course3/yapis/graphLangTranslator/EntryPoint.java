package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import java.io.IOException;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.CodeGeneratorDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.LoggerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzerDefault;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzerDefault;

public class EntryPoint {

	private static GraphLangTranslator graphLangTranslator;
	
	public static GraphLangTranslator getGraphLangTranslator() {
		return graphLangTranslator;
	}

	public static void main(String[] args) {
		Logger logger = new LoggerDefault();
		String path = "";
		try {
			if( args != null && args.length != 0 ){
				graphLangTranslator = new GraphLangTranslatorDefault();
				path = args[0];
				graphLangTranslator.setSourcePath(path);
				graphLangTranslator.setOutputPath(StringConstant.PATH_TRANSLATED_SOURCE_PATH.getString());
				graphLangTranslator.setLogger(logger);
				graphLangTranslator.setSemanticAnalyzer(new SemanticAnalyzerDefault());
				graphLangTranslator.setSyntaxAnalyzer(new SyntaxAnalyzerDefault());
				graphLangTranslator.setCodeGenerator(new CodeGeneratorDefault());
				graphLangTranslator.translate();
			}
			else{
				logger.addSystemMessage(StringConstant.FILE_NEED_TO_SET_FILE_NAME.getString());
			}
			
		} catch (GraphLangSyntaxException e) {
			logger.addSyntaxErrorMessage(e.getMessage(), e.getLineNumber(), e.getCharacterPosition());
			logger.addSystemMessage(StringConstant.SYNTAX_ANALYSIS_UNSUCCESSFUL_END.getString());
			logger.addSystemMessage(StringConstant.TRANSLATION_EXIT_UNSUCCESSFUL.getString());
		} catch (IOException e) {
			printFileNameToLogger(logger, path);
			logger.addSystemMessage(StringConstant.FILE_CANNOT_BE_OPENED.toString());
			logger.addSystemMessage(StringConstant.TRANSLATION_EXIT_UNSUCCESSFUL.getString());
		} finally {
			logger.printLog();
		}
	}

	public static void printFileNameToLogger( Logger logger, String fileName){
		logger.addSystemMessage(StringConstant.FILE_FOR_FILE.toString() + 
				StringConstant.SEPARATOR_SPACE.getString() +
				fileName);
	}
	
	public static void mainTest(String[] args) throws GraphLangSyntaxException, IOException {
		Logger logger = new LoggerDefault();
		String path = "";
		try {
			if( args != null && args.length != 0 ){
				graphLangTranslator = new GraphLangTranslatorDefault();
				path = args[0];
				graphLangTranslator.setSourcePath(path);
				graphLangTranslator.setOutputPath(StringConstant.PATH_TRANSLATED_SOURCE_PATH.getString());
				graphLangTranslator.setLogger(logger);
				graphLangTranslator.setSemanticAnalyzer(new SemanticAnalyzerDefault());
				graphLangTranslator.setSyntaxAnalyzer(new SyntaxAnalyzerDefault());
				graphLangTranslator.setCodeGenerator(new CodeGeneratorDefault());
				graphLangTranslator.translate();
			}
			else{
				logger.addSystemMessage(StringConstant.FILE_NEED_TO_SET_FILE_NAME.getString());
				throw new IOException();
			}			
		} catch (GraphLangSyntaxException e) {
			logger.addSyntaxErrorMessage(e.getMessage(), e.getLineNumber(), e.getCharacterPosition());
			logger.addSystemMessage(StringConstant.SYNTAX_ANALYSIS_UNSUCCESSFUL_END.getString());
			logger.addSystemMessage(StringConstant.TRANSLATION_EXIT_UNSUCCESSFUL.getString());
			throw e;
		} catch (IOException e) {
			printFileNameToLogger(logger, path);
			logger.addSystemMessage(StringConstant.FILE_CANNOT_BE_OPENED.toString());
			logger.addSystemMessage(StringConstant.TRANSLATION_EXIT_UNSUCCESSFUL.getString());
			throw e;
		} finally {
			logger.printLog();
		}
	}
	
}
