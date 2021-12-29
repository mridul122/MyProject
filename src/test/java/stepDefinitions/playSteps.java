package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SetDef1 {

    @Given("^The login is done$")
    public void the_login_is_done() throws Throwable {

        System.out.println("In home page");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^The user searches a product$")
    public void the_user_searches_a_product() throws Throwable {

        System.out.println("In search page");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^The product should be displayed$")
    public void the_product_should_be_displayed() throws Throwable {
        System.out.println("In product page");
        // Write code here that turns the phrase above into concrete actions

    }


}