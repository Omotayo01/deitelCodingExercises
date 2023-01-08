package tdd.chapterThree;

import java.util.Scanner;

public class HeartRatesMain {

    public static void main(String[] args) {

        HeartRates OAUTHC = new HeartRates("", "", 0, 0, 0);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the user's first name");
     String userFirstName = input.nextLine();
     OAUTHC.setUserFirstName(userFirstName);

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter the user's Last name");
        String userLastName = inputTwo.nextLine();
        OAUTHC.setUserLastName(userLastName);

        Scanner inputThree = new Scanner(System.in);
        System.out.println("Please enter the user's month of birth");
        int userMonthOfBirth = inputThree.nextInt();
        OAUTHC.setUserMonthOfBirth(userMonthOfBirth);

        Scanner inputFour = new Scanner(System.in);
        System.out.println("Please enter the user's year of birth");
        int userYearOfBirth = inputFour.nextInt();
        OAUTHC.setUserYearOfBirth(userYearOfBirth);

        Scanner inputFive = new Scanner(System.in);
        System.out.println("Please enter the user's day of birth");
        int userDayOfBirth = inputFive.nextInt();
        OAUTHC.setUserDayOfBirth(userDayOfBirth);

       // HeartRates samuel = new HeartRates("Samuel", "Alawode", 11, 14, 1994);

        System.out.println("Mr/Mrs/Miss " + OAUTHC.getUserLastName() + "'s" + " " + OAUTHC.getUserFirstName() + " date of birth is " + OAUTHC.userDateOfBirth() + "\n");

        System.out.println("Mr/Mrs/Miss " + OAUTHC.getUserLastName() +  "'s" + " is " + OAUTHC.userAgeCalculatedInYears() + " years old" + "\n");

        System.out.println("Mr/Mrs/Miss " + OAUTHC.getUserLastName() + "'s" + " Maximum heart rate is " + OAUTHC.userMaximumHeartRate() + "\n");

        System.out.println("Mr/Mrs/Miss " + OAUTHC.getUserLastName() + "'s" + " Target heart rate ranges between " + OAUTHC.userTargetHeartRate() + "\n");
    }
}