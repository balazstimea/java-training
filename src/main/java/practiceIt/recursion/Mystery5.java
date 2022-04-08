package practiceIt.recursion;

public class Mystery5 {
    public static void main(String[] args) {
        Mystery5 mystery2 = new Mystery5();

        System.out.println(mystery5(128, 343));


    }
    public static int mystery5(int x, int y) {
        if (x < 0) {
            return -mystery5(-x, y);
        } else if (y < 0) {
            return -mystery5(x, -y);
        } else if (x == 0 && y == 0) {
            return 0;
        } else {
            return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
        }
    }
}
