package edabit;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = myObj.nextInt();
        if ((num % 2) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
