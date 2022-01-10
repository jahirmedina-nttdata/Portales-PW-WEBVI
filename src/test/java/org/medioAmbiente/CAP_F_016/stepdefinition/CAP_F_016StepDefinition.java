package org.medioAmbiente.CAP_F_016.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_016.step.CAP_F_016Step;

public class CAP_F_016StepDefinition {

    @Steps
    private CAP_F_016Step CAPF016Step;

    @Given("^CAPF016 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF016 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF016Step.cargarPagina();
    }

    @And("^CAPF016 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF016Step.aceptarCookies();
    }

    @And("^CAPF016 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF016Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF016 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF016Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF016 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF016Step.accederLogin();
    }

    @And("^CAPF016 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF016Step.redireccionarAUrl(xURL);
    }

    @And ("^CAPF016 - Clickar en pestaña \"([^\"]*)\"$")
    public void Clickar_en_Pestana(String xTexto) throws InterruptedException {
        CAPF016Step.clickarPestana(xTexto);
    }
    @And ("^CAPF016 - Desplazarse a \"([^\"]*)\"$")
    public void Desplazarse_a_Titulo(String xTexto) throws InterruptedException {
        CAPF016Step.desplazarseATitulo(xTexto);
    }

    @And ("^CAPF016 - Click en Figuras de Proteccion : \"([^\"]*)\"$")
    public void Click_en_Card_Figuras_De_Proteccion(String xTexto) throws InterruptedException {
        CAPF016Step.clickCardFigurasDeProteccion(xTexto);
    }

    @And ("^CAPF016 - Click en Ficha Tecnica : \"([^\"]*)\"$")
    public void Click_en_Card_Ficha_Tecnica(String xTexto) throws InterruptedException {
        CAPF016Step.clickCardsFichaTecnica(xTexto);
    }

}