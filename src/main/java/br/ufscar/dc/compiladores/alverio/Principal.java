package br.ufscar.dc.compiladores.alverio;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufscar.dc.compiladores.alverio.AlverioParser.ProgramContext;

public class Principal {

	public static void main(String[] args) throws IOException {
		CharStream cs = CharStreams.fromFileName(args[0]);
        AlverioLexer lexer = new AlverioLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlverioParser parser = new AlverioParser(tokens);
        ProgramContext tree = parser.program();
        Semantico s = new Semantico();
        s.visitProgram(tree);
//        if(s.hasError) {
//        	System.err.println("Teve erro");
//        }else {
        	File f = new File(args[1]);
        	String className = f.getName().substring(0,f.getName().length()-5);
        	try(PrintWriter pw = new PrintWriter(f)){
        		pw.println("package tests;");
        		pw.println("public class "+className+"{");
        		AlverioGerador ag = new AlverioGerador();
        		ag.visitProgram(tree);
        		pw.append(ag.texto);
        		pw.println("}");
        	}
//        }
  
    }
	
}
