package CodingBat.logic1;

public class teenSum {

    public static void main(String[] args) {

        System.out.println(teenSum(4,13));
    }
    public static int teenSum(int a, int b) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19))
            return 19;
        else
            return Integer.sum(a,b);
    }

}
