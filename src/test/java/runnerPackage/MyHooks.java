package runnerPackage;

import cucumber.api.java.Before;

public class MyHooks {

    public MyHooks()
    {
        System.out.println("Insde the hooks constructer");
    }

    @Before
    public void setUp()
    {
        System.out.println("setup");
    }
}
