package CreditCardValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectingCreditCardNumber {

    private static String collectedCardDetails;

    private static int[] creditCardNumber;



    public static int[] collectCardNumber() {
    Scanner collector = new Scanner(System.in);

        System.out.println("Hello, please kindly enter the card details you want to verify");
        collectedCardDetails = collector.next();

        int [] arrayOfCollectedCardDetails = new int[collectedCardDetails.length()];

        for (int runThroughArray = 0; runThroughArray < arrayOfCollectedCardDetails.length; runThroughArray++){

            arrayOfCollectedCardDetails[runThroughArray] = Integer.parseInt
                    (collectedCardDetails.substring(runThroughArray, runThroughArray + 1));
        }

        return (creditCardNumber = arrayOfCollectedCardDetails);

    }

    private static int doublingThenAddingEachSecondDigitOfCollectedCardNumberFromTheBack(){

        int doubledAndSummedDigitFromTheBack = 0;

     for (int runThroughArray = (creditCardNumber.length -2 ); 0 <= runThroughArray; runThroughArray -= 2){

         int doubledDigit = (creditCardNumber[runThroughArray] * 2);

         if (doubledDigit > 9){
             int breakItDownToSingleDigit = (doubledDigit / 10) + (doubledDigit % 10);

             doubledAndSummedDigitFromTheBack = doubledAndSummedDigitFromTheBack + breakItDownToSingleDigit;
         }
         else

             doubledAndSummedDigitFromTheBack =  doubledAndSummedDigitFromTheBack + doubledDigit ;
     }

     return doubledAndSummedDigitFromTheBack;
    }

    private static int addingEachDigitOfCollectedCardNumberThatAreInOddPositionsFromTheBack(){

        int summedDigitFromTheBackInOddPosition = 0;

        for (int runThroughArray = (creditCardNumber.length - 1 ); 0 <= runThroughArray; runThroughArray -= 2){

            int pickEachDigitInTheArrayInOddPositionFromTheBack = (creditCardNumber[runThroughArray]);

            summedDigitFromTheBackInOddPosition = pickEachDigitInTheArrayInOddPositionFromTheBack
                    + summedDigitFromTheBackInOddPosition;
        }

        return summedDigitFromTheBackInOddPosition;
    }

    private int totalSumOfSummedManipulatedDigitsFromTheBack(){
       int  totalSumOfManipulatedDigitsFromTheBack = 0;

        totalSumOfManipulatedDigitsFromTheBack = (addingEachDigitOfCollectedCardNumberThatAreInOddPositionsFromTheBack()
                + doublingThenAddingEachSecondDigitOfCollectedCardNumberFromTheBack());

        return totalSumOfManipulatedDigitsFromTheBack;
    }

    private void checkCardValidity(){
        if ((totalSumOfSummedManipulatedDigitsFromTheBack() % 10) == 0) {
            System.out.println("Valid");
        }
            else
            System.out.println("Invalid");
        }

        private String checkCardType(){

        if (creditCardNumber[0] == 4){
            return ("Visa");
        }
        else if (creditCardNumber[0] == 5) {
           return ("MasterCard");
        }
        else if ((creditCardNumber[0] == 3) && (creditCardNumber[1] == 7)){
            return ("American Express");
        }
        else if (creditCardNumber[0] == 6) {

           return ("Discover");
        }
        return ("Card type is Invalid");
        }

        private int lengthOfCreditCardNumber(){
        return creditCardNumber.length;
        }

        public void displayCardAnalysisSummary(){
            System.out.print("===============================================\n");
            System.out.printf("%s%s%s" ,"**Credit Card Type:  ", checkCardType(), "\n");
            System.out.printf("%s%s%s" ,"**Credit Card Number:  ", collectedCardDetails, "\n");
            System.out.print("**Credit Card Digit length:  " + lengthOfCreditCardNumber() + "\n");
            System.out.print("**Credit Card Validity Status:  ");
            checkCardValidity();
            System.out.print("===============================================\n");

        }

}
