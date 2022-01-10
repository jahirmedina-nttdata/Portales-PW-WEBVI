package org.medioAmbiente.CAP_F_003.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.juntadeandalucia.es/medioambiente/portal/c/portal/login")


public class CAP_F_003Page extends PageObject {

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade txtFieldNombre;

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtFieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div/div/div/section/div/div/div/div/form/fieldset/div[2]/button")
    private WebElementFacade btnAcceder;

    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        txtFieldNombre.sendKeys(xTexto);
    }

    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        txtFieldPassword.sendKeys(xTexto);
    }

    public void accederLogin() throws InterruptedException {
        btnAcceder.click();
    }
}
