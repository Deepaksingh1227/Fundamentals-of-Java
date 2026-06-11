package polymorphism;


public class Vehical {
    private String brand;
    private int speed;

    public Vehical (String brand, int speed){
        this.brand=brand;
        this.speed=speed;

    }

    public void start(){
        System.out.println("Vehical started");
    }
    public String getBrand(){
        return brand;

    }
    public void setBrand(String brand){
        this.brand=brand;
    }
     public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public static void main(String args[]){
        Vehical v1= new Vehical("thar", 80);
        v1.start();

        System.out.println("Brand: "+ v1.getBrand());
        System.out.println("Speed: "+ v1.getSpeed());   
    }
  
}

