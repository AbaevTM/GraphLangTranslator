// Generated from main\java\by\bsuir\course3\yapis\graphLangTranslator\syntaxAnalysis\parsing\GraphLangGrammar.g4 by ANTLR 4.2
package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphLangGrammarParser}.
 */
public interface GraphLangGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull GraphLangGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull GraphLangGrammarParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitialization(@NotNull GraphLangGrammarParser.VariableInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#variableInitialization}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitialization(@NotNull GraphLangGrammarParser.VariableInitializationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#functionParametersSection}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParametersSection(@NotNull GraphLangGrammarParser.FunctionParametersSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#functionParametersSection}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParametersSection(@NotNull GraphLangGrammarParser.FunctionParametersSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#terminalStatement}.
	 * @param ctx the parse tree
	 */
	void enterTerminalStatement(@NotNull GraphLangGrammarParser.TerminalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#terminalStatement}.
	 * @param ctx the parse tree
	 */
	void exitTerminalStatement(@NotNull GraphLangGrammarParser.TerminalStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryMultiplication}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryMultiplication(@NotNull GraphLangGrammarParser.StatementBinaryMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryMultiplication}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryMultiplication(@NotNull GraphLangGrammarParser.StatementBinaryMultiplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryComparison}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryComparison(@NotNull GraphLangGrammarParser.StatementBinaryComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryComparison}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryComparison(@NotNull GraphLangGrammarParser.StatementBinaryComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull GraphLangGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull GraphLangGrammarParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryDivision}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryDivision(@NotNull GraphLangGrammarParser.StatementBinaryDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryDivision}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryDivision(@NotNull GraphLangGrammarParser.StatementBinaryDivisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull GraphLangGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull GraphLangGrammarParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBrackets}.
	 * @param ctx the parse tree
	 */
	void enterStatementBrackets(@NotNull GraphLangGrammarParser.StatementBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBrackets}.
	 * @param ctx the parse tree
	 */
	void exitStatementBrackets(@NotNull GraphLangGrammarParser.StatementBracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementCast}.
	 * @param ctx the parse tree
	 */
	void enterStatementCast(@NotNull GraphLangGrammarParser.StatementCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementCast}.
	 * @param ctx the parse tree
	 */
	void exitStatementCast(@NotNull GraphLangGrammarParser.StatementCastContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(@NotNull GraphLangGrammarParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(@NotNull GraphLangGrammarParser.ConditionalOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull GraphLangGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull GraphLangGrammarParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull GraphLangGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull GraphLangGrammarParser.UnaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#switchOperator}.
	 * @param ctx the parse tree
	 */
	void enterSwitchOperator(@NotNull GraphLangGrammarParser.SwitchOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#switchOperator}.
	 * @param ctx the parse tree
	 */
	void exitSwitchOperator(@NotNull GraphLangGrammarParser.SwitchOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementAtom}.
	 * @param ctx the parse tree
	 */
	void enterStatementAtom(@NotNull GraphLangGrammarParser.StatementAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementAtom}.
	 * @param ctx the parse tree
	 */
	void exitStatementAtom(@NotNull GraphLangGrammarParser.StatementAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull GraphLangGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull GraphLangGrammarParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull GraphLangGrammarParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull GraphLangGrammarParser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeader(@NotNull GraphLangGrammarParser.FunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeader(@NotNull GraphLangGrammarParser.FunctionHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#preCondition}.
	 * @param ctx the parse tree
	 */
	void enterPreCondition(@NotNull GraphLangGrammarParser.PreConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#preCondition}.
	 * @param ctx the parse tree
	 */
	void exitPreCondition(@NotNull GraphLangGrammarParser.PreConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#functionArgumentsSection}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgumentsSection(@NotNull GraphLangGrammarParser.FunctionArgumentsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#functionArgumentsSection}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgumentsSection(@NotNull GraphLangGrammarParser.FunctionArgumentsSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterStatementFunctionCall(@NotNull GraphLangGrammarParser.StatementFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitStatementFunctionCall(@NotNull GraphLangGrammarParser.StatementFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void enterWhileCycle(@NotNull GraphLangGrammarParser.WhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void exitWhileCycle(@NotNull GraphLangGrammarParser.WhileCycleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryComparisionEquating}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryComparisionEquating(@NotNull GraphLangGrammarParser.StatementBinaryComparisionEquatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryComparisionEquating}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryComparisionEquating(@NotNull GraphLangGrammarParser.StatementBinaryComparisionEquatingContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#variableDefenition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefenition(@NotNull GraphLangGrammarParser.VariableDefenitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#variableDefenition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefenition(@NotNull GraphLangGrammarParser.VariableDefenitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#untilCycle}.
	 * @param ctx the parse tree
	 */
	void enterUntilCycle(@NotNull GraphLangGrammarParser.UntilCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#untilCycle}.
	 * @param ctx the parse tree
	 */
	void exitUntilCycle(@NotNull GraphLangGrammarParser.UntilCycleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryMinus(@NotNull GraphLangGrammarParser.StatementBinaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryMinus(@NotNull GraphLangGrammarParser.StatementBinaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#statementBinaryPlus}.
	 * @param ctx the parse tree
	 */
	void enterStatementBinaryPlus(@NotNull GraphLangGrammarParser.StatementBinaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#statementBinaryPlus}.
	 * @param ctx the parse tree
	 */
	void exitStatementBinaryPlus(@NotNull GraphLangGrammarParser.StatementBinaryPlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull GraphLangGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull GraphLangGrammarParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#primitiveAtom}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveAtom(@NotNull GraphLangGrammarParser.PrimitiveAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#primitiveAtom}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveAtom(@NotNull GraphLangGrammarParser.PrimitiveAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull GraphLangGrammarParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull GraphLangGrammarParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#ifOperator}.
	 * @param ctx the parse tree
	 */
	void enterIfOperator(@NotNull GraphLangGrammarParser.IfOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#ifOperator}.
	 * @param ctx the parse tree
	 */
	void exitIfOperator(@NotNull GraphLangGrammarParser.IfOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(@NotNull GraphLangGrammarParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(@NotNull GraphLangGrammarParser.ForCycleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(@NotNull GraphLangGrammarParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(@NotNull GraphLangGrammarParser.ForConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#postCondition}.
	 * @param ctx the parse tree
	 */
	void enterPostCondition(@NotNull GraphLangGrammarParser.PostConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#postCondition}.
	 * @param ctx the parse tree
	 */
	void exitPostCondition(@NotNull GraphLangGrammarParser.PostConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#cycleOperator}.
	 * @param ctx the parse tree
	 */
	void enterCycleOperator(@NotNull GraphLangGrammarParser.CycleOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#cycleOperator}.
	 * @param ctx the parse tree
	 */
	void exitCycleOperator(@NotNull GraphLangGrammarParser.CycleOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(@NotNull GraphLangGrammarParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(@NotNull GraphLangGrammarParser.TypeDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull GraphLangGrammarParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull GraphLangGrammarParser.VariableAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull GraphLangGrammarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull GraphLangGrammarParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraphLangGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull GraphLangGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLangGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull GraphLangGrammarParser.VariableContext ctx);
}