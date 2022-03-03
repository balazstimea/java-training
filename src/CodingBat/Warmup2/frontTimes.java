package CodingBat.Warmup2;

public class frontTimes {

    public static void main(String[] args) {

        System.out.println(frontTimes("ohh boy!", 19));
    }

    public static String frontTimes(String str, int n) {
        String result = "";
        int i=0;
        while (n>i){
            if (str.length()>=3)
                result = str.substring(0,3) + result;
            else if (str.length()<3)
                result = str + result;
            else
                result ="";
            i++;
        }
        return result;
    }
}
