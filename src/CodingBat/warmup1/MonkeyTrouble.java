package CodingBat.warmup1;

public class MonkeyTrouble {

    public static void main(String[] args) {

        System.out.println("Sleep in vacation: " + monkeyTrouble(false, false));
    }
        public static boolean monkeyTrouble ( boolean aSmile, boolean bSmile){
            if (aSmile && bSmile)
                return true;
            else if (!aSmile && !bSmile)
                return true;
            else
                return
                        false;
        }

    }

