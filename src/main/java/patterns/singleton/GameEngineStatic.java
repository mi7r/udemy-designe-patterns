package patterns.singleton;

public class GameEngineStatic {

    private String characterName = "Krzychu";
    private int hp = 120;

    private static GameEngineStatic gameEngineStaticInstance = new GameEngineStatic();

    private GameEngineStatic (){

    }

    public void run(){
        while (true){
            //game running
        }
    }

    public static GameEngineStatic getGameEngineStaticInstance(){
        return gameEngineStaticInstance;
    }
}
