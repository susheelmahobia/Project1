package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Susheel%20mahobia/AppData/Local/Microsoft/Windows/INetCache/Content.Outlook/4F92K44R/assignment%20(2).html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Idfield=driver.findElement(By.xpath("//input[@name='user_id']"));
        WebElement passfield=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement choosefield=driver.findElement(By.xpath("//input[@name='fileupload']"));
        WebElement submitbtn=driver.findElement(By.xpath("//input[@type='submit']"));
        Actions act=new Actions(driver);
        act.click(Idfield).sendKeys("Susheel").build().perform();
        act.click(passfield).sendKeys("sushmahobia").build().perform();
        choosefield.sendKeys("C:\\Users\\Susheel mahobia\\Downloads\\info.txt");
        System.out.println("URL before submit is :"+driver.getCurrentUrl());
        act.click(submitbtn).build().perform();
        System.out.println("Changed URL is : "+"\n"+ driver.getCurrentUrl());

    }
}
