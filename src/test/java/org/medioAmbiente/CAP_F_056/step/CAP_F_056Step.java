package org.medioAmbiente.CAP_F_056.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_056.page.CAP_F_056Page;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_056Step extends ScenarioSteps {

    private CAP_F_056Page CAP_F_056Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_056Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
//
        j.executeScript("window.scrollTo(0,600)");
        CAP_F_056Page.aceptarCookies();

    }

    @Step
    public void limpiarCampos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1400)");

        CAP_F_056Page.clickLimpiarCampos();
    }

    @Step
    public void buscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1500)");

        CAP_F_056Page.clickBuscar();

        j.executeScript("window.scrollTo(0,600)");
        Thread.sleep(5000);
    }

    @Step
    public void escribirBuscarPorPalabras(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,600)");

        CAP_F_056Page.escribirBusquedaPorPalabra(entradaTexto);
    }

    @Step
    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1200)");

        CAP_F_056Page.clickDropDownMenuEspaciosNaturales(entradaTexto);
    }

    @Step
    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1000)");

        CAP_F_056Page.clickDropDownProvincias(entradaTexto);
    }

    @Step
    public void clickdropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1500)");

        CAP_F_056Page.clickDropDownMenuTipoEquipamento(entradaTexto);
    }

    @Step
    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,1300)");

        CAP_F_056Page.clickDropDownMenuNombreEspacioNatural(entradaTexto);
    }
}