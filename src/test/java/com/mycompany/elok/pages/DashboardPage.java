package com.mycompany.elok.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 13/11/2017.
 */
@DefaultUrl("https://elok.ugm.ac.id/my/")
public class DashboardPage extends PageObject {


    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/form/input[1]")
    private WebElementFacade textboxSearch;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/form/input[2]")
    private WebElementFacade tombolCari;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[3]/a")
    private WebElementFacade tombolProfil;

    @FindBy(className = "menu-action-text")
    private WebElementFacade tombolGrade;

    ///////////////////////////////MESSAGE////////////////////////////////

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[5]/a/span")
    private WebElementFacade tombolMessages;


    @FindBy(className = "text"
            //"html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div/div/div[2]/div[2]/div[2]/div/span[1]/p"
            )
    private WebElementFacade isiMessages;


    //////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/ul[1]/li[1]/a")
    private WebElementFacade tombolMatakuliah;

    @FindBy(className = "usertext")
    private WebElementFacade labelNama;


    private String label = "usertext";


    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/div/div/div[3]/div/div[1]/form/div/input[1]")
    private WebElementFacade tombolContinue;

    public void klikCountinue(){tombolContinue.click();}

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/aside/div[2]/div[2]/div[1]/div[8]/div[1]/h2/a")
    private WebElementFacade labelListCourseBigdata;

    public WebElementFacade tidakAdaBigData(){return labelListCourseBigdata;}



//////////////////////////////////////////////////////////////////////////


    public void klikboxsearch() {
        textboxSearch.click();
    }

    public void ketikKeywordSearch(String keyword) {
        textboxSearch.type(keyword);
    }

    public void cariCourse() {
        tombolCari.click();
    }

    public WebElement temukanKeyword(){
        WebElement element = getDriver().findElement(By.tagName("Big Data"));
        return element;
    }

//////////////////LIHAT PROFIL//////////////////////////////////////////////////////


    @FindBy(className = "description")
    private WebElementFacade deskripsiProfil;

    public void klikTombolProfil() {tombolProfil.click();}

    public WebElementFacade lihatProfil() {return deskripsiProfil;}

    public void klikTombolGrade() {tombolGrade.click();}

    public void lihatGrade() {

    }

    public void klikTombolMessages() {tombolMessages.click();}

    public WebElementFacade lihatMessages() { return isiMessages;}

    //////////////////////////////////LIHAT SEMUA MATAKULIAH/////////////////////

    public void klikTombolMatakuliah() {tombolMatakuliah.click();}

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div[2]/div/div[1]/div[1]/h3/a")
    private WebElementFacade tombolMOOC;

    public void klikTombolMOOC(){tombolMOOC.click();}


    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div/div/div[2]/div[1]/div[1]/a")
    private WebElementFacade sampleMakulJarkom;

    public WebElementFacade lihatSemuaMatakuliah() { return sampleMakulJarkom;}


    //////////////////////////////////////////////////////////////////////////////////

    public void akanLihatHasilPencarian(){}

    public boolean labelCheck(){
        //setWaitForTimeout(5000);
        //waitFor(ExpectedConditions.presenceOfElementLocated(By.className(this.label)));
        return labelNama.isDisplayed();
    }

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/aside/div[2]/div[2]/div/div[1]/div[1]/h2/a")
    private WebElementFacade labelMakulSedangDiambil;

    public WebElementFacade lihatMakulSedangDiambil(){return labelMakulSedangDiambil;}

}
//
//    public List<String> temukanHasilSearch(){
//        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Big Data')]"));
//        Assert.assertTrue("Text not found!", list.size() > 0);
//        return ;
//    }
//}
