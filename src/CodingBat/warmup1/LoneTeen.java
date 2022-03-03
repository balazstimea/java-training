package CodingBat.warmup1;

public class LoneTeen {

    public static void main(String[] args) {

        System.out.println(loneTeen(13, 99));
    }

    public static boolean loneTeen(int a, int b) {
        if (a >=13 && a<=19 && b >=13 && b<=19)
            return
                    false;
        else
            return((a >=13 && a<=19) || (b >=13 && b<=19));
    }

}
