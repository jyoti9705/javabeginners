import java.util.ArrayList;
import java.util.List;

public class VowelRunner {
    private static boolean isVowel(String a) {
        List<String> vowelList = new ArrayList<>();
        vowelList.add("A");
        vowelList.add("E");
        vowelList.add("I");
        vowelList.add("O");
        vowelList.add("U");

        if (vowelList.contains(a.toUpperCase())) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isVowel("p"));
    }
}
