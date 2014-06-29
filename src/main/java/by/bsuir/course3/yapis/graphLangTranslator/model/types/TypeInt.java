package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.exception.UndefinedOperationException;

public class TypeInt extends TypeUndefinedOperationsAdapter<TypeInt, Integer>{

	private Integer content;
	
	public TypeInt(){
		this(0);
	}
	
	public TypeInt( Integer content){
		this.content = new Integer(content);
	}
	
	@Override
	public Integer getContent() {
		return content;
	}

	@Override
	public TypeInt operatorPlus(TypeInt secondOperand)
			throws UndefinedOperationException {
		return new TypeInt( this.content + secondOperand.content);
	}

	@Override
	public TypeInt operatorMinus(TypeInt secondOperand)
			throws UndefinedOperationException {
		return new TypeInt( this.content - secondOperand.content);
	}

	@Override
	public TypeInt operatorDevision(TypeInt secondOperand)
			throws UndefinedOperationException {
		return new TypeInt( this.content / secondOperand.content);
	}

	@Override
	public TypeInt operatorMultiplication(TypeInt secondOperand)
			throws UndefinedOperationException {
		return new TypeInt( this.content * secondOperand.content);
	}

	@Override
	public TypeBoolean operatorLessOrEqual(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( this.content <= secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorLess(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( this.content < secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreaterOrEqual(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( this.content >= secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreater(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( this.content > secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorEqual(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeInt secondOperand)
			throws UndefinedOperationException {
		if( ! this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

}
