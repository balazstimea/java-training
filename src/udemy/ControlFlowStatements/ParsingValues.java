package udemy.ControlFlowStatements;

public class ParsingValues {
    public static void main(String[] args){
        String numberAsString = "2018";
        //String numberAsString = "2018.125"; -> if we want to use double
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        //double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number= " + number);
    }
}


