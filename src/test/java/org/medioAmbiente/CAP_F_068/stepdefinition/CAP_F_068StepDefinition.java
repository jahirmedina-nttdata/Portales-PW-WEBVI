package org.medioAmbiente.CAP_F_068.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.CAP_F_068.step.CAP_F_068Step;

public class CAP_F_068StepDefinition {

    @Steps
    private CAP_F_068Step CAPF068Step;

    @Given("^CAPF068 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF068 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF068Step.cargarPagina();
    }


    @And("^CAPF068 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF068Step.aceptarCookies();
    }

    @And("^CAPF068 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF068Step.limpiarCampos();
    }

    @And("^CAPF068 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF068Step.buscar();

    }

    @And("^CAPF068 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF068Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF068 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF068Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF068 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF068Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF068 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF068Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF068 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF068Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


