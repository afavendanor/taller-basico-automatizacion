package com.cedaniel200.ejercicio2.pageobject.stepdefinitions;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.FlightConfirmationPage;
import com.cedaniel200.ejercicio2.pageobject.pages.FlightFinderPage;
import com.cedaniel200.ejercicio2.pageobject.pages.SignonPage;
import com.cedaniel200.ejercicio2.pageobject.pages.RegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static com.cedaniel200.ejercicio2.pageobject.model.UserBuilder.getUserByDefault;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BayFlightStepDefinitions {

    @Steps
    RegisterPage registerPage;
    @Steps
    SignonPage signonPage;
    @Steps
    FlightFinderPage flightFinderPage;
    // TODO agregar los demas page
    @Steps
    FlightConfirmationPage flightConfirmationPage;

    private User user;
    @Before
    public void setup(){
        user = getUserByDefault();
        registerPage.goToRegister();
        registerPage.tryRegister(user);
    }

    @Given("^I authenticate myself$")
    public void authenticate() {
        signonPage.goToLogin();
        signonPage.tryLogin(user);
    }

    @And("^I look for the flight$")
    public void lookForTheFlight() {
        //throw new PendingException();
    }

    @And("^I select the flight$")
    public void selectTheFlight() {
        //throw new PendingException();
    }

    @When("^I buy the flight$")
    public void buyTheFlight() {
        //throw new PendingException();
    }

    @Then("^you should see the Flight Confirmation$")
    public void shouldSeeTheFlightConfirmation() {
        //throw new PendingException();
        assertThat(flightConfirmationPage.isFlightConfirmationVisible(), is(true));
    }

}