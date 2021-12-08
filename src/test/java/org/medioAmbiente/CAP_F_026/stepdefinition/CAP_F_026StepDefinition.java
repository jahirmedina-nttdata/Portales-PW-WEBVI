package org.medioAmbiente.CAP_F_026.stepdefinition;

import org.medioAmbiente.CAP_F_026.step.CAP_F_026Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CAP_F_026StepDefinition {

    @Steps
    private CAP_F_026Step CAPF026Step;

    @Given("^CAPF026 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^CAPF026 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        CAPF026Step.cargarPagina();
    }


    @And("^CAPF026 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        CAPF026Step.aceptarCookies();
    }

    @And("^CAPF026 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        CAPF026Step.limpiarCampos();
    }

    @And("^CAPF026 - Buscar$")
    public void Buscar() throws InterruptedException {
        CAPF026Step.buscar();

    }

    @And("^CAPF026 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            CAPF026Step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^CAPF026 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF026Step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^CAPF026 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF026Step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^CAPF026 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF026Step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^CAPF026 - Es Accesible \"([^\"]*)\"$")
    public void Es_Accesible(String entradaTexto) throws InterruptedException {
        if(entradaTexto.equals("si")){
            CAPF026Step.clickCheckBoxAccesible();
        }
    }

    @And("^CAPF026 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            CAPF026Step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


