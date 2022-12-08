package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Arrays;

public class CrossBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Susheel mahobia\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver d1=new ChromeDriver();
        long starttimechromedriver=  System.currentTimeMillis();
        d1.get("https://www.geminisolutions.com");
        long finishtimechromedriver=System.currentTimeMillis();
        int chromeloadtime= (int)( (finishtimechromedriver-starttimechromedriver)/1000);
       System.setProperty("webdriver.edge.driver","C:\\Users\\Susheel mahobia\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver d2=new EdgeDriver();
        long starttimeedgebrowser=System.currentTimeMillis();
        d2.get("https://www.geminisolutions.com");
        long finishtimeedgebrowser=System.currentTimeMillis();
        int edgeloadtime= (int) ((finishtimeedgebrowser-starttimeedgebrowser)/1000);
        System.setProperty("webdriver.opera.driver","C:\\Users\\Susheel mahobia\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver d3=new OperaDriver();
        long starttimeoperabrowser=System.currentTimeMillis();
        d3.get("https://www.geminisolutions.com");
        long finishtimeoperabrowser=System.currentTimeMillis();
        int operaloadtime= (int)((finishtimeoperabrowser-starttimeoperabrowser)/1000);
        int [] timearray={chromeloadtime,edgeloadtime,operaloadtime};
        Arrays.sort(timearray);
        for (int i=0;i<timearray.length;i++)
        {
            System.out.println(timearray[i]+" "+"Seconds");
        }
        String chrometitle=d1.getTitle();
        String edgetitle=d2.getTitle();
        String operatitle=d3.getTitle();
        String titles[]={chrometitle,edgetitle,operatitle};
        for (String str:titles)
        { if( str.equals("Gemini Solutions | IT Consulting, Product Development & Management Services"))
            {
                System.out.println("Title is correct");

            }
            else {
            System.out.println("Title displayed is incorrect.");
        }

        }
    }
}
