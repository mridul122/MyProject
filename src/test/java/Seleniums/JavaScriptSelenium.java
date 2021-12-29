package Seleniums;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptSelenium {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement btn = driver.findElement(By.xpath("//input[@name='submit']"));
        WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        js.executeScript("arguments[0].value='mridul.das';",userName);
        js.executeScript("arguments[0].value='mridul.das';",password);

        //btn.click();
//        js.executeScript("arguments[0].click();",btn);
        //driver.quit();

    }
}
