package udemy.Methods;

public class Methods1 {
    public static void main(String[] args) {

        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        //  System.out.println("Your final score was " + finalScore);
        return finalScore;
    }

}


