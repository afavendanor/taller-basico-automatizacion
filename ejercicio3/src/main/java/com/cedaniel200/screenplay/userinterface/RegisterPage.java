package com.cedaniel200.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class RegisterPage {

    public static final Target USERNAME = the("username field")
            .located(By.id("email"));

    public static final Target PASSWORD = the("password field")
            .located(By.name("password"));

    public static final Target CONFIRM_PASSWORD = the("confirmPassword field")
            .located(By.name("confirmPassword"));

    public static final Target REGISTER = the("register button")
            .located(By.name("register"));
}
