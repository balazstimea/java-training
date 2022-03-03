package CodingBat.Warmup2;

public class stringBits {

    public static void main(String[] args) {

        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        int i=0;
        String result="";
        while (i<str.length()){
            result=result+str.charAt(i);
            i=i+2;
        }
        return result;
    }
}
