package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
   private static double totalTax = 0;
  //  static double totalEarnings = 0;

    public static void main(String[] args) {
        int counter = 0;
        String name = "";
        double totalEarnings = 0.0;

        Scanner tax = new Scanner(System.in);
        while (counter < 3) {
            System.out.println("please enter citizen's name ");
            name = tax.next();

            System.out.println("please enter citizen's annual earnings ");
            totalEarnings = tax.nextDouble();

            if (totalEarnings <= 30_000) {
                totalTax = (15.0 / 100) * totalEarnings;
            } else if (totalEarnings > 30_000) {
                totalTax = (20.0 / 100) * totalEarnings;
            }

            counter = counter + 1;
            System.out.println(name + "'s" + " total tax is " + totalTax);
        }
    }
}
