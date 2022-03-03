package udemy.Arrays;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int numOfElements = readInteger();
        int[] elements =readElements(numOfElements);
        findMin(elements);
        System.out.println("the min value in the array is "+findMin(elements));

    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the elements: ");
        int num = scanner.nextInt();
        return num;
    }
    private static int[] readElements(int num){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[num];
        System.out.println("Enter "+num+" integer values\r");
        for(int i=0; i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min =Integer.MAX_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]<min)
                min=array[i];
        }
        return min;

    }
}
