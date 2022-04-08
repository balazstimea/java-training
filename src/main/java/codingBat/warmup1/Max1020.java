package codingBat.warmup1;

public class Max1020 {

    public static void main(String[] args) {

        System.out.println(max1020(5,6));
    }

    public static int max1020(int a, int b) {
        if (a >=10 && a<=20 && b>=10 && b<=20)
            return Math.max(a,b);
        if (a >= 10 && a <= 20)
            return a;
        if (b >= 10 && b <= 20)
            return b;
        return 0;

    }

}
