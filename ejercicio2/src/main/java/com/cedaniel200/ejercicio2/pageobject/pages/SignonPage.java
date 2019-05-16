package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignonPage extends PageObject {

    @FindBy(name = "userName")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "login")
    private WebElement buttonLogin;

    @Step
    public void enterIntoUsername(String username) {
        enter(username).into(this.username);
    }

    @Step("Enter a password")
    public void enterIntoPassword(String password) {
        enter(password).into(this.password);
    }

    @Step
    public void clickOnLoginButton() {
        clickOn(buttonLogin);
    }

}
