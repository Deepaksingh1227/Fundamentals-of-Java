public class OverloadingDemo{

    public int add(int a, int b){
        return a+b;

    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main (String args[]){

        OverloadingDemo obj= new OverloadingDemo();
        System.out.println(obj.add(10, 20));

        System.out.println(obj.add(100.0, 20.0));

    }


}