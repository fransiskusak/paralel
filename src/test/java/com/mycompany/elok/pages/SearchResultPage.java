package com.mycompany.elok.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Fransiskus A K on 08/02/2018.
 */
public class SearchResultPage extends PageObject {
//////////////////////TEMPLATEE////////////////////////////////
    //@FindBy(xpath = "")
    //private WebElementFacade
///////////////////////////////////////////////////////////////


    /////////////////////////ENROLL OPEN/////////////////////////////////////
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div/div[2]/div[1]/h3/a")
    private WebElementFacade tulisanNamaMakul;

    public void klikTulisanNamaMakul() {
        tulisanNamaMakul.click();}


    public WebElementFacade lihatHasilSearchCourse() { return tulisanNamaMakul;}


    ////////////////////////////ENROLLMENT KEY//////////////////////////////////

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div[1]/div[2]/div[2]/h3/a/span[1]")
    private WebElementFacade jarkom;

    public void klikTulisanNamaMakulJarkom() {jarkom.click();}

////////////////////////////////////////////////////////////////////////////////////////

}
