package practiceIt.recursion;

public class MultiplyEvens {
    public static void main(String[] args) {
        MultiplyEvens multiplyEvens = new MultiplyEvens();

        System.out.println(multiplyEvens(4));


    }
    public static int multiplyEvens(int n) {
        if (n<1) {
            throw new IllegalArgumentException();
        }else if (n ==1) {
            return 2;
        }else{
            return 2 * n * multiplyEvens(n - 1);
        }

    }
}
