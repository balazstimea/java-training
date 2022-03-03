package CodingBat.logic1;

public class RedTicket {

    public static void main(String[] args) {

        System.out.println(redTicket(2, 2, 2));
    }
    public static int redTicket(int a, int b, int c) {
        if (a==b && a==c && b==c){
            if (a==2)
                return 10;
            else
                return 5;
        }
        else if (a!=b && a!=c)
            return 1;
        else
            return 0;
    }
}
