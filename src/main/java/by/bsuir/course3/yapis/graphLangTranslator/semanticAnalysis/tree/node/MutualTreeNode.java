package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.node;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;

public interface MutualTreeNode extends SemanticTreeNode, GeneratingTreeNode {

	public void addChild( MutualTreeNode treeNode);
	
}
