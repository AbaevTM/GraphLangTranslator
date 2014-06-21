package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.ErrorObserver;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;

public interface SyntaxAnalyzer extends ErrorObserver{

	public void init(String absolutePath);
	
	public ParseTree getTree();
	
	public boolean analyze();
	
	public void setLogger( Logger logger);
	
}
