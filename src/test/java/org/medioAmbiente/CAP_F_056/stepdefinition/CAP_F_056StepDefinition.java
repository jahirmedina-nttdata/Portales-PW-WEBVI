package org.medioAmbiente.CAP_F_056.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_056.step.CAP_F_056Step;

public class CAP_F_056StepDefinition {

    @Steps
    private CAP_F_056Step CAPF056Step;

    @Given("^CAPF056 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF056 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF056Step.cargarPagina();
    }


    @And("^CAPF056 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF056Step.aceptarCookies();
    }

    @And("^CAPF056 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF056Step.limpiarCampos();
    }

    @And("^CAPF056 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF056Step.buscar();

    }

    @And("^CAPF056 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF056Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF056 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF056Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF056 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF056Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF056 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF056Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF056 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF056Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


