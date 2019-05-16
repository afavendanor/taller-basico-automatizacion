package com.cedaniel200.ejercicio2.pageobject.stepdefinitions;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.*;
import com.cedaniel200.ejercicio2.pageobject.task.Register;
import com.cedaniel200.ejercicio2.pageobject.task.Signon;
import cucumber.api.PendingException;
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
    HomePage homePage;
    @Steps
    HorizontalMenu horizontalMenu;
    @Steps
    VerticalMenu verticalMenu;
    @Steps
    Register register;
    @Steps
    Signon signon;
    @Steps
    FlightFinderPage flightFinderPage;
    // TODO agregar las tasks o pages necesarias
    @Steps
    FlightConfirmationPage flightConfirmationPage;

    private User user;

    @Before
    public void setup(){
        homePage.goToHome();
        user = getUserByDefault();
        horizontalMenu.clickOnRegister();
        register.tryRegister(user);
        horizontalMenu.clickOnSignOff();
    }

    @Given("^I authenticate myself$")
    public void authenticate() {
        horizontalMenu.clickOnSignOn();
        signon.tryLogin(user);
    }

    @And("^I look for the flight$")
    public void lookForTheFlight() {
        verticalMenu.clickOnFlights();
        // TODO terminar la implementación
    }

    @And("^I select the flight$")
    public void selectTheFlight() {
        // TODO Implementar
        throw new PendingException();
    }

    @When("^I buy the flight$")
    public void buyTheFlight() {
        // TODO Implementar
        throw new PendingException();
    }

    @Then("^you should see the Flight Confirmation$")
    public void shouldSeeTheFlightConfirmation() {
        assertThat(flightConfirmationPage.isFlightConfirmationVisible(), is(true));
    }

}