import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4,5,6,7,8};
        int[] a2 = new int[]{1,2,3,4,5,6};
        ArrayList<Integer> integerArrayList = Arrays.stream(a2).boxed().collect(Collectors.toCollection(ArrayList::new));
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0 ; i < a1.length ; i++){
            if(integerArrayList.contains(a1[i])){
                set1.add(a1[i]);
            }
        }
        set1.stream().forEach(System.out::println);
    }


}
