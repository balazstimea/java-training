package edabit;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the base and height: ");

        int base = myObj.nextInt();
        int height = myObj.nextInt();

        int triArea = (base * height) / 2;
        System.out.println("The area of the triangle is:  " + triArea);


    }
}
