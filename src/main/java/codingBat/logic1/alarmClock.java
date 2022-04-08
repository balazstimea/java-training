package codingBat.logic1;

public class alarmClock {

    public static void main(String[] args) {

        System.out.println(alarmClock(5, false));
    }
    public static String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day==1 || day==2 || day==3 || day==4 || day==5)
                return "10:00";
            else
                return "off";
        }
        else {
            if (day==1 || day==2 || day==3 || day==4 || day==5)
                return "7:00";
            else
                return "10:00";
        }
    }
}
