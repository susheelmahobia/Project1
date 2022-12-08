package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelAssessment {
        public static HSSFSheet sheet;
    public static void main(String[] args) throws IOException {
      System.getProperty("user.dir");
        FileInputStream fio=new FileInputStream("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\ExcelAssessmentSheet.xls");
        HSSFWorkbook wb= new HSSFWorkbook(fio);
        sheet= wb.getSheet("Sheet1");
       int rownumber=1;
       String column="First Name";
        System.out.println(functionreturncelldata(rownumber,column));
    }
    public static String functionreturncelldata(int rownumber,String column)
    { HSSFCell celldata=sheet.getRow(1).getCell(columnmapping("First Name"));
        return celldata.getStringCellValue();
    }
    public static Integer columnmapping(String key)
    {       HashMap<String, Integer> columnmapping=new HashMap<>();
        columnmapping.put("First Name", 1);
        columnmapping.put("Last Name",2);
        columnmapping.put("Gender",3);
        columnmapping.put("Country",4);
        columnmapping.put("Age",5);
        columnmapping.put("Date",6);
        columnmapping.put("Id",7);
       return columnmapping.get(key);
    }
}
