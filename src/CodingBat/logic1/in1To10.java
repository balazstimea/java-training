package CodingBat.logic1;

public class in1To10 {

    public static void main(String[] args) {

        System.out.println(in1To10(11, false));
    }
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode){
            if (n<=1 || n>=10)
                return true;
            else
                return false;
        }
        else{
            if (n>=1 && n<=10)
                return true;
            else
                return false;
        }
    }

}
