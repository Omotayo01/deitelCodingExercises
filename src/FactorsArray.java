import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorsArray {

    public static int[] commonFactors(int number) {
        int count = 0;
//        char me = ' ';
        int processor = number;
//        StringBuilder resultt = new StringBuilder();
        ArrayList<Integer> result = new ArrayList<>();
        int divisor = 2;

        for (int i = 0; i <= processor ; i++) {

            if (processor % divisor != 0) {
                break;
            }
            result.add( divisor);
//            me = (char) divisor;
//            resultt.append(me);

//           count++;



            processor = processor / divisor;
        }

        divisor++;

        for (int j = 0; j <= processor * 2 ; j++){
            if (processor % divisor == 0) {
                result.add(divisor);
//                me = (char) divisor;
//                resultt.append(me);
                count++;
                processor = processor / divisor;
            } else if (processor % divisor != 0) {
                divisor++;

            }
        }

        int [] answer = new int[result.size()];

//        int [] answer = new int[count];

        for(int k = 0; k < answer.length ; k++){

            answer[k] = result.get(k);

//            answer[k] = Integer.valueOf(resultt.substring(k, k + 1));

        }

        return answer;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(commonFactors(99)));
    }

}
