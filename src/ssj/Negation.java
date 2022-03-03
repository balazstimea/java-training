package ssj;

import java.util.Scanner;

public class Negation {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x");

        int userNumber = obj.nextInt();
        System.out.println("The Number is: " + userNumber);

        if (( userNumber >= 0 ) && ( userNumber < 10 )) {
            System.out.println("You entered a Number between 0 and 10");
        }
    }
}
