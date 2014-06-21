package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message;

import static main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant.*;

public class LoggerMessageAdapter implements LoggerMessage {

	protected MessageType messageType;
	
	protected String message;

	public LoggerMessageAdapter(MessageType messageType, String message) {
		super();
		this.messageType = messageType;
		this.message = message;
	}

	@Override
	public MessageType getMessageType() {
		return messageType;
	}

	@Override
	public String getMessage() {
		String result = messageType.getText() + SEPARATOR_SPACE + SEPARATOR_COLON + SEPARATOR_SPACE + message;
		return result;
	}
	
	@Override
	public String toString(){
		return getMessage();
	}
}
