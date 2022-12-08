package Testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ToValidateDateIsFallingUderCertainRange {
    public static void main(String[] args) throws ParseException {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate.getYear());
        String dateToValidate="11/11/2022";
        String dateFormat="dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        Date date = sdf.parse(dateToValidate);
        Calendar currentDateAfter7Days = Calendar.getInstance();
        currentDateAfter7Days.add(Calendar.DAY_OF_WEEK, 7);
        if (date.before(currentDateAfter7Days.getTime()))
        {
            System.out.println("true haii");
        } else {
            System.out.println("false haii");
        }
    }
}
