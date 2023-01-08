package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    private static double salesPersonEarnings = 0.0;

    static double totalSales = 0.0;
    public static void main(String[] args) {

        Scanner sales = new Scanner(System.in);

        System.out.println("kindly enter sale's person sales for the week, enter -1 when you are done ");
       double  salesWeekly = sales.nextDouble();

       int counter = 0;
       while (salesWeekly != -1){
           totalSales = totalSales + salesWeekly;
           counter = counter + 1;
           System.out.println("kindly enter sale's person sales for the week, enter -1 when you are done ");
           salesWeekly = sales.nextDouble();
       }
        salesPersonEarnings = 200 + ((9 * totalSales) / 100);

        System.out.println("this sale's person total earning for the week is: " + salesPersonEarnings);
    }

}
