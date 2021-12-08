package org.medioAmbiente.CAP_F_061.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_061.step.CAP_F_061Step;

public class CAP_F_061StepDefinition {

    @Steps
    private CAP_F_061Step CAPF061Step;

    @Given("^CAPF061 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF061 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF061Step.cargarPagina();
    }


    @And("^CAPF061 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF061Step.aceptarCookies();
    }

    @And("^CAPF061 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF061Step.limpiarCampos();
    }

    @And("^CAPF061 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF061Step.buscar();

    }

    @And("^CAPF061 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF061Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF061 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF061Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF061 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF061Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF061 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF061Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF061 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF061Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


