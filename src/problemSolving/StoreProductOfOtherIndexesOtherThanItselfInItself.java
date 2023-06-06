package problemSolving;

import java.util.Arrays;

public class StoreProductOfOtherIndexesOtherThanItselfInItself {

    private static int [] storeProductOfOtherIndexesOtherThanItselfInItself(int [] input){

        int [] arrayProduct = new int[input.length];

        int product;

        for (int i = 0; i < input.length; i++) {
            product = 1;

            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    continue;
                }
                    product = product * input[j];
                }

            arrayProduct[i] = product;
            }

        return arrayProduct;
    }

    public static void main(String[] args) {
        int [] input = {1,2,3,4};

        System.out.println(Arrays.toString(storeProductOfOtherIndexesOtherThanItselfInItself(input)));
    }
}
