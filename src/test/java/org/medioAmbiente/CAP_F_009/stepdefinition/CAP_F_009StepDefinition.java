package org.medioAmbiente.CAP_F_009.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_009.step.CAP_F_009Step;

public class CAP_F_009StepDefinition {

    @Steps
    private CAP_F_009Step CAPF009Step;

    @Given("^CAPF009 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF009 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF009Step.cargarPagina();
    }

    @And("^CAPF009 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF009Step.aceptarCookies();
    }

    @And("^CAPF009 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF009Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF009 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF009Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF009 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF009Step.accederLogin();
    }

    @And("^CAPF009 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF009Step.redireccionarAUrl(xURL);
    }

    @And("^CAPF009 - Agregar a Favoritos$")
    public void Agregar_a_Favoritos() throws InterruptedException {
        CAPF009Step.agregarAFavoritos();
    }

    @And("^CAPF009 - Eliminar de Favoritos$")
    public void Eliminar_de_Favoritos() throws InterruptedException {
        CAPF009Step.eliminarDeFavoritos();
    }
}