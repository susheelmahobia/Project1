package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AmazonPage3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement e1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        act.moveToElement(e1).build().perform();
        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']")).click();

        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8656820740");
        System.out.println("Entering username");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Susheel@143");
        System.out.println("Entering password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        System.out.println("Logged in Successfully");


    }
}
