package org.medioAmbiente.CAP_F_016.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_016.page.CAP_F_016Page;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_016Step extends ScenarioSteps {

    private CAP_F_016Page CAP_F_016Page;

    private String prntw;
    private String popwnd;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_016Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_016Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_016Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_016Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }

    @Step
    public void clickarPestana(String xTexto) throws InterruptedException {
        CAP_F_016Page.clickPestanas(xTexto);
    }

    @Step
    public void desplazarseATitulo(String xTexto) throws InterruptedException {
        CAP_F_016Page.desplazarATitulo(xTexto);
    }

    @Step
    public void clickCardFigurasDeProteccion(String xTexto) throws InterruptedException {
        CAP_F_016Page.clickCardFigurasDeProteccion(xTexto);
    }

    @Step
    public void clickCardsFichaTecnica(String xTexto) throws InterruptedException {
        CAP_F_016Page.clickCardsFichaTecnica(xTexto);
    }

}