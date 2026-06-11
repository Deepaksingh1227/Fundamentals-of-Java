record Bike(String brand, int speed){}
public class RecordDemo{


    public static void main (String args[]){
        Bike bike= new Bike("gt650", 80);
        System.out.println("Brand: "+ bike.brand());
        System.out.println("Brand: "+ bike.speed());
    }
}