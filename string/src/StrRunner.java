import java.util.Locale;

public class StrRunner {

    public static void main(String[] args) {
        String str = "Test";
        System.out.println(str.charAt(0));
        //Output is T
        //In string index starts at 0

        String biggerString = "My name is Jyoti Singh";
        System.out.println(biggerString.substring(3));
        //Output is name is Jyoti Singh
        //enter the index value in substring  from where you want your text

        System.out.println(biggerString.substring(3,16));
        //Output is name is Jyoti
        //one this to notice is that left hand side value is inclusive whereas right hand side value is exclusive , so index till where you want + 1 index you need to specify


        String eachOnSeperateLine = "Print each letter on seperate line";
        /*for(int i = 0 ; i < eachOnSeperateLine.length(); i ++){
            System.out.println(eachOnSeperateLine.charAt(i));
        }*/
        //output : All characters will be printed in seperate line

        String myName = "Jyoti";
        System.out.println(myName.lastIndexOf('y'));
        //Output : 1;

        //few other methods
        System.out.println(myName.startsWith("J"));
        System.out.println(myName.contains("J"));
        System.out.println(myName.endsWith("J"));
        System.out.println(myName.isEmpty());
        System.out.println(myName.equals("JYOTI"));
        System.out.println(myName.equalsIgnoreCase("JYOTI"));


        //String is immutable
        String immutableExample = "Jyoti";
        immutableExample.concat(" Singh ");

        System.out.println(immutableExample);
        //Output : Jyoti :p

        //Store value into new Variable if you want to modify the value of String
        String anotherString =  immutableExample.concat(" Singh ");
        System.out.println(anotherString);
        //Output : Jyoti Singh :)

        //Print all values in UPPER CASE
        System.out.println(anotherString.toUpperCase());

        //Prints all values in lower case
        System.out.println(anotherString.toLowerCase());

        String removeSpaces = "  Space  ";
        //Removes spaces in start and end of word
        System.out.println(removeSpaces.trim());







    }
}
