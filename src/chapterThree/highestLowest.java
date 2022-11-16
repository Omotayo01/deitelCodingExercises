package chapterThree;

import java.util.Scanner;

public class highestLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        while (number != 0) {
            // String enteredNumber = input.nextLine();

            //int userInput = Integer.parseInt(enteredNumber);

            // if (number.equals("done"))
            //break;

            if (number > largest)
                largest = number;
            if (number < smallest)
                smallest = number;

            System.out.print("Kindly enter a number. Simply enter (done) when you are sated, Note: the (done) is case sensitive: ");
            number = input.nextInt();
        }

            System.out.println("the largest number,and the smallest number are: " + largest + " " + smallest + " respectively");

        }
    }

