package Seleniums;

import WebDriverManager.WebDriverManage;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class XPathandCSS {
    public static void main(String[] args) throws Exception {

        try {
//            WebDriver driver;
//
//            WebDriverManager.chromedriver().setup();
            HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
//            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            //div[@jscontroller='JGHKP']/input
            System.out.println("The title is "+driver.getTitle());
            driver.findElement(By.xpath("//div[@jscontroller='JGHKP']/input")).sendKeys("India");
            driver.quit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
