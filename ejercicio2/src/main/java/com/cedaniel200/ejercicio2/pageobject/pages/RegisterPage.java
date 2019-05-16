package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {

    @FindBy(id = "email")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;
    @FindBy(name = "register")
    private WebElement buttonRegister;

    @Step
    public void enterIntoUsername(String username) {
        enter(username).into(this.username);
    }

    @Step("Enter a password")
    public void enterIntoPassword(String password) {
        enter(password).into(this.password);
    }

    @Step("Enter a confirm passwors")
    public void enterIntoConfirmPassword(String confirmPassword) {
        enter(confirmPassword).into(this.confirmPassword);
    }

    @Step
    public void clickOnRegisterButton() {
        clickOn(buttonRegister);
    }

}
