package chapterFour;


import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        Scanner world = new Scanner(System.in);

        System.out.println("Kindly enter the world population right now: ");
        double worldPopulation = world.nextDouble();

        double currentWorldPopulation = worldPopulation;

        int year = 1;

        double growthRate = 2.3;

        System.out.println("Year\t world population\t growth annually");

        while (year <= 75){

            double increaseInGrowthAnnually = (currentWorldPopulation * growthRate) / 100;

            currentWorldPopulation = currentWorldPopulation + increaseInGrowthAnnually;

            System.out.printf("%d\t %.2f\t %.2f", year, currentWorldPopulation, increaseInGrowthAnnually);

            System.out.println();

            if ((currentWorldPopulation / worldPopulation) >= 2.0 && (currentWorldPopulation / worldPopulation) <= 2.03)

                System.out.println("world population at year one doubled at year " + year);

            year = year + 1;


        }

    }
}
