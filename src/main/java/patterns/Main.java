package patterns;

import patterns.singleton.GuessGame;

public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = GuessGame.getGuessGameInstance();

        guessGame.play();

        int score = guessGame.getScore();

        GuessGame secondGuessGame = GuessGame.getGuessGameInstance();
        if (guessGame==secondGuessGame){
            System.out.println("Singleton is working properly");
            if (score==guessGame.getScore()){
                System.out.println("Points are the same");
            }
        }

    }
}
