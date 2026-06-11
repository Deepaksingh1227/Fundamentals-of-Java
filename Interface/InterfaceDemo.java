package Interface;

public class InterfaceDemo {
    public static void main(String args[]) {
        CarControls mycar = new ElectricCar();
        mycar.turnLeft();
        mycar.applyBrake();
        mycar.turnRight();
        mycar.accelerate();
    }

}
