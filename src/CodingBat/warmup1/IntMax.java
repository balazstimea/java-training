package CodingBat.warmup1;

public class IntMax {

    public static void main(String[] args) {

        System.out.println(intMax(5,6,7));
    }

    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }

}
