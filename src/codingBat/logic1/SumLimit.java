package codingBat.logic1;

public class SumLimit {

    public static void main(String[] args) {

        System.out.println(sumLimit(2, 3));
    }
    public static int sumLimit(int a, int b) {
        if(String.valueOf(a).length()<String.valueOf(a+b).length())
            return a;
        else
            return a+b;
    }
}
