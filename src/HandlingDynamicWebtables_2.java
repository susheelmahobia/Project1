import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicWebtables_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement>row_list= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
        int row_count= row_list.size();
        for (int i=1;i<row_count;i++)
        { List<WebElement> row_column=row_list.get(i).findElements(By.tagName("td"));
            int column_count=row_column.size();
            for (int j=0;j<column_count;j++)
            {
                System.out.print("     " + row_column.get(j).getText()+"   ");

            }
            System.out.println(" ");

        }

    }
}
