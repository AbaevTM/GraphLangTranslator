package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

public interface Type {

	public boolean isOperationDefined( Operation operation );
	
	public boolean isCastPermitted ( Type type );
	
}
