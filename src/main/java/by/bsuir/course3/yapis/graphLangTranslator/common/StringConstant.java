package main.java.by.bsuir.course3.yapis.graphLangTranslator.common;

public enum StringConstant {
	////COMMON
	SEPARATOR_SPACE (" "),
	SEPARATOR_COLON (":"),
	
	////LOGGING
	LOGGING_MESSAGE_SYSTEM ("System message\t"),
	LOGGING_MESSAGE_SYNTAX_ERROR ("Syntax error\t"),
	LOGGING_MESSAGE_SEMANTIC_ERROR ("Semantic error\t"),
	
	////OTHER
	STR_LINE("\tline"),	
	STR_COLON("\tcolon"),
	
	////MESSAGE
	MESSAGE_NEED_TO_SET_FILE_NAME("as the first parameter you should set path to the source file."),
		////SYNTAX
		MESSAGE_START_SYNTAX_ANALYSIS("start of syntax analysis"),
		MESSAGE_FOR_FILE("for file :"),
		MESSAGE_SUCCESSFUL_END_SYNTAX_ANALYSIS("end of syntax analysis (successful)"),
		MESSAGE_UNSUCCESSFUL_END_SYNTAX_ANALYSIS("end of syntax analysis (unsuccessful)"),		
		MESSAGE_SOURCE_FILE_DOESNOT_EXIST("source graphLang file doesn't exist."),
		MESSAGE_FILE_CANNOT_BE_OPENED("source graphLang file cannot be opened"),
	MESSAGE_EXIT_COMILATION_SUCCESSFUL("exit compilation successfully"),
	MESSAGE_EXIT_COMILATION_UNSUCCESSFUL("exit compilation unsuccessfully"),
	
	////PATH
	TRANSLATED_SOURCE_PATH("\\source\\GraphLangProgram.java"),
	
	;
	
	private StringConstant(String text) {
		this.text = text;
	}

	private String text;

	public String getText() {
		return text;
	}
	
	@Override
	public String toString(){
		return getText();
	}
}
