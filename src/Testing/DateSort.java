package Testing;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class DateSort {
//    public static void main(String[] args) {
//        List<String > dateList=new ArrayList<String>();
//        dateList.add("30-11-2019");
//        dateList.add("31-08-2019");
//        dateList.add("31-08-2019");
//        dateList.add("30-11-2018");
//        dateList.add("30-11-2018");
//        dateList.add("31-05-2018");
//        dateList.add("30-11-2017");
//        dateList.add("28-02-2017");
//        sortDates(dateList);
//        for (String SortedDate :dateList)
//        {
//            System.out.println(SortedDate);
//        }
//
//    }
//    public static void sortDates(List<String> dateList)
//    {
//        Collections.sort(dateList, new Comparator<String>() {
//            DateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
//            @Override
//            public int compare(String DATE_1, String DATE_2) {
//                try {
//                    return dateformat.parse(DATE_1).compareTo(dateformat.parse(DATE_2));
//                }catch (Exception e){
//                    throw new IllegalArgumentException(e);
//                }
//            }
//        });
//
//
//    }
//}
