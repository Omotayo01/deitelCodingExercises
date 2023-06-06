package ClassWork;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    private static void ageCalculator() {
        Scanner collector = new Scanner(System.in);

        System.out.println("enter the date");
        String input = collector.next();

        String[] splitedInput = input.split("/");

        LocalDate dateOfBirth = LocalDate.of(Integer.parseInt(splitedInput[2]),
                Integer.parseInt(splitedInput[1]), Integer.parseInt(splitedInput[0]));

        LocalDate dateToday = LocalDate.now();

//        int calculatedAge = dateToday.getYear() - dateOfBirth.getYear() ;

        Period calculatedAge = Period.between(dateOfBirth, dateToday);

        System.out.println("you are " + calculatedAge.getYears() + " years old");

//        System.out.println("you are " + calculatedAge + " years old");

    }

    public static void main(String[] args) {
        ageCalculator();
    }
}