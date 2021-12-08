package org.medioAmbiente.CAP_F_066.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_066.step.CAP_F_066Step;

public class CAP_F_066StepDefinition {

    @Steps
    private CAP_F_066Step CAPF066Step;

    @Given("^CAPF066 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF066 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF066Step.cargarPagina();
    }


    @And("^CAPF066 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF066Step.aceptarCookies();
    }

    @And("^CAPF066 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF066Step.limpiarCampos();
    }

    @And("^CAPF066 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF066Step.buscar();

    }

    @And("^CAPF066 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF066Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF066 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF066Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF066 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF066Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF066 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF066Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF066 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF066Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


