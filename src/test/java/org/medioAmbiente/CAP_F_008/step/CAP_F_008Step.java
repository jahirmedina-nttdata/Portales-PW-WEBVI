package org.medioAmbiente.CAP_F_008.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_008.page.CAP_F_008Page;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class CAP_F_008Step extends ScenarioSteps {

    private CAP_F_008Page CAP_F_008Page;

    private String prntw;
    private String popwnd;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_008Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_008Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_008Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_008Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }

    @Step
    public void agregarAPasaporte() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,500)");

//        CAP_F_008Page.clickAgregarPasaporte();
        j.executeScript("document.querySelector(\"#portlet_Pasaportemodule_INSTANCE_PasaporteModule > div > div > div > div > button.evr-btn--add-pas\").click()");
    }

    @Step
    public void eliminarDePasaporte() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,500)");

//        CAP_F_008Page.clickEliminarPasaporte();
        j.executeScript("document.querySelector(\"#portlet_Pasaportemodule_INSTANCE_PasaporteModule > div > div > div > div > button.evr-btn--delete-pas\").click()");
    }
}