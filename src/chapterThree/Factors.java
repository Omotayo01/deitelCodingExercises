package chapterThree;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = data.nextInt();
        int count = 1;
        int numberOfFactors = 0;

        while (count <= number) {
         int factor = number % count;
           if (factor == 0) {
               System.out.println(count);
               numberOfFactors = numberOfFactors + 1;
           }


            count = count + 1;
        }

        System.out.println(number + " has " + numberOfFactors + " factors");
    }
}
