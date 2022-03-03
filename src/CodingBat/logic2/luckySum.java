package CodingBat.logic2;

public class luckySum {

    public static void main(String[] args) {

        System.out.println(luckySum(3,13,3));
    }

    public static int luckySum(int a, int b, int c) {
        if (a==13)
            return 0;
        if (b==13)
            return a;
        if (c==13)
            return a+b;
        else
            return a+b+c;
    }
}
