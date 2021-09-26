public class Receipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the Items");
        System.out.println("Do the Chopping");
        System.out.println("Prepare food");
        System.out.println("Food is prepared");


    }

    @Override
    void doTheDish() {
        System.out.println("Clean all utensils in which food is cooked");

    }
}
