public class Counter {
    private int i;

    public int getI() {
        return i;
    }

    //below method is not thread safe , which means it is not Atomic
    //to make it thread safe , i.e only one thread increases value of i at the time we use synchronized
    synchronized public void increment() {
        i++;
    }
}
