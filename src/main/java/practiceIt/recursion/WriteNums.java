package practiceIt.recursion;

public class WriteNums {
    public static void main(String[] args) {
        WriteNums mystery2 = new WriteNums();

        writeNums(5);


    }
    public static void writeNums(int n){
        if (n<1){
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n-1);
            System.out.print(", "+n);
        }
    }
}
