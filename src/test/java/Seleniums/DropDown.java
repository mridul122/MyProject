package Seleniums;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class DropDown {


    @Test
    public void selenium() throws Exception {

        System.setProperty("webdriver.chrome.driver","./output/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.spicejet.com");

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("H");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("e");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("l");
        driver.close();



    }
}
