import java.util.Arrays;

public class MethodCompareTo {

//    public static void main(String[] args) {
//        String me = "coor";
//        String she = "zat";
//
//        System.out.println(me.compareTo(she));
//    }
//}


    public static void main(String[] args) {
        int[] number = {10, 12, 3, 4};

        int[] reversedArray = new int[number.length];


        reversedArray[0] = number[3];
        reversedArray[1] = number[2];
        reversedArray[2] = number[1];
        reversedArray[3] = number[0];

        System.out.println(" reversed array = " + Arrays.toString(reversedArray));


    }

}