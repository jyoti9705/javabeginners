import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunners {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Candy");
        System.out.println("======================Added below values in the Set===============================");
        set1.stream().forEach(System.out::println);
        System.out.println("======================Adding Apple again in the Set===============================");
        set1.add("Apple");
        System.out.println("======================Printing set again after adding Apple=======================");
        set1.stream().forEach(System.out::println);
        //Output : Apple , Candy
        //Result : Set will not add values twice
        //Set does not care about position of element, so we cannot add or remove based on position

        Set<Integer> setnumber1 = new HashSet<>();
        setnumber1.add(45);
        setnumber1.add(456);
        setnumber1.add(23);
        setnumber1.add(3456);
        setnumber1.add(7894);
        System.out.println("=====================Printing Sets================================================");
        setnumber1.stream().forEach(System.out::println);
        System.out.println("We saw that orders are printed in any order, when we tried to print Set");

        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        number.add(45);
        number.add(456);
        number.add(23);
        number.add(3456);
        number.add(7894);
        System.out.println("=====================Printing Linked Hashset======================================");
        number.stream().forEach(System.out::println);
        System.out.println("We saw that orders were printed in order which they were added in Linked Hash Ser");


        Set<Integer> treeSetNumbers = new TreeSet<>();
        treeSetNumbers.add(45);
        treeSetNumbers.add(456);
        treeSetNumbers.add(23);
        treeSetNumbers.add(3456);
        treeSetNumbers.add(7894);
        System.out.println("=====================Printing Tree Set  ===========================================");
        treeSetNumbers.stream().forEach(System.out::println);
        System.out.println("We saw that orders were printed in sorted manner and not in order in which they were added using Tree Set");

        TreeSet<Integer> treeNumbers = new TreeSet<>();
        treeNumbers.add(12);
        treeNumbers.add(54);
        treeNumbers.add(34);
        treeNumbers.add(65);
        treeNumbers.add(99);
        //Treeset implements Navigable set which is not implements by any other collections and provides extra methods as compared to other collections
        System.out.println("Floor returns number which is less than or equal to number in this case it will return number lower than or equal to 40 which is " + treeNumbers.floor(40));
        System.out.println("Lower returns number which is less than the number provided , in this case it will return number lesser than 34 which is " + treeNumbers.lower(34));
        System.out.println("Ceiling returns number which is greater than or equal to the number provided , in this case it will return number greater that equal to 36 which is " + treeNumbers.ceiling(36));
        System.out.println("Higher returns number which is greater than the number provided , in this case it will return number greater than 65 which is " + treeNumbers.higher(65));
        System.out.println("Subset returns the set of numbers provided within brackets the first value in bracket is inclusive while the last value is exclusive which is second one " + treeNumbers.subSet(34,54));
        System.out.println("Subset can be modified depending upon choice we want  like " + treeNumbers.subSet(34 , true , 65 , true) + " It will include all the numbers including the ones specified in brackets");
        System.out.println("Subset can be modified depending upon choice we want  like " + treeNumbers.subSet(34 , false , 65 , false) + " It will exclude the numbers specified in bracket");
        System.out.println("Headset will print all the numbers till the number provided in the bracket excluding the one in the bracket" + treeNumbers.headSet(65));
        System.out.println("Tailset will print all the numbers after the one specified in bracket including the one in the bracket "+ treeNumbers.tailSet(65));



    }
}
