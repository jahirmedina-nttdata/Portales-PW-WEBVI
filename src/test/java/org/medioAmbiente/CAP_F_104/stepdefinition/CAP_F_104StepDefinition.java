package org.medioAmbiente.CAP_F_104.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_104.step.CAP_F_104Step;

public class CAP_F_104StepDefinition {

    @Steps
    private CAP_F_104Step CAPF104Step;

    @Given("^CAPF104 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF104 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF104Step.cargarPagina();
    }


    @And("^CAPF104 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF104Step.aceptarCookies();
    }

    @And("^CAPF104 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF104Step.limpiarCampos();
    }

    @And("^CAPF104 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF104Step.buscar();

    }

    @And("^CAPF104 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF104Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF104 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF104 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF104 - Seleccionar Categorias \"([^\"]*)\"$")
    public void Seleccionar_Categorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownCategorias(entradaTexto);
        }
    }

    @And("^CAPF104 - Seleccionar SubCategorias \"([^\"]*)\"$")
    public void Seleccionar_SubCategorias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownSubCategorias(entradaTexto);
        }
    }

    @And("^CAPF104 - Seleccionar Tipo de Archivo \"([^\"]*)\"$")
    public void Seleccionar_Tipo_de_Archivo(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownTipoArchivo(entradaTexto);
        }
    }

    @And("^CAPF104 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF104 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF104Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


