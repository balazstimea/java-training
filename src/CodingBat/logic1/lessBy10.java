package CodingBat.logic1;

public class lessBy10 {

    public static void main(String[] args) {

        System.out.println(lessBy10(23, 19,13));
    }
    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10;
    }
}
