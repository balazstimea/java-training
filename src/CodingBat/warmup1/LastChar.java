package CodingBat.warmup1;

public class LastChar {

    public static void main(String[] args) {

        System.out.println(backAround("code"));
    }
    public static String backAround(String str) {
        String lastChar = str.substring(str.length() -1);
        return lastChar + str + lastChar;
    }

    }

