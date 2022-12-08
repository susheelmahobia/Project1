package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AthenaLogin1 {
     public static WebDriver driver;
     public static WebDriverWait wait ;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://athena-dev.geminisolutions.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("firstname5")).sendKeys("ashish2@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abc@123");

        WebElement element= driver.findElement(By.xpath("//span[@class='p-button-label']"));
        element.click();
        WebElement ele= driver.findElement(By.xpath("//button[contains(text(),'Start Test')]"));
        ele.click();
        WebElement ele1=  driver.findElement(By.xpath("//button[@class='instBtn p-button p-component']"));
        System.out.println(ele1.isEnabled());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
        System.out.println(ele1.isEnabled());
        ele1.click();
        WebElement ele2= driver.findElement(By.xpath("//span[@class='p-button-icon p-button-icon-left pi pi-check']"));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3=driver.findElement(By.xpath("//button[@class='btn mt-2 mb-2 submitButton p-button p-component']"));
        ele3.click();
    }

}
