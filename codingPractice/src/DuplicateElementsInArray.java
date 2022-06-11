import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateElementsInArray {

    //Find Duplicate elements in the array

    public static void main(String args[]){
        int[] intArray= new int[]{1,2,3,1,2,5};
        List<Integer> list = Arrays.stream(intArray).boxed().toList();
        //Using HashMap
        System.out.println(list.stream().collect(groupingBy(Function.identity(),counting())).entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet()));
        //Using Set
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet());
        System.out.println(duplicateSet);
    }
}
