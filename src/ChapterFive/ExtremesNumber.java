package ChapterFive;

import java.util.Scanner;

public class ExtremesNumber {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        System.out.print("How manny times do you want this app to collect numbers from you? ");
        int sentinel = collector.nextInt();

        System.out.print("Kindly enter a number : ");
        int number = collector.nextInt();

        int counter = 1;

        int largest = number;
        int smallest = number;

        while (counter < sentinel) {


            if (number > largest)
                largest = number;
            if (number < smallest)
                smallest = number;

            counter = counter + 1;

            System.out.print("Kindly enter a number : ");
            number = collector.nextInt();
        }

       int  sumOfTheExtremes = largest + smallest;
        System.out.println("sum of the numbers at the extreme in the entered stream is : " + sumOfTheExtremes);

    }
}
