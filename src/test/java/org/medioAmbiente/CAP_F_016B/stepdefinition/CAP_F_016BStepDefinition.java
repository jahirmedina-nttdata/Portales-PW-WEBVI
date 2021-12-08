package org.medioAmbiente.CAP_F_016B.stepdefinition;

import org.medioAmbiente.CAP_F_016B.step.CAP_F_016BStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_016BStepDefinition {

    @Steps
    private CAP_F_016BStep CAPF016BStep;

    @Given("^CAPF016B - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF016B - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF016BStep.cargarPagina();
    }


    @And("^CAPF016B - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF016BStep.aceptarCookies();
    }

    @And("^CAPF016B - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF016BStep.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF016B - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF016BStep.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF016B - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF016BStep.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF016B - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF016BStep.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF016B - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF016BStep.clickarBotonBuscar();
    }

    @And("^CAPF016B - Seleccionar Tema : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF016BStep.seleccionarTemaAmbiental(nmbrTema);
    }
}

