package org.medioAmbiente.CAP_F_052.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_052.step.CAP_F_052Step;

public class CAP_F_052StepDefinition {

    @Steps
    private CAP_F_052Step CAPF052Step;

    @Given("^CAPF052 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF052 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF052Step.cargarPagina();
    }


    @And("^CAPF052 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF052Step.aceptarCookies();
    }

    @And("^CAPF052 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF052Step.limpiarCampos();
    }

    @And("^CAPF052 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF052Step.buscar();

    }

    @And("^CAPF052 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF052Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF052 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF052Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF052 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF052Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF052 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF052Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF052 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF052Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


