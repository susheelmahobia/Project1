package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxErrorValidate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement submitbutton= driver.findElement(By.id("submit"));
        WebElement userEmail=driver.findElement(By.id("userEmail"));
        String str= "mr-sm-2 field-error form-control";
        userEmail.sendKeys("fdbfdbdbd");
        js.executeScript("arguments[0].scrollIntoView();",submitbutton);
        driver.findElement(By.id("submit")).click();
        if(str.equals(userEmail.getAttribute("class")))
        {
            System.out.println("Invalid email address");
            return;
        }
    }
}


