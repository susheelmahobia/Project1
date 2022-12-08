
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");


		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		Thread.sleep(2000);


		//Confirm Alert
		driver.findElement(By.id("confirmBox")).click();
		 Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());

		//prompt alert
		Thread.sleep(2000);

		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert =driver.switchTo().alert();
		promptAlert.sendKeys("Gemini");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		System.out.println(System.getProperty("user.dir"));
	}

}
