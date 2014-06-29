package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import java.util.HashSet;
import java.util.Set;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.exception.UndefinedOperationException;

public class TypeGraph extends TypeUndefinedOperationsAdapter<TypeGraph, String> {
	
	private Set<TypeArc> arcs;
	
	private Set<TypeNode> nodes;
	
private static Integer graphId = 0;
	
	private static Integer getGraphId(){
		return graphId++;
	}
	
	private Integer content;
	
	public TypeGraph (){
		content = getGraphId();
		arcs = new HashSet<>();
		nodes = new HashSet<>();
	}
	
	@Override
	public String getContent() {
		//TODO
		return null;
	}

	@Override 
	public TypeGraph operatorPlus( TypeGraph secondOperator){
		TypeGraph result = new TypeGraph();
		result.arcs.addAll(this.arcs);
		result.arcs.addAll(secondOperator.arcs);
		result.nodes.addAll(this.nodes);
		result.nodes.addAll(secondOperator.nodes);
		return result;
	}
	
	@Override 
	public TypeGraph operatorMinus( TypeGraph secondOperator){
		TypeGraph result = new TypeGraph();
		result.arcs.addAll(this.arcs);
		result.arcs.removeAll(secondOperator.arcs);
		result.nodes.addAll(this.nodes);
		result.nodes.removeAll(secondOperator.nodes);
		return result;
	}
	
	public TypeGraph addArc( TypeArc arc){
		arcs.add(arc);
		return this;
	}
	
	public TypeGraph addNode( TypeNode node){
		nodes.add(node);
		return this;
	}
	
	public TypeGraph removeArc ( TypeArc arc){
		arcs.remove(arc);
		return this;
	}
	
	public TypeGraph removeNode ( TypeNode node){
		nodes.remove(node);
		return this;
	}
	
	public Set<TypeArc> getArcs() {
		return arcs;
	}

	public Set<TypeNode> getNodes() {
		return nodes;
	}

	@Override
	public TypeBoolean operatorEqual(TypeGraph secondOperand)
			throws UndefinedOperationException {
		if( this.arcs.equals( secondOperand.arcs )
				&& this.nodes.equals( secondOperand.nodes)
				){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

	@Override
	public TypeBoolean operatorNotEqual(TypeGraph secondOperand)
			throws UndefinedOperationException {
		if( ! ( this.arcs.equals( secondOperand.arcs )
				&&  this.nodes.equals( secondOperand.nodes) )
				){
			return TypeBoolean.instanceTrue();
		}
		else {
			return TypeBoolean.instanceFalse();
		}
	}

}
