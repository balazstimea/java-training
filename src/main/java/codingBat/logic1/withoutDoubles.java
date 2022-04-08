package codingBat.logic1;

public class withoutDoubles {

    public static void main(String[] args) {

        System.out.println(withoutDoubles(2, 3, true));
    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles)
            if (die1 == die2){
                if (die1==6)
                    return die1+1;
                else
                    return die1+die2+1;
            }else
                return die1+die2;
        else
            return die1+die2;
    }
}
