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

		File f = new File(args[1]);
		String className = f.getName().substring(0, f.getName().length() - 5);
		try (PrintWriter pw = new PrintWriter(f)) {
			pw.println("package br.ufscar.dc.compiladores.tests;\n");
			pw.println("import org.junit.Assert;");
			pw.println("import org.openqa.selenium.By;");
			pw.println("import org.openqa.selenium.WebDriver;");
			pw.println("import org.openqa.selenium.chrome.ChromeDriver;");
			pw.println("import org.junit.Test;\n");
			pw.println("public class " + className + "{\n");
			pw.println("");
			AlverioGerador ag = new AlverioGerador();
			ag.visitProgram(tree);
			pw.append(ag.texto);
			pw.println("\n}");
		}

	}

}
