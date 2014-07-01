package main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.exception.UndefinedOperationException;

public class TypeString extends TypeUndefinedOperationsAdapter< TypeString, String>{

	private String content;
	
	public TypeString (){
		this("");
	}
	
	public TypeString( String content){
		this.content = new String(content);
	}
	
	@Override
	public String getContent() {
		return content;
	}

	@Override
	public TypeString operatorPlus(TypeString secondOperand)
			throws UndefinedOperationException {
		return new TypeString( this.content + secondOperand.content);
	}

	@Override
	public TypeBoolean operatorLessOrEqual(TypeString secondOperand)
			throws UndefinedOperationException {
		if( this.content.compareTo( secondOperand.content) <= 0 ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorLess(TypeString secondOperand)
			throws UndefinedOperationException {
		if( this.content.compareTo( secondOperand.content) < 0 ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreaterOrEqual(TypeString secondOperand)
			throws UndefinedOperationException {
		if( this.content.compareTo( secondOperand.content) >= 0 ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorGreater(TypeString secondOperand)
			throws UndefinedOperationException {
		if( this.content.compareTo( secondOperand.content) > 0 ){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorEqual(TypeString secondOperand)
			throws UndefinedOperationException {
		if( this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeString secondOperand)
			throws UndefinedOperationException {
		if( ! this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}
	
}
