package udemy.OOP2.composition;

public class Ceiling {
    private int height;
    private int paitedColor;

    public Ceiling(int height, int paitedColor) {
        this.height = height;
        this.paitedColor = paitedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaitedColor() {
        return paitedColor;
    }
}
