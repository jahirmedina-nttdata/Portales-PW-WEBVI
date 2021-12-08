package org.medioAmbiente.CAP_F_034.step;

import org.medioAmbiente.CAP_F_034.page.CAP_F_034Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_034Step extends ScenarioSteps {

    private CAP_F_034Page CAP_F_034Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_034Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @Step
    public void limpiarCampos() throws InterruptedException {
        CAP_F_034Page.clickLimpiarCampos();
    }

    @Step
    public void buscar() throws InterruptedException {
        CAP_F_034Page.clickBuscar();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        j.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void escribirBuscarPorPalabras(String entradaTexto) throws InterruptedException {
        CAP_F_034Page.escribirBusquedaPorPalabra(entradaTexto);
    }

    @Step
    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        CAP_F_034Page.clickDropDownMenuEspaciosNaturales(entradaTexto);
    }

    @Step
    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        CAP_F_034Page.clickDropDownProvincias(entradaTexto);
    }

    @Step
    public void clickdropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        CAP_F_034Page.clickDropDownMenuTipoEquipamento(entradaTexto);
    }

    @Step
    public void clickCheckBoxAccesible() throws InterruptedException {
//        CAP_F_021Page.clickCheckBoxAccesible();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#check\").click();");

    }

    @Step
    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        CAP_F_034Page.clickDropDownMenuNombreEspacioNatural(entradaTexto);
    }
}