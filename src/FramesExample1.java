import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesExample1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gemini ");
        driver.switchTo().frame("frm1");
        Select selectDD= new Select(driver.findElement(By.id("selectnav2")));
        selectDD.selectByVisibleText("Menu");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("   Solutions ");
    }
}
