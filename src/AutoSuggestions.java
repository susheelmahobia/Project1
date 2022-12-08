package KTSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestions {
    public static  WebDriver driver;
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("selenium");
      List<WebElement>list =  driver.findElements(By.xpath("//ul//li[@class='sbct']"));
      for (int i=0;i<list.size();i++)
      {
          String s = list.get(i).getText();
          System.out.println(s);
          if (s.contains("selenium testing")) {
              System.out.println("Selenium Testing is selected from above suggestions");
              list.get(i).click();


          }
      }
//       WebElement wb= driver.findElement(By.name("q"));
//        Actions action=new Actions(driver);
//        Action act=action.keyDown(wb, Keys.SHIFT)
//                .sendKeys("selenium")
//                .keyUp(wb,Keys.SHIFT)
//                .keyDown(wb,Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(wb,Keys.CONTROL)
//                .keyDown(wb,Keys.CONTROL)
//                .sendKeys("x")
//                .keyDown(wb,Keys.CONTROL)
//                .sendKeys("v")
//
//                .build();
//        act.perform();
    }
}
