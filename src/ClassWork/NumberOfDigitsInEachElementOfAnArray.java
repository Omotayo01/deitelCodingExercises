package ClassWork;

public class NumberOfDigitsInEachElementOfAnArray {

    public static int  numberOfDigitsInEachElementOfAnArray(String[] input){
        int totalNumberOfDigit = 0;
            StringBuilder merge = new StringBuilder();
        for (String i : input) {
            merge.append(i);
        }


        String result = merge.toString();


        for (int j = 0; j < result.length(); j++) {
            if (result.charAt(j) >= 48 && result.charAt(j) <= 57)
                totalNumberOfDigit++;
        }
        return totalNumberOfDigit;
    }

}
