import java.util.*;
public class Factorial {
    public static int fac(int num){
        int f=1;
        for(int i=1; i<=num; i++ ){
            f*=i;
        }
        return f;

    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num= sc.nextInt();
        System.out.println(fac(num));



    }
}
