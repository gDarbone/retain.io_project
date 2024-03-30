package retain.automation.core;


import io.cucumber.java.After;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemSettings {
	
	private static final String URL = "https://www.saucedemo.com/";
	static WebDriver driver;

	public SystemSettings() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
