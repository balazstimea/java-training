package edabit;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = myObj.nextInt();
        int rest = (num % 5);

        if (rest == 0) {
            System.out.println("the number is divisible by 5");
        } else {
            System.out.println("the number is not divisible by 5");
        }

    }
}
