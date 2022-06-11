public class HighestSumSubarray {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,-1};
        int max= Integer.MIN_VALUE;
        int cmx = 0;
        for(int i = 0 ; i < intArray.length;i++){
            cmx = cmx + intArray[i];
            if(max<cmx){
                max=cmx;
            }
            if(cmx < 0){
                cmx = 0;
            }
        }
//        for (int i = 0 ; i< intArray.length;i++){
//            cmx = Math.max(intArray[i],cmx+intArray[i]);
//            max = Math.max(max,cmx);
//        }


        System.out.println(max);
    }
}
