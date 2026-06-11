
public class Constrcotrs {
    private String brand;
    private String color;
    private int speed;
    public Constrcotrs (String brand, String color, int speed){
        System.out.println(color+ " "+ brand + " is driving at "+speed +"km/h in mountain");
        this.brand=brand;
        this.color=color;
        this.speed=speed;



    }
    public  int getSpeed(){
        return speed;

    }
    public void setSpeed( int speed){
        this.speed=speed;

    }
    
    public void drive(){ 
        System.out.println(color+ " "+ brand + " is driving at "+speed +"km/h in mountain");

    }

    public static void main (String args[]){
        Constrcotrs c1= new Constrcotrs("thar", "black", 60);
        c1.drive();

        c1.setSpeed(100);

        System.out.println("updated speed: " +c1.getSpeed());
        c1.drive();
         
        


        // Scanner sc=new Scanner(System.in);

        // Constrcotrs c1= new Constrcotrs();
        // System.out.print("Enter the brand : ");
        // c1.brand=sc.nextLine();

        // System.out.print("Enter the color : ");
        // c1.color=sc.nextLine();

        // System.out.print("Enter the speed : ");
        // c1.speed=sc.nextInt();
        // c1.drive();
        
    }
}
