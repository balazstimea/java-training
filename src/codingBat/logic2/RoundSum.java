package codingBat.logic2;

public class RoundSum {

    public static void main(String[] args) {

        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(45, 21, 30));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
    public static int round10(int num){
        if(num%10>=5)
            return num + (10-(num%10));
        else
            return num - (num%10);
    }

}
