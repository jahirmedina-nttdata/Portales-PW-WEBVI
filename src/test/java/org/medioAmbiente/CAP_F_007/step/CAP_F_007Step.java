package org.medioAmbiente.CAP_F_007.step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.CAP_F_007.page.CAP_F_007Page;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class CAP_F_007Step extends ScenarioSteps {

    private CAP_F_007Page CAP_F_007Page;

    private String prntw;
    private String popwnd;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_007Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");

    }

    @Step
    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_007Page.escribirNombreDeUsuario(xTexto);
    }

    @Step
    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        CAP_F_007Page.escribirClaveDeUsuario(xTexto);
    }

    @Step
    public void accederLogin() throws InterruptedException {
        CAP_F_007Page.accederLogin();
    }

    @Step
    public void redireccionarAUrl(String xURL) throws InterruptedException {
        getDriver().get(xURL);
    }

    @Step
    public void publicarFacebook() throws InterruptedException {
        CAP_F_007Page.clickCompartirFacebook();

        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Ventana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    @Step
    public void publicarTwitter() throws InterruptedException {
        CAP_F_007Page.clickCompartirTwitter();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Ventana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    @Step
    public void publicarPinterest() throws InterruptedException {
        CAP_F_007Page.clickCompartirActivar();
        CAP_F_007Page.clickCompartirPinterest();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Ventana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        CAP_F_007Page.clickCompartirDesactivar();
    }

    @Step
    public void publicarWhatsapp() throws InterruptedException {
        CAP_F_007Page.clickCompartirActivar();
        CAP_F_007Page.clickCompartirWhatsapp();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Ventana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        CAP_F_007Page.clickCompartirDesactivar();
    }

    @Step
    public void publicarEmail() throws InterruptedException {
        CAP_F_007Page.clickCompartirActivar();
        CAP_F_007Page.clickCompartirEmail();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Ventana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        CAP_F_007Page.clickCompartirDesactivar();
    }
}