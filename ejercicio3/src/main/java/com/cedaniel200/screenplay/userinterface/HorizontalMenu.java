package com.cedaniel200.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HorizontalMenu {

    public static final Target REGISTER_OPTION = the("register option ")
            .located(By.linkText("REGISTER"));

    public static final Target SIGN_OFF_OPTION = the("sign-off option ")
            .located(By.linkText("SIGN-OFF"));

    public static final Target SIGN_ON_OPTION = the("sign-on option ")
            .located(By.linkText("SIGN-ON"));
}
