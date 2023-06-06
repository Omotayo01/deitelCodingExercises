
import java.util.Arrays;

public class ClassworkArray {

    private static int [] input(int[] number) {

        int a = 0;
        int b = 0;

        int sum = 0;
        int total = 0;
        int [] solution = new int[4];
        int maximum = -999999999;

        int minimum = 999999999;


        int [] actualSolution = new int[2];

        int [] realSolution = new int[2];


        for (int i = 0; i < number.length; i++) {
            sum = number[i] + sum;
            }
        for (int j = 0 ; j < number.length; j++){
           total = sum - number[j];

            solution[j] = total;

//           total++;
        }

        for (int k = 0; k < number.length; k++) {
            if ( maximum<solution[k]) {
                maximum = solution[k];
            }
            if ( minimum > solution[k]){
                minimum = solution[k];
            }
//            System.out.println(minimum);
        }
//            for (int l = 0; l < number.length; l++) {
//
//            if ( minimum>solution[l]){
//                minimum = solution[l];
//            }
//
//        }
        actualSolution[0] = minimum;
        actualSolution[1] = maximum;

        for (int m = 0; m < number.length; m++){

            if (maximum == solution[m]){
                a = m;
            }
            if (minimum == solution[m]){
                b = m;
            }
        }

        realSolution[0] = b;

        realSolution[1] = a;


        System.out.println(Arrays.toString(solution));
//
//        System.out.println(" " + Arrays.toString(actualSolution));

        System.out.println("index that gave minimum and maximum sum is as  follows" + Arrays.toString(realSolution));


        return solution;


    }

    public static void main(String[] args) {
        int [] numbers = {-1, -3, -5, -7};
        input(numbers);
    }

}