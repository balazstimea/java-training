package codingBat.Warmup2;

public class stringMatch {

    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    public static int stringMatch(String a, String b) {
        int length = Math.min(a.length(), b.length());
        int count = 0;
        int i= 0;
        while (i<length-1){
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub))
                count++;
            i++;
        }
        return count;
    }
}
