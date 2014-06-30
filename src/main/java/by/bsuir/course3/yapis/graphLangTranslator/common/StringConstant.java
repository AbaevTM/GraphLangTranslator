package main.java.by.bsuir.course3.yapis.graphLangTranslator.common;

public enum StringConstant {
	////COMMON
	SEPARATOR_SPACE (" "),
	SEPARATOR_STARS ("*****"),
	SEPARATOR_COLON (":"),
	
	////LOGGING
	LOGGING_MESSAGE_SYSTEM ("System message\t"),
	LOGGING_MESSAGE_SYNTAX_ERROR ("Syntax error\t"),
	LOGGING_MESSAGE_SEMANTIC_ERROR ("Semantic error\t"),
	
	////OTHER
	STR_LINE("\tline"),	
	STR_COLON("\tcolon"),
	
	////FILE
	FILE_NEED_TO_SET_FILE_NAME("as the first parameter you should pass path to the source file."),
	FILE_FOR_FILE("for file :"),
	FILE_SOURCE_FILE_DOESNOT_EXIST("source graphLang file doesn't exist."),
	FILE_CANNOT_BE_OPENED("source graphLang file cannot be opened"),
	
	////SYNTAX ANALYSIS
	SYNTAX_ANALYSIS_START("start of syntax analysis"),
	SYNTAX_ANALYSIS_SUCCESSFUL_END("exit syntax analysis successfully"),
	SYNTAX_ANALYSIS_UNSUCCESSFUL_END("exit syntax analysis unsuccessfully"),	
	
	////SYNTAX ANALYSIS
	SEMANTIC_ANALYSIS_START("start of semantic analysis"),
	SEMANTIC_ANALYSIS_SUCCESSFUL_END("exit semantic analysis successfully"),
	SEMANTIC_ANALYSIS_UNSUCCESSFUL_END("exit semantic analysis unsuccessfully"),		
	
	////CODE GENERATION
	CODE_GENEREATION_ANALYSIS_START("start of code generation"),
	CODE_GENEREATION_SUCCESSFUL_END("exit code generation successfully"),
	CODE_GENEREATION_UNSUCCESSFUL_END("exit code generation unsuccessfully"),		
	
	
	////TRANSLATION
	TRANSLATION_EXIT_SUCCESSFUL("exit translation successfully"),
	TRANSLATION_EXIT_UNSUCCESSFUL("exit translation unsuccessfully"),
	
	////PATH
	PATH_TRANSLATED_SOURCE_PATH("\\source\\GraphLangProgram.java"),
	
	////TYPE
	TYPE_ARC_ARROW_BEGIN(" ---"),
	TYPE_ARC_ARROW_END("--> "),
	TYPE_GRAPH_GRAPH("Graph:"),
	TYPE_GRAPH_NODES("Nodes:"),
	TYPE_GRAPH_ARCS("Arcs:"),
	;
	
	private StringConstant(String text) {
		this.text = text;
	}

	private String text;

	public String getString() {
		return text;
	}
	
	@Override
	public String toString(){
		return getString();
	}
}
