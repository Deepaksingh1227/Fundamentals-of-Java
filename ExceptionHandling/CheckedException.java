package ExceptionHandling;
import java.io.FileReader;

public class CheckedException {
    public static void main (String args[]){
        System.out.println("Trying to learn about Checked Exception ");
        //checked exception are the exception that compiler force to handle and checked by the compile at compile time

        try{
            FileReader F1 = new FileReader("abc.txt");

        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
        
    }
}
