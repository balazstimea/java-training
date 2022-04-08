package codingBat.logic1;

public class love6 {

    public static void main(String[] args) {

        System.out.println(love6(4, 5));
    }
    public static boolean love6(int a, int b) {
        if (a==6 || b==6 || Integer.sum(a,b)==6 || Math.abs(a-b)==6)
            return true;
        else
            return false;
    }

}
