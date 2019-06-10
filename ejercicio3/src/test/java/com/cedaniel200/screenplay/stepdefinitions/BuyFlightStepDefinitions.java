package com.cedaniel200.screenplay.stepdefinitions;

import com.cedaniel200.screenplay.tasks.Register;
import com.cedaniel200.screenplay.userinterface.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.screenplay.model.UserBuilder.userDefault;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BuyFlightStepDefinitions {

    private static final String CESAR = "Cesar";
    private HomePage homePage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(CESAR).wasAbleTo(
                Open.browserOn(homePage),
                Register.the(userDefault())
        );
    }

    @Given("^I authenticate myself$")
    public void iAuthenticateMyself() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I look for the flight$")
    public void iLookForTheFlight() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I select the flight$")
    public void iSelectTheFlight() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I buy the flight$")
    public void iBuyTheFlight() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^you should see the Flight Confirmation$")
    public void youShouldSeeTheFlightConfirmation() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
