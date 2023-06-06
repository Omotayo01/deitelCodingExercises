package problemSolving;

import java.util.Scanner;

public class SumOfIntegersDivisibleBy3Between1AndAnyEnteredNumber {

    private static int sumOfIntegersDivisibleBy3Between1AndAnyEnteredNumber(int number){
        int count;
        int divisor;
        int sum = 0;
        for (count = 3; count <= number ; count++ ){
            divisor = count % 3;
            if (divisor == 0){
                sum = sum + count;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        System.out.println("enter any whole number");
        int number = collector.nextInt();

        System.out.println("sum of the integers divisible by (3) between one and " + number + " is " +
                sumOfIntegersDivisibleBy3Between1AndAnyEnteredNumber(number));
    }
    
}
