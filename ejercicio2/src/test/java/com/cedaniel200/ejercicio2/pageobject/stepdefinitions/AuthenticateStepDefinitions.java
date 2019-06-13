package com.cedaniel200.ejercicio2.pageobject.stepdefinitions;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.HomePage;
import com.cedaniel200.ejercicio2.pageobject.pages.HorizontalMenu;
import com.cedaniel200.ejercicio2.pageobject.task.Register;
import com.cedaniel200.ejercicio2.pageobject.task.Signon;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static com.cedaniel200.ejercicio2.pageobject.model.UserBuilder.getUserByDefault;

public class AuthenticateStepDefinitions {

    @Steps
    HomePage homePage;
    @Steps
    HorizontalMenu horizontalMenu;
    @Steps
    Register register;
    @Steps
    Signon signon;

    private User user;

    @Given("^I am in mercury tours$")
    public void iAmInMercuryTours() {
        homePage.goToHome();
        user = getUserByDefault();
        horizontalMenu.clickOnRegister();
        register.tryRegister(user);
        horizontalMenu.clickOnSignOff();
    }

    @When("^I authenticate$")
    public void iAuthenticate() {
        // TODO Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the home page$")
    public void iShouldSeeTheHomePage() {
        // TODO Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
