package chapterFour;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter student A grade");
        float enteredNumber = grade.nextFloat();
        int count = 1;
        float total = 0;

        while (count <= 10) {

            if (count == 1)
                total = total + enteredNumber;
            count = count + 1;
            if (count == 2)
                System.out.print("Enter student B grade");
            float enteredNumberTwo = grade.nextFloat();
            total = total + enteredNumberTwo;
            count = count + 1;

            if (count == 3)
                System.out.print("Enter student C grade");
            float enteredNumberThree = grade.nextFloat();
            total = total + enteredNumberThree;
            count = count + 1;

            if (count == 4)
                System.out.print("Enter student D grade");
            float enteredNumberFour = grade.nextFloat();
            total = total + enteredNumberFour;
            count = count + 1;

            if (count == 5)
                System.out.print("Enter student E grade");
            float enteredNumberFive = grade.nextFloat();
            total = total + enteredNumberFive;
            count = count + 1;

            if (count == 6)
                System.out.print("Enter student F grade");
            float enteredNumberSix = grade.nextFloat();
            total = total + enteredNumberSix;
            count = count + 1;

            if (count == 7)
                System.out.print("Enter student G grade");
            float enteredNumberSeven = grade.nextFloat();
            total = total + enteredNumberSeven;
            count = count + 1;

            if (count == 8)
                System.out.print("Enter student H grade");
            float enteredNumberEight = grade.nextFloat();
            total = total + enteredNumberEight;
            count = count + 1;

            if (count == 9)
                System.out.print("Enter student I grade");
            float enteredNumberNine = grade.nextFloat();
            total = total + enteredNumberNine;
            count = count + 1;


                System.out.print("Enter student J grade");
            float enteredNumberTen = grade.nextFloat();
            if (count == 10)
            total = total + enteredNumberTen;
            count = count + 1;
        }

        float average = total / 10;

        System.out.println("Average of the students scores is: " + average);

    }
}
