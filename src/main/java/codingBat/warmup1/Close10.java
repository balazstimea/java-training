package codingBat.warmup1;

public class Close10 {

    public static void main(String[] args) {

        System.out.println(close10(5,6));
    }

    public static int close10(int a, int b) {
        int nva = Math.abs(a - 10);
        int nvb = Math.abs(b - 10);
        if (nva == nvb)
            return 0;
        if (nva > nvb)
            return b;
        else
            return a;
    }

}
