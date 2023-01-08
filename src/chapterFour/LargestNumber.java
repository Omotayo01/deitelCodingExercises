package chapterFour;
import java.util.Scanner;

public class LargestNumber {

        public static void main(String[] args) {

            int largest = 0;
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Kindly enter a number. Simply enter (done) when you are sated, Note: the (done) is case sensitive: ");
                String enteredNumber = input.nextLine();
                int userInput = Integer.valueOf(enteredNumber);
                if (enteredNumber.equals("done"))
                    break;
                else
                if (userInput > largest)
                    largest = userInput;



            }
            System.out.println("the largest number is : " + largest );
        }
    }
