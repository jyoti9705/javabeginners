import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StringAB {
    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//            String[] words = line.split(",");
//            String A = words[0];
//            String B = words[1];
//            if(A.endsWith(B)){
//                System.out.println(1);
//            }else {
//                System.out.println(0);
//            }

       // }
        List<Integer> integerList = Arrays.asList(10,11,12,12,13,11,14,14,15,14,16,17,17);
        Set<Integer> integerSet = new HashSet<>(){};
        integerList.stream().filter(x->!integerSet.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

        String str = "Hello Jyoti How are you you look great we welcome you with big hello";

        List<String> stringList = Arrays.asList(str.split(" "));
        Map<String , Long > map = stringList.stream().collect(groupingBy(Function.identity(),counting()));
        System.out.println(map.toString());

    }
}
