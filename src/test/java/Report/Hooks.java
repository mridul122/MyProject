package Report;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


    @Before
    public void setup()
    {
        //Scenario sc=null;

        System.out.println("Before Scenario");
       // System.out.println(sc.getName());
    }

    @After
    public void teardown()
    {
        System.out.println("After Scenario");
    }
}
