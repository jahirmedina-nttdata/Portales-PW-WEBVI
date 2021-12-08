package org.medioAmbiente.CAP_F_034.stepdefinition;

import org.medioAmbiente.CAP_F_034.step.CAP_F_034Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_034StepDefinition {

    @Steps
    private CAP_F_034Step CAPF034Step;

    @Given("^CAPF034 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF034 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF034Step.cargarPagina();
    }


    @And("^CAPF034 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF034Step.aceptarCookies();
    }

    @And("^CAPF034 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF034Step.limpiarCampos();
    }

    @And("^CAPF034 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF034Step.buscar();

    }

    @And("^CAPF034 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF034Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF034 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF034Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF034 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF034Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF034 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF034Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF034 - Es Accesible \"([^\"]*)\"$")
    public void Es_Accesible(String entradaTexto) throws InterruptedException {
        if(entradaTexto.equals("si")){
            CAPF034Step.clickCheckBoxAccesible();
        }
    }

    @And("^CAPF034 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF034Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


