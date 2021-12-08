package org.medioAmbiente.CAP_F_008.stepdefinition;

import org.medioAmbiente.CAP_F_008.step.CAP_F_008Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_008StepDefinition {

    @Steps
    private CAP_F_008Step CAPF008Step;

    @Given("^CAPF008 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF008 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF008Step.cargarPagina();
    }


    @And("^CAPF008 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF008Step.aceptarCookies();
    }

}

