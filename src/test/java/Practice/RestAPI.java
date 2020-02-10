package Practice;

import Utils.Utils;
import com.mysql.cj.x.protobuf.Mysqlx;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.util.HashMap;
import java.util.Random;

public class RestAPI extends Logging {

    Response response;
    RequestSpecification req;
    //Logger logger = Logger.getLogger("Logging");


    public void postRequest(String title, String fname, String lname, String uid, String role) throws Exception {
       // PropertyConfigurator.configure("Log4j.properties");

        //Utils utils = new Utils();

        RestAssured.baseURI = Utils.getValue("URL_UserSync");
        //logger.info("The url is https://www.awscmg-dev.dwpcloud.uk");
        req = RestAssured.given();//.auth().basic();
        req.header("Content-Type", "application/json");
        req.body(JsonBodyforSyncUser(title, fname, lname, uid, role).toJSONString());
        response = req.post();


    }

    public void postRequestBulk(int noofIterations) throws Exception {

        int coun = new Random().nextInt(9000000);
        String counter = Integer.toString(coun);


        for (int i = 1; i <= noofIterations; i++) {
            String uid = counter + i;
            System.out.println("The emp_id is  " + uid);
            String fname = "Foo" + uid;
            //System.out.println("The first name is  " + fname);
            postRequest("Mr", fname, "Bar", uid, "CofC");

        }



    }

    public JSONObject JsonBodyforSyncUser(String title, String fname, String lname, String uid, String role) throws Exception {
        JSONObject jobj = new JSONObject();
        jobj.put("title", title);
        jobj.put("fname", fname);
        jobj.put("lname", lname);
        jobj.put("uid", uid);
        jobj.put("role", role);

        return jobj;


    }


    public void IDfedlogin(String name) {
        RestAssured.baseURI = "https://www.awscmg-dev.dwpcloud.uk/iiam/idfedgw/auth/login/siebel/";
        req = RestAssured.given();
        req.header("Content-Type", "application/json");
        req.body(JsonBodyforLogin(name).toJSONString());

        response = req.post();

    }

    public JSONObject JsonBodyforLogin(String userid) {
        JSONObject jobj = new JSONObject();

        jobj.put("name", userid);
        jobj.put("password", "password123");
        return jobj;
    }


    public void validateResponse() {

        System.out.println(response.then().extract().response().toString());
        try {
            response.then().assertThat().statusCode(200);
        } catch (Error e) {
            //System.out.println("In catch");
            response.then().assertThat().statusCode(302);
        }


    }


    public void checkRestConnectivity()
    {
        RestAssured.baseURI = "https://kafka-restproxy.service.awscmg-dev.dwpcloud.uk/test";
        req=RestAssured.given();
        response=req.when().get("/topics");
        validateResponse();

    }


    public void updateBulk(int noifiterations) throws  Exception
    {
       // String counter = Integer.toString(noifiterations);

        for (int i=6;i<=noifiterations;i++) {
            postRequest("Miss", "Fname3", "LasName"+i, "3005201" + i, "CofC");
        }

    }



}

