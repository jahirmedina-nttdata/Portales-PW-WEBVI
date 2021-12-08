package org.medioAmbiente.CAP_F_052.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_052.page.CAP_F_052Page;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_052Step extends ScenarioSteps {

    private CAP_F_052Page CAP_F_041Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_041Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
//
        j.executeScript("window.scrollTo(0,0)");
        CAP_F_041Page.aceptarCookies();

    }

    @Step
    public void limpiarCampos() throws InterruptedException {
        CAP_F_041Page.clickLimpiarCampos();
    }

    @Step
    public void buscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,600)");

        CAP_F_041Page.clickBuscar();

        j.executeScript("window.scrollTo(0,100)");
        Thread.sleep(5000);
    }

    @Step
    public void escribirBuscarPorPalabras(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,100)");

        CAP_F_041Page.escribirBusquedaPorPalabra(entradaTexto);
    }

    @Step
    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,300)");

        CAP_F_041Page.clickDropDownMenuEspaciosNaturales(entradaTexto);
    }

    @Step
    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,200)");

        CAP_F_041Page.clickDropDownProvincias(entradaTexto);
    }

    @Step
    public void clickdropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,500)");

        CAP_F_041Page.clickDropDownMenuTipoEquipamento(entradaTexto);
    }

    @Step
    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        CAP_F_041Page.clickDropDownMenuNombreEspacioNatural(entradaTexto);
    }
}