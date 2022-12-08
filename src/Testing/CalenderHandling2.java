package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CalenderHandling2 {
    public static WebDriver driver;

    public static void main(String[] args) throws ParseException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        String targetdate="14-March-2023";
        driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
        selectdate(targetdate,"dd-MMM-yyyy");

    }
    public static void selectdate(String targetdate,String formatdate) throws ParseException {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat targettedformat=new SimpleDateFormat(formatdate);
        targettedformat.setLenient(false);
        Date formatteddate= targettedformat.parse(targetdate);
        cal.setTime(formatteddate);
        int date= cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        String actualdate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
        cal.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
        int actualmonth=cal.get(Calendar.MONTH)+1;
        int actualyear= cal.get(Calendar.YEAR);
        while (month<actualmonth ||year<actualyear) {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            System.out.println(actualdate);
            cal.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
            actualmonth = cal.get(Calendar.MONTH)+1;
            actualyear = cal.get(Calendar.YEAR);

        }
        while (actualmonth<month || actualyear<year) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
                actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
                System.out.println(actualdate);
                cal.setTime(new SimpleDateFormat("MMM yyyy").parse(actualdate));
                actualmonth = cal.get(Calendar.MONTH)+1;
                actualyear = cal.get(Calendar.YEAR);

            }
            driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled'))]/a[text()='" + date + "']")).click();


    }





}