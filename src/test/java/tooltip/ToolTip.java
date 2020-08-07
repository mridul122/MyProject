package tooltip;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {


    public static void main(String[] args) throws Exception {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://jqueryui.com/tooltip/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
            driver.switchTo().frame(fr);
        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Tooltips')]"));

        Actions act =new Actions(driver);
//
        act.moveToElement(ele).build().perform();

        Thread.sleep(5000);

        WebElement ele2  = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));

        System.out.println(ele2.getText());
        driver.quit();

            // driver.findElement(By.xpath("//a[title='aria-describedby']"));

        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("In catch block");
            driver.quit();
        }

    }
}
