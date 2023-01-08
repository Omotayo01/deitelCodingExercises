package ChapterSeven;

import java.util.Scanner;

public class ArrayGiveMeElements {

    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);

        System.out.println("how many scores do you wanna add");

        int numberOfScores = collect.nextInt();

        int [] scores = new int[numberOfScores];
        int sum = 0;

        for(int index = 0; index < numberOfScores; index++){

            System.out.println("Enter score " + (index+1));

            scores[index] = collect.nextInt();


        }

        for (int index = 0; index < scores.length; index++){
            sum += scores[index];

        }

        System.out.println("sum of scores is " + sum);
    }
}
