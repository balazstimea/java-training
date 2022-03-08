package codingBat.Warmup2;

public class NoTriples {

    public static void main(String[] args) {

        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
    }

    public static boolean noTriples(int[] nums) {
        int i=0;
        while(i<nums.length-2){
            if (nums[i]==nums[i+1] && nums[i]==nums[i+2])
                return false;
            i++;
        }
        return true;
    }
}
