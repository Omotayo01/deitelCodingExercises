package ChapterFive;

public class SumOfIntegersBtwOneToThirtyDivisibleByThree {

    public static void main(String[] args) {

        int counter;
        int sum = 0;

        for (counter = 1 ; counter <= 30 ; counter = counter + 1){
            int divisible = counter % 3;

            if (divisible == 0)
              sum = sum + counter;
        }
        System.out.println("sum of the integers between one and thirty divisible by three is " + sum);
    }
}
