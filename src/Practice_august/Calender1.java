package Practice_august;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Calender1 {
    public static WebDriver driver=null;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)","");
        driver.findElement(By.id("first_date_picker")).click();
        String targetdate="17-September-2017";
        String[] targeteddate = targetdate.split("-");
        String exdate=targeteddate[0].trim();
        String exmonth=targeteddate[1].trim();
        String exyear=targeteddate[2].trim();
        date_selector(exdate,monthtono(exmonth),exyear);
    }
    public static int monthtono(String month)
    {    HashMap<String,String> obj=new HashMap<String,String>();
        obj.put("January","1");
        obj.put("February","2");
        obj.put("March","3");
        obj.put("April","4");
        obj.put("May","5");
        obj.put("June","6");
        obj.put("July","7");
        obj.put("August","8");
        obj.put("September","9");
        obj.put("October","10");
        obj.put("November","11");
        obj.put("December","12");
        String str=obj.get(month);
        int i=Integer.parseInt(str);
        return i;
    }
    public static void date_selector(String exdate , int exmonth , String exyear) throws InterruptedException {
        WebDriverWait wait= new WebDriverWait(driver,30);
        String[] parseddate =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");
        if(Integer.parseInt(parseddate[1].trim())>Integer.parseInt(exyear)) {
            while (!((monthtono(parseddate[0].trim())==exmonth)&&Integer.parseInt(parseddate[1].trim())==Integer.parseInt(exyear))) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
                parseddate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");
            }
        }
        else if((Integer.parseInt(parseddate[1].trim())==Integer.parseInt(exyear))&& (monthtono(parseddate[0].trim())>exmonth))
        {  while (!(monthtono(parseddate[0].trim())==exmonth)) {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            parseddate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");
        }


        }
        else {
            while (!((monthtono(parseddate[0].trim())==exmonth) && (parseddate[1].trim().equals(exyear)))) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
                parseddate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");

            }
        }
        driver.findElement(By.xpath("//a[@class='ui-state-default'and text()='"+exdate+"']")).click();

    }
}
