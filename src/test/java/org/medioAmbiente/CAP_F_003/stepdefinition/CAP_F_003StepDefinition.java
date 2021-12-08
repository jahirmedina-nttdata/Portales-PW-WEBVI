package org.medioAmbiente.CAP_F_003.stepdefinition;

import org.medioAmbiente.CAP_F_003.step.CAP_F_003Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_003StepDefinition {

    @Steps
    private CAP_F_003Step CAPF003Step;

    @Given("^CAPF003 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF003 - Se haya cargado el blog$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF003Step.cargarPagina();
    }


    @And("^CAPF003 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF003Step.aceptarCookies();
    }

    @Then("^CAPF003 - Valorar el Post con : \"([^\"]*)\"$$")
    public void Valorar_El_Post(String xValoracion) throws InterruptedException {
        CAPF003Step.valorarContenido(xValoracion);
    }

}

