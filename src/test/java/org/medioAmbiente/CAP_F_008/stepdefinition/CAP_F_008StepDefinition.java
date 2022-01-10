package org.medioAmbiente.CAP_F_008.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_008.step.CAP_F_008Step;

public class CAP_F_008StepDefinition {

    @Steps
    private CAP_F_008Step CAPF008Step;

    @Given("^CAPF008 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF008 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF008Step.cargarPagina();
    }

    @And("^CAPF008 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF008Step.aceptarCookies();
    }

    @And("^CAPF008 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF008Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF008 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF008Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF008 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF008Step.accederLogin();
    }

    @And("^CAPF008 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF008Step.redireccionarAUrl(xURL);
    }

    @And("^CAPF008 - Agregar a Pasaporte Ecoturista$")
    public void Agregar_a_Pasaporte() throws InterruptedException {
        CAPF008Step.agregarAPasaporte();
    }

    @And("^CAPF008 - Eliminar de Pasaporte Ecoturista$")
    public void Eliminar_de_Pasaporte() throws InterruptedException {
        CAPF008Step.eliminarDePasaporte();
    }
}