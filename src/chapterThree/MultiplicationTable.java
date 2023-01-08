package chapterThree;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = input.nextInt();

        int count = 1;

        while (count <= 12) {
            System.out.println(number + " " + "times" + " " + count + " " + "is" + " " + (count * number));
            count = count + 1;
        }
    }
}
