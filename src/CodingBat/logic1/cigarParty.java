package CodingBat.logic1;

public class cigarParty {

    public static void main(String[] args) {

        System.out.println(cigarParty(50, false));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend)
            return (cigars>=40);
        else if (cigars>=40 && cigars<=60)
            return true;
        else
            return false;
    }
}
