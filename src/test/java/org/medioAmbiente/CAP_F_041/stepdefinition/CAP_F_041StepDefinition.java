package org.medioAmbiente.CAP_F_041.stepdefinition;

import org.medioAmbiente.CAP_F_041.step.CAP_F_041Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_041StepDefinition {

    @Steps
    private CAP_F_041Step CAPF041Step;

    @Given("^CAPF041 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF041 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF041Step.cargarPagina();
    }


    @And("^CAPF041 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF041Step.aceptarCookies();
    }

    @And("^CAPF041 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF041Step.limpiarCampos();
    }

    @And("^CAPF041 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF041Step.buscar();

    }

    @And("^CAPF041 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF041Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF041 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF041Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF041 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF041Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF041 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF041Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF041 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF041Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


