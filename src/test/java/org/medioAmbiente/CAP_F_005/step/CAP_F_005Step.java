package org.medioAmbiente.CAP_F_005.step;

import org.medioAmbiente.CAP_F_005.page.CAP_F_005Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;


public class CAP_F_005Step extends ScenarioSteps {

    private CAP_F_005Page CAP_F_005Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_005Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_005Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_005Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_005Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }
}