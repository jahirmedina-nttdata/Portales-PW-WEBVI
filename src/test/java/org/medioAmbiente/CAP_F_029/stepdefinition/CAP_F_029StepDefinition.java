package org.medioAmbiente.CAP_F_029.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_029.step.CAP_F_029Step;

public class CAP_F_029StepDefinition {

    @Steps
    private CAP_F_029Step CAPF029Step;

    @Given("^CAPF029 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF029 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF029Step.cargarPagina();
    }

    @And("^CAPF029 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF029Step.aceptarCookies();
    }

    @And("^CAPF029 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF029Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF029 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF029Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF029 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF029Step.accederLogin();
    }

    @And("^CAPF029 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF029Step.redireccionarAUrl(xURL);
    }

    @And("^CAPF029 - Desplazarse a Descarga$")
    public void navegar_a_descargas() throws InterruptedException {
        CAPF029Step.navegarADescargas();
    }

    @And("^CAPF029 - Descargar Formato : \"([^\"]*)\"$")
    public void descargar_formato(String xTexto) throws InterruptedException {
        CAPF029Step.descargarFormato(xTexto);
    }

}