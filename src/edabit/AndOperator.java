package edabit;

import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter true of false two times:");

        Boolean userAfi1 = myObj.nextBoolean();
        Boolean userAfi2 = myObj.nextBoolean();

        System.out.println(userAfi1 && userAfi2);


    }
}
