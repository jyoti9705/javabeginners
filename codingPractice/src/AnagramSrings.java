import java.util.Arrays;

public class AnagramSrings {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bdca";
        boolean anagram = true ;
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();
        if(a.length()!=b.length()){
            anagram = false;
        }else {
            Arrays.sort(aCharArray);
            Arrays.sort(bCharArray);
            for (int i = 0 ; i < aCharArray.length ; i++){
                if (aCharArray[i]!=bCharArray[i]){
                    anagram = false;
                }
            }

        }

        System.out.println(anagram);
    }
}
