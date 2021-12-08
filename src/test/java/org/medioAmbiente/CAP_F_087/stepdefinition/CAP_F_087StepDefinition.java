package org.medioAmbiente.CAP_F_087.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_087.step.CAP_F_087Step;

public class CAP_F_087StepDefinition {

    @Steps
    private CAP_F_087Step CAPF087Step;

    @Given("^CAPF087 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF087 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF087Step.cargarPagina();
    }


    @And("^CAPF087 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF087Step.aceptarCookies();
    }

    @And("^CAPF087 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF087Step.limpiarCampos();
    }

    @And("^CAPF087 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF087Step.buscar();

    }

    @And("^CAPF087 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF087Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF087 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF087Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF087 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF087Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF087 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF087Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF087 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF087Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


