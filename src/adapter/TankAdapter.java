package adapter;

public class TankAdapter implements IAccelerate {

    Tank tank;

    public TankAdapter(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void speedUp(int n) {
        tank.driveFast(n);
    }
}
