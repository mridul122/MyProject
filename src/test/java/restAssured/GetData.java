package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GetData extends Credentials {

    @Test
    public void testResponseCode()
    {

        WebDriver driver;
//        int code = RestAssured.given().when().get("/Kolkata").getStatusCode();
//        System.out.println(code);
//
//        String body = RestAssured.given().when().get("/Kolkata").asString();
//        //System.out.println(body);
//
//        JsonPath jsonPath =  new JsonPath((body));
//
//        String FaultId = jsonPath.get("Temperature");
//
//        System.out.println(FaultId);

        //Response res = RestAssured.given().get();//"api.openweathermap.org/data/2.5/weather?q=London");
       // System.out.println(res.prettyPrint());

    RestAssured.given().get().then().assertThat().statusCode(401);





    }


}
