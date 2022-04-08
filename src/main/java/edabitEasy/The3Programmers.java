package edabitEasy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class The3Programmers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the hourly wages of 3 programmer: ");

        int WageOne = myObj.nextInt();
        int WageTwo = myObj.nextInt();
        int WageThree = myObj.nextInt();

        int Maxi = 1;
        if (WageOne > WageTwo) {
            if (WageOne > WageThree)
                Maxi = WageOne;
            else Maxi = WageThree;
        } else if (WageTwo > WageThree)
            Maxi = WageTwo;
        else Maxi = WageThree;

        System.out.println(Maxi);

        int Mini = 1;
        if (WageOne < WageTwo) {
            if (WageOne < WageThree)
                Mini = WageOne;
            else Mini = WageThree;
        } else if (WageTwo < WageThree)
            Mini = WageTwo;
        else Mini = WageThree;

        System.out.println(Mini);

        System.out.println("Difference between the highest vs lowest paid employee: " + (Maxi-Mini));

    }
}

