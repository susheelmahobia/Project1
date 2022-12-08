package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Question_3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
        String str = null;
        String str1 = null;
        if (!header.get(0).getText().equals("Company") && header.get(1).getText().equals("Contact") && header.get(2).getText().equals("Country")) {
            System.out.println("column sequence is changed");
            return;
        }
        List<WebElement> ROWS = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        for (int i = 1; i <= ROWS.size(); i++) {
            List<WebElement> entries = driver.findElements(By.xpath("//table[@id='customers']//tr[" + i + "]//td"));
            for (int j = 0; j < entries.size(); j++) {
                if (entries.get(j).getText().equals("Maria Anders")) {
                    str = entries.get(0).getText();
                    str1 = entries.get(2).getText();
                }

            }
        }
        if (str.equals("Google") && str1.equals("Germany"))
            System.out.println("Maria Anders works " + str + " and lives in " + str1);
    }
}
