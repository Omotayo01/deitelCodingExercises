package problemSolving;

import java.util.Scanner;

public class GuessDayOfBirthTillYouAreCorrect {
    private static void guessDayOfBirthTillYouAreCorrect(){
        int dayOfBirth = 16;

        Scanner collector = new Scanner(System.in);
        System.out.println("enter your guess here");

        int guess = collector.nextInt();

        while(guess != dayOfBirth){

            System.out.println("Incorrect Guess ");

            System.out.println("try again");
            guess = collector.nextInt();
        }
        System.out.println("correct guess!!!");
    }

    public static void main(String[] args) {
        guessDayOfBirthTillYouAreCorrect();
    }
}
