package patterns.singleton;

public class GameEngine {

    private String characterName = "Rychu";
    private int hp = 100;

    private static GameEngine gameInstance;

    private GameEngine() {
    }

    public void run() {
        while (true) {
            //game running
        }
    }

    public static GameEngine getGameInstance() {
        if (gameInstance == null) {
            synchronized (GameEngine.class) {
                if (gameInstance == null) {
                    gameInstance = new GameEngine();
                }
            }
        }
        return gameInstance;
    }
}
