package codingBat.logic1;

public class caughtSpeeding {

    public static void main(String[] args) {

        System.out.println(caughtSpeeding(65, false));
    }
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if(speed<=65)
                return 0;
            if (speed>65 && speed<=85)
                return 1;
            else
                return 2;
        }
        else{
            if(speed<=60)
                return 0;
            if (speed>60 && speed<=80)
                return 1;
            else
                return 2;
        }
    }
}
