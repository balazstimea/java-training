package codingBat.warmup1;

public class SumDouble {

    public static void main(String[] args) {

        System.out.println(sumDouble(5, 5));
    }
        public static int sumDouble (int a, int b){
            if (a == b)
                return 2 *(a + b);
            else
                return a + b;
        }

    }

