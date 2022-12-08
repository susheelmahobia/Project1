package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalederHandling3 {
    public static WebDriver driver;
    public static void main(String[] args) throws ParseException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
        WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        String targetdate="14-Aug-2018";
        selectdate(targetdate,months);
    }

    public static void selectdate(String targetdate,WebElement months) throws ParseException {
        String[] arrayoftargetdate=targetdate.split("-");
        String date=arrayoftargetdate[0];
        String month=arrayoftargetdate[1];
        String year=arrayoftargetdate[2];
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        Select obj1=new Select(months);
        obj1.selectByVisibleText(month);
     //   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
        List<WebElement> years=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//option"));
       for (int i=0;i<years.size();i++) {
           if (years.get(i).getText().equals(year));
           { years.get(i).click();
           }
       }

    }







    }

