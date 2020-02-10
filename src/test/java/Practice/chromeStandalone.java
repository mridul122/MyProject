package Practice;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;
import java.net.URL;

public class chromeStandalone {

    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();


        //URL
        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url,capabilities);

        driver.get("http:www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

    }
}
