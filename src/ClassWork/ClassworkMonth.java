package ClassWork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassworkMonth {
    public static void main(String[] args) {

        Date date = new Date();
        DateFormat monthFormat = null;
        String month = null;
        /*
         * M -> Month in digits(1-12)
         * MM -> Month in digits(1-12)
         * MMM -> Month name in 3 chars
         * MMMM -> Full month name
         */
        monthFormat = new SimpleDateFormat("M");
        // Convert Date to String.
        month = monthFormat.format(date);
        System.out.println("Current month in digits : " + month);
        monthFormat = new SimpleDateFormat("MMM");
        // Convert Date to String.
        month = monthFormat.format(date);
        System.out.println("Month name in 3 chars : " + month);
        monthFormat = new SimpleDateFormat("MMMM");
        // Convert Date to String.
        month = monthFormat.format(date);
        System.out.println("Full month name : " + month);

    }

}

