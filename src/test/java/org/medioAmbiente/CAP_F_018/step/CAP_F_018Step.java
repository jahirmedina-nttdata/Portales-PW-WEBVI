package org.medioAmbiente.CAP_F_018.step;

import org.medioAmbiente.CAP_F_018.page.CAP_F_018Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;


public class CAP_F_018Step extends ScenarioSteps {

    private CAP_F_018Page CAP_F_018Page;


    @Step
    public void cargarPagina() throws InterruptedException {
        CAP_F_018Page.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }
}