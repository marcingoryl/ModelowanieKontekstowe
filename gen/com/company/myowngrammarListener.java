// Generated from /Users/marcin/IdeaProjects/Parser/src/com/company/myowngrammar.g4 by ANTLR 4.9.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myowngrammarParser}.
 */
public interface myowngrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(myowngrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(myowngrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(myowngrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(myowngrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(myowngrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(myowngrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#assignatr}.
	 * @param ctx the parse tree
	 */
	void enterAssignatr(myowngrammarParser.AssignatrContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#assignatr}.
	 * @param ctx the parse tree
	 */
	void exitAssignatr(myowngrammarParser.AssignatrContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(myowngrammarParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(myowngrammarParser.CreateContext ctx);
}