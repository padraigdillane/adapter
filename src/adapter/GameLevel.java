package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by User on 04/11/2015.
 */
public class GameLevel {
    List<IAccelerate> gameObjects = new ArrayList<IAccelerate>();

    public GameLevel(List<IAccelerate> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public GameLevel() {

    }

    public void nextLevel(){

        for(IAccelerate acc : gameObjects){
            acc.speedUp(10);
        }
    }



}


