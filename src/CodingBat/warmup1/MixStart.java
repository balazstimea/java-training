package CodingBat.warmup1;

public class MixStart {

    public static void main(String[] args) {

        System.out.println(mixStart("mix snacks"));
    }

    public static boolean mixStart(String str) {
        if (str.length()>=3)
            return (str.substring(1,3).equals("ix"));
        else
            return false;
    }

}
