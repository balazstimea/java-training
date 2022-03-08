package udemy.controlFlowStatements;

public class Sum3and5Challange {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i=1; i <= 1000; i++) {
            if (i % 3 ==0 && i % 5 ==0){
                count++;
                sum = sum + i;
                System.out.println(i);
            }
            if (count == 5){
                System.out.println("the sum of the first 5 numbers disible with 3 and 5 is: " + sum);
                break;
            }
        }
    }


}


