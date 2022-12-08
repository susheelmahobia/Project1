package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Question_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
        for (int i=1;i<Rows.size();i++)
        { List<WebElement> entries=Rows.get(i).findElements(By.tagName("td"));
            for (int j=0;j<entries.size();j++)
            {
                System.out.print(entries.get(j).getText()+" ");
            }
            System.out.println(" ");

        }

    }
}
