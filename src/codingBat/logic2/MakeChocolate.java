package codingBat.logic2;

public class MakeChocolate {

    public static void main(String[] args) {

        System.out.println(makeChocolate(6, 1, 11));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int smallC=small*1;
        int bigC=big*5;
        while (goal<bigC){
            bigC=bigC-5;
        }
        if (bigC + smallC >= goal)
            return goal-bigC;
        else
            return -1;
    }
}
