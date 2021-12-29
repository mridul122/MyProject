package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class playSteps {
    @Given("^Fresco credentials are available$")
    public void fresco_credentials_are_available() throws Throwable {
        System.out.println("Inside Fresco given");

    }

    @When("^When we login to Fresco$")
    public void when_we_login_to_fresco() throws Throwable {
        System.out.println("Inside Fresco when");

    }

    @Then("^We can access the cucumber course$")
    public void we_can_access_the_cucumber_course() throws Throwable {
        System.out.println("Inside Fresco then");

    }
}