package Testing;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDate4 {
    /* Driver Code */
    public static void main(String[] args) {
        sortDateTimeObject();

    }

    private static void sortDateTimeObject() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        List<String > BaseList=new ArrayList<String>();
        List<LocalDate> dateList = new ArrayList<LocalDate>();
        BaseList.add("30-11-2019");
        BaseList.add("31-08-2019");
        BaseList.add("31-08-2019");
        BaseList.add("30-11-2018");
        BaseList.add("30-11-2018");
        BaseList.add("31-05-2018");
        BaseList.add("30-11-2017");
        BaseList.add("28-02-2017");
        for (int i=0;i<BaseList.size();i++)
        {
            dateList.add(LocalDate.parse(BaseList.get(i),formatter));
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("---> Date & Time Object List Before Sort (dd-MM-yyyy");
        for (LocalDate dateTime : dateList) {
            System.out.println(dateTime.format(dateTimeFormatter));
        }

        Collections.sort(dateList,Collections.reverseOrder());

        System.out.println("---> Date & Time Object List After Sort (dd-MM-yyyy)");
        for (LocalDate dateTime : dateList) {
            System.out.println(dateTime.format(dateTimeFormatter));
        }

    }

}