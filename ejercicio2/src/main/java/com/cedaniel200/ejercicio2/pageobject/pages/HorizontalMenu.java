package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalMenu extends PageObject {
    @FindBy(linkText = "REGISTER")
    private WebElement register;
    @FindBy(linkText = "SIGN-OFF")
    private WebElement signOff;
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOn;

    @Step
    public void clickOnRegister() {
        clickOn(register);
    }

    @Step
    public void clickOnSignOff() {
        clickOn(signOff);
    }

    @Step
    public void clickOnSignOn() {
        clickOn(signOn);
    }
}
