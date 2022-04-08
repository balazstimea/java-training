package practiceIt.recursion;

public class Mystery4 {
    public static void main(String[] args) {
        Mystery4 mystery2 = new Mystery4();

        System.out.println(mystery4(14, 10));


    }
    public static int mystery4(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return mystery4(x - y, y);
        }
    }
}
