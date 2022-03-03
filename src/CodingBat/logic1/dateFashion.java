package CodingBat.logic1;

public class dateFashion {

    public static void main(String[] args) {

        System.out.println(dateFashion(5, 10));
    }
    public static int dateFashion(int you, int date) {
        if (you<=2 || date<=2)
            return 0;
        else if ((you>=8 && date>=2) || (date>=8 && you>=2))
            return 2;
        else
            return 1;
    }
}
