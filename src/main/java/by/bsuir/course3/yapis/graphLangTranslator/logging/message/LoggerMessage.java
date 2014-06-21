package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message;

public interface LoggerMessage {

	public abstract MessageType getMessageType();

	public abstract String getMessage();

	public String toString();
	
}