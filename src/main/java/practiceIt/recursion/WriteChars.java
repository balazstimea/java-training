package practiceIt.recursion;

public class WriteChars {
    public static void main(String[] args) {
        WriteChars writeChars = new WriteChars();

        writeChars(8);

    }
    public static void writeChars(int n) {
        if (n<1) {
            throw new IllegalArgumentException();
        }else if (n ==1) {
            System.out.print("*");
        }else if (n==2){
            System.out.print("**");

        } else {

            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}
