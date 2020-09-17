package WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverManage {

    EventCapture eventListener;
    EventFiringWebDriver driver;
    WebDriver dr;


    @Test
    public void runBrowser() throws Exception
    {

       WebDriverManager.chromedriver().setup();

       // WebDriver driver = new FirefoxDriver();
        dr =new ChromeDriver();


        driver = new EventFiringWebDriver(dr);
        eventListener = new EventCapture();
        driver.register(eventListener);
        System.setProperty("webdriver.chrome.logfile", "./chromedriver.log");
//        driver.navigate().to("https://www.google.com");
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");

//        System.out.println(dr.getTitle());
//        System.out.println(driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).getText());
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
        driver.quit();

    }
}
