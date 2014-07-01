package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.node;

public abstract class BasicNode implements MutualTreeNode{

	private int lineNumber;
	
	private int characterPosition;
	
	public BasicNode(){
		lineNumber = 0;
		characterPosition = 0;
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
		return;
	}
	
}
