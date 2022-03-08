package codingBat.warmup1;

public class Diff21 {

    public static void main(String[] args) {

        System.out.println(diff21(22));
    }
        public static int diff21 (int n){
            if (n > 21)
                return 2 * Math.abs(n-21);
            else
                return Math.abs(n-21);
        }

    }

