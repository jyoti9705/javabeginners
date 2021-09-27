import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", map.getOrDefault("A", 0) + 1);
        map.put("B", 3);
        map.put("Z", 10);
        System.out.println("=========================Printing Values in a Map==========================================");
        map.entrySet().stream().forEach(System.out::println);
        //Few Utility methods in Map
        System.out.println(map.get("A")); //Output : 1
        System.out.println(map.containsKey("A")); //Output : true
        System.out.println(map.containsValue(11)); //Output : false
        System.out.println(map.values()); // Output : 1 ,  3, 10;

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 11);
        hashMap.put("C", 12);
        hashMap.put("D", 13);
        hashMap.put("T", 24);
        System.out.println("=========================Printing Values in a HashMap==========================================");
        System.out.println(hashMap.entrySet());

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 34);
        linkedHashMap.put("B", 56);
        linkedHashMap.put("C", 12);
        linkedHashMap.put("T", 67);
        linkedHashMap.put("D", 24);
        System.out.println("=========================Printing Values in a LinkedHashMap==========================================");
        System.out.println(linkedHashMap.entrySet());


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 34);
        treeMap.put("B", 56);
        treeMap.put("C", 12);
        treeMap.put("T", 67);
        treeMap.put("D", 24);
        System.out.println("=========================Printing Values in a TreeMap==========================================");
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.floorKey("A"));
        System.out.println(treeMap.ceilingKey("B"));
        System.out.println(treeMap.lowerKey("A"));
        System.out.println(treeMap.higherKey("B"));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());


    }
}
