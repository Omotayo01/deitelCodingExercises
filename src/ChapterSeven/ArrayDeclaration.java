package ChapterSeven;

import tdd.Account;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        int [] numbers = new int[10];

        System.out.println(Arrays.toString(numbers));

        numbers[0] = 34;
        numbers[8] = -1;

        System.out.println(numbers);

        // to now see the elements of the array in individual memory location

        System.out.println(Arrays.toString(numbers));
    }
}
