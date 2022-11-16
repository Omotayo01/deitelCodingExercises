package chapterThree;

import java.util.Scanner;

public class highestLowestTrial {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kindly enter a number");
            String number = input.nextLine();
            int userInput = Integer.parseInt(number);
            int largest = userInput;
            int smallest = userInput;

            while (userInput != 0) {
                // String enteredNumber = input.nextLine();

                //int userInput = Integer.parseInt(enteredNumber);

                 if (number.equals("done"))
                    break;

                if (userInput > largest)
                    largest = userInput;
                if (userInput < smallest)
                    smallest = userInput;

                System.out.print("Kindly enter a number. Simply enter (done) when you are sated, Note: the (done) is case sensitive: ");
                userInput = input.nextInt();
            }

            System.out.println("the largest number,and the smallest number are: " + largest + " " + smallest + " respectively");

        }
    }

