package Seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./output/chromedriver 3");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();


        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        select.selectByValue("USD");
//driver.cl  /ose();
    }
}
