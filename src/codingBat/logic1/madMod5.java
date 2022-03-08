package codingBat.logic1;

public class madMod5 {

    public static void main(String[] args) {

        System.out.println(maxMod5(23, 19));
    }
    public static int maxMod5(int a, int b) {
        if ((a%5==b%5) && (a!=b))
            return Math.min(a,b);
        else if (a==b)
            return 0;
        else
            return Math.max(a,b);

    }
}
