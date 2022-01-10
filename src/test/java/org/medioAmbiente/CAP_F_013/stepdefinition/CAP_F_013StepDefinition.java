package org.medioAmbiente.CAP_F_013.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_013.step.CAP_F_013Step;

public class CAP_F_013StepDefinition {

    @Steps
    private CAP_F_013Step CAPF013Step;

    @Given("^CAPF013 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF013 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF013Step.cargarPagina();
    }

    @And("^CAPF013 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF013Step.aceptarCookies();
    }

    @And("^CAPF013 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF013Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF013 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF013Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF013 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF013Step.accederLogin();
    }

    @And("^CAPF013 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF013Step.redireccionarAUrl(xURL);
    }

    @And ("^CAPF013 - Clickar en pestaña \"([^\"]*)\"$")
    public void Clickar_en_Pestana(String xTexto) throws InterruptedException {
        CAPF013Step.clickarPestana(xTexto);
    }
    @And ("^CAPF013 - Desplazarse a \"([^\"]*)\"$")
    public void Desplazarse_a_Titulo(String xTexto) throws InterruptedException {
        CAPF013Step.desplazarseATitulo(xTexto);
    }

    @And ("^CAPF013 - Click en Figuras de Proteccion : \"([^\"]*)\"$")
    public void Click_en_Card_Figuras_De_Proteccion(String xTexto) throws InterruptedException {
        CAPF013Step.clickCardFigurasDeProteccion(xTexto);
    }

    @And ("^CAPF013 - Click en Ficha Tecnica : \"([^\"]*)\"$")
    public void Click_en_Card_Ficha_Tecnica(String xTexto) throws InterruptedException {
        CAPF013Step.clickCardsFichaTecnica(xTexto);
    }




}