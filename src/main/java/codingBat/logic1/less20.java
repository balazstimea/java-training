package codingBat.logic1;

public class less20 {

    public static void main(String[] args) {

        System.out.println(less20(58));
    }
    public static boolean less20(int n) {
        if(((n+1)%20)==0 || ((n+2)%20)==0)
            return true;
        else
            return false;
    }

}
