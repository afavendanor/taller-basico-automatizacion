package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public void goToHome() {
        getDriver().navigate().to("http://newtours.demoaut.com/");
    }
}
