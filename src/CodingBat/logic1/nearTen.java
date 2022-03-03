package CodingBat.logic1;

public class nearTen {

    public static void main(String[] args) {

        System.out.println(nearTen(58));
    }
    public static boolean nearTen(int num) {
        if((num%10)>=0 && (num%10)<=2)
            return true;
        else if (((num+1)%10)==0 || ((num+2)%10)==0)
            return true;
        else
            return false;
    }

}
