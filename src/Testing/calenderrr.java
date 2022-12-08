package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Year;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class calenderrr {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
        WebElement WB=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
        WebElement wb1=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
        Select s=new Select(WB);
        List<WebElement> SS=s.getOptions();
        Select w=new Select(wb1);
        List<WebElement> ww=w.getOptions();
        for (int i=0;i<SS.size();i++)
        {
            System.out.println(SS.get(i).getText());

        }
        for (int j=0;j<ww.size();j++)
        {
            System.out.println(ww.get(j).getText());

        }

    }
    }

