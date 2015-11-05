package adapter;

public class AdapterTest {
    public static void main(String[] args) {

        GameLevel gl = new GameLevel();


        gl.gameObjects.add(new Car());
        gl.gameObjects.add(new TankAdapter(new Tank()));



    }
}
