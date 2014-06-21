package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzer;

import org.antlr.v4.runtime.tree.ParseTree;

public class GraphLangTranslatorDefault implements GraphLangTranslator {

	private String sourcePath;
	
	private String translatedSourcePath;
	
	private Logger logger;

	private SyntaxAnalyzer syntaxAnalyzer;
	
	private SemanticAnalyzer semanticAnalyzer;
	
	@Override
	public void setSyntaxAnalyzer(SyntaxAnalyzer syntaxAnalyzer) {
		this.syntaxAnalyzer = syntaxAnalyzer;
	}

	@Override
	public void setSemanticAnalyzer(SemanticAnalyzer semanticAnalyzer) {
		this.semanticAnalyzer = semanticAnalyzer;
	}

	@Override
	public void translate() {
		if(isReadyToTranslate()){
			syntaxAnalyzer.setLogger(logger);
			syntaxAnalyzer.init(sourcePath);
			if( syntaxAnalyzer.analyze()){
				ParseTree parseTree = syntaxAnalyzer.getTree();
				semanticAnalyzer.setLogger(logger);
				semanticAnalyzer.init(parseTree);
				if( semanticAnalyzer.analyze()){
					logger.addSystemMessage(StringConstant.MESSAGE_EXIT_COMILATION_SUCCESSFUL.getText());
					return;
				}
			}
		}
		logger.addSystemMessage(StringConstant.MESSAGE_EXIT_COMILATION_UNSUCCESSFUL.getText());
		return;
	}

	private boolean isReadyToTranslate(){
		return 	logger != null &&
				semanticAnalyzer != null &&
				syntaxAnalyzer != null &&
				sourcePath != null &&
				translatedSourcePath != null;
	}
	
	@Override
	public void setTranslatedSourcePath(String translatedSourcePath) {
		this.translatedSourcePath = translatedSourcePath;
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

}
