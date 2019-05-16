package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightFinderPage extends PageObject {

    @FindBy(name = "tripType")
    private List<WebElement> tripTypes;
    @FindBy(name = "passCount")
    private WebElement passCount;
    // TODO mapea los elementos restantes

    // TODO crear los métodos para interactuar con los elementos de la pagina
}
