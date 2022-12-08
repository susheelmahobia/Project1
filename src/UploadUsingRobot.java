import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class UploadUsingRobot {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
        driver.findElement(By.xpath("//span[text()='Browse']")).click();
        Robot rb=new Robot();
        StringSelection filepath= new StringSelection("C:\\Users\\Susheel mahobia\\Downloads\\info.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);



    }
}
