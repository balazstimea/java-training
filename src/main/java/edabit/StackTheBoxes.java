package edabit;

import java.util.Scanner;

public class StackTheBoxes {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a positiv number: ");

        int num = myObj.nextInt();
        System.out.println("there are " + (num * num) + " cubes in the box");

    }
}
