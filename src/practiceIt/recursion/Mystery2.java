package practiceIt.recursion;

public class Mystery2 {
    public static void main(String[] args) {
        Mystery2 mystery2 = new Mystery2();

        mystery2(30);

    }
    public static void mystery2(int n) {
        if (n > 100) {
            System.out.print(n);
        } else {
            mystery2(2 * n);
            System.out.print(", " + n);
        }
    }
}
