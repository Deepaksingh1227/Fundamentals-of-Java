import java.util.Scanner;

public class Parameter{

    public static  int twoSum(int a, int b){
        return a+b;

    }

    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the value of a :");
         int a =sc.nextInt();
        System.out.print("enter the value of b :");
        int b =sc.nextInt();
       int sum= twoSum(a, b);
       System.out.println(sum);

    }
}