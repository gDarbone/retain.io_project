package retain.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {

	private WebDriver driver;
	private final String primeiroProduto = "//button[@id=\"remove-sauce-labs-backpack\"]";
	private final String segundoProduto = "//button[@id=\"remove-sauce-labs-bike-light\"]";
	private final String terceiroProduto = "//button[@id=\"remove-sauce-labs-bolt-t-shirt\"]";
	private final String quartoProduto = "//button[@id=\"remove-sauce-labs-fleece-jacket\"]";
	private final String quintoProduto = "//button[@id=\"remove-sauce-labs-onesie\"]";
	private final String sextoProduto = "//button[@id=\"remove-test.allthethings()-t-shirt-(red)\"]";


	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrirCarrinho() {
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
	}


	public void removerProdutoMainPage(String produto) {
		switch (produto){
			case "primeiro":
				driver.findElement(By.xpath(primeiroProduto)).click();
				break;
			case "segundo":
				driver.findElement(By.xpath(segundoProduto)).click();
				break;
			case "terceiro":
				driver.findElement(By.xpath(terceiroProduto)).click();
				break;
			case "quarto":
				driver.findElement(By.xpath(quartoProduto)).click();
				break;
			case "quinto":
				driver.findElement(By.xpath(quintoProduto)).click();
				break;
			case "sexto":
				driver.findElement(By.xpath(sextoProduto)).click();
				break;
		}
	}

	public void validarCarrinhoVazio() {
        Assert.assertFalse(driver.getPageSource().contains("Sauce Labs Backpack") || driver.getPageSource().contains("Sauce Labs Bike Light") || driver.getPageSource().contains( "Sauce Labs Fleece Jacket") || driver.getPageSource().contains( "Sauce Labs Onesie") || driver.getPageSource().contains("Sauce Labs Bolt T-Shirt") || driver.getPageSource().contains("Test.allTheThings() T-Shirt (Red)"));

	}


	public void clicarCheckout() {
		driver.findElement(By.id("checkout")).click();
	}
}
