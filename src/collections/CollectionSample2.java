package collections;

import java.util.LinkedList;
import java.util.List;

public class CollectionSample2 {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Folahan");
        names.add("Malik");

        System.out.println(names);

        List<String> list = List.of("Malik", "Tayo");
        boolean b1 = names.containsAll(list);
        System.out.println(b1);
    }
}
