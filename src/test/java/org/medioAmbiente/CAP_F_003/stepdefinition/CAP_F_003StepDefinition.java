package org.medioAmbiente.CAP_F_003.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_003.step.CAP_F_003Step;

public class CAP_F_003StepDefinition {

    @Steps
    private CAP_F_003Step CAPF003Step;

    @Given("^CAPF003 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF003 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF003Step.cargarPagina();
    }

    @And("^CAPF003 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF003Step.aceptarCookies();
    }

    @And("^CAPF003 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF003Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF003 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF003Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF003 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF003Step.accederLogin();
    }

    @And("^CAPF003 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF003Step.redireccionarAUrl(xURL);
    }


}

