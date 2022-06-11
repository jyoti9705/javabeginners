import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SecondLargestElementInIntegerArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 1, 2, 5};
        int[] integerSorted = Arrays.stream(intArray).boxed().collect(Collectors.toCollection(ArrayList::new)).stream().collect(Collectors.toCollection(HashSet::new)).stream().sorted().mapToInt(a -> a).toArray();
        Arrays.stream(integerSorted).forEach(System.out::println);

        //Directly using Java 8
        System.out.println(integerSorted[integerSorted.length-2]);

        //Using Java 7
        int i = Integer.MIN_VALUE;
        int j = 0;
        for (int k = 0 ; k < integerSorted.length;k++){
            if(i<integerSorted[k]){
                j = i;
                i = integerSorted[k];
            }else{
                if(j<integerSorted[k]){
                    j = integerSorted[k];
                }
            }
        }
        System.out.println(j);
    }
}
