package runnerPackage;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue= {"stepDefinitions"},
        tags={"@IAM-Bulk"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
        //dryRun =true,
        //plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/myreport.html"},
        //plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)


public class RunnerTest {






        @AfterClass
        public static void teardown() {
                Reporter.loadXMLConfig(new File("src/Resources/extent-config.xml"));
                Reporter.setSystemInfo("user", System.getProperty("user.name"));
                Reporter.setSystemInfo("os", "Mac OSX");
                Reporter.setTestRunnerOutput("Sample test runner output message");
        }

}

