// Generated from /Users/marcin/Desktop/ModelowanieKontekstowe/ModelowanieKontekstowe/src/com/company/myowngrammar.g4 by ANTLR 4.9.2
package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link myowngrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class myowngrammarBaseListener implements myowngrammarListener {

	PrintStream fileStream = new PrintStream("Model.java");


	List atributes = new ArrayList();
	String className;

	public myowngrammarBaseListener() throws FileNotFoundException {
		System.setOut(fileStream);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(myowngrammarParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(myowngrammarParser.ProgramContext ctx) {
		System.out.println("\n}");
	}

	@Override
	public void enterCreateEvent(myowngrammarParser.CreateEventContext ctx) {
		System.out.println();
		System.out.println("public void " + ctx.getText() + "() " + " {");
	}

	@Override
	public void exitCreateEvent(myowngrammarParser.CreateEventContext ctx) {
		System.out.println("}");
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(myowngrammarParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(myowngrammarParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCreateModel(myowngrammarParser.CreateModelContext ctx) {
		String value = ctx.NAME().getText();
		className = value;
		System.out.println("class" + " " + value + " {");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCreateModel(myowngrammarParser.CreateModelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCreateParam(myowngrammarParser.CreateParamContext ctx) {
		String variableName = ctx.NAME().getText();
		atributes.add(variableName);
		System.out.println("	" + "String " + variableName + ";");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCreateParam(myowngrammarParser.CreateParamContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssingParamsWithModel(myowngrammarParser.AssingParamsWithModelContext ctx) {
		String atrs = "";
		for(Object s: atributes){
			atrs += "String " + s.toString() + ", ";
		}
		atrs = atrs.substring(0, atrs.length() - 2);

		System.out.println();
		System.out.println("public " + className + "(" + atrs + ")" + "{ ");
		System.out.println();
		for(int i = 0; i<atributes.size(); i++){
			System.out.println("	" + "this." + atributes.get(i) + " = " + atributes.get(i) + ";");
		}
		System.out.println("	}");

		atributes.clear();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssingParamsWithModel(myowngrammarParser.AssingParamsWithModelContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}