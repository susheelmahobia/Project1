package Assignment_excel_sheet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadingAssignment_3 {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallseotools.com/plagiarism-checker/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele=driver.findElement(By.xpath("//span[@id='img_name']"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        ele.click();
        Robot rb =new Robot();
        StringSelection stringSelection=new StringSelection("C:\\Users\\Susheel mahobia\\Downloads\\info.txt");
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
//span[@id='img_name']