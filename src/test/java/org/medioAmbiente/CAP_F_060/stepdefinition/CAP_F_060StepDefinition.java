package org.medioAmbiente.CAP_F_060.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_060.step.CAP_F_060Step;

public class CAP_F_060StepDefinition {

    @Steps
    private CAP_F_060Step CAPF060Step;

    @Given("^CAPF060 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF060 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF060Step.cargarPagina();
    }


    @And("^CAPF060 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF060Step.aceptarCookies();
    }

    @And("^CAPF060 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF060Step.limpiarCampos();
    }

    @And("^CAPF060 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF060Step.buscar();

    }

    @And("^CAPF060 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF060Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF060 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF060Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF060 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF060Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF060 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF060Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF060 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF060Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


