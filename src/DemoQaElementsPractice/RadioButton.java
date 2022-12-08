package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

     WebElement wb1= driver.findElement(By.id("yesRadio"));
     WebElement wb2=driver.findElement(By.id("impressiveRadio"));
        Actions action =new Actions(driver);
        action.click(wb1).build().perform();

        System.out.println( driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
        action.click(wb2).build().perform();
        System.out.println( driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
        WebElement wb3=driver.findElement(By.id("noRadio"));
        System.out.println(wb3.isEnabled());

    }
}
