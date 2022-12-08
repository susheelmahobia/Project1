package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicWebtables_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[1]//th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));

        int total_rows = rows.size();

        if (!headers.get(0).getText().equals("Company") && headers.get(1).getText().equals("Contact") && headers.get(2).getText().equals("Country")) {
            System.out.println("column sequence is changed");
            return;
        } else {
            for (int i = 1; i <= total_rows; i++) {
                List<WebElement> column_data = driver.findElements(By.xpath("//table[@id='customers']//tbody//td[" + i + "]"));
                 {
                    for (int j = 0; j < column_data.size(); j++) {
                        System.out.println(column_data.get(j).getText());

                    }
                }
            }
        }

    }
}