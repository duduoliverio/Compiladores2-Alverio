# Compiladores2-Alverio

Alvaro Pedro Magalhães 587818

Eduardo Oliverio 614033


Repositório destinado à matéria de Construção de Compiladores 2 da Universidade Federal de São Carlos - ENPE 2020/2
A linguagem Alverio foi criada para testes web a partir do Selenium, com orientação do professor Daniel Lucredio. @dlucredio.

---

### Desenvolvimento
O primeiro passo foi esboçar a linguagem Alverio com base no programa criado.
No programa consta os xpaths (referenciar partes de um documento) e o evento que aquela entidade pode executar. E por fim os testcases que são as verificações que devem acontecer após o evento.

```sh
entity Botao {
   xpath: "//button[@class='btn btn-primary']"
   events: click
}

entity SelecaoEmail {
   xpath: "//*[@id='email']"
   events: isSelected
}

entity MensagemErroEmail {
   xpath: "//div[@class='alert alert-danger']"
}

entity MensagemErroSenha {
   xpath: "//div[2][@class='alert alert-danger']"
}

entity Email {
   xpath: "//*[@id='email']"
}

test-case testaBotaoEmail {
   when: Botao.click
   assert: MensagemErroEmail has-content "Email é um campo obrigatório"
}

test-case testaBotaoSenha {
   when: Botao.click
   assert: MensagemErroSenha has-content "Senha é um campo obrigatório"
}

test-case testaSelecaoEmail {
   when: SelecaoEmail.isSelected
   assert: Email has-content ""
}
```

Com isso, foi possível criar a linguagem com a ajuda do ANTLR4.

```sh
grammar Alverio;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING:	'"' ( ~('"') )* '"';
WS: [ \t\n\r]->skip;

program: (entity | testcase)*;

entity: 'entity' name=ID '{'
   'xpath' ':' entityXpath=STRING
   ('events' ':' eventsId+=ID ( ',' eventsId+=ID )*)?
'}';

testcase: 'test-case' name=ID '{'
   'when' ':' condition
   'assert' ':' query
'}';

condition: element=ID '.' event=ID;

query: element=ID assertType;

assertType: 'has-content' content=STRING;
```

Finalizada a criação da linguagem, foi feita a verificação semântica que consta no arquivo Semantico.java
E para finalizar foi criado o gerador, que é possível analisar através do arquivo AlverioGerador.java


### Execução

Para executar a linguagem basta utilizar o seguinte código

```sh
java -jar "\AlverioSintatico\target\AlverioSintatico-0.0.1-SNAPSHOT-jar-with-dependencies.jar" "\AlverioSintatico\programa.txt" ./TestSuite.java
```

O arquivo TesteSuite.java será gerado na pasta em que foi executado o comando.
Ao final da execução será possível ver o seguinte código.
São 3 testes que executam validações distintas de login no site https://seubarriga.wcaquino.me/login

```sh
package br.ufscar.dc.compiladores.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TestSuite{

	@Test
	public void testaBotaoEmail(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Assert.assertEquals("Email é um campo obrigatório", driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		driver.quit();
	}
  
	@Test
	public void testaBotaoSenha(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Assert.assertEquals("Senha é um campo obrigatório", driver.findElement(By.xpath("//div[2][@class='alert alert-danger']")).getText());
		driver.quit();
	}
  
	@Test
	public void testaSelecaoEmail(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");

		driver.findElement(By.xpath("//*[@id='email']")).isSelected();
		Assert.assertEquals("", driver.findElement(By.xpath("//*[@id='email']")).getText());
		driver.quit();
	}
}
```
