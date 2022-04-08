package edabitEasy;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number, Operator and Number: ");

        int Num1 = myObj.nextInt();
        char myOperator = myObj.next().charAt(0);
        int Num2 = myObj.nextInt();

        if (myOperator == '+') {
            int Calc = Num1 + Num2;
            System.out.println(Calc);
        } else if (myOperator == '*') {
            int Calc = Num1 * Num2;
            System.out.println(Calc);
        } else if (myOperator == '-') {
            int Calc = Num1 - Num2;
            System.out.println(Calc);
        }else {
            System.out.println("Error");
        }

    }
}

