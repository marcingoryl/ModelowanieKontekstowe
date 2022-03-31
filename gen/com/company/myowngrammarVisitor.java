// Generated from /Users/marcin/IdeaProjects/Parser/src/com/company/myowngrammar.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myowngrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myowngrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(myowngrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(myowngrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(myowngrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#assignatr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignatr(myowngrammarParser.AssignatrContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(myowngrammarParser.CreateContext ctx);
}