package udemy.ControlFlowStatements;

public class SwitchDayOfAWeek {
    public static void main(String[] args) {

        int day = 5;

        switch(day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4: case 5: case 6: case 7:
                System.out.println("It's Thursday or Friday or Saturday or maybe Sunday ");
                break;

            default:
                System.out.println("not found");
                break;
        }

    }


}


