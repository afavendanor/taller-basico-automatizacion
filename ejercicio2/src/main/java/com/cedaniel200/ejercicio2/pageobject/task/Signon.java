package com.cedaniel200.ejercicio2.pageobject.task;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.SignonPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Signon {
    @Steps
    SignonPage signonPage;

    @Step("Try login an user")
    public void tryLogin(User user) {
        signonPage.enterIntoUsername(user.getUsername());
        signonPage.enterIntoPassword(user.getPassword());
        signonPage.clickOnLoginButton();
    }
}
