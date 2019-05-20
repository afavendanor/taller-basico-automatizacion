package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerticalMenu extends PageObject {
    @FindBy(linkText = "Flights")
    private WebElement Flights;

    @Step
    public void clickOnFlights() {
        clickOn(Flights);
    }
}
