package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTablesQues2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[1]//th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
        int total_rows = rows.size();
        String str = null;
        String str1=null;
        if (!headers.get(0).getText().equals("Company") && headers.get(1).getText().equals("Contact") && headers.get(2).getText().equals("Country")) {
            System.out.println("Column is arranged Differently & not in Company -Contact -Country order");
            return;
        } else {
            for (int i = 2; i <= total_rows; i++) {
                List<WebElement> column_data = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[" + i + "]//td"));
                for (int j = 0; j < column_data.size(); j++) {
                    if (column_data.get(j).getText().equals("Roland Mendel")) {
                        str = column_data.get(0).getText();
                        str1=column_data.get(2).getText();

                    }
                }
            }

        }
        if (str.equals("Microsoft")&&str1.equals("Austria"))
            System.out.println("Roland Mendel works "+str+" and lives in "+str1);
    }
}