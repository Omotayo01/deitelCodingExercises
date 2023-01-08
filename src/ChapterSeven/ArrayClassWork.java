package ChapterSeven;

import java.util.Scanner;

public class ArrayClassWork {

    public int[] hello(int[]number, int num) {

        Scanner collect = new Scanner(System.in);

        System.out.println("how many elements do you want in ur array");

        int collectedNumber = collect.nextInt();
      //  int colectedNumberTwo = collect.nextInt();

        int [] scores = new int[collectedNumber];
        int sum = 0;

        for(int index = 0; index < collectedNumber; index++){
            System.out.println("Enter element " + (index+1));

            scores[index] = collect.nextInt();

        }
        System.out.println("Enter any random number");
        int randomNumber = collect.nextInt();

        for (int index = 0; index < scores.length; index++){
            sum += scores[index];
         if (sum == randomNumber)
             break;
        }
        int[] index = new int[0];
        return index;
    }

}
