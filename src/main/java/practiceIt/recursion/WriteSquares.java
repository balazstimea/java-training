package practiceIt.recursion;

public class WriteSquares {
    public static void main(String[] args) {
        WriteSquares writeSquares = new WriteSquares();

        writeSquares(8);
        //49, 25, 9, 1, 4, 16, 36, 64

    }
    public static void writeSquares(int n){
        if (n<1){
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(n);
        } else if (n%2==0){
            writeSquares(n-1);
            System.out.print(", "+(n*n));
        } else {
            System.out.print((n*n) + ", ");
            writeSquares(n-1);
        }
    }
}
