package stepDefinitions;

//import Report.ExtentReporting;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.GherkinKeyword;
//import com.aventstack.extentreports.gherkin.model.Feature;
//import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SetpDef //extends ExtentReporting
{
//
//    ExtentReports extent= setextentReporting();;
//    ExtentTest feature;
//    ExtentTest scenario;



    @Given("^The application is open$")
    public void the_application_is_open() throws Throwable {

         //extent = setextentReporting();


//        feature = extent.createTest(Feature.class, "To test the login functionality");
//         scenario = feature.createNode(Scenario.class, "Scenario to test the login functionality");
//        scenario.createNode(new GherkinKeyword("Given"), "The application is open").pass("pass");
//        //scenario.createNode(new GherkinKeyword("When"),"The user populates the credentials").pass("pass");
       // extent.flush();

        System.out.println("Only given");


    }

    @When("^The user populates the credentials$")
    public void the_user_populates_the_credentials() throws Throwable {
         //extent = setextentReporting();

//        //ExtentTest feature = extent.createTest(Feature.class,"login");
//        //ExtentTest scenario= feature.createNode(Scenario.class,"To test the login functionality");
       // scenario.createNode(new GherkinKeyword("When"),"The user populates the credentials").pass("pass");
//        //extent.flush();

        System.out.println("Inside when");
        //System.out.println(System.getProperty("os.name"));//System.getProperty("os.name");
        //extent.flush();


    }

    @Then("^The user should be navigated to the home page$")
    public void the_user_should_be_navigated_to_the_home_page() throws Throwable {
         //extent=setextentReporting();
//
////        ExtentTest feature = extent.createTest(Feature.class,"login");
////        ExtentTest scenario= feature.createNode(Scenario.class,"To test the login functionality");
       // scenario.createNode(new GherkinKeyword("Then"),"The user should be navigated to the home page").pass("pass");
        //extent.flush();


        System.out.println("Inside then");


    }

}
