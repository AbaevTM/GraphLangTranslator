package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;

public interface SemanticAnalyzer {

	public void setTranslatedSourcePath( String translatedSourcePath );
	
	public void init(ParseTree parseTree);
	
	public void analyze();
	
	public void setLogger( Logger logger);
}
