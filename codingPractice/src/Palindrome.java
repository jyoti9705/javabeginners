public class Palindrome {
    public static void main(String[] args) {
        String a = "aabbaa";
        String reverseA = "";
        for (int i = a.length()-1 ; i >=0 ; i--){
            reverseA += a.charAt(i);
        }
        System.out.println(reverseA);
        if(a.toLowerCase().equals(reverseA)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
