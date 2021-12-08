package org.medioAmbiente.CAP_F_021.stepdefinition;

import org.medioAmbiente.CAP_F_021.step.CAP_F_021Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_021StepDefinition {

    @Steps
    private CAP_F_021Step CAPF021Step;

    @Given("^CAPF021 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF021 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF021Step.cargarPagina();
    }


    @And("^CAPF021 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF021Step.aceptarCookies();
    }

    @And("^CAPF021 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF021Step.limpiarCampos();
    }

    @And("^CAPF021 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF021Step.buscar();

    }

    @And("^CAPF021 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF021Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF021 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF021Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF021 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF021Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF021 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF021Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF021 - Es Accesible \"([^\"]*)\"$")
    public void Es_Accesible(String entradaTexto) throws InterruptedException {
        if(entradaTexto.equals("si")){
            CAPF021Step.clickCheckBoxAccesible();
        }
    }

    @And("^CAPF021 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF021Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


