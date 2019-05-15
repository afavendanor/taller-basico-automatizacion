package com.cedaniel200.ejercicio2.pageobject.pages;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignonPage extends PageObject {

    private static final String LOGIN_URL = "http://newtours.demoaut.com/mercurysignon.php";

    @FindBy(name = "userName")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "login")
    private WebElement buttonLogin;

    public void tryLogin(User user) {
        enter(user.getUsername()).into(username);
        enter(user.getPassword()).into(password);
        clickOn(buttonLogin);
    }

    public void goToLogin() {
        openUrl(LOGIN_URL);
    }
}
