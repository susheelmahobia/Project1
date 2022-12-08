package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement wb=driver.findElement(By.id("double-click"));
        Actions act=new Actions(driver);
        act.doubleClick(wb).build().perform();
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
