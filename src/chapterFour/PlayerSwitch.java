package chapterFour;


import java.util.Scanner;

public class PlayerSwitch {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        System.out.println("""
                1
                2
                3
                4
                5
                6
                7
                8
                9
                10
                11
                """);

        System.out.print("Enter one of these numbers to know the player's role on field");
        int enteredNumber = player.nextInt();

        switch (enteredNumber) {
            case 1:
                System.out.println("Goal keeper");
                break;
            case 2:
                System.out.println("right wing defender");
                break;
            case 3:
                System.out.println("left wing defender");
                break;
            case 4:
                System.out.println("Defensive midfielder");
                break;
            case 5:
                System.out.println("central defender");
                break;
            case 6:
                System.out.println("central defender ");
                break;
            case 7:
                System.out.println("right wing forward");
                break;
            case 8:
                System.out.println("Attacking midfielder");
                break;
            case 9:
                System.out.println("Central striker");
                break;
            case 10:
                System.out.println("central midfielder");
                break;
            case 11:
                System.out.println("left wing forward");
                break;
            default:
                System.out.println("Invalid player number");

        }
    }
}
