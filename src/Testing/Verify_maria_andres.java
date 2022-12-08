package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Verify_maria_andres {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
       List<WebElement> headerlist= driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
       int no_of_header= headerlist.size();
       int col_no_contact=0;
       int col_no_company=0;
       int col_no_country=0;
       for (int i=0;i<no_of_header;i++)
       { if (headerlist.get(i).getText().equals("Contact"))
         {   col_no_contact=i+1;

         }
         if (headerlist.get(i).getText().equals("Company"))
         {
             col_no_company=i+1;
         }

           if (headerlist.get(i).getText().equals("Country"))
           {
               col_no_country=i+1;
           }


       }

        System.out.println("Column no of contact : "+col_no_contact);
        System.out.println("Column no of company : "+col_no_company);
        System.out.println("Column no of contry : "+col_no_country);
        int number=0;
        List<WebElement> list1=driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
        for (int i=0;i<list1.size();i++)
        {
           if (list1.get(i).getText().equals("Roland Mendel"))
           {
               number=i+1;

           }


        }
        number+=1;
       String company= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+number+"]//td["+col_no_company+"]")).getText();
       String country=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+number+"]//td["+col_no_country+"]")).getText();
        if(country.equals("Austria")&&company.equals("Microsoft"))
        {
            System.out.println("Roland Mendel works in Microsoft and lives in Austria.");
        }
        else
        {
            System.out.println("Roland Mendel not works in microsoft and also not lives in austria");
        }


    }
}
