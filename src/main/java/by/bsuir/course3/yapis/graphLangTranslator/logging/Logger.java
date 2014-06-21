package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message.LoggerMessage;

public interface Logger {

	void addMessage( LoggerMessage message );
	
	void addSystemMessage( String message);
	
	void addSyntaxErrorMessage( String message, int lineNumber, int characterPosition);
	
	void addSemanticErrorMessage( String message, int lineNumber, int characterPosition);
	
	void printLog();
	
}
