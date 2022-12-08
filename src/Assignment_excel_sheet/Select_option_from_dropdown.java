package Assignment_excel_sheet;

import common.Assert;
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

public class Select_option_from_dropdown {
    public static void main(String[] args) throws ParseException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://codepen.io/abdulmlik/pen/dJOJov");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Calendar cal=Calendar.getInstance();
        String targetdate="09-05-2005";
        SimpleDateFormat targettedformat=new SimpleDateFormat("MM-dd-yyyy");
        // targettedformat.setLenient(false);
        Date formatteddate= targettedformat.parse(targetdate);
        cal.setTime(formatteddate);
        int date= cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);
        driver.switchTo().frame("result");
        WebElement yearpath=driver.findElement(By.xpath("//select[@id='year']"));
        Select yeardropdown=new Select(yearpath);

        yeardropdown.selectByVisibleText(String.valueOf(year));
        String selectedyear=yeardropdown.getFirstSelectedOption().getText();
        if(Integer.parseInt(selectedyear) == year)
        {
            System.out.println("Year Field is validated");

        }
        else {
            System.out.println("Year field is not validated");
        }

        Select monthdrpdown=new Select(driver.findElement(By.id("month")));
        monthdrpdown.selectByVisibleText(String.valueOf(month));
        String selectedmonth=monthdrpdown.getFirstSelectedOption().getText();
        if(Integer.parseInt(selectedmonth) == month)
        {
            System.out.println("month Field is validated");

        }
        else {
            System.out.println("month field is not validated");
        }
        Select daydropdown=new Select(driver.findElement(By.id("day")));
        daydropdown.selectByVisibleText(String.valueOf(date));
        String selectedday=daydropdown.getFirstSelectedOption().getText();
        if(Integer.parseInt(selectedday) == date)
        {
            System.out.println("day Field is validated");

        }
        else {
            System.out.println("day field is not validated");
        }
       List<WebElement> list_of_all_years= yeardropdown.getOptions();
        List actuallist=new ArrayList<>();
        for (int i=1;i< list_of_all_years.size();i++)
        {  actuallist.add(list_of_all_years.get(i).getText());
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
}
