package chapterThree;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter a number, enter any negative number to exit");
        int number = input.nextInt();
        int numberOfEven = 0;
        int numberOfOdd = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int count = 1;

        while (number > 0) {

            int factor = number % 2;
            if (factor == 0) {
                sumOfEven = sumOfEven + number;
                numberOfEven = numberOfEven + 1;
            }
            if (factor != 0) {
                sumOfOdd = sumOfOdd + number;
                numberOfOdd = numberOfOdd + 1;
            }
            count = count + 1;

            System.out.print("Kindly enter a number, enter any negative number to exit");
            number = input.nextInt();
        }
        System.out.println("Number of odd numbers entered is " + numberOfOdd);
        System.out.println("Number of even numbers entered is " + numberOfEven);
        System.out.println("sum of odd numbers entered is " +  sumOfOdd);
        System.out.println("sum of even numbers entered is " + sumOfEven);

    }
}
