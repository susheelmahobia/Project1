package Testing;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EXcelAssessment2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fio = new FileInputStream("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\Financial Sample.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fio);
        XSSFSheet sheet = wb.getSheetAt(0);
        List<String> segmentlist= new ArrayList<>();
        List<String> countrylist=new ArrayList<>();
        int total_row_count = sheet.getLastRowNum();
           for (int i=1;i<total_row_count;i++)
           {
              XSSFCell value = sheet.getRow(i).getCell(0);
              XSSFCell value1=sheet.getRow(i).getCell(1);
              segmentlist.add(value.getStringCellValue());
              countrylist.add(value1.getStringCellValue());
           }
           List<String> newlist=segmentlist.stream().distinct().collect(Collectors.toList());
        List<String> newlist1=countrylist.stream().distinct().collect(Collectors.toList());
         System.out.println("Printing Distinct segments "+ Arrays.asList(newlist));
        System.out.println("Pinting distinct countries"+ Arrays.asList(newlist1));
         XSSFWorkbook workbook=new XSSFWorkbook();
         XSSFSheet sh=workbook.createSheet(" Unique Segments");
         int rowcount1=newlist.size();
         for ( int r=0;r<rowcount1;r++)
         {
         XSSFRow row= sh.createRow(r);
          XSSFCell cell=  row.createCell(1);
          cell.setCellValue(newlist.get(r));
         }
        XSSFSheet sh1=workbook.createSheet(" Unique Country");
         int rowcount2= newlist1.size();
        for( int j=0;j<rowcount2;j++)
        {
            XSSFRow row= sh1.createRow(j);
            XSSFCell cell=  row.createCell(1);
            cell.setCellValue(newlist1.get(j));
        }


        FileOutputStream fo=new FileOutputStream("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\unique.xlsx");
         workbook.write(fo);
         fo.close();




    }
}
