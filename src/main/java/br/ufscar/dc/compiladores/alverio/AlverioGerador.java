package br.ufscar.dc.compiladores.alverio;

import br.ufscar.dc.compiladores.alverio.AlverioParser.TestcaseContext;

public class AlverioGerador extends AlverioBaseVisitor<Void> {

	public StringBuilder texto = new StringBuilder();

	@Override
	public Void visitTestcase(TestcaseContext ctx) {

		String nomeTestcase = ctx.name.getText();
		texto.append("public void "+nomeTestcase+"(){\n");
		texto.append("}\n");
		return super.visitTestcase(ctx);
	}

}
