package practiceIt.recursion;

public class Mystery1 {
    public static void main(String[] args) {
        Mystery1 mystery1 = new Mystery1();

        mystery1(16);

    }
    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }
}
