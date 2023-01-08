package chapterFour;

import java.util.Scanner;

public class FirstNumberPowerOfSecond {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int firstNumber = data.nextInt();

        System.out.print("Kindly enter another number");
        int secondNumber = data.nextInt();
        int  firstNumberPowerOfSecond = 1 ;
        int count = 1;

        while (count <= secondNumber) {

            firstNumberPowerOfSecond =  firstNumberPowerOfSecond * firstNumber;
                count = count + 1;

        }
        System.out.println(firstNumberPowerOfSecond);

    }
}