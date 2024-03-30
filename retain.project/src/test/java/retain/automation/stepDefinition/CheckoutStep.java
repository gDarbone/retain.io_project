package retain.automation.stepDefinition;


import retain.automation.core.SystemSettings;
import retain.automation.pages.CheckoutPage;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;

public class CheckoutStep {

    private SystemSettings set;

    CheckoutPage checkoutPage = new CheckoutPage(getDriver());


    @Entao("finalizo a compra do pedido {string}")
    public void finalizo_a_compra(String pedido) {
        checkoutPage.validarValor(pedido);

    }

    public WebDriver getDriver() {
        return SystemSettings.getDriver();
    }
}
