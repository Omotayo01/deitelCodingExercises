package streamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterEvenNumbers {
    public static void main(String[] args) {


        int[] l = {1, 2, 3, 4};

        Arrays.stream(l).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
    }

    private static Stream<Integer> filterThings() {
        int[] l = {1, 2, 3, 4};

        Arrays.stream(l).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
        return null;
    }
}
