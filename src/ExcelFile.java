import jxl.Workbook;
import jxl.write.*;
import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {
/*
    public static void main(String[] args) throws IOException, WriteException {
        WritableWorkbook workbook= Workbook.createWorkbook(new File("FirstWorkBook.xls"));
        WritableSheet sheet =workbook.createSheet("sheet1",0);
        WritableCell cell = new Label(0,0,"VIRENDRA");
        WritableCell cell1 = new Label(1,0,"ashu");
        WritableCell cell2 = new Label(2,0,"vassshu");
        sheet.addCell(cell);
        sheet.addCell(cell1);
        sheet.addCell(cell2);
        workbook.write();
        workbook.close();

    }*/

    public static void main(String[] args) throws IOException {
//            String projir = System.getProperty("user.dir");
//            System.out.println(projir);
            String excelpath ="C:\\Dump\\FirstWorkBook2.xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
            XSSFSheet sheet = workbook.getSheetAt(0);
       // String filepath = ""; // To add directory
      //  FileInputStream inputStream = new FileInputStream(filepath); // To open the file
       // File file = new File("C:\\Dump");
        //for(String fileNames : file.list()) System.out.println(fileNames);


      //  XSSFWorkbook wb = new XSSFWorkbook("C:\\Dump\\FirstWorkBook2.xlsx");
        //XSSFSheet sheet = wb.getSheetAt(0);


      //  System.out.println(rowCount);

    }


}

