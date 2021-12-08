package org.medioAmbiente.CAP_F_016C.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/buscador-videos")


public class CAP_F_016CPage extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_searchTextInput\"]")
    private WebElementFacade txtFieldBuscador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_startDate\"]")
    private WebElementFacade txtDesdeFecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_endDate\"]")
    private WebElementFacade txtHastaFecha;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div[2]/section/div/div/div/div/div/section/div/form/div[2]/div[2]/label")
    private WebElementFacade btnDesplegarBusquedaAvanzada;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div/section/div/div/div/div/div/section/div/form/div[2]/button[1]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div[2]/section/div/div/div/div/div/section/div/form/div[2]/div[2]/div/div[2]/div/div[1]/span")
    private WebElementFacade dropDownTema;

    public void interacturaScrollAceptarCookies() throws InterruptedException {
        scrollAceptarCookies.click();
    }

    public void aceptarCookies() throws InterruptedException {
        btnAceptarCookies.click();
    }

    public void buscarTerminoEnPortales(String txtBusqueda) throws InterruptedException {
        txtFieldBuscador.sendKeys(txtBusqueda + Keys.ENTER);
    }

    public void clickarDesplegarBusquedaAvanzada() throws InterruptedException {
        Thread.sleep(1000);
        btnDesplegarBusquedaAvanzada.click();
    }

    public void escribirDesdeFecha(String txtDesde) throws InterruptedException {
        txtDesdeFecha.sendKeys(txtDesde + Keys.ENTER);
    }

    public void clickarBotonBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void escribirHastaFecha(String txtHasta) throws InterruptedException {
        txtHastaFecha.sendKeys(txtHasta + Keys.ENTER);
    }

    public void clickDropDownTemaAmbiental() throws InterruptedException {
        dropDownTema.click();
    }
}
