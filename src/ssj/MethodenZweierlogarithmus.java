package ssj;


public class MethodenZweierlogarithmus {
    public static void main(String[] args) {

        int x = log2(17);
        System.out.println(x);
    }

    static int log2(int n) {
        int res = 0;
        while (n > 1) {
            n = n / 2;
            res++;
        }
        return res;
    }

}

