package com.utest.stepDefinitions;

import com.utest.task.UserRegisterTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserRegisterStepDefinition {

    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }
    @Given("^The user accesses the homepage$")
    public void theUserAccessesTheHomepage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com"));
    }

    @When("^The user fills in all the fields of the registration form$")
    public void theUserFillsInAllTheFieldsOfTheRegistrationForm() {
        theActorInTheSpotlight().attemptsTo(UserRegisterTask.instrumentdClass());
    }

    @Then("^User registration ends when the configuration setup button appears$")
    public void userRegistrationEndsWhenTheConfigurationSetupButtonAppears() {
    }
}
