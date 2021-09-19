public class Primitive {

    public static void main(String [] args){
        int i = 10;
        int i1 = 10;
        int i2 = 10;
        int i3 = 10;


        //Post Increment
        // value 10 of i will be assigned to j and then i value will be incremented so j value will be 10 and i will 11
        int j = i++;
        System.out.println(j);
        System.out.println(i);

        //Pre Increment
        //value 10 of i1 will be incremented to 11 and then assigned to a, so value of a will 11 and i1 will be 11
        int a = ++i1;
        System.out.println(a);
        System.out.println(i1);


        //Post Decrement
        // value 10 of i2 will be assigned to b and then i2 value will be decremented so b value will be 10 and i2 will 9
        int b = i2--;
        System.out.println(b);
        System.out.println(i2);

        //Pre Decrement
        //value 10 of i3 will be decremented to 9 and then assigned to c, so value of c will 9 and i1 will be 9
        int c = --i3;
        System.out.println(c);
        System.out.println(i3);








    }
}
