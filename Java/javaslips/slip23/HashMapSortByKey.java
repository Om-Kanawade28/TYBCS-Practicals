import java.util.*;

public class HashMapSortByKey {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(5, "Apple");
        map.put(2, "Orange");
        map.put(8, "Banana");
        map.put(1, "Mango");

        System.out.println("Before Sorting:");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("\nAfter Sorting by Keys:");
        sortedMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
