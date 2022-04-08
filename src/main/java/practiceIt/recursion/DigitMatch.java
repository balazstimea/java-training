package practiceIt.recursion;

public class DigitMatch {
    public static void main(String[] args) {
        DigitMatch digitMatch = new DigitMatch();

        System.out.println(digitMatch(123, 343));


    }
    public static int digitMatch(int x, int y) {
        if (x < 0 || y<0) {
            throw  new IllegalArgumentException();

        } else if (x == 0 && y == 0) {
            return 1;
        } else {
            int result=0;
            if (x%10==y%10) {
                result++;
            }
            if (x/10==0 || y/10==0) {
                return result;
            }
            return result + digitMatch(x/10, y/10);
        }
    }
}
