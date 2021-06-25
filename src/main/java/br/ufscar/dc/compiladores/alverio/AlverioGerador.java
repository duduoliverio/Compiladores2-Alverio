package br.ufscar.dc.compiladores.alverio;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.alverio.AlverioParser.EntityContext;
import br.ufscar.dc.compiladores.alverio.AlverioParser.TestcaseContext;

public class AlverioGerador extends AlverioBaseVisitor<Void> {

	public StringBuilder texto = new StringBuilder();
	List<EntityStruct> entityList = new ArrayList<>();

	@Override
	public Void visitTestcase(TestcaseContext ctx) {

		String nomeTestcase = ctx.name.getText();
		texto.append("	@Test\n");
		texto.append("	public void "+nomeTestcase+"(){\n");
		
		EntityStruct esCondition = null;
		EntityStruct esQuery = null;
		
		for(EntityStruct e: entityList) {
			if(e.name.equals(ctx.condition().element.getText())) {
				esCondition = e;
			}
			else if(e.name.equals(ctx.query().element.getText())) {
				esQuery = e;
			}
		}

		texto.append("		System.setProperty(\"webdriver.chrome.driver\", \"C:\\\\Program Files\\\\Drivers\\\\chromedriver.exe\");\n");
		texto.append("		WebDriver driver = new ChromeDriver();\n");
		texto.append("		driver.get(\"https://seubarriga.wcaquino.me/login\");\n\n");
							
		texto.append("		driver.findElement(By.xpath("+esCondition.xpath+"))."+ctx.condition().event.getText()+"();\n");
		
		texto.append("		Assert.assertEquals("+ctx.query().assertType().content.getText()+", driver.findElement(By.xpath("+esQuery.xpath+")).getText());\n");
		texto.append("		driver.quit();\n");
		texto.append("	}\n");
		
		return super.visitTestcase(ctx);
	}

	@Override
	public Void visitEntity(EntityContext ctx) {
		EntityStruct es = new EntityStruct();
		
		es.name = ctx.name.getText();
		for (Token t : ctx.eventsId) {
			es.events.add(t.getText());
		}
		
		es.xpath = ctx.entityXpath.getText();
		entityList.add(es);
		
		return super.visitEntity(ctx);
	}
}
