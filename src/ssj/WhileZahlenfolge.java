package ssj;

import java.util.Scanner;


public class WhileZahlenfolge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers:");

        int currentNumber = 0;
        while (currentNumber <= 2) {
            int userNum = scanner.nextInt();
            currentNumber++;
            int index = 0;

            while (index < userNum) {
                System.out.print("*");
                index++;
            }
            System.out.println("");
        }
    }
}
