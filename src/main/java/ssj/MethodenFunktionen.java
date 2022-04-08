package ssj;


public class MethodenFunktionen {
    public static void main(String[] args) {

        int result = 3 * max(100, 200)+1;
        System.out.println(result);
    }

    static int max (int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

}

