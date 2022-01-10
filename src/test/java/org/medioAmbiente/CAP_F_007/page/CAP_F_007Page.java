package org.medioAmbiente.CAP_F_007.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.juntadeandalucia.es/medioambiente/portal/c/portal/login")


public class CAP_F_007Page extends PageObject {

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade txtFieldNombre;

    @FindBy(xpath = "//input[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtFieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div/div/div/section/div/div/div/div/form/fieldset/div[2]/button")
    private WebElementFacade btnAcceder;

    @FindBy(xpath = "//div[@class=\"jssocials-share evr-social-network__jssocials-share\"]")
    private WebElementFacade btnShareDeactivated;

    @FindBy(xpath = "//div[@class=\"jssocials-share evr-social-network__jssocials-share active\"]")
    private WebElementFacade btnShareActivated;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-facebook\"]")
    private WebElementFacade btnShareFacebook;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-twitter\"]")
    private WebElementFacade btnShareTwitter;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-pinterest\"]")
    private WebElementFacade btnSharePinterest;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-whatsapp\"]")
    private WebElementFacade btnShareWhatsapp;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-email\"]")
    private WebElementFacade btnShareEmail;

    public void escribirNombreDeUsuario(String xTexto) throws InterruptedException {
        txtFieldNombre.sendKeys(xTexto);
    }

    public void escribirClaveDeUsuario(String xTexto) throws InterruptedException {
        txtFieldPassword.sendKeys(xTexto);
    }

    public void accederLogin() throws InterruptedException {
        btnAcceder.click();
    }

    public void clickCompartirActivar() throws InterruptedException {
        btnShareDeactivated.click();
    }

    public void clickCompartirDesactivar() throws InterruptedException {
        btnShareActivated.click();
    }

    public void clickCompartirFacebook() throws InterruptedException {
        btnShareFacebook.click();
    }

    public void clickCompartirTwitter() throws InterruptedException {
        btnShareTwitter.click();
    }

    public void clickCompartirPinterest() throws InterruptedException {
        btnSharePinterest.click();
    }

    public void clickCompartirWhatsapp() throws InterruptedException {
        btnShareWhatsapp.click();
    }

    public void clickCompartirEmail() throws InterruptedException {
        btnShareEmail.click();
    }
}
