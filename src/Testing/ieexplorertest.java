package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class ieexplorertest {
    public static void main(String[] args) {
       System.setProperty("webdriver.ie.driver","C:\\Users\\Susheel mahobia\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
        InternetExplorerOptions cap=new InternetExplorerOptions();
        cap.ignoreZoomSettings();
        WebDriver driver=new InternetExplorerDriver(cap);
        driver.get("https://www.google.com/");
    }
}
