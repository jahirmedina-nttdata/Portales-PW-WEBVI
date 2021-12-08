package org.medioAmbiente.CAP_F_013.stepdefinition;

import org.medioAmbiente.CAP_F_013.step.CAP_F_013Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_013StepDefinition {

    @Steps
    private CAP_F_013Step CAPF013Step;

    @Given("^CAPF013 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF013 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF013Step.cargarPagina();
    }


    @And("^CAPF013 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF013Step.aceptarCookies();
    }

    @And("^CAPF013 - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF013Step.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF013 - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF013Step.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF013 - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF013Step.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF013 - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF013Step.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF013 - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF013Step.clickarBotonBuscar();
    }

    @And("^CAPF013 - Seleccionar Tema Ambiental : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF013Step.seleccionarTemaAmbiental(nmbrTema);
    }
}

