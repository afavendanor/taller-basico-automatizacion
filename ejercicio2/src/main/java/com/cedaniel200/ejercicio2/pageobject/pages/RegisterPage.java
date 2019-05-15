package com.cedaniel200.ejercicio2.pageobject.pages;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {

    private static final String REGISTER_URL = "http://newtours.demoaut.com/mercuryregister.php";

    @FindBy(id = "email")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;
    @FindBy(name = "register")
    private WebElement buttonRegister;

    public void goToRegister(){
        getDriver().navigate().to(REGISTER_URL);
    }

    public void tryRegister(User user) {
        enter(user.getUsername()).into(username);
        enter(user.getPassword()).into(password);
        enter(user.getPassword()).into(confirmPassword);
        clickOn(buttonRegister);
    }

}
