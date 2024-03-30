package retain.automation.stepDefinition;



import retain.automation.core.SystemSettings;
import retain.automation.pages.LoginPage;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    private LoginPage loginPage;
    private SystemSettings set;


    @Dado("que eu acesse a pagina de teste")
    public void dado_que_eu_acesse_a_pagina_de_teste() {
        set = new SystemSettings();
        loginPage = new LoginPage(getDriver());
    }

    @Quando("eu preencho campo de usuario com {string}")
    public void eu_preencho_campo_de_usuario_com(String user) {
        loginPage.preencherCampoLogin(user);
    }

    @Quando("preencho o campo de senha com {string}")
    public void preencho_o_campo_de_senha_com(String password) {
        loginPage.preencherCampoSenha(password);
    }

    @Quando("clico no botão de logar")
    public void clico_no_botão_de_logar() {
        loginPage.clicarBotaoLogar();
    }
    @Então("O usuario ou senha esta incorreto")
    public void o_usuario_ou_senha_esta_incorreto() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",loginPage.getMensagemUsuarioIncorreto());
        getDriver().quit();
    }

    @Então("O usuario esta bloqueado")
    public void o_usuario_esta_bloqueado() {
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.",loginPage.getMensagemUsuarioIncorreto());
        getDriver().quit();
    }


    public WebDriver getDriver() {
        return SystemSettings.getDriver();
    }
}
