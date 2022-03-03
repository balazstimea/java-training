package CodingBat.logic2;

public class EvenlySpaced {

    public static void main(String[] args) {

        System.out.println(evenlySpaced(2, 4, 6));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int large = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));
        int medium = (a + b + c) - (large + small);

        return ((large - medium) == (medium - small));
    }
}
