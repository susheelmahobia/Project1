package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class OrangeHRMLogin {
    public static WebDriver driver;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter What you want :1. Directly click on Log in  2. Log in via Credntials ");
        int choice = sc.nextInt();
        if (choice == 1) {
           Browseropen();
            String Title = driver.getTitle();
            driver.findElement(By.id("btnLogin")).click();
            Boolean bool = driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
            System.out.println("Yess");
        } else if (choice == 2) {
               Browseropen();
            String Title = driver.getTitle();
            System.out.println("Title of Page is  : " + Title);
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
        }
    }
    public static void Browseropen()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();


    }

}
