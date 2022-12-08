package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
       WebElement loginbutton=driver.findElement(By.name("login"));
       click(driver,10,loginbutton);
       WebElement ele=driver.findElement(By.xpath("//div[@class='_9ay7']"));
        if(ele.getText().equals("The email address or mobile number you entered isn't connected to an account. Find your account and log in."))
        {
            System.out.println("W/o entering credentials , log in button in clicked");
            return;
        }
        System.out.println("Scripted Completed");
    }
    public static void click(WebDriver driver,int unit,WebElement element)
    { new WebDriverWait(driver,unit).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    }
