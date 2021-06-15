package br.ufscar.dc.compiladores.alverio;

import java.io.IOException;

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
        if(s.hasError) {
        	System.err.println("Teve erro");
        }else {
        	System.out.println("Não teve erro");
        }
    }
	
}
