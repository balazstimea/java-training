package practiceIt.recursion;

public class SumTo {
    public static void main(String[] args) {
        SumTo sumTo = new SumTo();

        System.out.println(sumTo(2));


    }
    public static double sumTo(int n) {
        if (n<1) {
            throw new IllegalArgumentException();
        }else if (n ==1) {
            return 1;
        }else{
            return (double) (1.0/n) + sumTo(n - 1);
        }

    }
}
