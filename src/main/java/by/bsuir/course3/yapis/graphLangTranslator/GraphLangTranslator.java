package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzer;

public interface GraphLangTranslator {
	
	public void setSourcePath(String sourcePath);
	
	public void setSyntaxAnalyzer(SyntaxAnalyzer syntaxAnalyzer);
	
	public void setSemanticAnalyzer(SemanticAnalyzer semanticAnalyzer);
	
	public void setLogger( Logger logger);

	public void translate();
	
	public void setTranslatedSourcePath( String translatedSourcePath );
	
}
