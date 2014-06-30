package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.listener;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarListener;

public interface TreeBuilderListener extends GraphLangGrammarListener{
	
	public SemanticTreeNode getSemanticTree ();
	
	public GeneratingTreeNode getGeneratingTree ();

}
