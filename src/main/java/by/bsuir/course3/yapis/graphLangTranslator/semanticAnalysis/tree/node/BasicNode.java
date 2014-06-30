package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.node;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicNode implements MutualTreeNode{

	private List<MutualTreeNode> children;
	
	private int lineNumber;
	
	private int characterPosition;
	
	public BasicNode(){
		lineNumber = 0;
		characterPosition = 0;
		children = new ArrayList<>();
	}
	
	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public int getCharacterPosition() {
		return characterPosition;
	}

	public void setCharacterPosition(int characterPosition) {
		this.characterPosition = characterPosition;
	}

	@Override
	public void addChild(MutualTreeNode treeNode) {
		children.add(treeNode);
	}
	
}
