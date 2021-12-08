package org.medioAmbiente.CAP_F_015.stepdefinition;

import org.medioAmbiente.CAP_F_015.step.CAP_F_015Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_015StepDefinition {

    @Steps
    private CAP_F_015Step CAPF015Step;

    @Given("^CAPF015 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF015 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF015Step.cargarPagina();
    }


    @And("^CAPF015 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF015Step.aceptarCookies();
    }

    @And("^CAPF015 - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF015Step.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF015 - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF015Step.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF015 - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF015Step.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF015 - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF015Step.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF015 - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF015Step.clickarBotonBuscar();
    }

    @And("^CAPF015 - Seleccionar Tema Ambiental : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF015Step.seleccionarTemaAmbiental(nmbrTema);
    }
}

