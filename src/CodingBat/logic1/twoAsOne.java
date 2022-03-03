package CodingBat.logic1;

public class twoAsOne {

    public static void main(String[] args) {

        System.out.println(twoAsOne(3, 1,2));
    }
    public static boolean twoAsOne(int a, int b, int c) {
        return (a+b==c || a+c==b || b+c==a);
    }

}
