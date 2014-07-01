package main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.exception.UndefinedOperationException;

public interface Type<ReturnType, ContentType> {

	public ContentType getContent();
	
	public ReturnType operatorPlus ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public ReturnType operatorMinus ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public ReturnType operatorDevision ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public ReturnType operatorMultiplication ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorLessOrEqual ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorLess ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorGreaterOrEqual ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorGreater ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorEqual ( ReturnType secondOperand ) throws UndefinedOperationException;
	
	public TypeBoolean operatorNotEqual ( ReturnType secondOperand ) throws UndefinedOperationException;
}
