package KTSession;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println(System.getProperty("user.dir"));
		//1. Map <>
		Map<String, Object> preferences = new HashMap<String, Object>();
		preferences.put("download.default_directory", System.getProperty("user.dir") + "\\downloadFiles");
		//2. Creating a ChromeOption class
		ChromeOptions options = new ChromeOptions();
		
		//3. Assigning the Map to the "prefs" tag in the options class
		options.setExperimentalOption("prefs", preferences);
		
		//4. Passing the options class to our Chrome Driver
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		
		
	}

}
