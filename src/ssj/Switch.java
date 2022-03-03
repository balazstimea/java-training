package ssj;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //int month = 6;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter one month from 1 to 12: ");

        int month = myObj.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("This month has 31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 days");
                break;
            default:
                System.out.println("error");
        }

    }
}
