package org.medioAmbiente.CAP_F_049.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_049.step.CAP_F_049Step;

public class CAP_F_049StepDefinition {

    @Steps
    private CAP_F_049Step CAPF049Step;

    @Given("^CAPF049 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF049 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF049Step.cargarPagina();
    }


    @And("^CAPF049 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF049Step.aceptarCookies();
    }

    @And("^CAPF049 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF049Step.limpiarCampos();
    }

    @And("^CAPF049 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF049Step.buscar();

    }

    @And("^CAPF049 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF049Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF049 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF049Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF049 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF049Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF049 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF049Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF049 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF049Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


