public class AnimalMain {

    public static void swap(Integer a , Integer b){
        a = a +b ;
        b = a -b;
        a = a - b;
    }

    public static void main(String[] args) {
        Animal a = new WaterAnimal();
        a.typeAnimal();

        Integer b = 10;
        Integer c = 20;
        System.out.println(b + "cb" + c);
        swap(b,c);
        System.out.println(b + "cb" + c);
    }
}
