package retain.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {

	private WebDriver driver;
	private final String primeiroProduto = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]";
	private final String segundoProduto = "//button[@id=\"add-to-cart-sauce-labs-bike-light\"]";
	private final String terceiroProduto = "//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]";
	private final String quartoProduto = "//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]";
	private final String quintoProduto = "//button[@id=\"add-to-cart-sauce-labs-onesie\"]";
	private final String sextoProduto = "//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]";
	int countProduct = 0;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void adicionarProdutoAoCarrinho (String produto) {
		switch (produto){
			case "primeiro":
				driver.findElement(By.xpath(primeiroProduto)).click();
				this.countProduct++;
				break;
			case "segundo":
				driver.findElement(By.xpath(segundoProduto)).click();
				this.countProduct++;
				break;
			case "terceiro":
				driver.findElement(By.xpath(terceiroProduto)).click();
				this.countProduct++;
				break;
			case "quarto":
				driver.findElement(By.xpath(quartoProduto)).click();
				this.countProduct++;
				break;
			case "quinto":
				driver.findElement(By.xpath(quintoProduto)).click();
				this.countProduct++;
				break;
			case "sexto":
				driver.findElement(By.xpath(sextoProduto)).click();
				this.countProduct++;
				break;
		}
	}

	public void abrirCarrinho() {
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
	}

	public void verificarItemsNoCarrinho() {
		int cont=0;
		List<WebElement> produtos = driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
		for(WebElement produto : produtos){
			if(produto.getText().contains("Sauce Labs Backpack") || produto.getText().contains("Sauce Labs Bike Light") || produto.getText().contains("Sauce Labs Fleece Jacket") || produto.getText().contains("Sauce Labs Onesie") || produto.getText().contains("Sauce Labs Bolt T-Shirt") || produto.getText().contains("Test.allTheThings() T-Shirt (Red)")){
				cont++;
			}
		}
		Assert.assertEquals(this.countProduct,cont);
	}

}
