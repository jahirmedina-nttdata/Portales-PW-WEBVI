package org.medioAmbiente.CAP_F_029.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://www.juntadeandalucia.es/medioambiente/portal/c/portal/login")


public class CAP_F_029Page extends PageObject {

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade txtFieldNombre;

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtFieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div/div/div/section/div/div/div/div/form/fieldset/div[2]/button")
    private WebElementFacade btnAcceder;

    @FindBy(xpath = "//section[@class=\"evr-download\"]//div[@class=\"evr-panel-content__container-out tab-pane\"]//span[@class=\"evr-panel-content__title\"]")
    private WebElementFacade seccionDescargas;

    @FindAll(@FindBy(xpath = "//section[@class=\"evr-download\"]//*//a[@href]"))
    private List<WebElementFacade> btnsDescargasPorFormato;

    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        txtFieldNombre.sendKeys(xTexto);
    }

    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        txtFieldPassword.sendKeys(xTexto);
    }

    public void accederLogin() throws InterruptedException {
        btnAcceder.click();
    }

    public void navegarADescargas() throws InterruptedException {
        Actions actions = new Actions(getDriver());

        actions.moveToElement(seccionDescargas);
        actions.perform();

        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0,300)");
    }

    public void descargarFormato(String entradaTexto) throws InterruptedException {
        for(int ii = 0; ii < btnsDescargasPorFormato.size(); ii ++){
            WebElementFacade currentElement = btnsDescargasPorFormato.get(ii);
            String currentInnerText = currentElement.getAttribute("innerText");

            System.out.println(currentInnerText);

            if(currentInnerText.contains(entradaTexto)){
//                WebElement btnParent = currentElement.findElement(By.xpath("./../../"));
//                btnParent.click();
                currentElement.click();
                break;
            }
        }
    }


}
