package Assignment_excel_sheet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Webtable_Assignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Susheel%20mahobia/Downloads/Assignment.html");
        driver.manage().window().maximize();
        List<WebElement> list_of_rows=driver.findElements(By.xpath("//tbody//tr"));
        for (int i=0;i< list_of_rows.size();i++)
        {

            System.out.println(list_of_rows.get(i).getText());
        }
       List<String> listofnames=new ArrayList<>();
        for (int i=0;i< list_of_rows.size();i++)
       {
            listofnames.add(list_of_rows.get(i).getText());
       }
        List<String> unique_list= listofnames.stream().distinct().collect(Collectors.toList());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Unique Rows from the above tables are : ");
        for (int i=0;i< unique_list.size();i++)
        {

            System.out.println(unique_list.get(i));
        }

    }
}
