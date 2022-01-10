package org.medioAmbiente.CAP_F_021.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_021.step.CAP_F_021Step;

public class CAP_F_021StepDefinition {

    @Steps
    private CAP_F_021Step CAPF021Step;

    @Given("^CAPF021 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF021 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF021Step.cargarPagina();
    }

    @And("^CAPF021 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF021Step.aceptarCookies();
    }

    @And("^CAPF021 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF021Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF021 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF021Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF021 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF021Step.accederLogin();
    }

    @And("^CAPF021 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF021Step.redireccionarAUrl(xURL);
    }

    @And ("^CAPF021 - Clickar en pestaña \"([^\"]*)\"$")
    public void Clickar_en_Pestana(String xTexto) throws InterruptedException {
        CAPF021Step.clickarPestana(xTexto);
    }

    @And ("^CAPF021 - Clickar en Enlace a Reserva Tu Visita$")
    public void Clickar_En_Reserva_Tu_Visita() throws InterruptedException {
        CAPF021Step.clickEnReserva();
    }

}