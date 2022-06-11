import java.util.Arrays;

public class FindMissingNumberInIntegerArray {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[]{1,2,3,5};
        int sumOfAll = n*(n+1)/2;
        Integer sum = Arrays.stream(numbers).sum();
        int missingNumber = sumOfAll-sum;
        System.out.println(missingNumber);

    }
}
