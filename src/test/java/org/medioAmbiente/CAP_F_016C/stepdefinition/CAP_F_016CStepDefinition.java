package org.medioAmbiente.CAP_F_016C.stepdefinition;

import org.medioAmbiente.CAP_F_016C.step.CAP_F_016CStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_016CStepDefinition {

    @Steps
    private CAP_F_016CStep CAPF016CStep;

    @Given("^CAPF016C - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF016C - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF016CStep.cargarPagina();
    }


    @And("^CAPF016C - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF016CStep.aceptarCookies();
    }

    @And("^CAPF016C - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF016CStep.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF016C - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF016CStep.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF016C - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF016CStep.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF016C - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF016CStep.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF016C - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF016CStep.clickarBotonBuscar();
    }

    @And("^CAPF016C - Seleccionar Tema : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF016CStep.seleccionarTemaAmbiental(nmbrTema);
    }
}

