package codingBat.warmup1;

public class MissingChar {

    public static void main(String[] args) {

        System.out.println(missingChar("kitten", 1));
    }
    public static String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1, str.length());
    }

    }

