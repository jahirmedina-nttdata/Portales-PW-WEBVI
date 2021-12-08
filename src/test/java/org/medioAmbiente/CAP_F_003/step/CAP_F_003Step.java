package org.medioAmbiente.CAP_F_003.step;

import org.medioAmbiente.CAP_F_003.page.CAP_F_003Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_003Step extends ScenarioSteps {

    private CAP_F_003Page CAP_F_003Page;

    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_003Page.open();
//        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @Step
    public void valorarContenido(String xValoracion) throws InterruptedException {
        CAP_F_003Page.valorarContenido(xValoracion);
    }
}