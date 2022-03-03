package CodingBat.warmup1;

public class NotString {

    public static void main(String[] args) {

        System.out.println(notString("candy"));
    }
    public static String notString(String str) {
        if (str.length()>=3 && str.substring(0, 3).equals("not"))
            return str;

        else
            return ("not " + str);
    }

    }

