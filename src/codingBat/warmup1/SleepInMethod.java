package codingBat.warmup1;

public class SleepInMethod {

    public static void main(String[] args) {

        System.out.println("Sleep in vacation: " + sleepIn(false, true));
    }
        public static boolean sleepIn ( boolean weekday, boolean vacation){
            if (!weekday || vacation) {
                return true;
            }
            return false;
        }

    }

