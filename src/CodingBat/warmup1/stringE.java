package CodingBat.warmup1;

public class stringE {

    public static void main(String[] args) {

        System.out.println(stringE("Helloeee"));
    }

    public static boolean stringE(String str) {
        int sum = 0;
        int i=0;
        while (i<str.length()){
            if (str.substring(i, i+1).equals("e"))
                sum++;
            i++;
        }
        return (sum>=1 && sum<=3);
    }

}
