package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Iframes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://techtuts.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> frameslist=driver.findElements(By.tagName("iframe"));
        System.out.println("Total no of frames present are : " + frameslist.size());
        for (int i=0;i< frameslist.size();i++) {
            System.out.println(frameslist.get(i).getAttribute("name"));
        }
        for (int i=0;i< frameslist.size();i++)
        {
            System.out.println(frameslist.get(i).getAttribute("name"));
            if(frameslist.get(i).getAttribute("name").equals("google_esf"))
                driver.switchTo().frame(i);
                break;
        }
        driver.switchTo().parentFrame();;
        driver.switchTo().frame(frameslist.size()-2);

    }
}
