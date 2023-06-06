package collections;

import java.util.*;

public class CollectionSample {

    public static void main(String[] args) {
        Collection<Integer> collection = List.of(11,12,13,14);
        Queue<Integer> picker = new LinkedList<> ();
        picker.add(15);
        picker.add(16);
        picker.add(17);
        picker.add(18);
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(2, 100);

        nums.addAll(collection);
        nums.addAll(picker);

        //TODO: [10, 20, 100, 30, 40, 11, 12, 13, 14, 15, 16, 17, 18]
        System.out.println(nums);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<String> words = Arrays.asList("QWERTY","ASDFG", "ZXCVB");
        List<String> names  = List.of("James", "Birthday geh", "Austin");
    }
}
