import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Orange");
        names.add("Banana");


        System.out.println("========================Printing each elements in a list===================================");
        names.stream().forEach(System.out::println);

        System.out.println("=======================Printing only elements ending with e================================");
        names.stream().filter(e -> e.endsWith("e")).forEach(System.out::println);

        System.out.println("=======================Collecting elements ending with e and collect to list================");
        names.stream().filter(e -> e.endsWith("e")).collect(Collectors.toList()).stream().forEach(System.out::println);

        System.out.println("======================Arraylist to Array====================================================");
        Arrays.stream(names.stream().toArray()).forEach(System.out::println);

        List<Integer> numlist = new ArrayList<>();
        numlist.add(20);
        numlist.add(30);
        numlist.add(50);

        System.out.println("======================Collecting sums of numbes in a list===================================");
        int sum = numlist.stream().reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(sum);

        //


    }
}
