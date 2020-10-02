package softAssertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

   static WebDriver driver ;//=new ChromeDriver();


    public static void main(String[] args) throws Exception {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        SoftAssert softAssert = new SoftAssert();


        driver.get("http://demo.guru99.com/test/newtours/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for(WebElement link:links)
        {
            String url=link.getAttribute("href");
            System.out.println("The link text is "+link.getText());

            HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();

            con.setRequestMethod("HEAD");
            con.setConnectTimeout(2000);
            con.connect();
            int resCode = con.getResponseCode();

            System.out.println(resCode);

            softAssert.assertTrue(resCode<100,"Its Fail");




        }
        softAssert.assertAll();

       driver.quit();
    }
}
