package CodingBat.array1;

public class Sum3 {
    public static void main(String[] args) {

        System.out.println(sum3(new int[]{1, 2, 3}));
    }
   // public static int sum3(int[] nums) {
   //     return nums[0]+nums[1]+nums[2];
   // }
    public static int sum3(int[] nums) {
        int sum=0;
        int i=0;
        while (i< nums.length){
            sum=sum+nums[i];
            i++;
        }
        return sum;
    }
}
