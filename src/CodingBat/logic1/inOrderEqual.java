package CodingBat.logic1;

public class inOrderEqual {

    public static void main(String[] args) {

        System.out.println(inOrderEqual(5, 5,7, true));
    }
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk)
            return (a==b && b<=c)||(b==c && a<=c);
        else
            return (a<b && b<c);
    }
}
