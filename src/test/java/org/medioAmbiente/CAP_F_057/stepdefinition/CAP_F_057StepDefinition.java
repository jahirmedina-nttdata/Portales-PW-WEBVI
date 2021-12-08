package org.medioAmbiente.CAP_F_057.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_057.step.CAP_F_057Step;

public class CAP_F_057StepDefinition {

    @Steps
    private CAP_F_057Step CAPF057Step;

    @Given("^CAPF057 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF057 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF057Step.cargarPagina();
    }


    @And("^CAPF057 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF057Step.aceptarCookies();
    }

    @And("^CAPF057 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF057Step.limpiarCampos();
    }

    @And("^CAPF057 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF057Step.buscar();

    }

    @And("^CAPF057 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF057Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF057 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF057Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF057 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF057Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF057 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF057Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF057 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF057Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


