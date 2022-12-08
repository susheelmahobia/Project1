package Assignment_excel_sheet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DropDownDate {
    public static WebDriver driver;
    public static void main(String[] args) throws ParseException {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("file://C:/Users/Susheel%20mahobia/Downloads/Dropdown%20(1).html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Calendar cal=Calendar.getInstance();
        String targetdate="09-05-2005";
        String[] array=targetdate.split("-");
        String date=array[0];
        String month=array[1];
        String year=array[2];
        selectdate(date,monthtono(month),year);
        WebElement yearfield=driver.findElement(By.xpath("//select[@id='dob-year']"));
        Select yearselect=new Select(yearfield);
       List<WebElement>yearslist= yearselect.getOptions();
        List actuallist=new ArrayList<>();
        for (int i=2;i<yearslist.size();i++)
        {  actuallist.add(yearslist.get(i).getText());
        }
        List tempdsc=new ArrayList<>();
        List tempasc=new ArrayList<>();

        tempdsc.addAll(actuallist);
        tempasc.addAll(actuallist);
        Collections.sort(tempasc);
        Collections.sort(tempdsc,Collections.reverseOrder());
        if (actuallist.equals(tempdsc))
            System.out.println(" year's dropdown is in descending order");
        else if(actuallist.equals(tempasc))
            System.out.println("Year's dropdown is in ascending order");

    }
    public static String monthtono(String month)
    {    HashMap<String,String> obj=new HashMap<String,String>();
        obj.put("01","January");
        obj.put("02","February");
        obj.put("03","March");
        obj.put("04","April");
        obj.put("05","May");
        obj.put("06","June");
        obj.put("07","July");
        obj.put("08","August");
        obj.put("09","September");
        obj.put("10","October");
        obj.put("11","November");
        obj.put("12","December");
        String str=obj.get(month);
        return str;
    }
    public static void selectdate(String date,String month,String year)
    {
        WebElement datefield=driver.findElement(By.xpath("//select[@id='dob-day']"));
        WebElement monthfield=driver.findElement(By.xpath("//select[@id='dob-month']"));
        WebElement yearfield=driver.findElement(By.xpath("//select[@id='dob-year']"));
        Select dateselect=new Select(datefield);
        dateselect.selectByVisibleText(date);
        Select monthselect=new Select(monthfield);
        monthselect.selectByVisibleText(month);
        Select yearselect=new Select(yearfield);
        yearselect.selectByVisibleText(year);



    }
}
