package CodingBat.warmup1;

public class ParrotTrouble {

    public static void main(String[] args) {

        System.out.println(parrotTrouble(false, 22));
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20))
            return true;
        else
            return false;
    }

    }

