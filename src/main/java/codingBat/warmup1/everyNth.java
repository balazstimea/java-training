package codingBat.warmup1;

public class everyNth {

    public static void main(String[] args) {

        System.out.println(everyNth("Miricle", 2));
    }

    public static String everyNth(String str, int n) {
        int i=0;
        String store = "";
        while (str.length() >i) {
            store = store + str.charAt(i);
            i=i+n;
        }
        return store;
    }

}
