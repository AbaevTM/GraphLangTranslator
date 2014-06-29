package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.exception.UndefinedOperationException;

public class TypeNode extends TypeUndefinedOperationsAdapter< TypeNode, Integer>{

	private static Integer nodeId = 0;
	
	private static Integer getNodeId(){
		return nodeId++;
	}
	
	private Integer content;
	
	public TypeNode (){
		content = getNodeId();
	}
	
	@Override
	public Integer getContent() {
		return content;
	}

	@Override
	public String toString(){
		return content.toString();
	}
	
	@Override
	public TypeBoolean operatorEqual(TypeNode secondOperand)
			throws UndefinedOperationException {
		if( this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeNode secondOperand)
			throws UndefinedOperationException {
		if( ! this.content.equals( secondOperand.content )){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}
	
	@Override
	public boolean equals ( Object object){
		if( object == null 
				|| ! ( object instanceof TypeNode )
				){
			return false;
		}
		else{
			return this.content.equals( ((TypeNode) object).content );
		}
	}
	
	@Override
	public int hashCode (){
		return this.content.hashCode();
	}
	
}
