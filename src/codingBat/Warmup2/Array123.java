package codingBat.Warmup2;

public class Array123 {

    public static void main(String[] args) {

        System.out.println(array123(new int[]{4,1,2,3,4}));
    }

    public static boolean array123(int[] nums) {
        int i=0;
        while (i<nums.length-2){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
                return true;
            i++;
        }
        return false;
    }
}
