package CodingBat.warmup1;

public class HasTeen {

    public static void main(String[] args) {

        System.out.println(hasTeen(13, 99, 20));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }
}
