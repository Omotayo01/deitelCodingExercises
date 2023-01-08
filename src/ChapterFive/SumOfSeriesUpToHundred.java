package ChapterFive;

public class SumOfSeriesUpToHundred {

    public static void main(String[] args) {

        int total = 0;
        int counter;

        System.out.printf("%s\t%s\t%n","n", "sum of the sequence");

        for (counter = 1; counter <= 100 ; counter++){
            total = total + counter;

            System.out.printf("%d\t%d\t%n" ,counter ,total);
        }
    }
}
