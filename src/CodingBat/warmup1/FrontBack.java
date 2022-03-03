package CodingBat.warmup1;

public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("code"));
    }
    public static String frontBack(String str) {
        if (str.length()>1)
            return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0, 1);
        else
            return str;
    }

    }

