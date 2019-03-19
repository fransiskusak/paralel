package com.mycompany.elok.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Fransiskus A K on 09/03/2018.
 */
public class ErrorLoginPage extends PageObject {
    @FindBy(className = "error")
    private WebElementFacade textInvalidLogin;

    public WebElementFacade lihatInvalidLogin() {
        return textInvalidLogin;
    }
}
