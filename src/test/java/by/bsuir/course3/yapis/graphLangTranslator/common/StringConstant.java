package test.java.by.bsuir.course3.yapis.graphLangTranslator.common;

public enum StringConstant {
	////SYNTAX ANALYSIS TEST
	PATH_SYNTAX_ERROR_FILE_EXAMPLE(
			"target\\test-classes\\test\\java\\by\\bsuir\\course3\\yapis\\graphLangTranslator\\syntaxAnalysis"
			+ "\\examples\\syntaxError.graphLang"),
	PATH_CANNOT_OPEN_FILE_EXAMPLE(
			"target\\test-classes\\test\\java\\by\\bsuir\\course3\\yapis\\graphLangTranslator\\syntaxAnalysis"
			+ "\\examples\\cannotOpen.graphLang"),
	PATH_OK_FILE_EXAMPLE(
			"target\\test-classes\\test\\java\\by\\bsuir\\course3\\yapis\\graphLangTranslator\\syntaxAnalysis"
			+ "\\examples\\ok.graphLang"),
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
