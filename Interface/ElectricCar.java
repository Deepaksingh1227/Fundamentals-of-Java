package Interface;

public class ElectricCar implements CarControls {
    @Override
    public void turnLeft(){
        System.out.println("turning left .....");

    }
    @Override
    public void turnRight(){
        System.out.println("turning right .....");

    }
    @Override
    public void applyBrake(){
        System.out.println("break applied .....");

    }

    @Override
    public void accelerate(){
        System.out.println("accelerating .....");
    }
}
