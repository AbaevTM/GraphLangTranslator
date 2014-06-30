package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.listener.TreeBuilderListener;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.listener.TreeBuilderListenerDefault;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TreeBuilderDefault implements TreeBuilder{

	private ParseTree parseTree;
	
	private SemanticTreeNode semanticTreeNode;
	
	private GeneratingTreeNode generatingTreeNode;
	
	@Override
	public void setParseTree(ParseTree parseTree) {
		this.parseTree = parseTree;
	}

	@Override
	public void buildTree() {
		TreeBuilderListener builderListener = new TreeBuilderListenerDefault();
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		parseTreeWalker.walk(builderListener, parseTree);
		semanticTreeNode = builderListener.getSemanticTree();
		generatingTreeNode = builderListener.getGeneratingTree();
	}

	@Override
	public SemanticTreeNode getSemanticTree() {
		return semanticTreeNode;
	}

	@Override
	public GeneratingTreeNode getGeneratingTree() {
		return generatingTreeNode;
	}

}
