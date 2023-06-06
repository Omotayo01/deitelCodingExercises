import java.util.Scanner;

public class ArrayVideo {

    static Scanner collector = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("How many numbers do you wanna enter? ");
        int number = collector.nextInt();
        int [] myIntegers = getIntegers(number);

        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("element is " + i + " typed value was " + myIntegers[i] );
        }
    }

    public static int [] getIntegers(int number){
        System.out.println( "Enter " + number + " integer values");

        int [] values = new int[number];
        for (int i =0; i < values.length; i++){
            values[i] = collector.nextInt();
        }
        return values;
    }
}
