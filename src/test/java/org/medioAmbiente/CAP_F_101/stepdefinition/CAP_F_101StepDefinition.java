package org.medioAmbiente.CAP_F_101.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_101.step.CAP_F_101Step;

public class CAP_F_101StepDefinition {

    @Steps
    private CAP_F_101Step CAPF101Step;

    @Given("^CAPF101 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF101 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF101Step.cargarPagina();
    }


    @And("^CAPF101 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF101Step.aceptarCookies();
    }

    @And("^CAPF101 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF101Step.limpiarCampos();
    }

    @And("^CAPF101 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF101Step.buscar();

    }

    @And("^CAPF101 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF101Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF101 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF101 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF101 - Seleccionar Categorias \"([^\"]*)\"$")
    public void Seleccionar_Categorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownCategorias(entradaTexto);
        }
    }

    @And("^CAPF101 - Seleccionar SubCategorias \"([^\"]*)\"$")
    public void Seleccionar_SubCategorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownSubCategorias(entradaTexto);
        }
    }

    @And("^CAPF101 - Seleccionar Tipo de Archivo \"([^\"]*)\"$")
    public void Seleccionar_Tipo_de_Archivo(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownTipoArchivo(entradaTexto);
        }
    }

    @And("^CAPF101 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF101 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF101Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


