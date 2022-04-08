package ssj;

import java.util.Scanner;


public class ForMultiplikationstabelle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");


        int userNum = scanner.nextInt();

        for (int index = 1; index <= userNum; index++) {
            for (int otherIndex = 1; otherIndex <= userNum; otherIndex++) {
                System.out.print(index * otherIndex + " ");
            }
            System.out.println();
        }
    }
}
