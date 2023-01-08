package chapterFour;

import java.util.Scanner;

public class EncryptingIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four digits number:");
        int fourDigitsNumber = input.nextInt();

        int firstDigit = fourDigitsNumber / 1000 % 10;
        int secondDigit = fourDigitsNumber / 100 % 10;
        int thirdDigit = fourDigitsNumber / 10 % 10;
        int fourthDigit = fourDigitsNumber % 10;

        firstDigit = firstDigit + 7;
        secondDigit = secondDigit + 7;
        thirdDigit = thirdDigit + 7;
        fourthDigit = fourthDigit + 7;

        firstDigit = firstDigit % 10;
        secondDigit = secondDigit % 10;
        thirdDigit = thirdDigit % 10;
        fourthDigit = fourthDigit % 10;

       int swapDigitOne = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit =swapDigitOne;


        int swapDigitTwo = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = swapDigitTwo;

        System.out.println("Result of the encryption is " + firstDigit + secondDigit + thirdDigit + fourthDigit);

        System.out.print("Kindly Enter the encryption result, or any encrypted number to reverse: ");
        int fourDigitsEncryptedNumber = input.nextInt();


        int firstEncryptedDigit = fourDigitsEncryptedNumber / 1000 % 10;
        int secondEncryptedDigit = fourDigitsEncryptedNumber / 100 % 10;
        int thirdEncryptedDigit = fourDigitsEncryptedNumber / 10 % 10;
        int fourthEncryptedDigit = fourDigitsEncryptedNumber % 10;

        int swapEncryptedDigitOneBack = firstEncryptedDigit;
        firstEncryptedDigit = thirdEncryptedDigit;
        thirdEncryptedDigit = swapEncryptedDigitOneBack;


        int swapEncryptedDigitTwoBack = secondEncryptedDigit;
        secondEncryptedDigit = fourthEncryptedDigit;
        fourthEncryptedDigit = swapEncryptedDigitTwoBack;

         firstEncryptedDigit = firstEncryptedDigit + 10;
         secondEncryptedDigit = secondEncryptedDigit + 10;
         thirdEncryptedDigit = thirdEncryptedDigit + 10;
         fourthEncryptedDigit = fourthEncryptedDigit + 10;


        firstEncryptedDigit = firstEncryptedDigit - 7;
        secondEncryptedDigit = secondEncryptedDigit - 7;
        thirdEncryptedDigit = thirdEncryptedDigit - 7;
        fourthEncryptedDigit = fourthEncryptedDigit - 7;

        firstEncryptedDigit = firstEncryptedDigit % 10;
        secondEncryptedDigit = secondEncryptedDigit % 10;
        thirdEncryptedDigit = thirdEncryptedDigit % 10;
        fourthEncryptedDigit = fourthEncryptedDigit % 10;

        System.out.println("The Decoded number is " + firstEncryptedDigit + secondEncryptedDigit + thirdEncryptedDigit + fourthEncryptedDigit);

    }
}

