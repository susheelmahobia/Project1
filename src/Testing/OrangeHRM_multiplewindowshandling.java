package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OrangeHRM_multiplewindowshandling {
      static WebDriver driver=null;
    static  String desiredwindow=null;
    public static void main(String[] args) {
        String pending = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
        driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
        String parentwindow = driver.getWindowHandle();
        // System.out.println(parentwindow);
        Set<String> allwindows = driver.getWindowHandles();
        Iterator<String> itr = allwindows.iterator();
        List<String> alllist=new ArrayList<>(allwindows);
        switchtodesiredwindow(alllist,"Facebook");
        closeallotherwindows(desiredwindow ,itr);

    }
    public static void switchtodesiredwindow(List<String> alllist ,String DESIRED) {
        for (String d : alllist) {
           String title= driver.switchTo().window(d).getTitle();
            if (title.contains(DESIRED)) {
                System.out.println("found the right window"+ driver.getTitle());
                desiredwindow=driver.getWindowHandle();
                return;
            }

        }
    }
    public static void closeallotherwindows(String desiredwindow , Iterator <String> itr)
    { while (itr.hasNext() )
    {  String s= itr.next();
        if (!desiredwindow.equals(s)) {
            driver.switchTo().window(s).close();
        }
    }


    }
}
