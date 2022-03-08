package udemy.arrays;

import java.util.Scanner;

public class Main {

   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    int[] sorted =sortIntegers(myIntegers);
    printArray(sorted);
    }


    public static int[] getIntegers(int number){

        int[] values = new int[number];
        System.out.println("Enter "+number+" integer values.\r");
        for (int i=0; i<values.length; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] values) {
        for (int i = 0;i<values.length;i++){
            System.out.println("Element " + i + " contents " + values[i]);
        }
    }
    public static int[] sortIntegers(int[] values){
        int[] sortedArray = new int[values.length];
        double max=0;
        for (int i = 0;i<values.length ;i++){
            sortedArray[i]=values[i];
        }
        boolean flag=true;
        //80 30 50
        int temp;
        while(flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1;i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
