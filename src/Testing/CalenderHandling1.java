package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CalenderHandling1 {
    public static WebDriver driver;
    public static void main(String[] args) throws ParseException, InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        String targetdate="14-July-2022";
        String[] array=targetdate.split("-");
        String date=array[0];
        String month=array[1];
        String year=array[2];
        driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
        SelectDate(date,monthtono(month),year);
       }

   public static int monthtono(String month)
   {    HashMap<String,String>obj=new HashMap<String,String>();
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
    public static String[] date(String date)
    {
        return date.split(" ");

    }
    public static void SelectDate(String exday,int month,String year)
    {  String Getcurrmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
        if(monthtono(date(Getcurrmonthyear)[0])>month && Integer.parseInt(date(Getcurrmonthyear)[1])>= Integer.parseInt(year)) {
            while (!(monthtono(date(Getcurrmonthyear)[0]) == month && date(Getcurrmonthyear)[1].equals(year))) {
                System.out.println(Getcurrmonthyear);
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
                Getcurrmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            }
        }
       else if(Integer.parseInt(date(Getcurrmonthyear)[1])<= Integer.parseInt(year)) {
            while (!(monthtono(date(Getcurrmonthyear)[0]) == month && date(Getcurrmonthyear)[1].equals(year))) {
                System.out.println(Getcurrmonthyear);

                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
                Getcurrmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            }
        }

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not (contains(@class,' ui-datepicker-other-month '))]/a[text()='"+exday+"']")).click();


    }
}
