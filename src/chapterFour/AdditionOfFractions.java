package chapterFour;

import java.util.Scanner;

public class AdditionOfFractions {
    public static  void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Kindly enter a number");
        int number = data.nextInt();

        double  additionOfTheFraction = 0 ;
        int fractionOfTheAdditionDen = 1;
        int fractionOfTheAdditionNum = 0;
        int count = 1;
        int countOne = 1;
        int countTwo = 1;
        int countThree = 1;
        int countFour = 1;
        int countFive = 1;

        while (count <= number) {

            additionOfTheFraction = (1.0/count) + (additionOfTheFraction);
            if (count >=2 && count <= number)
           fractionOfTheAdditionDen = count * fractionOfTheAdditionDen;
           // if (count >=2 && count <= number)

            count = count + 1;

        }
       while (countOne <= number) {
            fractionOfTheAdditionNum = fractionOfTheAdditionDen/countOne + fractionOfTheAdditionNum;
           countOne = countOne + 1;
        }
       while (fractionOfTheAdditionNum % 2 == 0 && fractionOfTheAdditionDen % 2 == 0) {
           fractionOfTheAdditionNum = fractionOfTheAdditionNum / 2;
           fractionOfTheAdditionDen = fractionOfTheAdditionDen / 2;

           countTwo = countTwo + 1;
       }
        while (fractionOfTheAdditionNum % 3 == 0 && fractionOfTheAdditionDen % 3 == 0) {
            fractionOfTheAdditionNum = fractionOfTheAdditionNum / 3;
            fractionOfTheAdditionDen = fractionOfTheAdditionDen / 3;

            countThree = countThree + 1;
        }
        while (fractionOfTheAdditionNum % 4 == 0 && fractionOfTheAdditionDen % 4 == 0) {
            fractionOfTheAdditionNum = fractionOfTheAdditionNum / 4;
            fractionOfTheAdditionDen = fractionOfTheAdditionDen / 4;

            countFour = countFour + 1;
        }
        while (fractionOfTheAdditionNum % 5 == 0 && fractionOfTheAdditionDen % 5 == 0) {
            fractionOfTheAdditionNum = fractionOfTheAdditionNum / 5;
            fractionOfTheAdditionDen = fractionOfTheAdditionDen / 5;

            countFive = countFive + 1;
        }
        System.out.println(additionOfTheFraction);
        System.out.println(fractionOfTheAdditionNum  + "/" + fractionOfTheAdditionDen );
        }
    }

