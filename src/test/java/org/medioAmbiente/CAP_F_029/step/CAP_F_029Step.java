package org.medioAmbiente.CAP_F_029.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_029.page.CAP_F_029Page;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_029Step extends ScenarioSteps {

    private CAP_F_029Page CAP_F_029Page;

    private String prntw;
    private String popwnd;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_029Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_029Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_029Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_029Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }

    @Step
    public void navegarADescargas() throws InterruptedException {
        CAP_F_029Page.navegarADescargas();
    }

    @Step
    public void descargarFormato(String xTexto) throws InterruptedException {
        CAP_F_029Page.descargarFormato(xTexto);
    }

}