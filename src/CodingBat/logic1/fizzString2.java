package CodingBat.logic1;

public class fizzString2 {

    public static void main(String[] args) {

        System.out.println(fizzString2(3));
    }
    public static String fizzString2(int n) {
        if (n%15==0)
            return "FizzBuzz!";
        if (n%3==0)
            return "Fizz!";
        if (n%5==0)
            return "Buzz!";
        else
            return n + "!";
    }

}
