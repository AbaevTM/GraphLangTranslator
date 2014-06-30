package main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;

public interface CodeGenerator {

	public void setOutputPath( String outputPath);
	
	public void setGeneratingTree ( GeneratingTreeNode generatingTreeNode);
	
	public void generateCode();
	
	public void setLogger( Logger logger);
	
}
