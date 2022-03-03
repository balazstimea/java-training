package ssj;

import java.util.Scanner;


public class TemaDeCasa {
    public static void main(String[] args) {

        //Determinati cifra minima a unui numar natural.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");


        int userNum = scanner.nextInt();
        int min = userNum % 10;
        while (userNum > 0) {
            int ultimaCifra = userNum % 10;
            if (min > ultimaCifra) {
                min = ultimaCifra;
            }
            userNum = userNum /10;
        }
        System.out.println(min);
    }
}
