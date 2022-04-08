package ssj;

import java.util.Scanner;


public class Gleitkommazahlen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers:");

        float Sum = 0;
        int userNum = scanner.nextInt();
        for (int index = userNum; index > 0; index--) {
            Sum += 1.0f / index;
            System.out.println("sum=" + Sum);
        }

    }
}
