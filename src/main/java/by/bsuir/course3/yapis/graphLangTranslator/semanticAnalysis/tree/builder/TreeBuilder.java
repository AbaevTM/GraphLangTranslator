package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;

import org.antlr.v4.runtime.tree.ParseTree;

public interface TreeBuilder {

	public void setParseTree ( ParseTree parseTree);
	
	public void buildTree();
	
	public SemanticTreeNode getSemanticTree ();
	
	public GeneratingTreeNode getGeneratingTree ();
	
}
