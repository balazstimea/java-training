package CodingBat.logic1;

public class inOrder {

    public static void main(String[] args) {

        System.out.println(inOrder(1, 2, 4, false));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }
}