package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.exception.UndefinedOperationException;
import static main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant.*;

public class TypeArc extends TypeUndefinedOperationsAdapter<TypeArc, String>{

	private static Integer arcId = 0;
	
	private static Integer getArcId(){
		return arcId++;
	}
	
	private Integer content;
	
	private TypeNode firstNode;
	
	private TypeNode secondNode;
	
	public TypeArc (){
		content = getArcId();
		firstNode = null;
		secondNode = null;
	}
	
	public TypeNode getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(TypeNode firstNode) {
		this.firstNode = firstNode;
	}

	public TypeNode getSecondNode() {
		return secondNode;
	}

	public void setSecondNode(TypeNode secondNode) {
		this.secondNode = secondNode;
	}

	@Override
	public String getContent() {
		String result;
		result = firstNode.getContent().toString() +
				TYPE_ARC_ARROW_BEGIN.getString() +
				content.toString() +
				TYPE_ARC_ARROW_END.toString() + 
				secondNode.getContent().toString();
		return result;
	}
	
	@Override
	public String toString(){
		return getContent();
	}

	@Override
	public TypeBoolean operatorEqual(TypeArc secondOperand)
			throws UndefinedOperationException {
		if( this.content.equals(secondOperand.content)
				){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeArc secondOperand)
			throws UndefinedOperationException {
		if( ! this.content.equals(secondOperand.content)
				){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public boolean equals ( Object object){
		if( object == null 
				|| ! ( object instanceof TypeArc )
				){
			return false;
		}
		else{
			try {
				return operatorEqual((TypeArc) object).getContent();
			} catch (UndefinedOperationException e) {
				return false;
			}
		}
	}
	
	@Override
	public int hashCode (){
		return this.content.hashCode() + this.firstNode.hashCode() + this.secondNode.hashCode();
	}
	
}
