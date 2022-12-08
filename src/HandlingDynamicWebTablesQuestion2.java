import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicWebTablesQuestion2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        for (int i=1;i<=3;i++) {
           List<WebElement> list  = driver.findElements(By.xpath("//table[@id='customers']//tbody//td["+i+"]"));
          int sizeee = list.size();
           for (int j = 0; j < sizeee; j++) {
                System.out.println("  " + list.get(j).getText());


            }


        }

    }
}
