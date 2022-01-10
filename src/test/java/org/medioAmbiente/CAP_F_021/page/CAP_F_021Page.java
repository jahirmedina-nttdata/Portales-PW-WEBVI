package org.medioAmbiente.CAP_F_021.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://www.juntadeandalucia.es/medioambiente/portal/c/portal/login")


public class CAP_F_021Page extends PageObject {

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade txtFieldNombre;

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtFieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div/div/div/section/div/div/div/div/form/fieldset/div[2]/button")
    private WebElementFacade btnAcceder;

    @FindAll(@FindBy(xpath = "//div[@class=\"scrtabs-tabs-fixed-container\"]//div[@class=\"scrtabs-tabs-movable-container\"]//ul[@class=\"lfr-nav nav nav-tabs \"]//li"))
    private List<WebElementFacade> btnsPestanas;

    @FindBy(xpath = "//a[@href=\"https://www.reservatuvisita.es/\"]")
    private WebElementFacade btnAgendarVisita;

    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        txtFieldNombre.sendKeys(xTexto);
    }

    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        txtFieldPassword.sendKeys(xTexto);
    }

    public void accederLogin() throws InterruptedException {
        btnAcceder.click();
    }

    public void clickPestanas(String entradaTexto) throws InterruptedException {
        for(int ii = 0; ii < btnsPestanas.size(); ii ++){
            WebElementFacade currentElement = btnsPestanas.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickEnReserva() throws InterruptedException {
        btnAgendarVisita.click();
    }


}
