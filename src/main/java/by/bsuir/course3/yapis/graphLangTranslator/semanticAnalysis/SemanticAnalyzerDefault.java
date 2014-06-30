package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.TreeBuilder;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.TreeBuilderDefault;
import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticAnalyzerDefault implements SemanticAnalyzer {
	
	private ParseTree parseTree;

	private Logger logger;
	
	private GeneratingTreeNode generatingTreeNode;
	
	@Override
	public void setParseTree(ParseTree parseTree) {
		this.parseTree = parseTree;
	}

	@Override
	public void analyze() {
		if( isInitialized() ){
			logger.addSystemMessage(StringConstant.SEMANTIC_ANALYSIS_START.getString());
			TreeBuilder builder = new TreeBuilderDefault();
			builder.setParseTree(parseTree);
			builder.buildTree();
			SemanticTreeNode semanticTreeNode = builder.getSemanticTree();
			//TODO
			//semanticTreeNode.validate();
			generatingTreeNode = builder.getGeneratingTree();
			logger.addSystemMessage(StringConstant.SEMANTIC_ANALYSIS_SUCCESSFUL_END.getString());
		}
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public GeneratingTreeNode getGeneratingTree() {
		return generatingTreeNode;
	}
	
	private boolean isInitialized(){
		return logger != null
				&& parseTree != null
				;
	}

}
