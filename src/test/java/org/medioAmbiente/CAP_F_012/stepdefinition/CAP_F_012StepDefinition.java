package org.medioAmbiente.CAP_F_012.stepdefinition;

import org.medioAmbiente.CAP_F_012.step.CAP_F_012Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_012StepDefinition {

    @Steps
    private CAP_F_012Step CAPF012Step;

    @Given("^CAPF012 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF012 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF012Step.cargarPagina();
    }


    @And("^CAPF012 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF012Step.aceptarCookies();
    }

    @And("^CAPF012 - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF012Step.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF012 - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF012Step.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF012 - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF012Step.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF012 - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF012Step.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF012 - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF012Step.clickarBotonBuscar();
    }

    @And("^CAPF012 - Seleccionar Tema Ambiental : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF012Step.seleccionarTemaAmbiental(nmbrTema);
    }
}

