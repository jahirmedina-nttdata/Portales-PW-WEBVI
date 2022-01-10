package org.medioAmbiente.CAP_F_007.stepdefinition;

        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.When;
        import net.thucydides.core.annotations.Steps;
        import org.medioAmbiente.CAP_F_007.step.CAP_F_007Step;

public class CAP_F_007StepDefinition {

    @Steps
    private CAP_F_007Step CAPF007Step;

    @Given("^CAPF007 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF007 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF007Step.cargarPagina();
    }

    @And("^CAPF007 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF007Step.aceptarCookies();
    }

    @And("^CAPF007 - Ingresar el Nombre de Usuario \"([^\"]*)\"$")
    public void Ingresar_Usuario_en_Login(String xTexto) throws InterruptedException {
        CAPF007Step.escribirNombreDeUsuario(xTexto);
    }

    @And("^CAPF007 - Ingresar la Clave de Usuario \"([^\"]*)\"$")
    public void Ingresar_Clave_en_Login(String xTexto) throws InterruptedException {
        CAPF007Step.escribirClaveDeUsuario(xTexto);
    }

    @And("^CAPF007 - Acceder$")
    public void Acceder_en_Login() throws InterruptedException {
        CAPF007Step.accederLogin();
    }

    @And("^CAPF007 - Cambiar a \"([^\"]*)\" Especifica$")
    public void Redireccionar_a_pagina(String xURL) throws InterruptedException {
        CAPF007Step.redireccionarAUrl(xURL);
    }

    @And("^CAPF007 - Publicar en Facebook$")
    public void Publicar_en_Facebook() throws InterruptedException {
        CAPF007Step.publicarFacebook();
    }

    @And("^CAPF007 - Publicar en Twitter$")
    public void Publicar_en_Twitter() throws InterruptedException {
        CAPF007Step.publicarTwitter();
    }

    @And("^CAPF007 - Publicar en Pinterest$")
    public void Publicar_en_Pinterest() throws InterruptedException {
        CAPF007Step.publicarPinterest();
    }

    @And("^CAPF007 - Publicar en Whatsapp$")
    public void Publicar_en_Whatsapp() throws InterruptedException {
        CAPF007Step.publicarWhatsapp();
    }

    @And("^CAPF007 - Publicar por email$")
    public void Publicar_por_email() throws InterruptedException {
        CAPF007Step.publicarEmail();
    }
}