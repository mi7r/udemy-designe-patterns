package patterns.singleton;

import java.io.Serializable;

public class GameEngineSerializable implements Serializable {

    private static final long serialVersionUID = 23232322;

    private String characterName = "Zbychu";
    private int hp = 110;

    private static GameEngineSerializable gameEngineSerializableInstance = new GameEngineSerializable();

    private GameEngineSerializable(){

    }

    public void run(){
        while (true){
            ///game running
        }
    }

    public static GameEngineSerializable getGameEngineSerializableInstance(){
        return gameEngineSerializableInstance;
    }

    protected Object readResolve(){
        return getGameEngineSerializableInstance();
    }


}
