package CodingBat.warmup1;

public class NearHundred {

    public static void main(String[] args) {

        System.out.println(nearHundred(89));
    }
    public static boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <=10))
            return true;
        else
            return false;
    }

    }

