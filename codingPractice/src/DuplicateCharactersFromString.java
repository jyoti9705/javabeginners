import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersFromString {

    public static void main(String[] args) {
        String name = "JyotiSinghwelcomesyoutotheProgram";
        char[] elementsToChar = name.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0 ; i < elementsToChar.length ; i++){
            if(!characterSet.add(elementsToChar[i])){
                System.out.println(elementsToChar[i]);
            }

        }

    }
}
