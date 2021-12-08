package org.medioAmbiente.CAP_F_005.stepdefinition;

import io.cucumber.java.bs.A;
import org.medioAmbiente.CAP_F_005.step.CAP_F_005Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_005StepDefinition {

    @Steps
    private CAP_F_005Step CAPF005Step;

    @Given("^CAPF005 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF005 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF005Step.cargarPagina();
    }

    @And("^CAPF005 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF005Step.aceptarCookies();
    }

    @And("^CAPF005 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF005Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF005 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF005Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF005 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF005Step.accederLogin();
    }

    @And("^CAPF005 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF005Step.redireccionarAUrl(xURL);
    }


}

