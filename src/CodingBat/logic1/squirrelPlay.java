package CodingBat.logic1;

public class squirrelPlay {

    public static void main(String[] args) {

        System.out.println(squirrelPlay(70, false));
    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer)
            return (temp>=60 && temp<=100);
        else
            return (temp>=60 && temp<=90);
    }
}
