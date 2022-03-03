package CodingBat.Warmup2;

public class stringSplosion {

    public static void main(String[] args) {

        System.out.println(stringSplosion("Code"));
    }

    public static String stringSplosion(String str) {
        int i=0;
        String result = "";
        while(i<str.length()){
            result = result + str.substring(0, i+1);
            i++;
        }
        return result;
    }
}
