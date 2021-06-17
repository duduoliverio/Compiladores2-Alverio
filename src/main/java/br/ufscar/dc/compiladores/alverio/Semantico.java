package br.ufscar.dc.compiladores.alverio;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.alverio.AlverioParser.EntityContext;
import br.ufscar.dc.compiladores.alverio.AlverioParser.TestcaseContext;

public class Semantico extends AlverioBaseVisitor<Void>{

	List<EntityStruct> entityList = new ArrayList<>();
	
	public boolean hasError = false;
	
	@Override
	public Void visitEntity(EntityContext ctx) {
		EntityStruct es = new EntityStruct();
		es.name = ctx.name.getText();
		for(Token t:ctx.eventsId) {
			es.events.add(t.getText());
		}		

		return null;
	}
	
	@Override
	public Void visitTestcase(TestcaseContext ctx) {
		String elementName = ctx.condition().element.getText();
		String eventName = ctx.condition().event.getText();
		if(!entityList.contains(elementName)) {
			System.err.println("Entity "+elementName+" not declared");
			hasError = true;
		}
		
		return null;
	}
	

}
