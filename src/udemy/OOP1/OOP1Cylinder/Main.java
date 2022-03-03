package udemy.OOP1.OOP1Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        Cylinder cylinder = new Cylinder(7.25,5.55);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());

        double x = 80 /60;
        System.out.println(x);
    }

}