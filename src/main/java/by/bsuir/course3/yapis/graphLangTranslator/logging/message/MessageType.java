package main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.message;
import static main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant.*;

public enum MessageType {
	SYSTEM ( LOGGING_MESSAGE_SYSTEM.getString() ),
	SYNTAX_ERROR ( LOGGING_MESSAGE_SYNTAX_ERROR.getString() ),
	SEMANTIC_ERROR ( LOGGING_MESSAGE_SEMANTIC_ERROR.getString() ),
	;

	private MessageType(String text) {
		this.text = text;
	}

	private String text;

	public String getText() {
		return text;
	}
	
	

	
}
