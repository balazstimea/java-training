package CodingBat.logic1;

public class answerCall {

    public static void main(String[] args) {

        System.out.println(answerCall(false,false, false));
    }
    public static boolean answerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
            return false;
        else if (isMorning){
            if (isMom)
                return true;
            else
                return false;
        }
        else
            return
                    true;
    }

}
