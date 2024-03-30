package retain.automation.stepDefinition;


import retain.automation.core.SystemSettings;
import retain.automation.pages.CartPage;
import retain.automation.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;

public class CartStep {

    private LoginPage loginPage;
    private SystemSettings set;

    CartPage cartPage = new CartPage(getDriver());

    @Dado("clico em remover o {string} produto do carrinho")
    public void clico_em_remover(String produto) throws InterruptedException {
        cartPage.removerProdutoMainPage(produto);
    }


    @Entao("o produto foi removido com sucesso")
    public void o_produto_foi_removido_com_sucesso() {
        cartPage.validarCarrinhoVazio();
    }

    @Dado("clico em checkout")
    public void clico_em_checkout() {
        cartPage.clicarCheckout();
    }



    public WebDriver getDriver() {
        return SystemSettings.getDriver();
    }
}
