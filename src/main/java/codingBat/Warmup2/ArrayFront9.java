package codingBat.Warmup2;

public class ArrayFront9 {

    public static void main(String[] args) {

        System.out.println(arrayFront9(new int[]{1,2,9,3,4}));
    }

    public static boolean arrayFront9(int[] nums) {
        int i=0;
        int count=0;
        while (i<4 && i<nums.length){
            if (nums[i]==9)
                return true;
            i++;
        }
        return false;
    }
}
