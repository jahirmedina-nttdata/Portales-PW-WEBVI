package org.medioAmbiente.CAP_F_075.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_075.step.CAP_F_075Step;

public class CAP_F_075StepDefinition {

    @Steps
    private CAP_F_075Step CAPF075Step;

    @Given("^CAPF075 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF075 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF075Step.cargarPagina();
    }


    @And("^CAPF075 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF075Step.aceptarCookies();
    }

    @And("^CAPF075 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF075Step.limpiarCampos();
    }

    @And("^CAPF075 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF075Step.buscar();

    }

    @And("^CAPF075 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF075Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF075 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF075Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF075 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF075Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF075 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF075Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF075 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF075Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


