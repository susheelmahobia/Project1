package Testing;

import common.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

        String givenurl="https://www.amazon.in/";
        if(givenurl.equals("https://www.amazon.in/"))
        {
            System.out.println("correct webpage is opened");
        }

    }
}
