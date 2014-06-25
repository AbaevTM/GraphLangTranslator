package main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception;

public class GraphLangSyntaxExceptionRuntime extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3159426982553781438L;
	
	private String message;
	
	private int lineNumber;
	
	private int characterPosition;

	public GraphLangSyntaxExceptionRuntime(String message, int lineNumber,
			int characterPosition) {
		super();
		this.message = message;
		this.lineNumber = lineNumber;
		this.characterPosition = characterPosition;
	}

	public String getMessage() {
		return message;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getCharacterPosition() {
		return characterPosition;
	}
	
	
	
}
