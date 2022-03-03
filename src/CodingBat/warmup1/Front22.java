package CodingBat.warmup1;

public class Front22 {

    public static void main(String[] args) {

        System.out.println(front22("kitten"));
    }
    public static String front22(String str) {
        if (str.length() >=2) {
            String firstTwo = str.substring(0, 2);
            return firstTwo + str + firstTwo;
        }
        else
            return str + str + str;
    }

    }

