package polymorphism;


public class Bike extends Vehical{
    String brand;
    int speed;

    public Bike(String brand, int speed){
        super(brand,speed);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void start(){
        System.out.println("bike started");
    }


    public static void main (String args[]){
        Bike b1= new Bike("gt650", 100);
        b1.setSpeed(2000);

        System.out.println("Brand: "+ b1.getBrand());
        System.out.println("Speed: "+ b1.getSpeed());
        
        
        b1.start();
    }

    
}

