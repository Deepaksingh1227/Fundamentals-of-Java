public class Encapsulation {
     public static void main(String args[]){
        Car c1= new Car("thar", "black", 60);
        Car c2= new Car("kia", "red", 80);
        c1.setSpeed(100);
        c1.Dsplay();
        c2.Dsplay();
    }
}
    class Car{
        private String  brand;
        private String color;
        private int speed;
        public Car(String brand, String color , int speed){
            this.brand=brand;
            this.color=color;
            //this.speed=speed;
            setSpeed(speed);
        }
        public void Dsplay(){
            System.out.println(color+" "+brand + " is driving at "+speed+"km/h in mountain");
        }

        public int getSpeed(){
            return speed;
        }
        public void setSpeed(int speed){
            this.speed=speed;
        }



    }
   

