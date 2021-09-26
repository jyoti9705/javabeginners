import java.util.*;

public class ArrayListsRunner {
    public static void main(String[] args) {
        //below list is immutable you will get exception while adding anything to below list
        List<String> words = List.of("Apple", "Bat", "Cat");
        //size of arraylist
        System.out.println(words.size());
        //how to print arrayList
        words.stream().forEach(System.out::println);
        //to find out if arraylist if empty or has values
        System.out.println(words.isEmpty());
        //to find out first value from arraylist
        System.out.println(words.get(0));
        //to make list mutable we will have to use Arraylist
        List<String> wordsList = new ArrayList<>();
        //to add an element in Arraylist
        wordsList.add("Jyoti'");
        wordsList.add("Singh");
        wordsList.add("Programmer");
        wordsList.stream().forEach(System.out::println);
        //we can also use vector
        List<String> wordVector = new Vector<>();
        wordVector.add("Jyoti");
        wordVector.add(" Used Vector");
        wordVector.stream().forEach(System.out::println);

        System.out.println("==============Now using LinkedList================");

        //we can also use LinkedList
        List<String> wordsLinkedList = new LinkedList<>();
        wordsLinkedList.add("Jyoti");
        wordsLinkedList.add(" Used Linked List");
        wordsLinkedList.stream().forEach(System.out::print);

        //we can iterate around loop using iterator , advanced for loop , streams
        //advanced for each loop
        for (String word : wordsList) {
            System.out.println(word);
        }

        //using Iterator
        Iterator<String> wordsIterator = wordsList.listIterator();
        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

        //sorting the list

        //Method 1
        //Collections.sort can only be used by classes that are already implementing comparable to make
        //use of Collections.sort for Custom Entity Objects, we can make class to implement comparable and define compare to method
        List<Integer> numberslist = new ArrayList<>();
        numberslist.add(1);
        numberslist.add(10);
        numberslist.add(20);
        numberslist.add(5);
        numberslist.add(3);
        Collections.sort(numberslist);
        System.out.println("=================Printing elements after sorting=======================");
        numberslist.stream().forEach(System.out::println);
        System.out.println("=================Elements printed after sorting ========================");

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(2, "Jyoti");
        Student s2 = new Student(1, "Gaurav");
        studentList.add(s1);
        studentList.add(s2);
       // Collections.sort(studentList);
       // studentList.stream().forEach(System.out::println);

        //Another way to compare two student class without wanting student class to implement comparable
        Comparator studentComparator = Comparator.comparing(Student::getId);
        studentComparator.compare(s1, s2);
        Collections.sort(studentList, studentComparator);
        studentList.stream().forEach(System.out::println);

    }
}
