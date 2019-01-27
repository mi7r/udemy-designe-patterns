package patterns;

import patterns.singleton.GameEngine;

public class Main {
    public static void main(String[] args) {

        GameEngine gameEngine = GameEngine.getGameInstance();

        GameEngine gameEngine2 = GameEngine.getGameInstance();

        System.out.println(gameEngine==gameEngine2);

    }
}
