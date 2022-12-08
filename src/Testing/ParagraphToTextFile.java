package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ParagraphToTextFile {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.toppr.com/guides/essays/essay-on-india/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String paragraph= driver.findElement(By.xpath("//p[contains(text(),'India is a great country where people speak differ')]")).getText();
        System.out.println(paragraph);
        FileWriter fw=new FileWriter("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\src\\testout.txt");
        fw.write(paragraph);
        fw.close();
    }
}
