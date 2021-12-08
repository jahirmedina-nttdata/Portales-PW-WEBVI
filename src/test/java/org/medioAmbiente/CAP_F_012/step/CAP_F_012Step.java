package org.medioAmbiente.CAP_F_012.step;

import org.medioAmbiente.CAP_F_012.page.CAP_F_012Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_012Step extends ScenarioSteps {

    private CAP_F_012Page CAP_F_012Page;


    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_012Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @Step
    public void buscarTerminoEnPortales(String txtBusqueda) throws InterruptedException {
        CAP_F_012Page.buscarTerminoEnPortales(txtBusqueda);
    }

    @Step
    public void clickarDesplegarBusquedaAvanzada() throws InterruptedException {
//        JavascriptExecutor j = (JavascriptExecutor)getDriver();
//        j.executeScript("document.querySelector(\"#evr-formFilters > div.evr-form-search__filters > div:nth-child(2) > label\").click()");
        CAP_F_012Page.clickarDesplegarBusquedaAvanzada();
    }

    @Step
    public void escribirDesdeFecha(String txtDesde) throws InterruptedException {
        CAP_F_012Page.escribirDesdeFecha(txtDesde);
    }
    
    @Step
    public void escribirHastaFecha(String txtHasta) throws InterruptedException {
        CAP_F_012Page.escribirHastaFecha(txtHasta);
    }

    @Step
    public void clickarBotonBuscar() throws InterruptedException {
        CAP_F_012Page.clickarBotonBuscar();
    }

    @Step
    public void seleccionarTemaAmbiental(String nmbrTema) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();

        CAP_F_012Page.clickDropDownTemaAmbiental();
        j.executeScript("document.querySelector(\"#ui-id-" + nmbrTema + "\").click()");
    }
}