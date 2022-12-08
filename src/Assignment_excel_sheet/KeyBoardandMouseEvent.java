package Assignment_excel_sheet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class KeyBoardandMouseEvent {
    public static void main(String[] args) throws AWTException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
//        WebElement firstbox=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
//        firstbox.click();
//        firstbox.sendKeys(Keys.SHIFT+"SUSHEEL");
//        firstbox.sendKeys(Keys.CONTROL+"A");
//        firstbox.sendKeys(Keys.CONTROL+"C");
//        WebElement  surame=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='lastname']"));
//        Actions action=new Actions(driver);
//        action.contextClick(surame).build().perform();
//        Robot rb =new Robot();
//        rb.keyPress(KeyEvent.VK_DOWN);
//        rb.keyRelease(KeyEvent.VK_DOWN);
//        rb.keyPress(KeyEvent.VK_DOWN);
//        rb.keyRelease(KeyEvent.VK_DOWN);
//        rb.keyPress(KeyEvent.VK_DOWN);
//        rb.keyRelease(KeyEvent.VK_DOWN);
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);
//
//        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='reg_email__']")).sendKeys("8656820740");
//        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        // wait of 4 seconds
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        // Keys.Chord string
        String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
        // open the link in new tab, Keys.Chord string passed to sendKeys
        driver.findElement(
                By.xpath("//*[text()='Company']")).sendKeys(clicklnk);
    }

}
