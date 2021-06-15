// Generated from br\u005Cufscar\dc\compiladores\alverio\Alverio.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.alverio;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlverioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlverioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlverioParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlverioParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlverioParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(AlverioParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlverioParser#testcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestcase(AlverioParser.TestcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlverioParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AlverioParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlverioParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(AlverioParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlverioParser#assertType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertType(AlverioParser.AssertTypeContext ctx);
}