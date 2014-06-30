package main.java.by.bsuir.course3.yapis.graphLangTranslator;

import java.io.IOException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.CodeGenerator;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.SemanticAnalyzer;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.SyntaxAnalyzer;

import org.antlr.v4.runtime.tree.ParseTree;

public class GraphLangTranslatorDefault implements GraphLangTranslator {

	private String sourcePath;
	
	private String outputPath;
	
	private Logger logger;

	private SyntaxAnalyzer syntaxAnalyzer;
	
	private SemanticAnalyzer semanticAnalyzer;
	
	private CodeGenerator codeGenerator;
	
	@Override
	public SyntaxAnalyzer getSyntaxAnalyzer() {
		return syntaxAnalyzer;
	}

	@Override
	public SemanticAnalyzer getSemanticAnalyzer() {
		return semanticAnalyzer;
	}

	@Override
	public void setSyntaxAnalyzer(SyntaxAnalyzer syntaxAnalyzer) {
		this.syntaxAnalyzer = syntaxAnalyzer;
	}

	@Override
	public void setSemanticAnalyzer(SemanticAnalyzer semanticAnalyzer) {
		this.semanticAnalyzer = semanticAnalyzer;
	}

	@Override
	public void translate() throws GraphLangSyntaxException, IOException{
		if(isReadyToTranslate()){
			syntaxAnalyzer.setLogger(logger);
			syntaxAnalyzer.init(sourcePath);
			syntaxAnalyzer.analyze();
			ParseTree parseTree = syntaxAnalyzer.getTree();
			semanticAnalyzer.setLogger(logger);
			semanticAnalyzer.setParseTree(parseTree);
			semanticAnalyzer.analyze();
//			GeneratingTreeNode generatingTreeNode = semanticAnalyzer.getGeneratingTree();
//			codeGenerator.setLogger(logger);
//			codeGenerator.setOutputPath(outputPath);
//			codeGenerator.setGeneratingTree(generatingTreeNode);
//			codeGenerator.generateCode();
			logger.addSystemMessage(StringConstant.TRANSLATION_EXIT_SUCCESSFUL.getString());
		}
		return;
	}

	private boolean isReadyToTranslate(){
		return 	logger != null &&
				semanticAnalyzer != null &&
				syntaxAnalyzer != null &&
				sourcePath != null &&
				outputPath != null &&
				codeGenerator != null
				;
	}
	
	@Override
	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	@Override
	public void setCodeGenerator(CodeGenerator codeGenerator) {
		this.codeGenerator = codeGenerator;
	}

	@Override
	public CodeGenerator getCodeGenerator() {
		return codeGenerator;
	}

}
