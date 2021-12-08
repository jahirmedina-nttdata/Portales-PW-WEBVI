package org.medioAmbiente.CAP_F_018.stepdefinition;

import org.medioAmbiente.CAP_F_018.step.CAP_F_018Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_018StepDefinition {

    @Steps
    private CAP_F_018Step CAPF018Step;

    @Given("^CAPF018 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF018 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF018Step.cargarPagina();
    }


    @And("^CAPF018 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF018Step.aceptarCookies();
    }

}

