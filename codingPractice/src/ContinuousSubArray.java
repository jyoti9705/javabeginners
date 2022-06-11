import java.util.Arrays;

public class ContinuousSubArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{5, 4, 1, 2, 3, 4, 1, 4, 5, 5};
        int reqSum = 10;
        for (int i = 0; i < intArray.length; i++) {
            int sum = 0;
            for(int j =i ; j<intArray.length;j++){
                sum = sum + intArray[j];
                if(sum == reqSum){
                    System.out.println(Arrays.toString(Arrays.copyOfRange(intArray,i , j+1)));
                }

            }
        }
    }
}
