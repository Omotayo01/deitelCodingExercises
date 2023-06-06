package streamOperations;

import java.util.*;
import java.util.stream.Collectors;

public class CollectListOfStringReturnMapThatHasLengthOfTheString {

    public static void main(String[] args) {
//        List<String> names = List.of("Feliz", "Prof",
//                "Joshua",
//                "Zainab",
//                "Deborah");
//
//        System.out.println(names
//                .stream()
//                .map(String::toUpperCase)
//                .filter(x -> x.length() <= 5)
//                .toList());
//
//        System.out.println(names
//                .stream()
//
//                .collect(Collectors.toMap(String::toString, String::length)));

        Map<String, Integer> input = new HashMap<>();
        input.put("Felix", 25);
        input.put("Tayo", 18);
        input.put("Zainab", 26);
        input.put("Renike", 32);
        input.put("Bola", 19);

//        input.forEach((k,v)->System.out.println(k + ":" + v));

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(input.entrySet());

        sortedList.sort(Map.Entry.comparingByValue());

        sortedList.forEach(System.out::println);

//        Map<Integer, String> result = new HashMap<>();
//
//        // put every value list to Map
//        for (Map.Entry<String, Integer> element : sortedList) {
//            result.put(element.getValue(), element.getKey());
//        }
//
//
//        System.out.println("Map  : " + result);
//    }

//        LinkedHashMap<String, Integer> result = input.entrySet().stream()
//                .collect(Collectors.toMap(String::toString,
//                        Integer::valueOf,
//                        (x, y) -> (x + ", " + y),
//                        LinkedHashMap::new));
//
//        result.forEach(
//                (x, y) -> System.out.println(x + "=" + y));
//
//        Map<String , Integer> sorted  = input.entrySet().stream().sorted(Map.Entry.<String,
//                        Integer>comparingByValue()
//                .thenComparing(Map.Entry.comparingByKey())).collect
//                (Collectors.toMap(Map.Entry::getKey,
//                Map.Entry::getValue, (x,y) -> x,
//                LinkedHashMap::new));
//
//        System.out.println(sorted);

    }
}

