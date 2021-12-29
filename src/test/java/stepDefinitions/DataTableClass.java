package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

public class DataTableClass {


    @Given("^The following details$")
    public void the_following_details(DataTable dataTable) throws Throwable {
       List<List<String>> mydata=dataTable.asLists(String.class);
       System.out.println(mydata.get(0).get(0));
        System.out.println(mydata.get(1).get(2));


    }

    @When("^This is the game$")
    public void this_is_the_game() throws Throwable {
        //throw new PendingException();
    }



    @Then("^That$")
    public void that() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
