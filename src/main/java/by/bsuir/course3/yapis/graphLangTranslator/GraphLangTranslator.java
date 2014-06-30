package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import java.io.IOException;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.CodeGenerator;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzer;

public interface GraphLangTranslator {
	
	public void setSourcePath(String sourcePath);
	
	public void setOutputPath( String outputPath );

	public void setSyntaxAnalyzer(SyntaxAnalyzer syntaxAnalyzer);
	
	public void setSemanticAnalyzer(SemanticAnalyzer semanticAnalyzer);
	
	public void setCodeGenerator ( CodeGenerator codeGenerator);
	
	public void setLogger( Logger logger);

	public void translate() throws GraphLangSyntaxException, IOException;
	
	public SyntaxAnalyzer getSyntaxAnalyzer();

	public SemanticAnalyzer getSemanticAnalyzer();
	
	public CodeGenerator getCodeGenerator();
	
}
