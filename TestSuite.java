package br.ufscar.dc.compiladores.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TestSuite{


	@Test
	public void testaBotao(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']").click();
		Assert.assertEquals("Emaial é um campo obrigatório", driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	}

}
