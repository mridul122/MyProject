package stepDefinitions;
import Practice.RestAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class IAM_Steps  {

     RestAPI restAPI = new RestAPI();


//    public IAM_Steps(RestAPI  restAPI)
//    {
//this.restAPI=restAPI;
//    }

    @Given("^The rest connectivity is proper$")
    public void the_rest_connectivity_is_proper() throws Throwable {
        //throw new PendingException();

    }



    @When("^When we pass the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void when_we_pass_the(String title, String fname, String lname, String uid, String role) throws Throwable {


        restAPI.postRequest(title,fname,lname,uid,role);



    }

    @Then("^Then the we should validate$")
    public void then_the_we_should_validate() throws Throwable {

       // Assert.assertTrue(false);
        restAPI.validateResponse();



    }

    @And("^Provide the \"([^\"]*)\"$")
    public void provide_the_something(int numberofiterations) throws Throwable {

        restAPI.postRequestBulk(numberofiterations);

    }


    @When("^we provide the \"([^\"]*)\" and password$")
    public void we_provide_the_something_and_password(String username) throws Throwable {

        restAPI.IDfedlogin(username);

    }

    @When("^we provide the \"([^\"]*)\"$")
    public void we_provide_the_something(int noofiterations) throws Throwable {

        restAPI.updateBulk(noofiterations);

    }




}
