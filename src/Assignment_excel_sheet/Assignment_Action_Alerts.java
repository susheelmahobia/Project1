package Assignment_excel_sheet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Action_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.xpath("//input[@name='confirmation']")).click();
        alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.xpath("//input[@name='upload']")).sendKeys("C:\\Users\\Susheel mahobia\\Documents\\validations..txt");
        WebElement hover_menu=driver.findElement(By.id("sub-menu"));
        Actions action=new Actions(driver);
        action.moveToElement(hover_menu).click(hover_menu).build().perform();
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    }
}
