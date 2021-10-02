public class ExceptionRunner {
    public static void main(String[] args) {
        try {
            int[] arrayNum = new int[]{1, 2, 3, 4};
            //this will cause Exception
            //System.out.println(arrayNum[5]);
            //this will not cause exception but if we run this program we will se that finally is executed even if return is there below sysoyut
            //Finally is executed in call conditions
            System.out.println(arrayNum[3]);
            return;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Exception Caught");
            e.printStackTrace();
        } finally {
            System.out.println("In Finally");
        }
    }
}
