package udemy.ControlFlowStatements;

public class SwitchWithChar {
    public static void main(String[] args) {

        char switchChar = 'G';

        switch(switchChar) {
            case 'A':
                System.out.println("the character was A");
                break;
            case 'B':
                System.out.println("the character was B");
                break;
            case 'C':
                System.out.println("the character was C");
                break;
            case 'D':
                System.out.println("the character was D");
                break;
            case 'E':
                System.out.println("the character was E");
                break;
            default:
                System.out.println("not found");
                break;
        }

    }


}


