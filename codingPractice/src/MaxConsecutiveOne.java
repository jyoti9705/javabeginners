public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,0,1,1,1,0};
        int ans = 0;
        int count = 0;


        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1) count++;
            if(nums[i] != 1) count=0;
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
    }
