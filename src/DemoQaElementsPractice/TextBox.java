package DemoQaElementsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TextBox {
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
      driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-0']")).click();
     WebElement username= driver.findElement(By.id("userName"));
      WebElement userEmail=driver.findElement(By.id("userEmail"));
      WebElement curraddress=driver.findElement(By.id("currentAddress"));
      WebElement paraddress=driver.findElement(By.id("permanentAddress"));
      username.sendKeys("susheel Mahobia");
      userEmail.sendKeys("susheel.mahobia@gmail.c");
      curraddress.sendKeys("Vidya Nagar Bilaspur");
      paraddress.sendKeys("same as current address");
     String enteredName= username.getAttribute("value");
     String enteredmail= userEmail.getAttribute("value");
     String enteredaddress =curraddress.getAttribute("value");
     String enteredparraddress= paraddress.getAttribute("value");
        System.out.println("Fetching Entered Value before submit    :     ");
        System.out.println(enteredName);
        System.out.println(enteredmail);
        System.out.println(enteredaddress);
        System.out.println(enteredparraddress);
        js.executeScript("window.scrollBy(0,1000)","");
        driver.findElement(By.id("submit")).click();
       List<WebElement>paras= driver.findElements(By.xpath("//div[@class='border col-md-12 col-sm-12']//p"));
        System.out.println("Fetching Entered value after submit   :    ");
       for (int i=0;i<paras.size();i++)
       {
           System.out.println(paras.get(i).getText());
       }

    }
}
