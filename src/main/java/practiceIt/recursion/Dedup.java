package practiceIt.recursion;

public class Dedup {
    public static void main(String[] args) {
        Dedup dedup = new Dedup();

        System.out.println(dedup("boookkkkeeper"));


    }
    public static String dedup(String s) {
        if (s.length()<=1){
            return s;
        } else if (s.substring(0, 1).equals(s.substring(1, 2))) {
                return dedup(s.substring(1));
        } else {
            return s.substring(0,1) + dedup(s.substring(1));
        }

    }
    }

