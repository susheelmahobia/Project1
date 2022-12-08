import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class UploadDemo {
    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement file= driver.findElement(By.id("imagesrc"));
       Actions act= new Actions(driver);
       act.click(file).build().perform();
        Robot rb =new Robot();
        StringSelection stringSelection=new StringSelection("C:\\Users\\Susheel mahobia\\Downloads\\image.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        rb.setAutoDelay(1000);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        rb.keyRelease(KeyEvent.VK_V);
        rb.setAutoDelay(1000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);




    }
}
