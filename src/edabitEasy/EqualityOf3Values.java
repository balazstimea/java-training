package edabitEasy;



import java.util.Scanner;

public class EqualityOf3Values {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers: ");

        int First = myObj.nextInt();
        int Second = myObj.nextInt();
        int Third = myObj.nextInt();
        int Equals = 0;

        if (First == Second && Second == Third && First == Third) {
            Equals = 3;
        } else if (First == Second || Second == Third || First == Third) {
            Equals = 2;
        } else {
            Equals = 0;
        }
        System.out.println(Equals);
    }
}

