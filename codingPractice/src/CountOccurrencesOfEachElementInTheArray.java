import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CountOccurrencesOfEachElementInTheArray {
    public static void main(String[] args) {
        int[] intArray= new int[]{1,2,3,1,2,5};
        System.out.println(Arrays.stream(intArray).boxed().collect(Collectors.groupingBy(Function.identity(),counting())));
    }
}
