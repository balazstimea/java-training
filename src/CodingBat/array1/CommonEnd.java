package CodingBat.array1;

public class CommonEnd {
    public static void main(String[] args) {

        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if (a.length>=1 && b.length>=1)
            return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
        else
            return false;
    }
}
