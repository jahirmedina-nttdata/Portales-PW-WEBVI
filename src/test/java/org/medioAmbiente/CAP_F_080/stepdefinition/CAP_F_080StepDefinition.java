package org.medioAmbiente.CAP_F_080.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_080.step.CAP_F_080Step;

public class CAP_F_080StepDefinition {

    @Steps
    private CAP_F_080Step CAPF080Step;

    @Given("^CAPF080 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF080 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF080Step.cargarPagina();
    }


    @And("^CAPF080 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF080Step.aceptarCookies();
    }

    @And("^CAPF080 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF080Step.limpiarCampos();
    }

    @And("^CAPF080 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF080Step.buscar();

    }

    @And("^CAPF080 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF080Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF080 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF080Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF080 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF080Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF080 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF080Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF080 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF080Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


