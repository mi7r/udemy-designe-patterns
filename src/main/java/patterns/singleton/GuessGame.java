package patterns.singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private static GuessGame guessGameInstance = new GuessGame();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(9) + 1;
            System.out.println("Enter number from 1 to 10:");
            int myNumber = scanner.nextInt();
            if (randomNumber == myNumber) {
                System.out.println("Nice shot!");
                score++;
            } else {
                System.out.println("No. Should be: " + randomNumber);
            }
        }
        System.out.println("GAME OVER. Your score is: " + score);
    }

    protected Object readResolve() {
        return getGuessGameInstance();
    }

    public static GuessGame getGuessGameInstance() {
        return guessGameInstance;
    }

    public int getScore() {
        return score;
    }
}
