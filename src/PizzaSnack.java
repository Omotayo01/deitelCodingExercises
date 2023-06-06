public class PizzaSnack {

    private static void pizzaToBeEaten(int numberOfStudent, int minSatisfaction, int maxSatisfaction){

        int minDeterminant = minSatisfaction * 2;

        int maxDeterminant = maxSatisfaction * 3;

        int numberOfStudentThatWillEatSingleSlice = numberOfStudent - (minSatisfaction + maxSatisfaction);

        int numberOfBoxesToBePurchased = (numberOfStudentThatWillEatSingleSlice + minDeterminant + maxDeterminant) / 6  ;

        if (numberOfBoxesToBePurchased % 6 != 0) {
            numberOfBoxesToBePurchased++;
        }

        int numberOfSlicesAvailable = numberOfBoxesToBePurchased * 6;

        int numberOfSlicesConsumed = numberOfStudentThatWillEatSingleSlice + minDeterminant + maxDeterminant;

        int numberOfExtraSlices = numberOfSlicesAvailable - numberOfSlicesConsumed;


        System.out.println("number of pizza boxes bought = " + numberOfBoxesToBePurchased );
        System.out.println("number of pizza slices consumed = " + numberOfSlicesConsumed);
        System.out.println("number of pizza slices left not-consumed = " + numberOfExtraSlices);

    }

    public static void main(String[] args) {
        pizzaToBeEaten(45, 2, 3);
    }

    }




