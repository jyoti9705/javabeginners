import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        //initializing a array
        int[] marks = {20, 30, 40};
        int sum = 0;
        int avg = 0;
        int countOfNumbers = 0;

        //advanced for loop over an array
        for (int mark : marks) {
            sum = sum + mark;
            countOfNumbers++;
        }
        avg = sum / countOfNumbers;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(marks.length);
        System.out.println(countOfNumbers);

        //array can also be initialized in below way
        int[] newWay = new int[5];
        //by default value for int array is 0 , double is 0.0 , boolean is false , for class null
        Arrays.stream(newWay).forEach(a -> System.out.println(a));

        //size of an array can be mentioned only on definition side and not on declaration side
        //means u cannot declare int[5] marks = new int[]
        //values in array can only be added of type that they are declared

        //Sorting a array
        Arrays.sort(marks);
        Arrays.stream(marks).forEach(a -> System.out.println(a));

    }
}
