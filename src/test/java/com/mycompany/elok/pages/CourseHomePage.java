package com.mycompany.elok.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Fransiskus A K on 08/02/2018.
 */


public class CourseHomePage extends PageObject {
    //Enroll
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[2]/div/div/div/input")
    private WebElementFacade tblEnroll;

    //Unenroll

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/aside/div[2]/div[2]/div/ul/li/ul/li/p/a")
    private WebElementFacade tblUnenroll;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/div/div/div[3]/div/div[1]/form/div/input[1]")
    private WebElementFacade tblContinue;

    @FindBy(className = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/aside/div[2]/div[2]")
    private WebElementFacade listMatakuliahBigData;

/////////////////////////ENROLLMENT KEY////////////////////////////////////////

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[2]/div/a[1]/span/span/em")
    private WebElementFacade textboxLockEnrollmentKey;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[2]/div/span/input")
    private WebElementFacade textboxEnrollmentKey;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[2]/div/div/div/input")
    private WebElementFacade tombolEnrollJarkom;

    //Invalid Enroll
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[2]/span")
    private WebElementFacade erorInvalidEnrollKey;

    public WebElementFacade akanLihatErorEnroll(){return erorInvalidEnrollKey;}


    public void klikTextboxEnrollKey(){
        textboxLockEnrollmentKey.click();}

    public void ketikEnrollmentKey(String key){
        textboxEnrollmentKey.type(key);}

    public void klikEnrollMeJarkom(){tombolEnrollJarkom.click();}

/////////////////////////////////////////////////////////////////////////////////

    public void enrollBigData(){tblEnroll.click();}

    public WebElementFacade temukanUnenroll(){ return tblUnenroll;}


    //Unenroll
    public void unenroll(){tblUnenroll.click();}

    public void klikContinue(){tblContinue.click();}

    public WebElementFacade tidakMenemukanListMatakuliah() {return listMatakuliahBigData ;}


}
