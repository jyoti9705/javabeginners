import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

    public static void main(String[] args) {
        //Concurrent hashmap provides atomic operations
        //Concurrent hashmap takes intelligent approach by making locks over each region in HashTable
        ConcurrentHashMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();
        String str = "My Name is Jyoti Singh";
        for (Character c : str.toCharArray()) {
            occurrences.computeIfAbsent(c, character -> new LongAdder()).increment();
        }
        System.out.println(occurrences);
    }
}
