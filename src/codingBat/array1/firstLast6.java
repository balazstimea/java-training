package codingBat.array1;

public class firstLast6 {
    public static void main(String[] args) {

        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
    }
    public static boolean firstLast6(int[] nums) {
        if (nums.length<1)
            return false;
        if (nums[0]==6 || nums[nums.length-1]==6)
            return true;
        else
            return false;
    }
}
