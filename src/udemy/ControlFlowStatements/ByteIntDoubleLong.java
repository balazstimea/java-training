package udemy.ControlFlowStatements;

public class ByteIntDoubleLong {
    public static void main(String[] args) {

        byte byteNum = 112;
        short shortNum = 1112;
        int intNum = 111112;
        long longNum = 50_000L + 10L * (byteNum + shortNum + intNum);
        System.out.println(longNum);

        short shortTotal = (short) (1000 + 10 * (byteNum + shortNum +intNum));
        System.out.println(shortTotal);
    }
}
