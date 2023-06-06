package problemSolving;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

    private static int convertBinaryToDecimal(){
        Scanner collector = new Scanner(System.in);
        System.out.println("kindly enter your binary number");
        String binaryNumber = collector.next();
        int sum = 0;
        int count = 0;

        int [] binaryArray = new int[binaryNumber.length()];

        for (int i = 0; i < binaryNumber.length(); i++){
            binaryArray[i] = Integer.parseInt(binaryNumber.substring(i, i+1));
        }

        for (int j = binaryArray.length - 1; j >= 0; j-- ){
            sum = (int) (sum + Math.pow((binaryArray[j] * 2), count));

            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Decimal equivalent of the entered binary is " + convertBinaryToDecimal());
    }
}
