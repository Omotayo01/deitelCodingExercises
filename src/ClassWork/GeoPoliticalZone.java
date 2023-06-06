package ClassWork;

import java.util.Scanner;

import static ClassWork.ZoneAndState.NORTH_CENTRAL;

public class GeoPoliticalZone {

    public static void main(String[] args) {



        Scanner collector = new Scanner(System.in);

        System.out.println("Please kindly enter the state you are from");
        String userInput = collector.next();

        if (userInput.equalsIgnoreCase(String.valueOf(NORTH_CENTRAL))) {
            System.out.println("North central");
        }
    }
}
