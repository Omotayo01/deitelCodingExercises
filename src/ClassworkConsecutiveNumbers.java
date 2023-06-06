public class ClassworkConsecutiveNumbers {

    public static int numberAtTheQueriedIndex(int numberOne, int numberTwo, int numberThree) {

        int x = (numberTwo - numberOne) / (numberOne);

        int solution1 = 0;


        int[] returnedList = new int[numberOne];

        for (int i = 0; i < returnedList.length; i++) {

            returnedList[i] = x;

            x = x + 1;
        }

        for (int m = 0; m < returnedList.length; m++) {

            if (numberThree == m) {
                solution1 = returnedList[m];
            }
        }

        return solution1;
    }

    public static void main(String[] args) {



        System.out.println(numberAtTheQueriedIndex(4, 66, 2));
        }

}


