package Seleniums;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {


    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","./output/chromedriver 3");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();



//        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

        Thread.sleep(5000);


        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
        Thread.sleep(2000);


        //driver.findElement(By.xpath("(//a[@text='Bhopal (BHO)'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Bhopal (BHO)']")).click();

        //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']

        Thread.sleep(5000);
        driver.quit();




    }
}


