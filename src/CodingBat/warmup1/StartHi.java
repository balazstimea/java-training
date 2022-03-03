package CodingBat.warmup1;

public class StartHi {

    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
    }
    public static boolean startHi(String str) {
        if (str.length() >=2)
            return (str.substring(0, 2).equals("hi"));
        else
            return false;
    }

    }

