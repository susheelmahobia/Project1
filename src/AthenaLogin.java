import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class AthenaLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://athena-dev.geminisolutions.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("firstname5")).sendKeys("ashish2@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abc@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='p-button-label']")).click();
       Set<String> sett= driver.getWindowHandles();
        System.out.println(sett.size());
        Thread.sleep(5000);
        WebElement ele= driver.findElement(By.xpath("//button[contains(text(),'Start Test')]"));
        ele.click();
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
        Thread.sleep(2000);
      WebElement ele1=  driver.findElement(By.xpath("//button[@class='instBtn p-button p-component']"));
        System.out.println(ele1.isEnabled());
        driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
        System.out.println(ele1.isEnabled());
        ele1.click();
        WebElement ele2= driver.findElement(By.xpath("//span[@class='p-button-icon p-button-icon-left pi pi-check']"));
        ele2.click();
        Thread.sleep(3000);
        WebElement ele3=driver.findElement(By.xpath("//button[@class='btn mt-2 mb-2 submitButton p-button p-component']"));
        ele3.click();
      //  driver.findElement(By.xpath("//body/athena-root[1]/div[1]/athena-layout[1]/div[1]/athena-candidate-home[1]/div[1]/div[2]/div[1]/div[2]/div[1]/athena-instructions-screen[1]/div[1]/div[2]/div[2]/div[1]/div[1]/p-checkbox[1]/div[1]/div[2]"));

    }

}
