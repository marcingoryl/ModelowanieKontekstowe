// Generated from /Users/marcin/Desktop/ModelowanieKontekstowe/ModelowanieKontekstowe/src/com/company/CtxM.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link myowngrammarParser#createModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateModel(myowngrammarParser.CreateModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#createParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateParam(myowngrammarParser.CreateParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(myowngrammarParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link myowngrammarParser#assingParamsWithModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingParamsWithModel(myowngrammarParser.AssingParamsWithModelContext ctx);
}