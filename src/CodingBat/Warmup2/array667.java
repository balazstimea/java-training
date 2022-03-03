package CodingBat.Warmup2;

public class array667 {

    public static void main(String[] args) {

        System.out.println(array667(new int[]{4,1,6,6,4}));
    }

    public static int array667(int[] nums) {
        int i=0;
        int count =0;
        while (i<nums.length-1){
            if(nums[i]==6){
                if(nums[i+1]==6 || nums[i+1]==7)
                    count++;
            }
            i++;
        }
        return count;
    }
}
