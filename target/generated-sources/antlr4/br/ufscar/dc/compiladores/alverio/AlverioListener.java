// Generated from br\u005Cufscar\dc\compiladores\alverio\Alverio.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.alverio;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlverioParser}.
 */
public interface AlverioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlverioParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlverioParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlverioParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlverioParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(AlverioParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(AlverioParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlverioParser#testcase}.
	 * @param ctx the parse tree
	 */
	void enterTestcase(AlverioParser.TestcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#testcase}.
	 * @param ctx the parse tree
	 */
	void exitTestcase(AlverioParser.TestcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlverioParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AlverioParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AlverioParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlverioParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(AlverioParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(AlverioParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlverioParser#assertType}.
	 * @param ctx the parse tree
	 */
	void enterAssertType(AlverioParser.AssertTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlverioParser#assertType}.
	 * @param ctx the parse tree
	 */
	void exitAssertType(AlverioParser.AssertTypeContext ctx);
}