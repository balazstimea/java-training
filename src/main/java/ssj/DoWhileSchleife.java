package ssj;

import java.util.Scanner;


public class DoWhileSchleife {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int userNum = scanner.nextInt();

        do {
            System.out.println(userNum % 10);
            userNum = userNum / 10;
        } while (userNum > 0);
    }
}
