package br.ufscar.dc.compiladores.alverio;

import java.util.ArrayList;
import java.util.List;

import br.ufscar.dc.compiladores.alverio.AlverioParser.EntityContext;
import br.ufscar.dc.compiladores.alverio.AlverioParser.TestcaseContext;

public class Semantico extends AlverioBaseVisitor<Void>{

	List<String> entityList = new ArrayList<>();
	public boolean hasError = false;
	
	@Override
	public Void visitEntity(EntityContext ctx) {
		entityList.add(ctx.entityId.getText());
		
		return null;
	}
	
	@Override
	public Void visitTestcase(TestcaseContext ctx) {
		String elementName = ctx.condition().element.getText();
		if(!entityList.contains(elementName)) {
			System.err.println("Entity "+elementName+" not declared");
			hasError = true;
		}
		return null;
	}
}
