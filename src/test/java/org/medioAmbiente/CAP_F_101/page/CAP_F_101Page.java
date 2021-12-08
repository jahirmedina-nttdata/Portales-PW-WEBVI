package org.medioAmbiente.CAP_F_101.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/publicaciones")


public class CAP_F_101Page extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/fieldset/div/div[1]/div[9]/button[1]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//button[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_searchTextInput\"][@title=\"Buscar\"]")
    private WebElementFacade txtBusquedaPorPalabra;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category0-button\"]")
    private WebElementFacade dropDownMenuProvincias;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category0-menu\"]//li[@class='ui-menu-item']//div"))
    private List<WebElementFacade> dropDownElementsProvincias;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category1-button\"]")
    private WebElementFacade dropDownMenuCategorias;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category1-menu\"]//li[@class='ui-menu-item']//div"))
    private List<WebElementFacade> dropDownElementsCategorias;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_subcategories-button\"]")
    private WebElementFacade dropDownMenuSubCategorias;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_subcategories-menu\"]//li[@class='ui-menu-item']//div"))
    private List<WebElementFacade> dropDownElementsSubCategorias;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category2-button\"]")
    private WebElementFacade dropDownMenuTipoArchivo;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category2-menu\"]//li//div[@role=\"option\"]"))
    private List<WebElementFacade> dropDownElementsTipoArchivo;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category3-button\"]")
    private WebElementFacade dropDownMenuTipoEquipamento;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category3-menu\"]//li//div[@role=\"option\"]"))
    private List<WebElementFacade> dropDownElementsTipoEquipamento;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category4-button\"]")
    private WebElementFacade dropDownMenuEspaciosNaturales;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_category4-menu\"]//li//div[@role=\"option\"]"))
    private List<WebElementFacade> dropDownElementsEspaciosNaturales;

    @FindBy(xpath = "//div[@class=\"form-group input-select-wrapper\"]//span[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_espaciosNaturales-button\"]")
    private WebElementFacade dropDownMenuNombreEspacioNatural;
    //*
    @FindAll(@FindBy(xpath = "//div[@class=\"ui-selectmenu-menu ui-front ui-selectmenu-open\"]//ul[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_espaciosNaturales-menu\"]//li//div"))
    private List<WebElementFacade> dropDownElementsNombreEspacioNatural;

    public void interacturaScrollAceptarCookies() throws InterruptedException {
        scrollAceptarCookies.click();
    }

    public void aceptarCookies() throws InterruptedException {
        for(int i=0; i<10; i++){
            getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
        }
    }

    public void clickLimpiarCampos() throws InterruptedException {
        btnLimpiar.waitUntilClickable();
        btnLimpiar.click();
    }

    public void clickBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void escribirBusquedaPorPalabra(String entradaTexto) throws InterruptedException {
        txtBusquedaPorPalabra.waitUntilClickable();
        txtBusquedaPorPalabra.click();
        txtBusquedaPorPalabra.waitUntilEnabled();
        txtBusquedaPorPalabra.clear();
        txtBusquedaPorPalabra.sendKeys(entradaTexto + Keys.ENTER);
    }

    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        dropDownMenuProvincias.click();

        for(int ii = 0; ii < dropDownElementsProvincias.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsProvincias.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownCategorias(String entradaTexto) throws InterruptedException {
        dropDownMenuCategorias.click();

        for(int ii = 0; ii < dropDownElementsCategorias.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsCategorias.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownSubCategorias(String entradaTexto) throws InterruptedException {
        dropDownMenuSubCategorias.click();

        for(int ii = 0; ii < dropDownElementsSubCategorias.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsSubCategorias.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownTipoArchivo(String entradaTexto) throws InterruptedException {
        dropDownMenuTipoArchivo.click();

        for(int ii = 0; ii < dropDownElementsTipoArchivo.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsTipoArchivo.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        dropDownMenuTipoEquipamento.click();

        for(int ii = 0; ii < dropDownElementsTipoEquipamento.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsTipoEquipamento.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        dropDownMenuEspaciosNaturales.click();

        for(int ii = 0; ii < dropDownElementsEspaciosNaturales.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsEspaciosNaturales.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        dropDownMenuNombreEspacioNatural.click();

        for(int ii = 0; ii < dropDownElementsNombreEspacioNatural.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsNombreEspacioNatural.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

}
