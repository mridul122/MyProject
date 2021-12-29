package Seleniums;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class LinkCount {

    public static void main(String[] args) throws IOException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/#/index");

        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.stream().count());


        for(WebElement link:links)
        {
            String url= link.getAttribute("href");
            System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode= conn.getResponseCode();
            System.out.println("The response code is "+responseCode);




        }


        driver.close();


    }
}
