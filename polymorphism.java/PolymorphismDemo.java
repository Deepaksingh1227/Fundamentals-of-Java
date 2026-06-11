package polymorphism;


public class PolymorphismDemo {
    public static void main(String args[]){
        Car c2= new Car("Alto 800", 50);
        c2.start();

        Bike b2= new Bike("Yamaha", 1000);
        b2.start();
//method overriding (run time polymorphism)
        Vehical v2= new Bike("Yamaha", 1000);
        v2.start();

        
    }
    
}
