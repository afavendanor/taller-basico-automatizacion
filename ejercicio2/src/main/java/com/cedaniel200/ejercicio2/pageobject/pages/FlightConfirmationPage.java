package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightConfirmationPage extends PageObject {

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")
    private WebElement flightConfirmation;

    public boolean isFlightConfirmationVisible() {
        return this.flightConfirmation.isDisplayed();
    }
}
