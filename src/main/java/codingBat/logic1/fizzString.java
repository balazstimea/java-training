package codingBat.logic1;

public class fizzString {

    public static void main(String[] args) {

        System.out.println(fizzString("min"));
    }
    public static String fizzString(String str) {

        String startsWith = str.substring(0,1);
        String endsWith = str.substring(str.length()-1);
        String result ="";
        if (startsWith.equals("f"))
            result = result + "Fizz";

        if (endsWith.equals("b"))
            result = result + "Buzz";

        if (result.equals(""))
            return str;
        else
            return result;
    }

}
