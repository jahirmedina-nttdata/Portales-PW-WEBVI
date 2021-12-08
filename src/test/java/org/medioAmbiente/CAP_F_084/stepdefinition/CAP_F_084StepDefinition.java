package org.medioAmbiente.CAP_F_084.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_084.step.CAP_F_084Step;

public class CAP_F_084StepDefinition {

    @Steps
    private CAP_F_084Step CAPF084Step;

    @Given("^CAPF084 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF084 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF084Step.cargarPagina();
    }


    @And("^CAPF084 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF084Step.aceptarCookies();
    }

    @And("^CAPF084 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF084Step.limpiarCampos();
    }

    @And("^CAPF084 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF084Step.buscar();

    }

    @And("^CAPF084 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF084Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF084 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF084Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF084 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF084Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF084 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF084Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF084 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF084Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


