package udemy.Methods;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

        public static void inputThenPrintSumAndAverage () {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            double avg = 0;
            int count =0;
            while(true) {
                boolean isAnInt = scanner.hasNextInt();
                if(isAnInt){
                    int number = scanner.nextInt();
                    sum = sum + number;
                    count++;

                }else {
                    avg =Math.round(sum / count);
                    System.out.println("SUM = " + (int)sum + " AVG = " + (long)avg);
                    break;}

                scanner.nextLine();
            }
            scanner.close();
        }
    }




