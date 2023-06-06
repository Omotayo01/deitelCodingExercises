package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedList {

    private static int [] mergeTwoSortedArrays(int [] firstArray, int [] secondArray){


        int [] mergedSortedArray = new int[firstArray.length + secondArray.length];

        int tempArray = 0;

        for (int k = 0; k < mergedSortedArray.length; k++){
            if (k >= firstArray.length ){
                mergedSortedArray [k] = secondArray[k- firstArray.length];
            }
            else  mergedSortedArray[k] = firstArray[k];

        }


        for (int i = 0; i < mergedSortedArray.length; i++){
                for (int j = i+1; j < mergedSortedArray.length - 1; j++ ){
                    if(mergedSortedArray[i] > mergedSortedArray[j])
                    {
                        tempArray = mergedSortedArray[i];
                        mergedSortedArray[i] = mergedSortedArray[j];
                        mergedSortedArray[j] = tempArray;
                    }
                }
        }

        return mergedSortedArray;
    }

    public static void main(String[] args) {
        int [] firstArray = {3,5, 8, 12};
        int [] secondArray = {2, 4, 7, 10, 14};
        System.out.println(Arrays.toString(mergeTwoSortedArrays(firstArray, secondArray)));
    }
}
