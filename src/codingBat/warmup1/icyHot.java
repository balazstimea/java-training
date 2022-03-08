package codingBat.warmup1;

public class icyHot {

    public static void main(String[] args) {

        System.out.println(icyHot(101, -2));
    }
    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 >100) || (temp1 >100 && temp2 < 0));
    }

    }

