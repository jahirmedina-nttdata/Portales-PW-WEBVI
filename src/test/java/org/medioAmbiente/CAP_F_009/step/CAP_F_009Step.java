package org.medioAmbiente.CAP_F_009.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_009.page.CAP_F_009Page;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;


public class CAP_F_009Step extends ScenarioSteps {

    private CAP_F_009Page CAP_F_009Page;

    private String prntw;
    private String popwnd;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_009Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_009Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_009Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_009Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }

    @Step
    public void agregarAFavoritos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,500)");

//        CAP_F_009Page.clickAgregarFavoritos();
        j.executeScript("document.querySelector(\"#portlet_favoritosmodule_INSTANCE_favoritosModule > div > div > div > div > button.evr-btn--add-fav\").click()");
    }

    @Step
    public void eliminarDeFavoritos() throws InterruptedException {
//        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);

        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollTo(0,500)");

//        CAP_F_009Page.clickEliminarFavoritos();
        j.executeScript("document.querySelector(\"#portlet_favoritosmodule_INSTANCE_favoritosModule > div > div > div > div > button.evr-btn--delete-fav\").click()");
    }
}