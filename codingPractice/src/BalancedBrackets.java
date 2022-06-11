import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        if(s.length()%2==1){return false;}
        Stack<Character> characters=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(characters.empty()){
                characters.push(s.charAt(i));
            } else if (characters.peek()=='[' && s.charAt(i)==']'||
                    characters.peek()=='{' && s.charAt(i)=='}'||
                    characters.peek()=='(' && s.charAt(i)==')') {
                characters.pop();
            }else {characters.push(s.charAt(i));}
        }
        return characters.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(isValid("{}[()]"));

    }
}
