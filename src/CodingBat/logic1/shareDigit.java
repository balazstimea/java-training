package CodingBat.logic1;

public class shareDigit {

    public static void main(String[] args) {

        System.out.println(shareDigit(12, 23));
    }
    public static boolean shareDigit(int a, int b) {
        return (a/10==b/10 || a/10==b%10 || a%10==b/10 || a%10==b%10);

    }
}
