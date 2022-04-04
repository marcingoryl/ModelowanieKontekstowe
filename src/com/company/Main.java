package com.company;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // args [0] - path to java file to be translated
        CharStream stream = CharStreams.fromFileName("src/com/company/rzeki.txt"); //args[0]

        // Get our lexer
        myowngrammarLexer lexer = new myowngrammarLexer(stream);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        myowngrammarParser parser = new myowngrammarParser(tokens);

        ParseTree parseTree = parser.program();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        myowngrammarBaseListener listener = new myowngrammarBaseListener();
        parseTreeWalker.walk(listener, parseTree);
    }



}
