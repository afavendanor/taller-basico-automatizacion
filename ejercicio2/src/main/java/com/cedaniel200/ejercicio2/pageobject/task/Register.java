package com.cedaniel200.ejercicio2.pageobject.task;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Register {

    @Steps
    RegisterPage registerPage;

    @Step("Try register an user")
    public void tryRegister(User user) {
        registerPage.enterIntoUsername(user.getUsername());
        registerPage.enterIntoPassword(user.getPassword());
        registerPage.enterIntoConfirmPassword(user.getPassword());
        registerPage.clickOnRegisterButton();
    }
}
