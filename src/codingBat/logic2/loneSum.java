package codingBat.logic2;

public class loneSum {

    public static void main(String[] args) {

        System.out.println(loneSum(3,2,1));
    }

    public static int loneSum(int a, int b, int c) {
        if (a!=b && a!=c && b!=c)
            return a+b+c;
        else if (a==b && a!=c)
            return c;
        else if (a==c && a!=b)
            return b;
        else if (b==c && b!=a)
            return a;
        else
            return 0;

    }
}
