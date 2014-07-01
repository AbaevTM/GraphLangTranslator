package main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.exception.UndefinedOperationException;

public class TypeBoolean extends TypeUndefinedOperationsAdapter<TypeBoolean, Boolean>{

	private boolean content;
	
	public TypeBoolean ( boolean content){
		this.content = content;
	}
	
	public TypeBoolean (){
		this(false);
	}
	
	public static TypeBoolean instanceTrue(){
		return new TypeBoolean(true);
	}
	
	public static TypeBoolean instanceFalse(){
		return new TypeBoolean(false);
	}

	@Override
	public TypeBoolean operatorEqual(TypeBoolean secondOperand)
			throws UndefinedOperationException {
		if ( this.content == secondOperand.content){
			return new TypeBoolean(true);
		}
		else {
			return new TypeBoolean(false);
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeBoolean secondOperand)
			throws UndefinedOperationException {
		if ( this.content == secondOperand.content){
			return new TypeBoolean(false);
		}
		else {
			return new TypeBoolean(true);
		}
	}

	@Override
	public Boolean getContent() {
		return Boolean.valueOf(content);
	}

	
	

}
