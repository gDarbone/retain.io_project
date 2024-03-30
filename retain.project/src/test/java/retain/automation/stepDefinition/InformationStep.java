package retain.automation.stepDefinition;


import retain.automation.core.SystemSettings;
import retain.automation.pages.InformationPage;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;

public class InformationStep {

    private SystemSettings set;

    InformationPage informationPage = new InformationPage(getDriver());


    @E("preencho as minhas informacoes")
    public void preencho_as_minhas_informacoes() {
        informationPage.preencherInfos("Gabriel","Darbone", "12312312");

    }

    public WebDriver getDriver() {
        return SystemSettings.getDriver();
    }
}
