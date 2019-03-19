package com.mycompany.elok.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 20/02/2018.
 */
public class RegisterPage extends PageObject {
    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[1]/div[2]/input")
    private WebElementFacade boxUsername;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[3]/div[2]/div/a[1]/span/span/em")
    private WebElementFacade lockPassword;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[3]/div[2]/div/span/input")
    private WebElementFacade boxPassword;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[1]/div[2]/input")
    private WebElementFacade boxEmail;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[2]/div[2]/input")
    private WebElementFacade boxEmailAgain;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[3]/div[2]/input")
    private WebElementFacade boxFirstName ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[4]/div[2]/input")
    private WebElementFacade boxSurname ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[5]/div[2]/input")
    private WebElementFacade boxCityTown ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[6]/div[2]/select")
    private WebElementFacade dropdownCountry ;

    @FindBy(xpath= ".//*[@id='id_country']")
    private WebElementFacade selectCountry;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[3]/div/div[1]/div/input[1]")
    private WebElementFacade tombolCreateAccount;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[3]/div/div[1]/div/input[2]")
    private WebElementFacade boxCancel;


    @FindBy(xpath ="html/body/div[1]/div[2]/div/div[2]/section/div/div[1]/p[1]")
    private WebElementFacade konfirmasiBerhasil;

//tombol continue html/body/div[1]/div[2]/div/div[2]/section/div/div[2]/form/div/input
// If you continue to have difficulty, contact the site administrator. html/body/div[1]/div[2]/div/div[2]/section/div/div[1]/p[3]
// It contains easy instructions to complete your registration. html/body/div[1]/div[2]/div/div[2]/section/div/div[1]/p[2]
// An email should have been sent to your address at scsc@acscs.com  html/body/div[1]/div[2]/div/div[2]/section/div/div[1]/p[1]

///////////////////////////////////////////////////////////////////////////////////////////////////////

    public void klikTombolUsername() {boxUsername.click();}

    public void masukkanUsername(String username ) {boxUsername.type(username);}

    public void klikLockPassword() {lockPassword.click();}

    public void klikBoxPassword() {boxPassword.click();}

    public void masukkanPassword(String password ) {boxPassword.type(password);}

    public void klikEmail() {boxEmail.click();}

    public void masukkanEmail(String email) {boxEmail.type(email);
    }

    public void klikEmailAgain() {boxEmailAgain.click();}

    public void masukkanEmailAgain(String emailagain ) {boxEmailAgain.type(emailagain);}

    public void klikFirstName() {boxFirstName.click();}

    public void masukkanFirstName(String firstname ) {boxFirstName.type(firstname);}

    public void klikSurename() {boxSurname.click();}

    public void masukkanSurename(String surename ) {boxSurname.type(surename);}

    public void klikCityTown() {boxCityTown.click();}

    public void masukkanCityTown(String citytown ) {boxCityTown.type(citytown);}

    public void klikDropdownCountry() {dropdownCountry.click();}


    public void selectNegara(String Indonesia) {selectCountry.selectByVisibleText(Indonesia);}

    public void klikCreateAccount() {tombolCreateAccount.click();}

    public WebElementFacade akanLihatKonfirmasi() {return konfirmasiBerhasil;}




    //INVALID REGISTER

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[1]/div[2]/span")
    private WebElementFacade erormessageusername;

    public WebElementFacade cekErorUsername(){
        return erormessageusername;}
}
