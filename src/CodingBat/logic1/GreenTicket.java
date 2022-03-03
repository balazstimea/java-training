package CodingBat.logic1;

public class GreenTicket {

    public static void main(String[] args) {

        System.out.println(greenTicket(2, 2, 2));
    }
    public static int greenTicket(int a, int b, int c) {
        if (a==b & a==c && b==c)
            return 20;
        else if(a==b || a==c || b==c)
            return 10;
        else
            return 0;
    }
}
