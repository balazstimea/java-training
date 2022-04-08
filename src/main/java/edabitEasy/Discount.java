package edabitEasy;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Price and Percentage: ");

        int Price = myObj.nextInt();
        int Percentage = myObj.nextInt();
        float Discount = (float) Price - (Price * Percentage/100f);

        System.out.println(Discount);

    }
}

