package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AmazonPage2 {
    public static void main(String[] args) {
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
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Susheel@143");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Books");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        System.out.println("Complete Price details for First book : "+ driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText());
        String pricedetails=driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText();
        String[] pricearray=pricedetails.split("\n");
        System.out.println( "only price of first book : " + pricearray[0]);

    }
}
