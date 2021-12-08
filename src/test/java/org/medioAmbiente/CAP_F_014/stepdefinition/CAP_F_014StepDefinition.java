package org.medioAmbiente.CAP_F_014.stepdefinition;

import org.medioAmbiente.CAP_F_014.step.CAP_F_014Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_014StepDefinition {

    @Steps
    private CAP_F_014Step CAPF014Step;

    @Given("^CAPF014 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF014 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF014Step.cargarPagina();
    }


    @And("^CAPF014 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF014Step.aceptarCookies();
    }

    @And("^CAPF014 - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF014Step.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF014 - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF014Step.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF014 - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF014Step.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF014 - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF014Step.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF014 - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF014Step.clickarBotonBuscar();
    }

    @And("^CAPF014 - Seleccionar Tema Ambiental : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF014Step.seleccionarTemaAmbiental(nmbrTema);
    }
}

