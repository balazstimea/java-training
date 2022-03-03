package CodingBat.array1;

public class sameFirstLast {
    public static void main(String[] args) {

        System.out.println(sameFirstLast(new int[]{6, 1, 2, 3}));
    }
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length>=1)
            return (nums[0]==nums[nums.length-1]);
        else
            return false;
    }
}
