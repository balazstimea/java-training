package CodingBat.Warmup2;

public class has271 {

    public static void main(String[] args) {

        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
    }

    public static boolean has271(int[] nums) {
        int i=0;
        while(i<nums.length-2){
            if (nums[i+1]==nums[i]+5 && Math.abs(nums[i+2] - (nums[i]-1)) <= 2){
                return true;
            }
            i++;
        }
        return false;
    }

}
