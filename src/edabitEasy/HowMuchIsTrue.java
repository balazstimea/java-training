package edabitEasy;

public class HowMuchIsTrue {
    public static void main(String[] args) {

        int Sum = 0;
        Boolean[] countTrue = {true, false, false, true, false};
        for (boolean index : countTrue) {
            if (index) {
                Sum = Sum + 1;
            }
        }
        System.out.println(Sum);
    }
}

