package org.medioAmbiente.CAP_F_107.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_107.step.CAP_F_107Step;

public class CAP_F_107StepDefinition {

    @Steps
    private CAP_F_107Step CAPF107Step;

    @Given("^CAPF107 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF107 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF107Step.cargarPagina();
    }


    @And("^CAPF107 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF107Step.aceptarCookies();
    }

    @And("^CAPF107 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF107Step.limpiarCampos();
    }

    @And("^CAPF107 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF107Step.buscar();

    }

    @And("^CAPF107 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF107Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF107 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF107 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF107 - Seleccionar Categorias \"([^\"]*)\"$")
    public void Seleccionar_Categorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownCategorias(entradaTexto);
        }
    }

    @And("^CAPF107 - Seleccionar SubCategorias \"([^\"]*)\"$")
    public void Seleccionar_SubCategorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownSubCategorias(entradaTexto);
        }
    }

    @And("^CAPF107 - Seleccionar Tipo de Archivo \"([^\"]*)\"$")
    public void Seleccionar_Tipo_de_Archivo(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownTipoArchivo(entradaTexto);
        }
    }

    @And("^CAPF107 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF107 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF107Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


