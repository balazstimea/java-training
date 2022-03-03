package ssj;


import java.util.Scanner;

public class MethodenReturn {
    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        int x = Obj.nextInt();
        printLog2(x);

    }

    static void printLog2(int n) {
        if (n <= 0)
            return;
        int res = 0;
        while (n > 1) {
            n = n / 2;
            res++;
        }
        System.out.println(res);
    }

}

