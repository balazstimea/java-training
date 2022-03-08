package codingBat.Warmup2;

public class StringYak {

    public static void main(String[] args) {

        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str) {
        String result = "";
        int i=0;
        while(i<str.length()){
            if (!(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'))
                result = result + str.substring(i, i+1);
            else
                i=i+2;
            i++;
        }
        return result;
    }
}
