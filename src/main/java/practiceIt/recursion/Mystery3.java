package practiceIt.recursion;

public class Mystery3 {
    public static void main(String[] args) {
        Mystery3 mystery2 = new Mystery3();

        mystery3(2);

    }
    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }
}
