package ChapterSix;

import java.util.Scanner;

public class PrimeNumbersLessThanOneThousand {

    public static void main(String[] args) {
        Scanner picker = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = picker.nextInt();
        int count = 1;
        int countTwo = 1;
        int numberOfFactors = 0;

        while (count <= number / 2) {
            count = count + 1;
            while (countTwo <= count) {


                }


            }


//        while (count <= number/2) {
////
//            if (number % count == 0)
//
//                numberOfFactors = numberOfFactors + 1;
//
//            if (numberOfFactors == 2)
//
//                System.out.println(count);
////               // factorsReal = count;
////           // if (count % countTwo == 0 )
////            System.out.println(count);
//
////            int factor = number % count;
////            if (factor == 0) {
////                numberOfFactors = numberOfFactors + 1;
////                if (numberOfFactors == 2)
////                    System.out.println(count);
//            }
//
//
//            count = count + 1;
        }


//        if (numberOfFactors == 2)
//            System.out.println(number + " is a prime number");
//        else
//            System.out.println(number + " is a not prime number");


    }



