package codingBat.logic2;

public class BlackJack {

    public static void main(String[] args) {

        System.out.println(blackjack(16, 17));
        System.out.println(blackjack(45, 21));
    }

    public static int blackjack(int a, int b) {
        if (a>21 && b>21)
            return 0;
        else if (a>21 && b<=21)
            return b;
        else if (b>21 && a<=21)
            return a;
        else
            return Math.max(a,b);
    }

}
