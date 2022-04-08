package codingBat.Warmup2;

public class ArrayCount9 {

    public static void main(String[] args) {

        System.out.println(arrayCount9(new int[]{4,9,2,9,4}));
    }

    public static int arrayCount9(int[] nums) {
        int i=0;
        int count=0;
        while(i<nums.length){
            if(nums[i]==9)
                count++;
            i++;
        }
        return count;
    }
}
