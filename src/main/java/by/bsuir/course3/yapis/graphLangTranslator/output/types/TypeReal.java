package main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.exception.UndefinedOperationException;

public class TypeReal extends TypeUndefinedOperationsAdapter< TypeReal, Double>{

	private Double content;
	
	public TypeReal(){
		this(0D);
	}
	
	public TypeReal( Double content){
		this.content = new Double(content);
	}
	
	@Override
	public Double getContent() {
		return content;
	}

	@Override
	public TypeReal operatorPlus(TypeReal secondOperand)
			throws UndefinedOperationException {
		return new TypeReal( this.content + secondOperand.content);
	}

	@Override
	public TypeReal operatorMinus(TypeReal secondOperand)
			throws UndefinedOperationException {
		return new TypeReal( this.content - secondOperand.content);
	}

	@Override
	public TypeReal operatorDevision(TypeReal secondOperand)
			throws UndefinedOperationException {
		return new TypeReal( this.content / secondOperand.content);
	}

	@Override
	public TypeReal operatorMultiplication(TypeReal secondOperand)
			throws UndefinedOperationException {
		return new TypeReal( this.content * secondOperand.content);
	}

	@Override
	public TypeBoolean operatorLessOrEqual(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( this.content <= secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorLess(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( this.content < secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreaterOrEqual(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( this.content >= secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreater(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( this.content > secondOperand.content ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorEqual(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeReal secondOperand)
			throws UndefinedOperationException {
		if( ! this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}
	
}
