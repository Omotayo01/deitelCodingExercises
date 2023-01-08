package chapterFour;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = data.nextInt();

        double factorial = 1;
        double euler = 1;
        int count = 1;
        int countTwo = 1;
        int countThree = 1;
        double eulerPower = 1;

        while (count <= number) {

            factorial = factorial * count;

            // if (count >=2 && count <= number)

            count = count + 1;

        }

        System.out.println("the factorial " + factorial);


       double factorialTwo = 1;
        while (countTwo <= number) {

            factorialTwo = factorialTwo * countTwo;

            euler = euler + (1/factorialTwo);

            // if (count >=2 && count <= number)

            countTwo = countTwo + 1;

        }

        System.out.println("The euler is:  " + euler);

        double factorialThree = 1;

        double power = 1;
        while (countThree <= number) {

            factorialThree = factorialThree * countThree;

            power = power * number;

            eulerPower = eulerPower + (power/factorialThree);

            // if (count >=2 && count <= number)

            countThree = countThree + 1;

        }

        System.out.println("Euler of the entered number is:  " + eulerPower);


    }
}
