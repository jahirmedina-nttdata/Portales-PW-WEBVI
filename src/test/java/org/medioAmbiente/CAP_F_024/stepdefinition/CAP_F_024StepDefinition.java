package org.medioAmbiente.CAP_F_024.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_024.step.CAP_F_024Step;

public class CAP_F_024StepDefinition {

    @Steps
    private CAP_F_024Step CAPF024Step;

    @Given("^CAPF024 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF024 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF024Step.cargarPagina();
    }

    @And("^CAPF024 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF024Step.aceptarCookies();
    }

    @And("^CAPF024 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF024Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF024 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF024Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF024 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF024Step.accederLogin();
    }

    @And("^CAPF024 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF024Step.redireccionarAUrl(xURL);
    }

    @And ("^CAPF024 - Clickar en pestaña \"([^\"]*)\"$")
    public void Clickar_en_Pestana(String xTexto) throws InterruptedException {
        CAPF024Step.clickarPestana(xTexto);
    }

    @And ("^CAPF024 - Clickar en Publicacion : \"([^\"]*)\"")
    public void clickar_en_publicacion(String xTexto) throws InterruptedException {
        CAPF024Step.clickEnPublicacion(xTexto);
    }

}