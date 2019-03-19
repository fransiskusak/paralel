package com.mycompany.elok.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 01/05/2018.
 */
public class UserAccountPage extends PageObject {
    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[6]/a/span")
    private WebElementFacade tombolPreferences;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/div/div/div/div[1]/ul/li[2]/a")
    private WebElementFacade tombolChangePassword;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[3]/div[2]/input")
    private WebElementFacade textboxCurrent;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[4]/div[2]/input")
    private WebElementFacade textboxNew;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[1]/div/div[5]/div[2]/input")
    private WebElementFacade textboxNewAgain;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[2]/div/div[1]/div/input[1]")
    private WebElementFacade tombolSaveChange;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    private WebElementFacade labelTersubmit;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/div[1]")
    private WebElementFacade notifikasisukses;

    public void klikPreferences() {tombolPreferences.click();}

    public void klikChangePassword() {tombolChangePassword.click();}

    public void klikCurrent(){textboxCurrent.click();}

    public void ketikCurrent(String currentPassword){textboxCurrent.type(currentPassword);}

    public void klikNew(){textboxNew.click();}

    public void ketikNew(String newPassword){textboxNew.type(newPassword);}

    public void klikNewAgain(){textboxNewAgain.click();}

    public void ketikNewAgain(String newPassAgain){textboxNewAgain.type(newPassAgain);}

    public void klikSaveChanges(){tombolSaveChange.click();}

    public WebElementFacade akanMelihatNotifikasiPenggantianPassword(){return notifikasisukses;}

}
