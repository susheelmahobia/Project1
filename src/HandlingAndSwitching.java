import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingAndSwitching {
    public static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parent=driver.getWindowHandle();
        driver.findElement(By.id("newWindowBtn")).click();
        Iterator<String> itr=iteratorfunc();
        while (itr.hasNext())
        { String s= itr.next();

            if(!parent.equals(s))
            { driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.findElement(By.id("firstName")).sendKeys("SUSHEEL");
                driver.findElement(By.id("lastName")).sendKeys("MAHOBIA");
                break;
            }
        }
        driver.switchTo().window(parent);
        driver.findElement(By.id("name")).sendKeys("SUSHEEL MAHOBIA ");
    }
    public static Iterator<String> iteratorfunc()
    {         Set<String> setw = driver.getWindowHandles();
                Iterator<String> itr = setw.iterator();
                return itr;
    }
}

