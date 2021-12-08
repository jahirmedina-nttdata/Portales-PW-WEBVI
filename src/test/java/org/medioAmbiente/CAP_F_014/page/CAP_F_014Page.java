package org.medioAmbiente.CAP_F_014.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/agenda")


public class CAP_F_014Page extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade txtFieldBuscador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_startDate\"]")
    private WebElementFacade txtDesdeFecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_endDate\"]")
    private WebElementFacade txtHastaFecha;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div/section/div/div/div/div/div/section/div/form/div[2]/div[2]/label")
    private WebElementFacade btnDesplegarBusquedaAvanzada;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div/section/div/div/div/div/div/section/div/form/div[2]/button[1]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div/div/section/div/div/div/div/div/section/div/form/div[2]/div[2]/div/div[2]/div/div[1]/span")
    private WebElementFacade dropDownTemaAmbiental;

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
        dropDownTemaAmbiental.click();
    }
}
