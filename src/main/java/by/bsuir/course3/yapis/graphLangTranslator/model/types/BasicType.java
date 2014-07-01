package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import java.util.HashSet;
import java.util.Set;
import static main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.BasicOperations.*;

public enum BasicType implements Type{

	TYPE_BOOLEAN(
				new Operation []{
					OPERATOR_EQUAL,
					OPERATOR_NOT_EQUAL
				},
				new Type[]{
						
				}
			),
	TYPE_STRING(
				new Operation[]{
					OPERATOR_PLUS,
					OPERATOR_LESS_OR_EQUAL,
					OPERATOR_LESS,
					OPERATOR_GREATER_OR_EQUAL,
					OPERATOR_GREATER,
					OPERATOR_EQUAL,
					OPERATOR_NOT_EQUAL
					},
				new Type[]{
						
				}
			),
	TYPE_REAL(
				new Operation[]{
					OPERATOR_PLUS,
					OPERATOR_MINUS,
					OPERATOR_MULTIPLICATION,
					OPERATOR_DEVISION,
					OPERATOR_LESS_OR_EQUAL,
					OPERATOR_LESS,
					OPERATOR_GREATER_OR_EQUAL,
					OPERATOR_GREATER,
					OPERATOR_EQUAL,
					OPERATOR_NOT_EQUAL
				},
				new Type[]{
					TYPE_STRING
				}
			),
	TYPE_INT(
				new Operation[]{
					OPERATOR_PLUS,
					OPERATOR_MINUS,
					OPERATOR_MULTIPLICATION,
					OPERATOR_DEVISION,
					OPERATOR_LESS_OR_EQUAL,
					OPERATOR_LESS,
					OPERATOR_GREATER_OR_EQUAL,
					OPERATOR_GREATER,
					OPERATOR_EQUAL,
					OPERATOR_NOT_EQUAL
					},
				new Type[]{
					TYPE_STRING,
					TYPE_REAL
				}
			),	
	TYPE_ARC(
				new Operation[]{
						OPERATOR_EQUAL,
						OPERATOR_NOT_EQUAL
						},
				new Type[]{
						
				}
			),
	TYPE_NODE(
				new Operation[]{
						OPERATOR_EQUAL,
						OPERATOR_NOT_EQUAL
						},
				new Type[]{
						
				}
			),
	TYPE_GRAPH(
				new Operation[]{
						OPERATOR_PLUS,
						OPERATOR_EQUAL,
						OPERATOR_NOT_EQUAL
						},
				new Type[]{
						
				}
			),
	;

	private Set<Operation> definedOperations;
	
	private Set<Type> permittedCasts;
	
	private BasicType( Operation [] definedOperations, Type [] permittedCasts){
		this.definedOperations = new HashSet<>();
		this.permittedCasts = new HashSet<>();
		for( Operation operation : definedOperations){
			this.definedOperations.add(operation);
		}
		for( Type type : permittedCasts){
			this.permittedCasts.add(type);
		}
	}
	
	@Override
	public boolean isOperationDefined(Operation operation) {
		return definedOperations.contains(operation);
	}

	@Override
	public boolean isCastPermitted(Type type) {
		return permittedCasts.contains(type);
	}
	
}
