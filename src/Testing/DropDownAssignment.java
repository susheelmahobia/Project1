package Testing;

import common.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
        String datetring= "19-Mar-2020";
        String dates[]=datetring.split("-");
        String date=dates[0];
        String month=dates[1];
        String year=dates[2];
        WebElement dayelement= driver.findElement(By.xpath("//select[@id=\"day\"]"));
        Select daydropdown=new Select(dayelement);
        daydropdown.selectByVisibleText(date);
        WebElement monthelement=driver.findElement(By.xpath("//select[@id='month']"));
        Select monthdropdown=new Select(monthelement);
        monthdropdown.selectByVisibleText(month);
        WebElement yearelement= driver.findElement(By.id("year"));
        Select yeardropdown=new Select(yearelement);
        yeardropdown.selectByVisibleText(year);
       List<WebElement> webElementList= yeardropdown.getOptions();
       List actuallist= new ArrayList<>();
        for (WebElement ele:webElementList
             ) {
            String data= ele.getText();
            actuallist.add(data);
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
