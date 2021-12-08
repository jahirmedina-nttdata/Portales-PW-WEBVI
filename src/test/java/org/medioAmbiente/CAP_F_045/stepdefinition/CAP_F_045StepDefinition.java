package org.medioAmbiente.CAP_F_045.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_045.step.CAP_F_045Step;

public class CAP_F_045StepDefinition {

    @Steps
    private CAP_F_045Step CAPF045Step;

    @Given("^CAPF045 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF045 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF045Step.cargarPagina();
    }


    @And("^CAPF045 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF045Step.aceptarCookies();
    }

    @And("^CAPF045 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF045Step.limpiarCampos();
    }

    @And("^CAPF045 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF045Step.buscar();

    }

    @And("^CAPF045 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF045Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF045 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF045Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF045 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF045Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF045 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF045Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF045 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF045Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


