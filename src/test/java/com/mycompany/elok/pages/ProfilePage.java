package com.mycompany.elok.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 20/03/2018.
 */
public class ProfilePage  extends PageObject {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div/div/section[1]/ul/li[1]/span/a")
    private WebElementFacade tombolEditProfil;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[1]/div[2]/input")
    private WebElementFacade boxFirstnameEdit ;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[2]/div[2]/input")
    private WebElementFacade boxSurnameEdit ;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[3]/div[2]/input")
    private WebElementFacade boxEmailAddressEdit ;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[4]/div[2]/select")
    private WebElementFacade boxEmailDisplayEdit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[4]/div[2]/select/option[2]")
    private WebElementFacade isiSelectboxEmailDisplayEdit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[5]/div[2]/input")
    private WebElementFacade boxCityEdit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[6]/div[2]/select")
    private WebElementFacade boxCountryEdit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[6]/div[2]/select/option[105]")
    private WebElementFacade selectCountryIndonesia;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[7]/div[2]/select")
    private WebElementFacade boxTimezoneEdit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[7]/div[2]/select/option[426]")
    private WebElementFacade selectTimezoneIndonesia;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[8]/div[2]/div/div[1]/div/div[2]/div")
    private WebElementFacade boxDescriptionEdit ;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[6]/div/div[1]/div/input")
    private WebElementFacade tombolUpdateProfile;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[3]/div[2]/span")
    private WebElementFacade emailErrorMessage;

    public void klikTombolEditProfile(){tombolEditProfil.click();}

    public void klikBoxFirstNameEdit(){boxFirstnameEdit.click();}

    public void masukkanBoxFirstName(String firstnameedit){boxFirstnameEdit.type(firstnameedit);}

    public void klikBoxSurnameEdit(){boxSurnameEdit.click();}

    public void masukkanBoxSurname(String surnameedit){boxSurnameEdit.type(surnameedit);}

    public void klikBoxEmailAddressEdit(){boxEmailAddressEdit.click();}

    public void masukkanEmailAddress(String emailaddressedit){boxEmailAddressEdit.type(emailaddressedit);}

    public void klikBoxEmailDisplayEdit(){boxEmailDisplayEdit.click();}

    public void klikIsiSelectboxEmailDisplayEdit(){isiSelectboxEmailDisplayEdit.click();}

    public void klikBoxCityEdit(){boxCityEdit.click();}

    public void masukkanCity(String cityedit){boxCityEdit.type(cityedit);}

    public void klikBoxCountryEdit(){boxCountryEdit.click();}

    public void klikSelectIsiBoxCountry(){selectCountryIndonesia.click();}

    public void klikBoxTimezoneEdit(){boxTimezoneEdit.click();}

    public void klikSelectIsiBoxTimezone(){selectTimezoneIndonesia.click();}

    public void klikBoxDescriptionEdit(){boxDescriptionEdit.click();}

    public void masukkanDescription(String descriptionedit){boxDescriptionEdit.type(descriptionedit);}

    public void klikTombolUpdateProfil(){tombolUpdateProfile.click();}

    public WebElementFacade temukanErorEmail(){return emailErrorMessage;}
}

