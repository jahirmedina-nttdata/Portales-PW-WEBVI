package org.medioAmbiente.CAP_F_016A.stepdefinition;

import org.medioAmbiente.CAP_F_016A.step.CAP_F_016AStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_016AStepDefinition {

    @Steps
    private CAP_F_016AStep CAPF016AStep;

    @Given("^CAPF016A - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF016A - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF016AStep.cargarPagina();
    }


    @And("^CAPF016A - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF016AStep.aceptarCookies();
    }

    @And("^CAPF016A - Escribir \"([^\"]*)\" y Buscar$")
    public void Escribir_Y_Buscar(String txtBusqueda) throws InterruptedException {
        CAPF016AStep.buscarTerminoEnPortales(txtBusqueda);
    }

    @And("^CAPF016A - Abrir Busqueda Avanzada$")
    public void Abrir_Busqueda_Avanzada() throws InterruptedException {
        CAPF016AStep.clickarDesplegarBusquedaAvanzada();
    }

    @And("^CAPF016A - Escribir Desde Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Desde_Que_Fecha_Buscar(String txtDesde) throws InterruptedException {
        CAPF016AStep.escribirDesdeFecha(txtDesde);
    }

    @And("^CAPF016A - Escribir Hasta Que Fecha Buscar : \"([^\"]*)\"$")
    public void Escribir_Hasta_Que_Fecha_Buscar(String txtHasta) throws InterruptedException {
        CAPF016AStep.escribirHastaFecha(txtHasta);
    }

    @And("^CAPF016A - Retomar Busqueda$")
    public void Retomar_Busqueda() throws InterruptedException {
        CAPF016AStep.clickarBotonBuscar();
    }

    @And("^CAPF016A - Seleccionar Tema : \"([^\"]*)\"$")
    public void Seleccionar_Tema_Ambiental(String nmbrTema) throws InterruptedException {
        CAPF016AStep.seleccionarTemaAmbiental(nmbrTema);
    }
}

