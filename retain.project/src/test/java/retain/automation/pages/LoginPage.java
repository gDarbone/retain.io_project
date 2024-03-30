package retain.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampoLogin(String user) {
		driver.findElement(By.id("user-name")).sendKeys(user);
	}

	public void preencherCampoSenha(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public String getMensagemUsuarioIncorreto() {
		return driver.findElement(By.xpath("//div[@class=\"error-message-container error\"]")).getText();

	}


	public void clicarBotaoLogar() {
		driver.findElement(By.id("login-button")).click();
	}
}
