import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



public class QueuesRunner {
    public static void main(String[] args) {
        Queue<String> queuesString = new PriorityQueue<>();
        //To add an  element in queue we make use of offer
        queuesString.offer("Apple");
        //to display first element in the queue we make use of poll
        //if queue is empty it will return null
        // System.out.println(queuesString.poll());
        //We can insert multiple elements in Queue using addAll function
        queuesString.addAll(List.of("Zebra", "Cat", "Dog"));
        queuesString.stream().forEach(System.out::println);
        //Once you do poll on queue the first element will be displayed and moved out of queue
        System.out.println("=================Polling queue for first time=========================");
        System.out.println(queuesString.poll());
        System.out.println("=================Polling completed , Printing Queue again=============");
        queuesString.stream().forEach(System.out::println);
        System.out.println("=================Polling queue for Second time========================");
        System.out.println(queuesString.poll());
        System.out.println("=================Polling completed , Printing Queue again=============");
        queuesString.stream().forEach(System.out::println);
        System.out.println("=================Polling queue for third time=========================");
        System.out.println(queuesString.poll());
        System.out.println("=================Polling completed , Printing Queue again=============");
        queuesString.stream().forEach(System.out::println);
        System.out.println("=================Polling queue for fourth time========================");
        System.out.println(queuesString.poll());
        System.out.println("=================Polling completed , Printing Queue again=============");
        queuesString.stream().forEach(System.out::println);
        System.out.println("=================Polling queue for fifth time, when no value is present in Queue========================");
        System.out.println(queuesString.poll());
        System.out.println("=================Polling completed , Printing Queue again=============");
        queuesString.stream().forEach(System.out::println);
        //Output : null when queue is empty
        //above queue was processed in natural order

        //=============================================================================================================================================================//

        //Defining custom order in Queue
        //Lets say I want to sort queue depending upon size of word
        //Step1 Make use of Comparator
        Queue<String> queuesString1 = new PriorityQueue<>(new StringLengthComparator());
        queuesString1.add("Jyoti");
        queuesString1.add("Singh");
        queuesString1.add("Developer");
        queuesString1.add("Practicing");
        queuesString1.add("JavaCollections");
        queuesString1.add("Hi,");
        queuesString1.stream().forEach(System.out::println);


    }

   /* private static int lengthComparator(String value1, String value2) {
        Comparator strlenComp = Comparator.comparingInt(String::length);
        return strlenComp.compare(value1.length(), value2.length());

    }*/

}

class  StringLengthComparator implements Comparator<String > {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}