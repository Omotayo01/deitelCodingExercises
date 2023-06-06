package ClassWork;

import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ConvertMonthToWords {




////creating a constructor of the SimpleDateFormat class
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
////getting current date
//        System.out.println("Today's date: "+formatter.format(calender.getTime()));
////creating a constructor of the Format class
////displaying full-day name
//        Format format = new SimpleDateFormat("EEEE");
//        String str = format.format(new Date());
////prints day name
//        System.out.println("Day Name: "+str);

    public static void main(String[] args) {


    Scanner collector = new Scanner(System.in);

        System.out.println("enter the date");
        String input = collector.next();

        String [] splitedInput = input.split("/");
//        String dayNames[] = new DateFormatSymbols().getWeekdays();

        String [] dayNames = new DateFormatSymbols().getWeekdays();
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.YEAR, Integer.parseInt(splitedInput[2]));
        calender.set(Calendar.MONTH, Integer.parseInt(splitedInput[1]));
        calender.set(Calendar.DAY_OF_MONTH, Integer.parseInt(splitedInput[0]));



        for (int i = 0; i < 1; i++){
            if (splitedInput[1].equals("01")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", January," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("02")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", February," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("03")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", March," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("04")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]   + ", April," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("05")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", May," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("06")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", June," + splitedInput[2]);
                break;
            }
            if (splitedInput[1].equals("07")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]   + ", July," + splitedInput[2]);
                break;
            }if (splitedInput[1].equals("08")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)] + ", August," + splitedInput[2]);
                break;
            }if (splitedInput[1].equals("09")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)] + ", September," + splitedInput[2]);
                break;
            }if (splitedInput[1].equals("10")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", October," + splitedInput[2]);
                break;
            }if (splitedInput[1].equals("11")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)] + ", November," + splitedInput[2]);
                break;
            }if (splitedInput[1].equals("12")) {
                System.out.println(dayNames[calender.get(Calendar.DAY_OF_MONTH)]  + ", December," + splitedInput[2]);
                break;
            }
        }
    }


}
