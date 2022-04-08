package ssj;


public class Primzahl {
    public static void main(String[] args) {

       boolean result = isPrime(23);
        System.out.println(result);

    }

    static boolean isPrime (int x) {
        if (x == 2) return true;
        if (x % 2 ==0) return false;
        int i=3;
        while (i * i <=x) {
            if (x % i == 0) return false;
            i =i +2;
        }
        return true;
    }

}

