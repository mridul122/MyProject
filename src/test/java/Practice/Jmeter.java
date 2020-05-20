package Practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Jmeter {




    @Test
    public void sample()
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.google.co.uk");
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
    }
}


