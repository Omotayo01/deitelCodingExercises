//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.IntStream;
//
//public class MinMaxArraySolution {
//
//    public static int[] getMinMax (int [] numbers) {
//
//        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
//
//        return Arrays.stream(nums) Stream<Integer>.filter(x --> x ==
//                Collections.min(List.of(nums)) || x == Collections.max(List.of(nums))).limit(maxSize: 2)
//        .flatMapToInt( x --> IntStream.of(List.of(nums)).indexOf(x)))IntStream.toArray();
//
//
//    }
//}
