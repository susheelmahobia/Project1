package Testing;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExcelAssessment3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fio = new FileInputStream("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\Financial Sample.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fio);
        XSSFSheet sheet = wb.getSheetAt(0);
        List<Double> saleprice= new ArrayList<>();
        int total_row_count = sheet.getLastRowNum();
        for (int i=1;i<total_row_count;i++)
        {
            XSSFCell value = sheet.getRow(i).getCell(2);
            saleprice.add(value.getNumericCellValue());

        }
        List<Double> newlist=saleprice.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.asList(newlist));
        double max_sale_price=Collections.max(newlist);
       int total_row_num= sheet.getLastRowNum();
       int total_col_num=sheet.getRow(1).getLastCellNum();
        XSSFCellStyle style=wb.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.SKY_BLUE.getIndex());
        style.setFillPattern(FillPatternType.FINE_DOTS);
       for (int r=1;r<total_row_num;r++)
       {
           XSSFRow row = sheet.getRow(r);
               XSSFCell cell = row.getCell(2);
               double value1=cell.getNumericCellValue();
               if (value1==max_sale_price)
               { for (int c=0;c<total_col_num;c++)
                 { XSSFCell cell1=row.getCell(c);
                     cell1.setCellStyle(style);
                 }
               }

       }
        FileOutputStream fo=new FileOutputStream("C:\\Users\\Susheel mahobia\\IdeaProjects\\Project1\\colour.xlsx");
        wb.write(fo);
        fo.close();

    }
}
