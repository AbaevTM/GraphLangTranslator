package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging;

import java.util.ArrayList;
import java.util.List;
import static main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message.MessageType.*;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message.LoggerMessage;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message.LoggerMessageAdapter;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message.LoggerMessageError;

public class LoggerDefault implements Logger {

	private List<LoggerMessage> messages ;
	
	public LoggerDefault() {
		super();
		messages = new ArrayList<>();
	}

	@Override
	public void addMessage( LoggerMessage message ) {
		messages.add( message );
	}

	@Override
	public void printLog() {
		for( LoggerMessage message : messages){
			System.out.println(message);
		}
	}

	@Override
	public void addSystemMessage(String message) {
		messages.add( new LoggerMessageAdapter( SYSTEM , message));
	}

	@Override
	public void addSyntaxErrorMessage(String message, int lineNumber, int characterPosition) {
		messages.add( new LoggerMessageError( SYNTAX_ERROR, message, lineNumber, characterPosition));
	}

	@Override
	public void addSemanticErrorMessage(String message, int lineNumber, int characterPosition) {
		messages.add( new LoggerMessageError( SEMANTIC_ERROR, message, lineNumber, characterPosition));
	}

}
