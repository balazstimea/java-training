package CodingBat.logic1;

public class specialEleven {

    public static void main(String[] args) {

        System.out.println(specialEleven(24));
    }
    public static boolean specialEleven(int n) {
        if (n % 11==0 || n % 11==1)
            return true;
        else
            return
                    false;
    }

}
