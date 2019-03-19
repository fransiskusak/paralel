package com.mycompany.elok.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 01/05/2018.
 */

@DefaultUrl("https://elok.ugm.ac.id/course/view.php?id=12")
public class SampleCoursePage extends PageObject {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div/ul/li[1]/div[3]/ul/li[6]/div/div/div[2]/div/a/span")
    private WebElementFacade tombolTugasAwal;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div[2]/div[1]/form/div/input[1]")
    private WebElementFacade tombolAddSubmission;

//add submision html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div[2]/div[1]/form/div/input[1]

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[1]/label")
    private WebElementFacade menuFileSubmission;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/a")
    private WebElementFacade tombolAdd;

    @FindBy(xpath = "html/body/div[5]/div[2]/div/div[2]/div/div[1]/ul/li[2]/a/span")
    private WebElementFacade tombolUploadAFile;

    @FindBy(xpath = "html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/form/div/div[1]/div/input")
    private WebElementFacade tombolBrowse;

    @FindBy(xpath = "html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/button")
    private WebElementFacade tombolUploadThisFile;

    @FindBy(className = "fp-repo-name")
    private WebElementFacade tombolRecentFiles;

    @FindBy(xpath = "html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/div/a/div[1]/div[3]")
    private WebElementFacade fileTerselect;

    @FindBy(xpath = "html/body/div[6]/div[2]/div/div[2]/div/form/div[2]/button[1]")
    private WebElementFacade tombolSelectThisFile;

    @FindBy(xpath = "html/body/div[7]/div[2]/div/div[2]/div/div/button[1]")
    private WebElementFacade tombolOverwrite;

    @FindBy(xpath = "html/body/div[2]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[2]/div/div/div/input[1]")
    private WebElementFacade tombolSaveChanges;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    private WebElementFacade fieldSubmissionStatus;


    public void klikTugasAwal(){tombolTugasAwal.click();}

    public void klikAddSubsmission(){tombolAddSubmission.click();}

    public void klikFileSubmission(){menuFileSubmission.click();}

    public void klikAdd(){tombolAdd.click();}

    public void klikUploadAFile(){tombolUploadAFile.click();}

    public void klikBrowse(){tombolBrowse.sendKeys("H:\\TugasAwal.docx");}

    public void klikUploadThisFile(){tombolUploadThisFile.click();}

    public void klikRecentFile(){tombolRecentFiles.click();}

    public void klikFileTerselect(){fileTerselect.click();}

    public void klikSelectThisFile(){tombolSelectThisFile.click();}

    public void klikOverwrite() {tombolOverwrite.click();}

    public void klikSaveChanges(){tombolSaveChanges.click();}

    public WebElementFacade akanLihatSubmissionStatus(){return fieldSubmissionStatus;}

//    public WebElementFacade lihatMenuFileSubmission(){return menuFileSubmission;}
}