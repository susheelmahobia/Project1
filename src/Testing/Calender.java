package Testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) throws ParseException {
        Calendar cal=Calendar.getInstance();

      //  String targetdate="2000-07-6";
        //SimpleDateFormat targettedformat=new SimpleDateFormat("yyyy-MM-dd");
        String targetdate="3-2045-12";
        SimpleDateFormat targettedformat=new SimpleDateFormat("dd-yyyy-MM");

       // targettedformat.setLenient(false);
       Date formatteddate= targettedformat.parse(targetdate);
        System.out.println(formatteddate);
        cal.setTime(formatteddate);
        int date= cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);

        String dates=date+" "+month +" "+ year;
        System.out.println(dates);


    }
}
