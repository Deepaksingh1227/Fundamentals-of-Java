import java.util.Scanner;

public class Car{
    
    String brand;
   
    String color;
    
    int speed;
    public void drive(){ 
        System.out.println(color+ " "+ brand + " is driving at "+speed +"km/h in mountain");

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Car c1= new Car();
        
        System.out.print("Enter the car Brand: ");
        c1.brand = sc.nextLine();
        System.out.print("Enter the car color: ");
        c1.color =sc.nextLine();
        System.out.print("Enter the car speed: ");
        c1.speed=sc.nextInt();
        c1.drive();


    }
}