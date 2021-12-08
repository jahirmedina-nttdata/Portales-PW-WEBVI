package org.medioAmbiente.CAP_F_066.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/avisos")


public class CAP_F_066Page extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/fieldset/div/div[1]/div[6]/button[1]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//button[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchTextInput\"][@title=\"Buscar\"]")
    private WebElementFacade txtBusquedaPorPalabra;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category0-button\"]")
    private WebElementFacade dropDownMenuProvincias;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category0-menu\"]//li[@class='ui-menu-item']//div"))
    private List<WebElementFacade> dropDownElementsProvincias;
    //*
    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category1-button\"]")
    private WebElementFacade dropDownMenuEspaciosNaturales;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category1-menu\"]//li[@class='ui-menu-item']//div"))
    private List<WebElementFacade> dropDownElementsEspaciosNaturales;

    @FindBy(xpath = "//div[@class=\"form-group input-select-wrapper\"]//span[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_espaciosNaturales-button\"]")
    private WebElementFacade dropDownMenuNombreEspacioNatural;
    //*
    @FindAll(@FindBy(xpath = "//div[@class=\"ui-selectmenu-menu ui-front ui-selectmenu-open\"]//ul[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_espaciosNaturales-menu\"]//li//div"))
    private List<WebElementFacade> dropDownElementsNombreEspacioNatural;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category2-button\"]")
    private WebElementFacade dropDownMenuTipoEquipamento;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category2-menu\"]//li//div[@role=\"option\"]"))
    private List<WebElementFacade> dropDownElementsTipoEquipamento;

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

    public void clickDropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        dropDownMenuTipoEquipamento.click();

        for(int ii = 0; ii < dropDownElementsTipoEquipamento.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsTipoEquipamento.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }

//        dropDownBtnTipoEquipamentoAplicar.click();
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
