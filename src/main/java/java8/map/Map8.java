package main.java.java8.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map.java
 */
public class Map8 {

    public void testMap(){

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.putIfAbsent(i, "val" + i);
        }

        System.out.println("Map test:");
        map.forEach((id, val) -> System.out.print(val + " "));

        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println("\nCompute if present: " + map.get(3));

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println("Compute if absent: " + map.get(23));

        System.out.println("Remove by key and value: ");
        map.remove(3, "val3");
        System.out.println(map.get(3));
        map.remove(3, "val33");
        System.out.println(map.get(3));

        System.out.print("Get or default: ");
        System.out.println(map.getOrDefault(43, "Not found"));

        System.out.println("Map merge: ");
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));
    }

}
