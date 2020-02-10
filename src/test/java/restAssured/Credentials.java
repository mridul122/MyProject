package restAssured;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class Credentials {


    @BeforeClass
    public void setup()
    {
       // RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA","TestPassword");
        RestAssured.baseURI="http://api.openweathermap.org/data/2.5/weather?q=London";
    }
}
