package com.mycompany.elok.pages;
import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;
import java.util.List;
import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://www.elok.ugm.ac.id/")
public class HomePage extends PageObject {

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[1]")
    private WebElementFacade boxUsername;

    @FindBy(xpath ="html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[2]" )
    private WebElementFacade boxPassword;

    @FindBy(className = "usertext")
    private WebElementFacade textNamauser;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[3]")
    private WebElementFacade tombolLogin;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[8]/a/span\n")
    private WebElementFacade tblLogout;

    @FindBy(className = "main-heading")
    private WebElementFacade textDiHomepage;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[2]/a[2]")
    private WebElementFacade tombolRegister;

///////////////////////////////////////////////////////////////////////////


    public void klikUsername() {boxUsername.click();}

    public void ketikUsername(String username) {boxUsername.type(username);}

    public void klikPassword() {boxPassword.click();}

    public void ketikPassword(String password) {
        boxPassword.type(password);
    }

    public void ketikInvalidPassword(String invalidpassword) {
        boxPassword.type(invalidpassword);
    }

    public void klikLogin() {tombolLogin.click();}

    public WebElementFacade lihatNama() { return textNamauser;}

    public void klikNama() {textNamauser.click();}

    public void klikLogout() {tblLogout.click();}

    public WebElementFacade lihatTulisan() {
        return textDiHomepage;
    }

    public void klikRegister() {tombolRegister.click();}
}