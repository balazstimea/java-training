package CodingBat.logic1;

public class sortaSum {

    public static void main(String[] args) {

        System.out.println(sortaSum(9, 4));
    }
    public static int sortaSum(int a, int b) {
        if (Integer.sum(a, b)>=10 && Integer.sum(a, b)<=19)
            return 20;
        else
            return Integer.sum(a, b);
    }
}
