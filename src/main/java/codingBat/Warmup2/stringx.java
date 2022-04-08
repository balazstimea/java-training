package codingBat.Warmup2;

public class stringx {

    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));
    }

    public static String stringX(String str) {
        String result="";
        int i =0;
        if (str.length()<=1)
            return str;

        while (i<str.length()-2){
            if (!(str.substring(i+1, i+2).equals("x"))){
                result = result + str.substring(i+1, i+2);
            }
            i++;
        }
        return str.substring(0,1) + result + str.substring(str.length()-1);
    }
}
