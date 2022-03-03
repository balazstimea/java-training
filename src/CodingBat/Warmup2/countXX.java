package CodingBat.Warmup2;

public class countXX {

    public static void main(String[] args) {

        System.out.println(countXX("abcxxx"));
    }

    public static int countXX(String str) {
        int i=0;
        int count=0;
        while (i<str.length()-1){
            if (str.substring(i,i+2).equals("xx"))
                count++;
            i++;
        }
        return count;
    }
}
