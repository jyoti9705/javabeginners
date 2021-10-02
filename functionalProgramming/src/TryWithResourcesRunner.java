import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner numScanner = new Scanner(System.in)) {
            int[] arrayNum = new int[]{1, 2, 3, 4};
            System.out.println(arrayNum[10]);
        }
    }
}
