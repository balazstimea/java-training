package codingBat.logic2;

public class MakeBricks {

    public static void main(String[] args) {

        System.out.println(makeBricks(3,2,1));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int smallBricks=small*1;
        int bigBricks=big*5;
        while (goal<bigBricks){
            bigBricks=bigBricks-5;
        }
        if (bigBricks + smallBricks >= goal)
            return true;
        else
            return false;
    }
}
