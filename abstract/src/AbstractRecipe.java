public abstract class AbstractRecipe {
    public void execute() {
        getReady();
        doTheDish();

    }

    abstract void getReady();

    abstract void doTheDish();


}
