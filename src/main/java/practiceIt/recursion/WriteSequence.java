package practiceIt.recursion;

public class WriteSequence {
    public static void main(String[] args) {
        WriteSequence mystery2 = new WriteSequence();

        writeSequence(6);


    }
    public static void writeSequence(int n){
        if (n<1){
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1 ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            if (n != 2) {
                writeSequence(n - 2);
            }
            System.out.print((n + 1) / 2 + " ");
        }
    }
}
