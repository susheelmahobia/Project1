package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
        if (!header.get(0).getText().equals("Company") && header.get(1).getText().equals("Contact") && header.get(2).getText().equals("Country")) {
            System.out.println("column sequence is changed");
            return;
        }
        int no_of_columns = header.size();
        for (int j = 1; j <= no_of_columns; j++) {
            List<WebElement> table_data = driver.findElements(By.xpath("//table[@id='customers']//td[" + j + "]"));
            for (int i = 0; i < table_data.size(); i++) {
                System.out.println(table_data.get(i).getText());


            }
        }
    }
}
