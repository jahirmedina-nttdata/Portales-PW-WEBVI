package org.medioAmbiente.CAP_F_090.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_090.step.CAP_F_090Step;

public class CAP_F_090StepDefinition {

    @Steps
    private CAP_F_090Step CAPF090Step;

    @Given("^CAPF090 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF090 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF090Step.cargarPagina();
    }


    @And("^CAPF090 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF090Step.aceptarCookies();
    }

    @And("^CAPF090 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF090Step.limpiarCampos();
    }

    @And("^CAPF090 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF090Step.buscar();

    }

    @And("^CAPF090 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF090Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF090 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF090Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF090 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF090Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF090 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF090Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF090 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF090Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


