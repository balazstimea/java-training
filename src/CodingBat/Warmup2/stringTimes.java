package CodingBat.Warmup2;

public class stringTimes {

    public static void main(String[] args) {

        System.out.println(stringTimes("ohh boy!", 19));
    }

    public static String stringTimes(String str, int n) {
        String result ="";
        int i=0;
        while (i<n){
            result = result + str;
            i++;
        }
        return result;
    }
}
