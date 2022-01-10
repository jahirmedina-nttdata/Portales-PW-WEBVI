package org.medioAmbiente.CAP_F_028.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_028.step.CAP_F_028Step;

public class CAP_F_028StepDefinition {

    @Steps
    private CAP_F_028Step CAPF028Step;

    @Given("^CAPF028 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF028 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF028Step.cargarPagina();
    }

    @And("^CAPF028 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF028Step.aceptarCookies();
    }

    @And("^CAPF028 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF028Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF028 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF028Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF028 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF028Step.accederLogin();
    }

    @And("^CAPF028 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF028Step.redireccionarAUrl(xURL);
    }

    @And ("^CAPF028 - Clickar en pestaña \"([^\"]*)\"$")
    public void Clickar_en_Pestana(String xTexto) throws InterruptedException {
        CAPF028Step.clickarPestana(xTexto);
    }

    @And ("^CAPF028 - Clickar en \"No te vayas sin...Disfrutar de sus Playas\"")
    public void clickar_en_No_Te_Vayas_Sin() throws InterruptedException {
        CAPF028Step.clickNoTeVayasSin();
    }

}