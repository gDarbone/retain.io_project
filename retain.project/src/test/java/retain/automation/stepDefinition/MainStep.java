package retain.automation.stepDefinition;


import retain.automation.core.SystemSettings;

import retain.automation.pages.MainPage;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class MainStep {

    MainPage mainPage = new MainPage(getDriver());

    @Então("O login foi feito com sucesso")
    public void o_login_foi_feito_com_sucesso() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",getDriver().getCurrentUrl());
    }

    @Dado("que eu adiciono o {string} produto ao carrinho")
    public void que_eu_adiciono_um_produto_ao_carrinho(String produto)  {
        mainPage.adicionarProdutoAoCarrinho(produto);
    }


    @Dado("clico no carrinho")
    public void clico_no_carrinho() {
        mainPage.abrirCarrinho();
    }

    @Entao("o produto foi adicionada com sucesso")
    public void o_produto_foi_adicionada_com_sucesso() {
        mainPage.verificarItemsNoCarrinho();
    }



    @After
    public void closeDriver(){
        SystemSettings.getDriver().quit();
    }

    public WebDriver getDriver() {
        return SystemSettings.getDriver();
    }
}
