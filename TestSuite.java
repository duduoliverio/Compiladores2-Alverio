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
	public void testaTitulo(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");

		driver.findElement(By.xpath("//*[@id='email']")).click();
		Assert.assertEquals("", driver.findElement(By.xpath("//*[@id='email']")).getText());
		driver.quit();
	}

}
