package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner driver = new Scanner(System.in);
        float milesPerGallon = 0;
        float combinedMilesPerGallon = 0;
        int counter = 0;

        System.out.println("press 1 to enter (miles driven and gallon used), press -1 when you are done entering all your input ");
        int userInput = driver.nextInt();

        System.out.println();

        while (userInput != -1) {
            System.out.println("please enter miles driven: ");
            int milesDriven = driver.nextInt();

            System.out.println("please enter gallon used: ");
            int gallonUsed = driver.nextInt();

            milesPerGallon = (float) (milesDriven / gallonUsed);
            System.out.println("miles per gallon for this trip is " + milesPerGallon);

            combinedMilesPerGallon = combinedMilesPerGallon + milesPerGallon;

            counter = counter + 1;

            System.out.println("press 1 to enter (miles driven and gallon used), press -1 when you are done entering all your input ");
            userInput = driver.nextInt();

        }

        System.out.println("total miles per gallon used is " + combinedMilesPerGallon);
    }
}
