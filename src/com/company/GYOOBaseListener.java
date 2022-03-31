// Generated from /Users/marcin/IdeaProjects/Parser/src/com/company/GYOO.g4 by ANTLR 4.9.2
//package com.company;
//
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * This class provides an empty implementation of {@link GYOOListener},
// * which can be extended to create a listener which only needs to handle a subset
// * of the available methods.
// */
//public class GYOOBaseListener implements GYOOListener {
//
//	private Map<String, Integer> variables;
//
//	public GYOOBaseListener() {
//		variables = new HashMap<>();
//	}
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterProgram(GYOOParser.ProgramContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitProgram(GYOOParser.ProgramContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterStatement(GYOOParser.StatementContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitStatement(GYOOParser.StatementContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterAssign(GYOOParser.AssignContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitAssign(GYOOParser.AssignContext ctx) {
//		String variableName = ctx.ID(0).getText();
//
//		// Get value from variable or number
//		String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//				: ctx.NUMBER().getText();
//
//		// Add variable to map
//		if(ctx.ID().size() > 1)
//			variables.put(variableName, variables.get(value));
//		else
//			variables.put(variableName, Integer.parseInt(value));
//	}
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterPrint(GYOOParser.PrintContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitPrint(GYOOParser.PrintContext ctx) {
//		String output = ctx.ID() == null ? ctx.NUMBER().getText()
//				: variables.get(ctx.ID().getText()).toString();
//		System.out.println(output);
//	}
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterAdd(GYOOParser.AddContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitAdd(GYOOParser.AddContext ctx) {
//		String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//				: ctx.ID(0).getText();
//		int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
//				: Integer.parseInt(ctx.NUMBER().getText());
//
//		variables.put(variableName, variables.get(variableName) + value);
//	}
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterSubstract(GYOOParser.SubstractContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitSubstract(GYOOParser.SubstractContext ctx) {
//		String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//				: ctx.ID(0).getText();
//		int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
//				: Integer.parseInt(ctx.NUMBER().getText());
//
//		variables.put(variableName, variables.get(variableName) - value);
//	}
//
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitTerminal(TerminalNode node) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitErrorNode(ErrorNode node) { }
//}