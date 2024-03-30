package retain.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {

	private WebDriver driver;

	public InformationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherInfos(String firstName, String lastName, String postalCode) {
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(postalCode);
		driver.findElement(By.id("continue")).click();
	}
}
