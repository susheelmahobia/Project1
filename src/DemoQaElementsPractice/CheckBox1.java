package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //   js.executeScript("window.scrollBy(0,1000)","");
        WebElement wb = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        js.executeScript("arguments[0].scrollIntoView();", wb);
        wb.click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-1']")).click();
        driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']"));

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            Thread.sleep(1000);


        }
        List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
        System.out.println(list1.size());
        for (int i = 1; i < list1.size(); i++) {
             System.out.println(list1.get(i).getText());
            list1.get(i).click();
            Thread.sleep(1000);


        }
    }
}
