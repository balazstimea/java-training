package codingBat.warmup1;

public class DelDel {

    public static void main(String[] args) {

        System.out.println(delDel("adeleo"));
    }

    public static String delDel(String str) {
        if (str.length()>=4  && str.substring(1, 4).equals("del"))
            return (str.substring(0, 1) + str.substring(4));
        else
            return str;
    }

}
