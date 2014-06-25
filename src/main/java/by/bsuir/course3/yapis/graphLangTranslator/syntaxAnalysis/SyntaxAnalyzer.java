package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis;

import java.io.IOException;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;

import org.antlr.v4.runtime.tree.ParseTree;

public interface SyntaxAnalyzer {

	public void init(String absolutePath) throws IOException;
	
	public ParseTree getTree();
	
	public void analyze() throws GraphLangSyntaxException;
	
	public void setLogger( Logger logger);
	
}
