package WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManage {


    @Test
    public void runBrowser()
    {

       WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
