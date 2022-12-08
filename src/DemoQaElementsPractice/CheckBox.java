package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //   js.executeScript("window.scrollBy(0,1000)","");
        WebElement wb= driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        js.executeScript("arguments[0].scrollIntoView();",wb);
        wb.click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-1']")).click();
        driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
        driver.findElement(By.xpath("//span[@class='rct-checkbox'][1]")).click();
    }
}
