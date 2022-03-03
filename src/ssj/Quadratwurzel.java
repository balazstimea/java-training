package ssj;

import static java.lang.Math.abs;

public class Quadratwurzel {
    public static void main(String[]args) {
       double x = 10;
       double root = x / 2;
       double a = x / root;

       while (abs(a - root) > 0.0000001) {
           root = (a + root) / 2;
           a = x / root;

       }
        System.out.println(root);


    }
}
