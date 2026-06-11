package polymorphism;


public class Car extends Vehical {
    String brand;
    int speed;


    public Car(String brand, int speed){
        super(brand,speed);

    }
    @Override
     public void start(){
        System.out.println("Car started");
    }
    public static void main (String args[]){
        
        Car c1= new Car("KIA", 90);
        c1.start();
        c1.setSpeed(100);
        c1.setBrand("Toyota");
        c1.start();
        System.out.println("Brand: "+ c1.getBrand());
        System.out.println("Speed: "+ c1.getSpeed());



    }




    
}
