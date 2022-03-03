package ssj;

import java.util.Scanner;


public class MethodenParameter {
    public static void main(String[] args) {

        printMax(100, 78);
        printMax(45, 89);
    }

    static void printMax(int num1, int num2) {
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }

}

