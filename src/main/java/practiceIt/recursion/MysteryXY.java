package practiceIt.recursion;

public class MysteryXY {
    public static void main(String[] args) {
        MysteryXY mystery2 = new MysteryXY();

        mysteryXY(4, 3);

    }
    public static void mysteryXY(int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ", ");
            mysteryXY(x, y - 1);
            System.out.print(", " + x * y);
        }
    }
}
