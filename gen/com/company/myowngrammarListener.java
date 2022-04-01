// Generated from /Users/marcin/Desktop/ModelowanieKontekstowe/ModelowanieKontekstowe/src/com/company/myowngrammar.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link myowngrammarParser#createModel}.
	 * @param ctx the parse tree
	 */
	void enterCreateModel(myowngrammarParser.CreateModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#createModel}.
	 * @param ctx the parse tree
	 */
	void exitCreateModel(myowngrammarParser.CreateModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#createParam}.
	 * @param ctx the parse tree
	 */
	void enterCreateParam(myowngrammarParser.CreateParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#createParam}.
	 * @param ctx the parse tree
	 */
	void exitCreateParam(myowngrammarParser.CreateParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(myowngrammarParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(myowngrammarParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link myowngrammarParser#assingParamsWithModel}.
	 * @param ctx the parse tree
	 */
	void enterAssingParamsWithModel(myowngrammarParser.AssingParamsWithModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link myowngrammarParser#assingParamsWithModel}.
	 * @param ctx the parse tree
	 */
	void exitAssingParamsWithModel(myowngrammarParser.AssingParamsWithModelContext ctx);
}