package chapterThree;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = collector.nextInt();
        int count = 1;
        int numberOfFactors = 0;

        while (count <= number) {
            int factor = number % count;
            if (factor == 0) {
                numberOfFactors = numberOfFactors + 1;
            }


            count = count + 1;
        }
        if (numberOfFactors == 2)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is a not prime number");

    }

}



