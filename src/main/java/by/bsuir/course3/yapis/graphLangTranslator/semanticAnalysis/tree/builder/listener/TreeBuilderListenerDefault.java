package main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.builder.listener;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.codeGeneration.tree.GeneratingTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.semanticAnalysis.tree.SemanticTreeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.AtomContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.BlockStatementContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.BreakStatementContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.ConditionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.ConditionalOperatorContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.CycleOperatorContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.DocumentContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.ForConditionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.ForCycleContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionArgumentsSectionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionBodyContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionCallContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionHeaderContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.FunctionParametersSectionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.IfOperatorContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.PostConditionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.PreConditionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.PrimitiveAtomContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.ReturnStatementContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementAtomContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryComparisionEquatingContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryComparisonContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryDivisionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryMinusContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryMultiplicationContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBinaryPlusContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementBracketsContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementCastContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.StatementFunctionCallContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.SwitchOperatorContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.TerminalStatementContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.TypeDefinitionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.UnaryContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.UntilCycleContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.VariableAssignmentContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.VariableContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.VariableDefenitionContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.VariableInitializationContext;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing.GraphLangGrammarParser.WhileCycleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TreeBuilderListenerDefault implements TreeBuilderListener{

	@Override
	public void enterAtom(AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAtom(AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableInitialization(VariableInitializationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableInitialization(VariableInitializationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionParametersSection(
			FunctionParametersSectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionParametersSection(
			FunctionParametersSectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTerminalStatement(TerminalStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTerminalStatement(TerminalStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryMultiplication(
			StatementBinaryMultiplicationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryMultiplication(
			StatementBinaryMultiplicationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryComparison(
			StatementBinaryComparisonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryComparison(
			StatementBinaryComparisonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryDivision(StatementBinaryDivisionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryDivision(StatementBinaryDivisionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockStatement(BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBrackets(StatementBracketsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBrackets(StatementBracketsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementCast(StatementCastContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementCast(StatementCastContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalOperator(ConditionalOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConditionalOperator(ConditionalOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunction(FunctionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunction(FunctionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnary(UnaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnary(UnaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchOperator(SwitchOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchOperator(SwitchOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementAtom(StatementAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementAtom(StatementAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDocument(DocumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDocument(DocumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionHeader(FunctionHeaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionHeader(FunctionHeaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPreCondition(PreConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPreCondition(PreConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionArgumentsSection(
			FunctionArgumentsSectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionArgumentsSection(FunctionArgumentsSectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementFunctionCall(StatementFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementFunctionCall(StatementFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWhileCycle(WhileCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhileCycle(WhileCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryComparisionEquating(
			StatementBinaryComparisionEquatingContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryComparisionEquating(
			StatementBinaryComparisionEquatingContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDefenition(VariableDefenitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDefenition(VariableDefenitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUntilCycle(UntilCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUntilCycle(UntilCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryMinus(StatementBinaryMinusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryMinus(StatementBinaryMinusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementBinaryPlus(StatementBinaryPlusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementBinaryPlus(StatementBinaryPlusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimitiveAtom(PrimitiveAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimitiveAtom(PrimitiveAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionBody(FunctionBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionBody(FunctionBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIfOperator(IfOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIfOperator(IfOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForCycle(ForCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForCycle(ForCycleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForCondition(ForConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForCondition(ForConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostCondition(PostConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostCondition(PostConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCycleOperator(CycleOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCycleOperator(CycleOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeDefinition(TypeDefinitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeDefinition(TypeDefinitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableAssignment(VariableAssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableAssignment(VariableAssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBreakStatement(BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBreakStatement(BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SemanticTreeNode getSemanticTree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneratingTreeNode getGeneratingTree() {
		// TODO Auto-generated method stub
		return null;
	}

}
