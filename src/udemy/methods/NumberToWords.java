package udemy.methods;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }


        int reverseNumber = reverse(number);

        for (int i=0; i< getDigitCount(number); i++){
            int digit = reverseNumber % 10;
            switch (digit){
                case 0: System.out.println("Zero");
                        break;
                case 1: System.out.println("One");
                    break;
                case 2: System.out.println("Two");
                    break;
                case 3: System.out.println("Three");
                    break;
                case 4: System.out.println("Four");
                    break;
                case 5: System.out.println("Five");
                    break;
                case 6: System.out.println("Six");
                    break;
                case 7: System.out.println("Seven");
                    break;
                case 8: System.out.println("Eight");
                    break;
                case 9: System.out.println("Nine");
                    break;
                default: System.out.println("Invalid Value");
                    break;
            }
            reverseNumber = reverseNumber /10;
        }
        System.out.println();
    }
    public static int reverse(int revNum){
        int newNum = 0;
        while (revNum != 0){
            int lastDigit = revNum % 10;
            newNum = newNum * 10 + lastDigit;
            revNum = revNum /10;
        }
        return newNum;
    }
    public static int getDigitCount (int number) {
        if (number < 0){
            return -1;
        }
        int count = 1;
        while (number > 9){
            number = number /10;
            count = count +1;
        }
        return count;
    }


}


