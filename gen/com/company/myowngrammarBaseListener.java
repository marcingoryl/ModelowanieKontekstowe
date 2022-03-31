// Generated from /Users/marcin/IdeaProjects/Parser/src/com/company/myowngrammar.g4 by ANTLR 4.9.2
package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link myowngrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class myowngrammarBaseListener implements myowngrammarListener {

	List atributes = new ArrayList();
	String className;

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
		System.out.println();
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
	@Override public void enterAssign(myowngrammarParser.AssignContext ctx) {
		//String variableName = ctx.ID(0).getText();

		// Get value from variable or number
		String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
				: ctx.NUMBER().getText();
		className = value;
		System.out.println("class" + " " + value + "{");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(myowngrammarParser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignatr(myowngrammarParser.AssignatrContext ctx) {
		String variableName = ctx.ATRNAME().getText();
		atributes.add(variableName);

		System.out.println("	" + "String " + variableName + ";");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignatr(myowngrammarParser.AssignatrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCreate(myowngrammarParser.CreateContext ctx) {
		String atrs = "";

		for(Object s: atributes){
			atrs += "String " + s.toString() + ", ";
		}
		atrs = atrs.substring(0, atrs.length() - 2);

		System.out.println();
		System.out.println(className + "(" + atrs + ")" + "{ ");
		System.out.println();
		for(int i = 0; i<atributes.size(); i++){
			System.out.println("	" + "this." + atributes.get(i) + " = " + atributes.get(i) + ";");
		}
		System.out.println("	}");
		}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCreate(myowngrammarParser.CreateContext ctx) { }

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