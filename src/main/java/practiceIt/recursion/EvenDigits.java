package practiceIt.recursion;

public class EvenDigits {
    public static void main(String[] args) {
        EvenDigits evenDigits = new EvenDigits();

        System.out.println(evenDigits(8342116));


    }
    public static int evenDigits(int n) {
        if (n == 0){
            return 0;
        } else {
            int num=n%10;
            if (num % 2 == 0) {
                return num+evenDigits(n / 10) * 10;
            } else {
                return evenDigits(n / 10);
            }
        }

    }
    }

