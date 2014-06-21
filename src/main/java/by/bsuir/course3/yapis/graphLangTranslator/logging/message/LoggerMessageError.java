package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message;

import static main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant.*;

public class LoggerMessageError extends LoggerMessageAdapter {

	public LoggerMessageError(MessageType messageType, String message, int lineNumber, int characterPosition) {
		super(messageType, message);
		this.lineNumber = lineNumber;
		this.characterPosition = characterPosition;
	}

	private int lineNumber;
	
	private int characterPosition;
	
	@Override
	public MessageType getMessageType() {
		return messageType;
	}
	
	private String formMessage(){
		String result = STR_LINE.toString() + SEPARATOR_COLON + lineNumber +
						SEPARATOR_SPACE + STR_COLON + SEPARATOR_COLON + characterPosition +
						SEPARATOR_SPACE + message;
		return result;
	}

	@Override
	public String getMessage() {
		return messageType.getText() + SEPARATOR_SPACE + SEPARATOR_COLON + SEPARATOR_SPACE + formMessage();
	}

}
