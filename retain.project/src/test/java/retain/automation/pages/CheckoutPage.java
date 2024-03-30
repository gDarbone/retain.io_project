package retain.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	private WebDriver driver;
	Integer tax;

	double valor = 0;
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherInfos(String firstName, String lastName, String postalCode) {
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(postalCode);
	}

	public void validarValor(String produto) {
		switch (produto){
			case "primeiro":
				valor = 29.99;
				break;
			case "segundo":
				valor = 9.99;
				break;
			case "terceiro":
				valor = 15.99;
				break;
			case "quarto":
				valor = 49.99;
				break;
			case "quinto":
				valor = 7.99;
				break;
			case "sexto":
				valor = 15.99;
				break;
		}

		String textoTodoTaxa = driver.findElement(By.xpath("//div[@class=\"summary_tax_label\"]")).getText();
		String valorTaxaString = textoTodoTaxa.substring(6,10);
		Double valorTaxa = Double.valueOf(valorTaxaString);
		Double valorTotalSomado= valorTaxa + valor;
		String textoTodoTotal = driver.findElement(By.xpath("//div[@class=\"summary_total_label\"]")).getText();
		if(textoTodoTotal.length()==13){
			String valorTotalString = textoTodoTotal.substring(8,13);
		}else if(textoTodoTotal.length()==12){
			String valorTotalString = textoTodoTotal.substring(7,12);
		}
		String valorTotalString = textoTodoTotal.substring(8,13);
		Double valorTotal = Double.valueOf(valorTotalString);
		Assert.assertEquals(valorTotalSomado, valorTotal);
	}
}
