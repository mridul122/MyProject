package DockerSelenium;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DockerSeleniumFirefox {


    public static void main (String [] args) throws Exception
    {


        DesiredCapabilities cap = DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,cap);
        driver.get("https://www.udemy.com/");
        System.out.println(driver.getTitle());



    }
}
