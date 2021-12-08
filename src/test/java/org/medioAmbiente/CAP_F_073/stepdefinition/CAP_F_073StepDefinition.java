package org.medioAmbiente.CAP_F_073.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_073.step.CAP_F_073Step;

public class CAP_F_073StepDefinition {

    @Steps
    private CAP_F_073Step CAPF073Step;

    @Given("^CAPF073 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF073 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF073Step.cargarPagina();
    }


    @And("^CAPF073 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF073Step.aceptarCookies();
    }

    @And("^CAPF073 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF073Step.limpiarCampos();
    }

    @And("^CAPF073 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF073Step.buscar();

    }

    @And("^CAPF073 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF073Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF073 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF073Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF073 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF073Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF073 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF073Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF073 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF073Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


