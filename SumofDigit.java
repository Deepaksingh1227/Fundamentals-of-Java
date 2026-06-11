import java.util.*;
public class SumofDigit {
    public static int  digitSum(int num){
        int sum=0;
    
        for(int i=0; i<=num; i++){
            int Ld= num%10;
            sum+= Ld;
            num/=10;
        }
        return sum;
    }


    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        System.out.println(digitSum(num));


    }
}
