package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
       // List<WebElement>list=driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        List<WebElement>list=driver.findElements(By.xpath("//div[@class='rt-tr -even' or @class='rt-tr -odd']//child::div[@class='rt-td']"));
        System.out.println(list.size());

        for (int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i).getText());
        }
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Susheel");
        driver.findElement(By.id("lastName")).sendKeys("Mahobia");
        driver.findElement(By.id("userEmail")).sendKeys("Gunjan@gmail.com");


    }
}
