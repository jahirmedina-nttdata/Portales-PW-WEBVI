package org.medioAmbiente.CAP_F_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es//medioambiente/portal/web/guest/landing-page-noticia/-/asset_publisher/XYiggbz580YL/content/la-poblacion-del-lince-en-andalucia-crece-un-10-7-y-alcanza-el-record-de-506-ejemplares/20151?categoryVal=")


public class CAP_F_008Page extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    public void interacturaScrollAceptarCookies() throws InterruptedException {
        scrollAceptarCookies.click();
    }

    public void aceptarCookies() throws InterruptedException {
        btnAceptarCookies.click();
    }
}
