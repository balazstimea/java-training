package ssj;

public class EukAlg {
    public static void main(String[]args) {
        int x = 28;
        int y = 20;
        int rest = x % y;

        while (rest != 0) {
            x = y;
            y = rest;
            rest = x % y;
        }
        System.out.println(y);
    }
}
