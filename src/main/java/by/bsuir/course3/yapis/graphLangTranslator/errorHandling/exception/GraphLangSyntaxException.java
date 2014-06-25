package main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception;

public class GraphLangSyntaxException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3159426982553781438L;
	
	private String message;
	
	private int lineNumber;
	
	private int characterPosition;

	public GraphLangSyntaxException(GraphLangSyntaxExceptionRuntime exc) {
		super();
		this.message = exc.getMessage();
		this.lineNumber = exc.getLineNumber();
		this.characterPosition = exc.getCharacterPosition();
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
