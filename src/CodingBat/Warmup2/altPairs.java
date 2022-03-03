package CodingBat.Warmup2;

public class altPairs {

    public static void main(String[] args) {

        System.out.println(altPairs("Chocolate"));
    }

    public static String altPairs(String str) {
        String result ="";
        int i=0;
        if (str.length()<=1)
            return str;

        while (i<str.length()){
            if (i+2>str.length())
                result = result + str.substring(i,str.length());
            else
                result = result + str.substring(i,i+2);
            i=i+4;
        }
        return result;
    }
}
