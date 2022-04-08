package edabit;

import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        //int month = 6;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter voltage and current: ");

        int voltage = myObj.nextInt();
        int current = myObj.nextInt();

        int power = voltage * current;
        System.out.println("The power is: " + power);


    }
}
